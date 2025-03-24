package dev.pegorari.jrepository.abstractions;

import br.com.sankhya.jape.vo.DynamicVO;

public class AdEntity extends AbstractSankhyaEntity<AdEntity> {
    private final String entityName;

    public AdEntity(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public String getTableName() {
        return this.entityName;
    }

    @Override
    public String getEntityName() {
        return entityName;
    }

    @Override
    public AdEntity fromVO(DynamicVO vo) {
        setVo(vo);
        return this;
    }
}
