package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DevolucaoCheque extends AbstractSankhyaEntity<DevolucaoCheque> {
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
        markAsChanged("ALINEACHEQDEV", aLineaCheqDev);
        this.aLineaCheqDev = aLineaCheqDev;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
        this.codTipTit = codTipTit;
   }

   public BigDecimal getNuDev() {
        return nuDev;
   }

   public void setNuDev(BigDecimal nuDev) {
        markAsChanged("NUDEV", nuDev);
        this.nuDev = nuDev;
   }

   public BigDecimal getNuFinDesp() {
        return nuFinDesp;
   }

   public void setNuFinDesp(BigDecimal nuFinDesp) {
        markAsChanged("NUFINDESP", nuFinDesp);
        this.nuFinDesp = nuFinDesp;
   }

   public BigDecimal getNuFinOrig() {
        return nuFinOrig;
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        markAsChanged("NUFINORIG", nuFinOrig);
        this.nuFinOrig = nuFinOrig;
   }

   public BigDecimal getNuFinRec() {
        return nuFinRec;
   }

   public void setNuFinRec(BigDecimal nuFinRec) {
        markAsChanged("NUFINREC", nuFinRec);
        this.nuFinRec = nuFinRec;
   }

   @Override
   public String getTableName() {
        return "TGFMDC";
   }

   @Override
   public String getEntityName() {
        return "DevolucaoCheque";
   }

   @Override
   public DevolucaoCheque fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aLineaCheqDev = vo.asString("ALINEACHEQDEV");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.nuDev = vo.asBigDecimal("NUDEV");
        this.nuFinDesp = vo.asBigDecimal("NUFINDESP");
        this.nuFinOrig = vo.asBigDecimal("NUFINORIG");
        this.nuFinRec = vo.asBigDecimal("NUFINREC");
        return this;
   }
}
