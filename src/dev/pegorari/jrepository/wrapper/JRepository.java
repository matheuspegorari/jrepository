package dev.pegorari.jrepository.wrapper;

import br.com.sankhya.jape.vo.DynamicVO;
import br.com.sankhya.jape.wrapper.JapeFactory;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JRepository {
    public static <T extends SankhyaEntity<T>> T findByPK(T template, Object... pkValues) throws Exception {
        String instanceName = template.getEntityName();
        DynamicVO vo = JapeFactory.dao(instanceName).findByPK(pkValues);
        return createEntity(template, vo);
    }

    public static <T extends SankhyaEntity<T>> List<T> find(T template, String where) throws Exception {
        String instanceName = template.getEntityName();
        Collection<DynamicVO> vos = JapeFactory.dao(instanceName).find(where);

        List<T> entities = new ArrayList<>(vos.size());
        for (DynamicVO vo : vos) {
            T entity = createNewInstance(template);
            entities.add(createEntity(entity, vo));
        }
        return entities;
    }

    public static <T extends SankhyaEntity<T>> List<T> find(T template, String where, Object... params) throws Exception {
        String instanceName = template.getEntityName();
        Collection<DynamicVO> vos = JapeFactory.dao(instanceName).find(where, params);

        List<T> entities = new ArrayList<>(vos.size());
        for (DynamicVO vo : vos) {
            T entity = createNewInstance(template);
            entities.add(createEntity(entity, vo));
        }
        return entities;
    }

    public static <T extends SankhyaEntity<T>> void update(T entity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static <T extends SankhyaEntity<T>> void create(T entity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @SuppressWarnings("unchecked")
    private static <T extends SankhyaEntity<T>> T createNewInstance(T template) {
        try {
            return (T) template.getClass().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar nova instância", e);
        }
    }

    public static <T extends SankhyaEntity<T>> T createEntity(T template, DynamicVO vo) {
        return template.fromVO(vo);
    }
}
