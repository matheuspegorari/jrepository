package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0200 implements SankhyaEntity<DemonsApurRessarcimentoSTR0200> {

   private BigDecimal aliqIcms;
   private BigDecimal cest;
   private String codAntItem;
   private String codBarra;
   private BigDecimal codEmp;
   private BigDecimal codGen;
   private String codItem;
   private BigDecimal codLst;
   private String codNcm;
   private BigDecimal codProd;
   private String descrItem;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private BigDecimal exIpi;
   private String reg;
   private String tipoItem;
   private String unidInv;

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getCest() {
        return cest;
   }

   public void setCest(BigDecimal cest) {
        this.cest = cest;
   }

   public String getCodAntItem() {
        return codAntItem;
   }

   public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGen() {
        return codGen;
   }

   public void setCodGen(BigDecimal codGen) {
        this.codGen = codGen;
   }

   public String getCodItem() {
        return codItem;
   }

   public void setCodItem(String codItem) {
        this.codItem = codItem;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        this.codLst = codLst;
   }

   public String getCodNcm() {
        return codNcm;
   }

   public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDescrItem() {
        return descrItem;
   }

   public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public BigDecimal getExIpi() {
        return exIpi;
   }

   public void setExIpi(BigDecimal exIpi) {
        this.exIpi = exIpi;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   public String getTipoItem() {
        return tipoItem;
   }

   public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
   }

   public String getUnidInv() {
        return unidInv;
   }

   public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0200";
   }

   @Override
   public DemonsApurRessarcimentoSTR0200 fromVO(DynamicVO vo) {
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.cest = vo.asBigDecimal("CEST");
        this.codAntItem = vo.asString("CODANTITEM");
        this.codBarra = vo.asString("CODBARRA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGen = vo.asBigDecimal("CODGEN");
        this.codItem = vo.asString("CODITEM");
        this.codLst = vo.asBigDecimal("CODLST");
        this.codNcm = vo.asString("CODNCM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descrItem = vo.asString("DESCRITEM");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.exIpi = vo.asBigDecimal("EXIPI");
        this.reg = vo.asString("REG");
        this.tipoItem = vo.asString("TIPOITEM");
        this.unidInv = vo.asString("UNIDINV");
        return this;
   }
}
