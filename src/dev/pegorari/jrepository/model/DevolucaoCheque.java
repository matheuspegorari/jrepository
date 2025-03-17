package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class DevolucaoCheque implements SankhyaEntity<DevolucaoCheque> {

   private String aLineaCheqDev;
   private BigDecimal codTipTit;
   private BigDecimal nuDev;
   private BigDecimal nuFinDesp;
   private BigDecimal nuFinOrig;
   private BigDecimal nuFinRec;

   public String getALineaCheqDev() {
        return aLineaCheqDev;
   }

   public void setALineaCheqDev(String aLineaCheqDev) {
        this.aLineaCheqDev = aLineaCheqDev;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        this.codTipTit = codTipTit;
   }

   public BigDecimal getNuDev() {
        return nuDev;
   }

   public void setNuDev(BigDecimal nuDev) {
        this.nuDev = nuDev;
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

   @Override
   public String getEntityName() {
        return "DevolucaoCheque";
   }

   @Override
   public DevolucaoCheque fromVO(DynamicVO vo) {
        this.aLineaCheqDev = vo.asString("ALINEACHEQDEV");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.nuDev = vo.asBigDecimal("NUDEV");
        this.nuFinDesp = vo.asBigDecimal("NUFINDESP");
        this.nuFinOrig = vo.asBigDecimal("NUFINORIG");
        this.nuFinRec = vo.asBigDecimal("NUFINREC");
        return this;
   }
}
