package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SeparacaoFaturamento extends AbstractSankhyaEntity<SeparacaoFaturamento> {
   private BigDecimal codEmp;
   private BigDecimal codTipOper;
   private BigDecimal codTipOperDest;
   private String confirmDocFat;
   private char[] criterioSep;
   private BigDecimal sequencia;
   private String serieDest;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipOperDest() {
        return codTipOperDest;
   }

   public void setCodTipOperDest(BigDecimal codTipOperDest) {
        markAsChanged("CODTIPOPERDEST", codTipOperDest);
        this.codTipOperDest = codTipOperDest;
   }

   public String getConfirmDocFat() {
        return confirmDocFat;
   }

   public void setConfirmDocFat(String confirmDocFat) {
        markAsChanged("CONFIRMDOCFAT", confirmDocFat);
        this.confirmDocFat = confirmDocFat;
   }

   public char[] getCriterioSep() {
        return criterioSep;
   }

   public void setCriterioSep(char[] criterioSep) {
        markAsChanged("CRITERIOSEP", criterioSep);
        this.criterioSep = criterioSep;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSerieDest() {
        return serieDest;
   }

   public void setSerieDest(String serieDest) {
        markAsChanged("SERIEDEST", serieDest);
        this.serieDest = serieDest;
   }

   @Override
   public String getTableName() {
        return "TGFFCI";
   }

   @Override
   public String getEntityName() {
        return "SeparacaoFaturamento";
   }

   @Override
   public SeparacaoFaturamento fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipOperDest = vo.asBigDecimal("CODTIPOPERDEST");
        this.confirmDocFat = vo.asString("CONFIRMDOCFAT");
        this.criterioSep = vo.asClob("CRITERIOSEP");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serieDest = vo.asString("SERIEDEST");
        return this;
   }
}
