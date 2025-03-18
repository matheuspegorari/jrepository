package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0200 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0200> {
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
        markAsChanged("ALIQICMS", aliqIcms);
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getCest() {
        return cest;
   }

   public void setCest(BigDecimal cest) {
        markAsChanged("CEST", cest);
        this.cest = cest;
   }

   public String getCodAntItem() {
        return codAntItem;
   }

   public void setCodAntItem(String codAntItem) {
        markAsChanged("CODANTITEM", codAntItem);
        this.codAntItem = codAntItem;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGen() {
        return codGen;
   }

   public void setCodGen(BigDecimal codGen) {
        markAsChanged("CODGEN", codGen);
        this.codGen = codGen;
   }

   public String getCodItem() {
        return codItem;
   }

   public void setCodItem(String codItem) {
        markAsChanged("CODITEM", codItem);
        this.codItem = codItem;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
        this.codLst = codLst;
   }

   public String getCodNcm() {
        return codNcm;
   }

   public void setCodNcm(String codNcm) {
        markAsChanged("CODNCM", codNcm);
        this.codNcm = codNcm;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getDescrItem() {
        return descrItem;
   }

   public void setDescrItem(String descrItem) {
        markAsChanged("DESCRITEM", descrItem);
        this.descrItem = descrItem;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public BigDecimal getExIpi() {
        return exIpi;
   }

   public void setExIpi(BigDecimal exIpi) {
        markAsChanged("EXIPI", exIpi);
        this.exIpi = exIpi;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
        this.reg = reg;
   }

   public String getTipoItem() {
        return tipoItem;
   }

   public void setTipoItem(String tipoItem) {
        markAsChanged("TIPOITEM", tipoItem);
        this.tipoItem = tipoItem;
   }

   public String getUnidInv() {
        return unidInv;
   }

   public void setUnidInv(String unidInv) {
        markAsChanged("UNIDINV", unidInv);
        this.unidInv = unidInv;
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0200";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0200";
   }

   @Override
   public DemonsApurRessarcimentoSTR0200 fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
