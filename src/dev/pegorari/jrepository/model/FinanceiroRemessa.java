package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FinanceiroRemessa implements SankhyaEntity<FinanceiroRemessa> {

   private BigDecimal nuFin;
   private BigDecimal nuRem;

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getNuRem() {
        return nuRem;
   }

   public void setNuRem(BigDecimal nuRem) {
        this.nuRem = nuRem;
   }

   @Override
   public String getEntityName() {
        return "FinanceiroRemessa";
   }

   @Override
   public FinanceiroRemessa fromVO(DynamicVO vo) {
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuRem = vo.asBigDecimal("NUREM");
        return this;
   }
}
