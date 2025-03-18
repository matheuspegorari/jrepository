package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoMudancaTributacao extends AbstractSankhyaEntity<ProdutoMudancaTributacao> {
   private BigDecimal aliqIcms;
   private BigDecimal aliqSt;
   private BigDecimal baseIcms;
   private BigDecimal baseSubstit;
   private BigDecimal baseSubstitCompra;
   private BigDecimal codEmp;
   private BigDecimal codGrupoProd;
   private BigDecimal codParcCompra;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String codVol;
   private BigDecimal cst;
   private String digitado;
   private Timestamp dtAlter;
   private Timestamp dtMtp;
   private BigDecimal idAliq;
   private BigDecimal mva;
   private String ncm;
   private BigDecimal nuNotaCompra;
   private BigDecimal qtdEst;
   private String usoProd;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIcmsCompra;
   private BigDecimal vlrUnitCusto;
   private BigDecimal baseIcmsSt;
   private BigDecimal cstAnterior;
   private BigDecimal idAliqAnterior;
   private BigDecimal vlrIcmsSt;
   private BigDecimal baseStEstoque;
   private String vlrCusUtil;
   private BigDecimal vlrIcmsUnit;

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqSt() {
        return aliqSt;
   }

   public void setAliqSt(BigDecimal aliqSt) {
        markAsChanged("ALIQST", aliqSt);
        this.aliqSt = aliqSt;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getBaseSubstitCompra() {
        return baseSubstitCompra;
   }

   public void setBaseSubstitCompra(BigDecimal baseSubstitCompra) {
        markAsChanged("BASESUBSTITCOMPRA", baseSubstitCompra);
        this.baseSubstitCompra = baseSubstitCompra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodParcCompra() {
        return codParcCompra;
   }

   public void setCodParcCompra(BigDecimal codParcCompra) {
        markAsChanged("CODPARCCOMPRA", codParcCompra);
        this.codParcCompra = codParcCompra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public BigDecimal getCst() {
        return cst;
   }

   public void setCst(BigDecimal cst) {
        markAsChanged("CST", cst);
        this.cst = cst;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtMtp() {
        return dtMtp;
   }

   public void setDtMtp(Timestamp dtMtp) {
        markAsChanged("DTMTP", dtMtp);
        this.dtMtp = dtMtp;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
        this.idAliq = idAliq;
   }

   public BigDecimal getMva() {
        return mva;
   }

   public void setMva(BigDecimal mva) {
        markAsChanged("MVA", mva);
        this.mva = mva;
   }

   public String getNcm() {
        return ncm;
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
        this.ncm = ncm;
   }

   public BigDecimal getNuNotaCompra() {
        return nuNotaCompra;
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        markAsChanged("NUNOTACOMPRA", nuNotaCompra);
        this.nuNotaCompra = nuNotaCompra;
   }

   public BigDecimal getQtdEst() {
        return qtdEst;
   }

   public void setQtdEst(BigDecimal qtdEst) {
        markAsChanged("QTDEST", qtdEst);
        this.qtdEst = qtdEst;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
        this.usoProd = usoProd;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIcmsCompra() {
        return vlrIcmsCompra;
   }

   public void setVlrIcmsCompra(BigDecimal vlrIcmsCompra) {
        markAsChanged("VLRICMSCOMPRA", vlrIcmsCompra);
        this.vlrIcmsCompra = vlrIcmsCompra;
   }

   public BigDecimal getVlrUnitCusto() {
        return vlrUnitCusto;
   }

   public void setVlrUnitCusto(BigDecimal vlrUnitCusto) {
        markAsChanged("VLRUNITCUSTO", vlrUnitCusto);
        this.vlrUnitCusto = vlrUnitCusto;
   }

   public BigDecimal getBaseIcmsSt() {
        return baseIcmsSt;
   }

   public void setBaseIcmsSt(BigDecimal baseIcmsSt) {
        markAsChanged("BASEICMSST", baseIcmsSt);
        this.baseIcmsSt = baseIcmsSt;
   }

   public BigDecimal getCstAnterior() {
        return cstAnterior;
   }

   public void setCstAnterior(BigDecimal cstAnterior) {
        markAsChanged("CSTANTERIOR", cstAnterior);
        this.cstAnterior = cstAnterior;
   }

   public BigDecimal getIdAliqAnterior() {
        return idAliqAnterior;
   }

   public void setIdAliqAnterior(BigDecimal idAliqAnterior) {
        markAsChanged("IDALIQANTERIOR", idAliqAnterior);
        this.idAliqAnterior = idAliqAnterior;
   }

   public BigDecimal getVlrIcmsSt() {
        return vlrIcmsSt;
   }

   public void setVlrIcmsSt(BigDecimal vlrIcmsSt) {
        markAsChanged("VLRICMSST", vlrIcmsSt);
        this.vlrIcmsSt = vlrIcmsSt;
   }

   public BigDecimal getBaseStEstoque() {
        return baseStEstoque;
   }

   public void setBaseStEstoque(BigDecimal baseStEstoque) {
        markAsChanged("BASESTESTOQUE", baseStEstoque);
        this.baseStEstoque = baseStEstoque;
   }

   public String getVlrCusUtil() {
        return vlrCusUtil;
   }

   public void setVlrCusUtil(String vlrCusUtil) {
        markAsChanged("VLRCUSUTIL", vlrCusUtil);
        this.vlrCusUtil = vlrCusUtil;
   }

   public BigDecimal getVlrIcmsUnit() {
        return vlrIcmsUnit;
   }

   public void setVlrIcmsUnit(BigDecimal vlrIcmsUnit) {
        markAsChanged("VLRICMSUNIT", vlrIcmsUnit);
        this.vlrIcmsUnit = vlrIcmsUnit;
   }

   @Override
   public String getTableName() {
        return "TGFPMT";
   }

   @Override
   public String getEntityName() {
        return "ProdutoMudancaTributacao";
   }

   @Override
   public ProdutoMudancaTributacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqSt = vo.asBigDecimal("ALIQST");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseSubstit = vo.asBigDecimal("BASESUBSTIT");
        this.baseSubstitCompra = vo.asBigDecimal("BASESUBSTITCOMPRA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codParcCompra = vo.asBigDecimal("CODPARCCOMPRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        this.cst = vo.asBigDecimal("CST");
        this.digitado = vo.asString("DIGITADO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtMtp = vo.asTimestamp("DTMTP");
        this.idAliq = vo.asBigDecimal("IDALIQ");
        this.mva = vo.asBigDecimal("MVA");
        this.ncm = vo.asString("NCM");
        this.nuNotaCompra = vo.asBigDecimal("NUNOTACOMPRA");
        this.qtdEst = vo.asBigDecimal("QTDEST");
        this.usoProd = vo.asString("USOPROD");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIcmsCompra = vo.asBigDecimal("VLRICMSCOMPRA");
        this.vlrUnitCusto = vo.asBigDecimal("VLRUNITCUSTO");
        this.baseIcmsSt = vo.asBigDecimal("BASEICMSST");
        this.cstAnterior = vo.asBigDecimal("CSTANTERIOR");
        this.idAliqAnterior = vo.asBigDecimal("IDALIQANTERIOR");
        this.vlrIcmsSt = vo.asBigDecimal("VLRICMSST");
        this.baseStEstoque = vo.asBigDecimal("BASESTESTOQUE");
        this.vlrCusUtil = vo.asString("VLRCUSUTIL");
        this.vlrIcmsUnit = vo.asBigDecimal("VLRICMSUNIT");
        return this;
   }
}
