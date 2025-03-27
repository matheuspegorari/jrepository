package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FaturamentoHorasCruzadas extends AbstractSankhyaEntity<FaturamentoHorasCruzadas> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
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
        return this;
   }
}
