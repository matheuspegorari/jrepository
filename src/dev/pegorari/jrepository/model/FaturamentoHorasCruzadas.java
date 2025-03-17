package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FaturamentoHorasCruzadas implements SankhyaEntity<FaturamentoHorasCruzadas> {

   private BigDecimal sequencia;
   private BigDecimal nuNota;
   private BigDecimal numOs;
   private BigDecimal numItem;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   @Override
   public String getEntityName() {
        return "FaturamentoHorasCruzadas";
   }

   @Override
   public FaturamentoHorasCruzadas fromVO(DynamicVO vo) {
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numItem = vo.asBigDecimal("NUMITEM");
        return this;
   }
}
