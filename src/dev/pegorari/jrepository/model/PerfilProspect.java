package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PerfilProspect implements SankhyaEntity<PerfilProspect> {

   private BigDecimal codPap;
   private BigDecimal codTipParc;

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        this.codPap = codPap;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   @Override
   public String getEntityName() {
        return "PerfilProspect";
   }

   @Override
   public PerfilProspect fromVO(DynamicVO vo) {
        this.codPap = vo.asBigDecimal("CODPAP");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        return this;
   }
}
