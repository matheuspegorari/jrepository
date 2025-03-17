package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoMudancaTributacao implements SankhyaEntity<ProdutoMudancaTributacao> {

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
   private BigDecimal baseTestoque;
   private String vlrCusUtil;
   private BigDecimal vlrIcmsUnit;

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqSt() {
        return aliqSt;
   }

   public void setAliqSt(BigDecimal aliqSt) {
        this.aliqSt = aliqSt;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getBaseSubstitCompra() {
        return baseSubstitCompra;
   }

   public void setBaseSubstitCompra(BigDecimal baseSubstitCompra) {
        this.baseSubstitCompra = baseSubstitCompra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodParcCompra() {
        return codParcCompra;
   }

   public void setCodParcCompra(BigDecimal codParcCompra) {
        this.codParcCompra = codParcCompra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getCst() {
        return cst;
   }

   public void setCst(BigDecimal cst) {
        this.cst = cst;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtMtp() {
        return dtMtp;
   }

   public void setDtMtp(Timestamp dtMtp) {
        this.dtMtp = dtMtp;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        this.idAliq = idAliq;
   }

   public BigDecimal getMva() {
        return mva;
   }

   public void setMva(BigDecimal mva) {
        this.mva = mva;
   }

   public String getNcm() {
        return ncm;
   }

   public void setNcm(String ncm) {
        this.ncm = ncm;
   }

   public BigDecimal getNuNotaCompra() {
        return nuNotaCompra;
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        this.nuNotaCompra = nuNotaCompra;
   }

   public BigDecimal getQtdEst() {
        return qtdEst;
   }

   public void setQtdEst(BigDecimal qtdEst) {
        this.qtdEst = qtdEst;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        this.usoProd = usoProd;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIcmsCompra() {
        return vlrIcmsCompra;
   }

   public void setVlrIcmsCompra(BigDecimal vlrIcmsCompra) {
        this.vlrIcmsCompra = vlrIcmsCompra;
   }

   public BigDecimal getVlrUnitCusto() {
        return vlrUnitCusto;
   }

   public void setVlrUnitCusto(BigDecimal vlrUnitCusto) {
        this.vlrUnitCusto = vlrUnitCusto;
   }

   public BigDecimal getBaseIcmsSt() {
        return baseIcmsSt;
   }

   public void setBaseIcmsSt(BigDecimal baseIcmsSt) {
        this.baseIcmsSt = baseIcmsSt;
   }

   public BigDecimal getCstAnterior() {
        return cstAnterior;
   }

   public void setCstAnterior(BigDecimal cstAnterior) {
        this.cstAnterior = cstAnterior;
   }

   public BigDecimal getIdAliqAnterior() {
        return idAliqAnterior;
   }

   public void setIdAliqAnterior(BigDecimal idAliqAnterior) {
        this.idAliqAnterior = idAliqAnterior;
   }

   public BigDecimal getVlrIcmsSt() {
        return vlrIcmsSt;
   }

   public void setVlrIcmsSt(BigDecimal vlrIcmsSt) {
        this.vlrIcmsSt = vlrIcmsSt;
   }

   public BigDecimal getBaseTestoque() {
        return baseTestoque;
   }

   public void setBaseTestoque(BigDecimal baseTestoque) {
        this.baseTestoque = baseTestoque;
   }

   public String getVlrCusUtil() {
        return vlrCusUtil;
   }

   public void setVlrCusUtil(String vlrCusUtil) {
        this.vlrCusUtil = vlrCusUtil;
   }

   public BigDecimal getVlrIcmsUnit() {
        return vlrIcmsUnit;
   }

   public void setVlrIcmsUnit(BigDecimal vlrIcmsUnit) {
        this.vlrIcmsUnit = vlrIcmsUnit;
   }

   @Override
   public String getEntityName() {
        return "ProdutoMudancaTributacao";
   }

   @Override
   public ProdutoMudancaTributacao fromVO(DynamicVO vo) {
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
        this.baseTestoque = vo.asBigDecimal("BASETESTOQUE");
        this.vlrCusUtil = vo.asString("VLRCUSUTIL");
        this.vlrIcmsUnit = vo.asBigDecimal("VLRICMSUNIT");
        return this;
   }
}
