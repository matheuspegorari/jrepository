package dev.pegorari.jrepository.core;

import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.fluid.FluidCreateVO;
import br.com.sankhya.jape.wrapper.fluid.FluidUpdateVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

import java.util.*;

public class JRepository {
    public static <T extends SankhyaEntity<T>> T findByPK(T template, Object... pkValues) throws Exception {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");
        if (pkValues == null || pkValues.length == 0) {
            throw new IllegalArgumentException("É necessário fornecer pelo menos um valor de chave primária para o método findByPK");
        }

        String entityName = template.getEntityName();
        DynamicVO vo = JapeFactory.dao(entityName).findByPK(pkValues);
        if (vo == null) {
            return null;
        }
        return createEntity(template, vo);
    }

    public static <T extends SankhyaEntity<T>> List<T> find(T template, String where) throws Exception {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");

        String entityName = template.getEntityName();
        Collection<DynamicVO> vos = JapeFactory.dao(entityName).find(where);

        List<T> entities = new ArrayList<>(vos.size());
        for (DynamicVO vo : vos) {
            T entity = createNewInstance(template);
            entities.add(createEntity(entity, vo));
        }
        return entities;
    }

    public static <T extends SankhyaEntity<T>> List<T> find(T template, String where, Object... params) throws Exception {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");
        String entityName = template.getEntityName();
        Collection<DynamicVO> vos = JapeFactory.dao(entityName).find(where, params);

        List<T> entities = new ArrayList<>(vos.size());
        for (DynamicVO vo : vos) {
            T entity = createNewInstance(template);
            entities.add(createEntity(entity, vo));
        }
        return entities;
    }

    public static <T extends SankhyaEntity<T>> T findOne(T template, String where) throws Exception {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");
        String entityName = template.getEntityName();
        DynamicVO vo = JapeFactory.dao(entityName).findOne(where);
        if (vo == null) {
            return null;
        }
        return createEntity(template, vo);
    }

    public static <T extends SankhyaEntity<T>> T findOne(T template, String where, Object... params) throws Exception {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");
        String entityName = template.getEntityName();
        DynamicVO vo = JapeFactory.dao(entityName).findOne(where, params);
        if (vo == null) {
            return null;
        }
        return createEntity(template, vo);
    }

    public static void updateEntity(SankhyaEntity<?> entity) {
        DynamicVO originalVO = entity.getVo();
        if (originalVO == null) {
            throw new IllegalArgumentException("Entidade não foi carregada do banco de dados");
        }

        Map<String, Object> changes = entity.getChanges();
        if (changes.isEmpty()) {
            return;
        }

        String entityName = entity.getEntityName();
        FluidUpdateVO updater = JapeFactory.dao(entityName).prepareToUpdate(originalVO);
        try {
            for (Map.Entry<String, Object> entry : changes.entrySet()) {
                updater.set(entry.getKey(), entry.getValue());
            }

            updater.update();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar entidade. " + e.getMessage(), e);
        }

        entity.clearChanges();
    }

    public static void createEntity(SankhyaEntity<?> entity) {
        DynamicVO vo = entity.getVo();
        if (vo != null) {
            throw new IllegalArgumentException("Entidade já foi criada no banco de dados. Utilize o método update para atualizar");
        }

        Map<String, Object> changes = entity.getChanges();
        if (changes.isEmpty()) {
            return;
        }
        DynamicVO persistedEntity = null;
        String entityName = entity.getEntityName();
        try {
            FluidCreateVO inserter = JapeFactory.dao(entityName).create();

            for (Map.Entry<String, Object> entry : changes.entrySet()) {
                inserter.set(entry.getKey(), entry.getValue());
            }

            persistedEntity = inserter.save();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao criar entidade. " + e.getMessage(), e);
        }
        entity.fromVO(persistedEntity);
    }

    @SuppressWarnings("unchecked")
    private static <T extends SankhyaEntity<T>> T createNewInstance(T template) {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");
        try {
            return (T) template.getClass().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao criar nova instância. " + e.getMessage(), e);
        }
    }

    public static <T extends SankhyaEntity<T>> T createEntity(T template, DynamicVO vo) {
        Objects.requireNonNull(template, "Template não pode ser \"null\"");
        return template.fromVO(vo);
    }


}
