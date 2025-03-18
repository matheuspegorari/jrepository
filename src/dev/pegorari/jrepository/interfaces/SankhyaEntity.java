package dev.pegorari.jrepository.interfaces;

import br.com.sankhya.jape.vo.DynamicVO;

import java.util.Map;

public interface SankhyaEntity<T extends SankhyaEntity<T>> {
    String getTableName();
    String getEntityName();
    T fromVO(DynamicVO vo);
    DynamicVO getOriginalVO();
    Map<String,Object> getChanges();
    void clearChanges();
}