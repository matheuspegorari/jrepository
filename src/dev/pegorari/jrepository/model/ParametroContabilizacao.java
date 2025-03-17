package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ParametroContabilizacao implements SankhyaEntity<ParametroContabilizacao> {

   private String ctaCtbConst;
   private String dc;
   private String formula;
   private String historico;
   private BigDecimal lancamento;
   private String cenCusConst;
   private String codCenCus;
   private String codCtaCtb;
   private BigDecimal codEmp;
   private BigDecimal codHistCtb;
   private String projConst;
   private BigDecimal sequencia;
   private String sintetiza;
   private String tipDt;
   private String codProj;
   private BigDecimal codTipOper;
   private String tipoEmpOrig;
   private String codCtaCtbTrans;
   private String ctaCtbConstTrans;
   private String tipCtbzCompany;
   private String tipEmpCompany;

   public String getCtaCtbConst() {
        return ctaCtbConst;
   }

   public void setCtaCtbConst(String ctaCtbConst) {
        this.ctaCtbConst = ctaCtbConst;
   }

   public String getDc() {
        return dc;
   }

   public void setDc(String dc) {
        this.dc = dc;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        this.formula = formula;
   }

   public String getHistorico() {
        return historico;
   }

   public void setHistorico(String historico) {
        this.historico = historico;
   }

   public BigDecimal getLancamento() {
        return lancamento;
   }

   public void setLancamento(BigDecimal lancamento) {
        this.lancamento = lancamento;
   }

   public String getCenCusConst() {
        return cenCusConst;
   }

   public void setCenCusConst(String cenCusConst) {
        this.cenCusConst = cenCusConst;
   }

   public String getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(String codCenCus) {
        this.codCenCus = codCenCus;
   }

   public String getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(String codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodHistCtb() {
        return codHistCtb;
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        this.codHistCtb = codHistCtb;
   }

   public String getProjConst() {
        return projConst;
   }

   public void setProjConst(String projConst) {
        this.projConst = projConst;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSintetiza() {
        return sintetiza;
   }

   public void setSintetiza(String sintetiza) {
        this.sintetiza = sintetiza;
   }

   public String getTipDt() {
        return tipDt;
   }

   public void setTipDt(String tipDt) {
        this.tipDt = tipDt;
   }

   public String getCodProj() {
        return codProj;
   }

   public void setCodProj(String codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public String getTipoEmpOrig() {
        return tipoEmpOrig;
   }

   public void setTipoEmpOrig(String tipoEmpOrig) {
        this.tipoEmpOrig = tipoEmpOrig;
   }

   public String getCodCtaCtbTrans() {
        return codCtaCtbTrans;
   }

   public void setCodCtaCtbTrans(String codCtaCtbTrans) {
        this.codCtaCtbTrans = codCtaCtbTrans;
   }

   public String getCtaCtbConstTrans() {
        return ctaCtbConstTrans;
   }

   public void setCtaCtbConstTrans(String ctaCtbConstTrans) {
        this.ctaCtbConstTrans = ctaCtbConstTrans;
   }

   public String getTipCtbzCompany() {
        return tipCtbzCompany;
   }

   public void setTipCtbzCompany(String tipCtbzCompany) {
        this.tipCtbzCompany = tipCtbzCompany;
   }

   public String getTipEmpCompany() {
        return tipEmpCompany;
   }

   public void setTipEmpCompany(String tipEmpCompany) {
        this.tipEmpCompany = tipEmpCompany;
   }

   @Override
   public String getEntityName() {
        return "ParametroContabilizacao";
   }

   @Override
   public ParametroContabilizacao fromVO(DynamicVO vo) {
        this.ctaCtbConst = vo.asString("CTACTBCONST");
        this.dc = vo.asString("DC");
        this.formula = vo.asString("FORMULA");
        this.historico = vo.asString("HISTORICO");
        this.lancamento = vo.asBigDecimal("LANCAMENTO");
        this.cenCusConst = vo.asString("CENCUSCONST");
        this.codCenCus = vo.asString("CODCENCUS");
        this.codCtaCtb = vo.asString("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codHistCtb = vo.asBigDecimal("CODHISTCTB");
        this.projConst = vo.asString("PROJCONST");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sintetiza = vo.asString("SINTETIZA");
        this.tipDt = vo.asString("TIPDT");
        this.codProj = vo.asString("CODPROJ");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.tipoEmpOrig = vo.asString("TIPOEMPORIG");
        this.codCtaCtbTrans = vo.asString("CODCTACTBTRANS");
        this.ctaCtbConstTrans = vo.asString("CTACTBCONSTTRANS");
        this.tipCtbzCompany = vo.asString("TIPCTBZCOMPANY");
        this.tipEmpCompany = vo.asString("TIPEMPCOMPANY");
        return this;
   }
}
