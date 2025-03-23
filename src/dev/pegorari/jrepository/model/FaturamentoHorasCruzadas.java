package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FaturamentoHorasCruzadas extends AbstractSankhyaEntity<FaturamentoHorasCruzadas> {
   private BigDecimal sequencia;
   private BigDecimal nuNota;
   private BigDecimal numOs;
   private BigDecimal numItem;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
        this.numItem = numItem;
   }

   @Override
   public String getTableName() {
        return "TCSFATHC";
   }

   @Override
   public String getEntityName() {
        return "FaturamentoHorasCruzadas";
   }

   @Override
   public FaturamentoHorasCruzadas fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numItem = vo.asBigDecimal("NUMITEM");
        return this;
   }
}
