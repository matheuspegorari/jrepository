package dev.pegorari.jrepository.interfaces;

import br.com.sankhya.jape.vo.DynamicVO;

public interface SankhyaEntity<T extends SankhyaEntity<T>> {
    String getEntityName();
    T fromVO(DynamicVO vo);
}