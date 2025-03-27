package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegraSLASubOs extends AbstractSankhyaEntity<RegraSLASubOs> {
   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNumReg() {
        return this.getVo().asBigDecimal("NUMREG");
   }

   public void setNumReg(BigDecimal numReg) {
        markAsChanged("NUMREG", numReg);
   }

   public BigDecimal getNuSla() {
        return this.getVo().asBigDecimal("NUSLA");
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
   }

   @Override
   public String getTableName() {
        return "TCSRSI";
   }

   @Override
   public String getEntityName() {
        return "RegraSLASubOs";
   }

   @Override
   public RegraSLASubOs fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
