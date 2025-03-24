package dev.pegorari.jrepository.abstractions;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.core.JRepository;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;


public abstract class AbstractSankhyaEntity<T extends SankhyaEntity<T>> implements SankhyaEntity<T> {
    private final transient Map<String, Object> changes = new HashMap<>();
    private transient DynamicVO vo;

    @Override
    public DynamicVO getVo() {
        return vo;
    }

    protected void setVo(DynamicVO vo) {
        if (this.vo != null) {
            throw new IllegalStateException("DynamicVO para este objeto já foi definido. Crie outra instância.");
        }
        this.vo = vo;
        clearChanges();
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

    public BigDecimal asBigDecimal(String fieldName) {
        return getVo().asBigDecimal(fieldName);
    }

    public BigDecimal asBigDecimalOrZero(String fieldName) {
        return getVo().asBigDecimalOrZero(fieldName);
    }

    public String asString(String fieldName) {
        return getVo().asString(fieldName);
    }

    public Timestamp asTimestamp(String fieldName) {
        return getVo().asTimestamp(fieldName);
    }

    public char[] asClob(String fieldName) {
        return getVo().asClob(fieldName);
    }

    public byte[] asBlob(String fieldName) {
        return getVo().asBlob(fieldName);
    }

    public int asInt(String fieldName) {
        return getVo().asInt(fieldName);
    }

    public double asDouble(String fieldName) {
        return getVo().asDouble(fieldName);
    }

    public boolean asBoolean(String fieldName) {
        return getVo().asBoolean(fieldName);
    }

    public long asLong(String fieldName) {
        return getVo().asLong(fieldName);
    }

    public void set(String fieldName, Object value) {
        markAsChanged(fieldName, value);
    }

    public void persist() throws Exception {
        if (this.getVo() == null) {
            JRepository.createEntity(this);
        } else {
            JRepository.updateEntity(this);
        }
    }
}