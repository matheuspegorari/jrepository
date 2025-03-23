package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegraSLASubOs extends AbstractSankhyaEntity<RegraSLASubOs> {
   private BigDecimal numItem;
   private BigDecimal numOs;
   private BigDecimal numReg;
   private BigDecimal nuSla;

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
        this.numItem = numItem;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   public BigDecimal getNumReg() {
        return numReg;
   }

   public void setNumReg(BigDecimal numReg) {
        markAsChanged("NUMREG", numReg);
        this.numReg = numReg;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
        this.nuSla = nuSla;
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
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numReg = vo.asBigDecimal("NUMREG");
        this.nuSla = vo.asBigDecimal("NUSLA");
        return this;
   }
}
