package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FluxoDiagnosticoOS implements SankhyaEntity<FluxoDiagnosticoOS> {

   private BigDecimal codFld;
   private BigDecimal numOs;

   public BigDecimal getCodFld() {
        return codFld;
   }

   public void setCodFld(BigDecimal codFld) {
        this.codFld = codFld;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   @Override
   public String getEntityName() {
        return "FluxoDiagnosticoOS";
   }

   @Override
   public FluxoDiagnosticoOS fromVO(DynamicVO vo) {
        this.codFld = vo.asBigDecimal("CODFLD");
        this.numOs = vo.asBigDecimal("NUMOS");
        return this;
   }
}
