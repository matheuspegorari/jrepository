package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SeparacaoFaturamento extends AbstractSankhyaEntity<SeparacaoFaturamento> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipOperDest() {
        return this.getVo().asBigDecimal("CODTIPOPERDEST");
   }

   public void setCodTipOperDest(BigDecimal codTipOperDest) {
        markAsChanged("CODTIPOPERDEST", codTipOperDest);
   }

   public String getConfirmDocFat() {
        return this.getVo().asString("CONFIRMDOCFAT");
   }

   public void setConfirmDocFat(String confirmDocFat) {
        markAsChanged("CONFIRMDOCFAT", confirmDocFat);
   }

   public char[] getCriterioSep() {
        return this.getVo().asClob("CRITERIOSEP");
   }

   public void setCriterioSep(char[] criterioSep) {
        markAsChanged("CRITERIOSEP", criterioSep);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSerieDest() {
        return this.getVo().asString("SERIEDEST");
   }

   public void setSerieDest(String serieDest) {
        markAsChanged("SERIEDEST", serieDest);
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
        this.setVo(vo);
        return this;
   }
}
