package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Repasse extends AbstractSankhyaEntity<Repasse> {
   public BigDecimal getNuCnd() {
        return this.getVo().asBigDecimal("NUCND");
   }

   public void setNuCnd(BigDecimal nuCnd) {
        markAsChanged("NUCND", nuCnd);
   }

   public BigDecimal getNuFinDesp() {
        return this.getVo().asBigDecimal("NUFINDESP");
   }

   public void setNuFinDesp(BigDecimal nuFinDesp) {
        markAsChanged("NUFINDESP", nuFinDesp);
   }

   public BigDecimal getNuFinOrig() {
        return this.getVo().asBigDecimal("NUFINORIG");
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        markAsChanged("NUFINORIG", nuFinOrig);
   }

   public BigDecimal getNuFinRec() {
        return this.getVo().asBigDecimal("NUFINREC");
   }

   public void setNuFinRec(BigDecimal nuFinRec) {
        markAsChanged("NUFINREC", nuFinRec);
   }

   public BigDecimal getPercRateio() {
        return this.getVo().asBigDecimal("PERCRATEIO");
   }

   public void setPercRateio(BigDecimal percRateio) {
        markAsChanged("PERCRATEIO", percRateio);
   }

   public BigDecimal getValorRateio() {
        return this.getVo().asBigDecimal("VALORRATEIO");
   }

   public void setValorRateio(BigDecimal valorRateio) {
        markAsChanged("VALORRATEIO", valorRateio);
   }

   @Override
   public String getTableName() {
        return "TGFFRP";
   }

   @Override
   public String getEntityName() {
        return "Repasse";
   }

   @Override
   public Repasse fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
