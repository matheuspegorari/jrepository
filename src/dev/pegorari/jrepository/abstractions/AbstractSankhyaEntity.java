package dev.pegorari.jrepository.abstractions;
import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

import java.util.HashMap;
import java.util.Map;


public abstract class AbstractSankhyaEntity<T extends SankhyaEntity<T>> implements SankhyaEntity<T> {
    private transient DynamicVO originalVO;
    private final transient Map<String, Object> dirtyFields = new HashMap<>();

    @Override
    public DynamicVO getOriginalVO() {
        return originalVO;
    }

    protected void setOriginalVO(DynamicVO vo) {
        this.originalVO = vo;
        this.dirtyFields.clear();
    }

    protected void markDirty(String fieldName, Object value) {
        dirtyFields.put(fieldName, value);
    }

    @Override
    public Map<String, Object> getDirtyFields() {
        return dirtyFields;
    }
}