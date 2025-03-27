package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DevolucaoCheque extends AbstractSankhyaEntity<DevolucaoCheque> {
   public String getALineaCheqDev() {
        return this.getVo().asString("ALINEACHEQDEV");
   }

   public void setALineaCheqDev(String aLineaCheqDev) {
        markAsChanged("ALINEACHEQDEV", aLineaCheqDev);
   }

   public BigDecimal getCodTipTit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
   }

   public BigDecimal getNuDev() {
        return this.getVo().asBigDecimal("NUDEV");
   }

   public void setNuDev(BigDecimal nuDev) {
        markAsChanged("NUDEV", nuDev);
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
        this.setVo(vo);
        return this;
   }
}
