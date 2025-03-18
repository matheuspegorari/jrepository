package dev.pegorari.jrepository.abstractions;
import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

import java.util.HashMap;
import java.util.Map;


public abstract class AbstractSankhyaEntity<T extends SankhyaEntity<T>> implements SankhyaEntity<T> {
    private transient DynamicVO originalVO;
    private final transient Map<String, Object> changes = new HashMap<>();

    @Override
    public DynamicVO getOriginalVO() {
        return originalVO;
    }

    protected void setOriginalVO(DynamicVO vo) {
        this.originalVO = vo;
        this.changes.clear();
    }

    protected void markAsChanged(String fieldName, Object value) {
        changes.put(fieldName, value);
    }

    @Override
    public Map<String, Object> getChanges() {
        return changes;
    }

    @Override
    public void clearChanges() {
        changes.clear();
    }
}