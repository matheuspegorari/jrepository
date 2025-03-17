package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Repasse extends AbstractSankhyaEntity<Repasse> {
   private BigDecimal nuCnd;
   private BigDecimal nuFinDesp;
   private BigDecimal nuFinOrig;
   private BigDecimal nuFinRec;
   private BigDecimal percRateio;
   private BigDecimal valorRateio;

   public BigDecimal getNuCnd() {
        return nuCnd;
   }

   public void setNuCnd(BigDecimal nuCnd) {
        this.nuCnd = nuCnd;
   }

   public BigDecimal getNuFinDesp() {
        return nuFinDesp;
   }

   public void setNuFinDesp(BigDecimal nuFinDesp) {
        this.nuFinDesp = nuFinDesp;
   }

   public BigDecimal getNuFinOrig() {
        return nuFinOrig;
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        this.nuFinOrig = nuFinOrig;
   }

   public BigDecimal getNuFinRec() {
        return nuFinRec;
   }

   public void setNuFinRec(BigDecimal nuFinRec) {
        this.nuFinRec = nuFinRec;
   }

   public BigDecimal getPercRateio() {
        return percRateio;
   }

   public void setPercRateio(BigDecimal percRateio) {
        this.percRateio = percRateio;
   }

   public BigDecimal getValorRateio() {
        return valorRateio;
   }

   public void setValorRateio(BigDecimal valorRateio) {
        this.valorRateio = valorRateio;
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
        this.nuCnd = vo.asBigDecimal("NUCND");
        this.nuFinDesp = vo.asBigDecimal("NUFINDESP");
        this.nuFinOrig = vo.asBigDecimal("NUFINORIG");
        this.nuFinRec = vo.asBigDecimal("NUFINREC");
        this.percRateio = vo.asBigDecimal("PERCRATEIO");
        this.valorRateio = vo.asBigDecimal("VALORRATEIO");
        return this;
   }
}
