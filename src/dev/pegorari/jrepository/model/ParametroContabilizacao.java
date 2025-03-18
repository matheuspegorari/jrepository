package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ParametroContabilizacao extends AbstractSankhyaEntity<ParametroContabilizacao> {
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
        markAsChanged("CTACTBCONST", ctaCtbConst);
        this.ctaCtbConst = ctaCtbConst;
   }

   public String getDc() {
        return dc;
   }

   public void setDc(String dc) {
        markAsChanged("DC", dc);
        this.dc = dc;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
        this.formula = formula;
   }

   public String getHistorico() {
        return historico;
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
        this.historico = historico;
   }

   public BigDecimal getLancamento() {
        return lancamento;
   }

   public void setLancamento(BigDecimal lancamento) {
        markAsChanged("LANCAMENTO", lancamento);
        this.lancamento = lancamento;
   }

   public String getCenCusConst() {
        return cenCusConst;
   }

   public void setCenCusConst(String cenCusConst) {
        markAsChanged("CENCUSCONST", cenCusConst);
        this.cenCusConst = cenCusConst;
   }

   public String getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(String codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public String getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(String codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodHistCtb() {
        return codHistCtb;
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
        this.codHistCtb = codHistCtb;
   }

   public String getProjConst() {
        return projConst;
   }

   public void setProjConst(String projConst) {
        markAsChanged("PROJCONST", projConst);
        this.projConst = projConst;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSintetiza() {
        return sintetiza;
   }

   public void setSintetiza(String sintetiza) {
        markAsChanged("SINTETIZA", sintetiza);
        this.sintetiza = sintetiza;
   }

   public String getTipDt() {
        return tipDt;
   }

   public void setTipDt(String tipDt) {
        markAsChanged("TIPDT", tipDt);
        this.tipDt = tipDt;
   }

   public String getCodProj() {
        return codProj;
   }

   public void setCodProj(String codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public String getTipoEmpOrig() {
        return tipoEmpOrig;
   }

   public void setTipoEmpOrig(String tipoEmpOrig) {
        markAsChanged("TIPOEMPORIG", tipoEmpOrig);
        this.tipoEmpOrig = tipoEmpOrig;
   }

   public String getCodCtaCtbTrans() {
        return codCtaCtbTrans;
   }

   public void setCodCtaCtbTrans(String codCtaCtbTrans) {
        markAsChanged("CODCTACTBTRANS", codCtaCtbTrans);
        this.codCtaCtbTrans = codCtaCtbTrans;
   }

   public String getCtaCtbConstTrans() {
        return ctaCtbConstTrans;
   }

   public void setCtaCtbConstTrans(String ctaCtbConstTrans) {
        markAsChanged("CTACTBCONSTTRANS", ctaCtbConstTrans);
        this.ctaCtbConstTrans = ctaCtbConstTrans;
   }

   public String getTipCtbzCompany() {
        return tipCtbzCompany;
   }

   public void setTipCtbzCompany(String tipCtbzCompany) {
        markAsChanged("TIPCTBZCOMPANY", tipCtbzCompany);
        this.tipCtbzCompany = tipCtbzCompany;
   }

   public String getTipEmpCompany() {
        return tipEmpCompany;
   }

   public void setTipEmpCompany(String tipEmpCompany) {
        markAsChanged("TIPEMPCOMPANY", tipEmpCompany);
        this.tipEmpCompany = tipEmpCompany;
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
        this.setOriginalVO(vo);
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
