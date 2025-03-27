package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FinanceiroRemessa extends AbstractSankhyaEntity<FinanceiroRemessa> {
   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNuRem() {
        return this.getVo().asBigDecimal("NUREM");
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
   }

   @Override
   public String getTableName() {
        return "TGFRCI";
   }

   @Override
   public String getEntityName() {
        return "FinanceiroRemessa";
   }

   @Override
   public FinanceiroRemessa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
