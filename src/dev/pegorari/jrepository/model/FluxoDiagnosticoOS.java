package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FluxoDiagnosticoOS extends AbstractSankhyaEntity<FluxoDiagnosticoOS> {
   public BigDecimal getCodFld() {
        return this.getVo().asBigDecimal("CODFLD");
   }

   public void setCodFld(BigDecimal codFld) {
        markAsChanged("CODFLD", codFld);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
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
        this.setVo(vo);
        return this;
   }
}
