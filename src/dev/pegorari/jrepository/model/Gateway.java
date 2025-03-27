package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Gateway extends AbstractSankhyaEntity<Gateway> {
   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   @Override
   public String getTableName() {
        return "TPRGTW";
   }

   @Override
   public String getEntityName() {
        return "Gateway";
   }

   @Override
   public Gateway fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
