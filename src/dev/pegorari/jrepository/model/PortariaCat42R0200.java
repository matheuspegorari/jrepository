package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R0200 extends AbstractSankhyaEntity<PortariaCat42R0200> {
   private BigDecimal aliqIcms;
   private BigDecimal cest;
   private String codBarra;
   private BigDecimal codEmp;
   private String codItem;
   private String codNcm;
   private BigDecimal codProd;
   private String descrItem;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String reg;
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

   public String getCodItem() {
        return codItem;
   }

   public void setCodItem(String codItem) {
        markAsChanged("CODITEM", codItem);
        this.codItem = codItem;
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

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
        this.reg = reg;
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
        return "TGFCAT42R0200";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R0200";
   }

   @Override
   public PortariaCat42R0200 fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.cest = vo.asBigDecimal("CEST");
        this.codBarra = vo.asString("CODBARRA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codItem = vo.asString("CODITEM");
        this.codNcm = vo.asString("CODNCM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descrItem = vo.asString("DESCRITEM");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.reg = vo.asString("REG");
        this.unidInv = vo.asString("UNIDINV");
        return this;
   }
}
