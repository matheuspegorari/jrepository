package dev.pegorari.jrepository.wrapper;

import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import br.com.sankhya.jape.wrapper.fluid.FluidUpdateVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class JRepository {
    public static <T extends SankhyaEntity<T>> T findByPK(T template, Object... pkValues) throws Exception {
        String entityName = template.getEntityName();
        DynamicVO vo = JapeFactory.dao(entityName).findByPK(pkValues);
        return createEntity(template, vo);
    }

    public static <T extends SankhyaEntity<T>> List<T> find(T template, String where) throws Exception {
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
        String entityName = template.getEntityName();
        Collection<DynamicVO> vos = JapeFactory.dao(entityName).find(where, params);

        List<T> entities = new ArrayList<>(vos.size());
        for (DynamicVO vo : vos) {
            T entity = createNewInstance(template);
            entities.add(createEntity(entity, vo));
        }
        return entities;
    }

    public static void update(SankhyaEntity<?>... entities) throws Exception {
        for (SankhyaEntity<?> entity : entities) {
            updateEntity(entity);
        }
    }

    private static void updateEntity(SankhyaEntity<?> entity) throws Exception {
        DynamicVO originalVO = entity.getOriginalVO();
        if (originalVO == null) {
            throw new IllegalArgumentException("Entidade não foi carregada do banco de dados");
        }

        Map<String,Object> changes = entity.getChanges();
        if (changes.isEmpty()) {
            return;
        }

        String entityName = entity.getEntityName();
        FluidUpdateVO updater = JapeFactory.dao(entityName).prepareToUpdate(originalVO);

        for (Map.Entry<String, Object> entry : changes.entrySet()) {
            updater.set(entry.getKey(), entry.getValue());
        }
        try {
            updater.update();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar entidade", e);
        }

        entity.clearChanges();
    }

    public static <T extends SankhyaEntity<T>> void create(T entity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @SuppressWarnings("unchecked")
    private static <T extends SankhyaEntity<T>> T createNewInstance(T template) {
        try {
            return (T) template.getClass().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao criar nova instância", e);
        }
    }

    public static <T extends SankhyaEntity<T>> T createEntity(T template, DynamicVO vo) {
        return template.fromVO(vo);
    }
}
