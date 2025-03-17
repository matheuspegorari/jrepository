package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RegraSLASubOs implements SankhyaEntity<RegraSLASubOs> {

   private BigDecimal numItem;
   private BigDecimal numOs;
   private BigDecimal numReg;
   private BigDecimal nuSla;

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNumReg() {
        return numReg;
   }

   public void setNumReg(BigDecimal numReg) {
        this.numReg = numReg;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        this.nuSla = nuSla;
   }

   @Override
   public String getEntityName() {
        return "RegraSLASubOs";
   }

   @Override
   public RegraSLASubOs fromVO(DynamicVO vo) {
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numReg = vo.asBigDecimal("NUMREG");
        this.nuSla = vo.asBigDecimal("NUSLA");
        return this;
   }
}
