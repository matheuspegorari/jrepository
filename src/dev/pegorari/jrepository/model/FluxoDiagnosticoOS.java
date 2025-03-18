package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FluxoDiagnosticoOS extends AbstractSankhyaEntity<FluxoDiagnosticoOS> {
   private BigDecimal codFld;
   private BigDecimal numOs;

   public BigDecimal getCodFld() {
        return codFld;
   }

   public void setCodFld(BigDecimal codFld) {
        markAsChanged("CODFLD", codFld);
        this.codFld = codFld;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   @Override
   public String getTableName() {
        return "TCSFXO";
   }

   @Override
   public String getEntityName() {
        return "FluxoDiagnosticoOS";
   }

   @Override
   public FluxoDiagnosticoOS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codFld = vo.asBigDecimal("CODFLD");
        this.numOs = vo.asBigDecimal("NUMOS");
        return this;
   }
}
