package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ParametroContabilizacao extends AbstractSankhyaEntity<ParametroContabilizacao> {
   public String getCtaCtbConst() {
        return this.getVo().asString("CTACTBCONST");
   }

   public void setCtaCtbConst(String ctaCtbConst) {
        markAsChanged("CTACTBCONST", ctaCtbConst);
   }

   public String getDc() {
        return this.getVo().asString("DC");
   }

   public void setDc(String dc) {
        markAsChanged("DC", dc);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public String getHistorico() {
        return this.getVo().asString("HISTORICO");
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
   }

   public BigDecimal getLancamento() {
        return this.getVo().asBigDecimal("LANCAMENTO");
   }

   public void setLancamento(BigDecimal lancamento) {
        markAsChanged("LANCAMENTO", lancamento);
   }

   public String getCenCusConst() {
        return this.getVo().asString("CENCUSCONST");
   }

   public void setCenCusConst(String cenCusConst) {
        markAsChanged("CENCUSCONST", cenCusConst);
   }

   public String getCodCenCus() {
        return this.getVo().asString("CODCENCUS");
   }

   public void setCodCenCus(String codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public String getCodCtaCtb() {
        return this.getVo().asString("CODCTACTB");
   }

   public void setCodCtaCtb(String codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodHistCtb() {
        return this.getVo().asBigDecimal("CODHISTCTB");
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
   }

   public String getProjConst() {
        return this.getVo().asString("PROJCONST");
   }

   public void setProjConst(String projConst) {
        markAsChanged("PROJCONST", projConst);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSintetiza() {
        return this.getVo().asString("SINTETIZA");
   }

   public void setSintetiza(String sintetiza) {
        markAsChanged("SINTETIZA", sintetiza);
   }

   public String getTipDt() {
        return this.getVo().asString("TIPDT");
   }

   public void setTipDt(String tipDt) {
        markAsChanged("TIPDT", tipDt);
   }

   public String getCodProj() {
        return this.getVo().asString("CODPROJ");
   }

   public void setCodProj(String codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getTipoEmpOrig() {
        return this.getVo().asString("TIPOEMPORIG");
   }

   public void setTipoEmpOrig(String tipoEmpOrig) {
        markAsChanged("TIPOEMPORIG", tipoEmpOrig);
   }

   public String getCodCtaCtbTrans() {
        return this.getVo().asString("CODCTACTBTRANS");
   }

   public void setCodCtaCtbTrans(String codCtaCtbTrans) {
        markAsChanged("CODCTACTBTRANS", codCtaCtbTrans);
   }

   public String getCtaCtbConstTrans() {
        return this.getVo().asString("CTACTBCONSTTRANS");
   }

   public void setCtaCtbConstTrans(String ctaCtbConstTrans) {
        markAsChanged("CTACTBCONSTTRANS", ctaCtbConstTrans);
   }

   public String getTipCtbzCompany() {
        return this.getVo().asString("TIPCTBZCOMPANY");
   }

   public void setTipCtbzCompany(String tipCtbzCompany) {
        markAsChanged("TIPCTBZCOMPANY", tipCtbzCompany);
   }

   public String getTipEmpCompany() {
        return this.getVo().asString("TIPEMPCOMPANY");
   }

   public void setTipEmpCompany(String tipEmpCompany) {
        markAsChanged("TIPEMPCOMPANY", tipEmpCompany);
   }

   @Override
   public String getTableName() {
        return "TGFCTB";
   }

   @Override
   public String getEntityName() {
        return "ParametroContabilizacao";
   }

   @Override
   public ParametroContabilizacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
