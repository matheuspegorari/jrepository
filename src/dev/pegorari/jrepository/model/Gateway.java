package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Gateway extends AbstractSankhyaEntity<Gateway> {
   private BigDecimal ideFx;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
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
        this.ideFx = vo.asBigDecimal("IDEFX");
        return this;
   }
}
