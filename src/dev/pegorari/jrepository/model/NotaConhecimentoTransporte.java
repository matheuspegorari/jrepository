package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaConhecimentoTransporte extends AbstractSankhyaEntity<NotaConhecimentoTransporte> {
   private BigDecimal codModDoc;
   private Timestamp dtEmissao;
   private String numero;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private String serie;
   private BigDecimal vlrNota;
   private BigDecimal baseSt;
   private BigDecimal baseIcms;
   private String chaveNfe;
   private BigDecimal vlrIcms;
   private BigDecimal cfop;
   private BigDecimal vlrSt;
   private BigDecimal vlrTotProd;
   private String segCodBar;
   private String descrDoc;
   private BigDecimal pesoB;
   private BigDecimal pesoL;

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        this.codModDoc = codModDoc;
   }

   public Timestamp getDtEmissao() {
        return dtEmissao;
   }

   public void setDtEmissao(Timestamp dtEmissao) {
        this.dtEmissao = dtEmissao;
   }

   public String getNumero() {
        return numero;
   }

   public void setNumero(String numero) {
        this.numero = numero;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        this.vlrNota = vlrNota;
   }

   public BigDecimal getBaseSt() {
        return baseSt;
   }

   public void setBaseSt(BigDecimal baseSt) {
        this.baseSt = baseSt;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getCfop() {
        return cfop;
   }

   public void setCfop(BigDecimal cfop) {
        this.cfop = cfop;
   }

   public BigDecimal getVlrSt() {
        return vlrSt;
   }

   public void setVlrSt(BigDecimal vlrSt) {
        this.vlrSt = vlrSt;
   }

   public BigDecimal getVlrTotProd() {
        return vlrTotProd;
   }

   public void setVlrTotProd(BigDecimal vlrTotProd) {
        this.vlrTotProd = vlrTotProd;
   }

   public String getSegCodBar() {
        return segCodBar;
   }

   public void setSegCodBar(String segCodBar) {
        this.segCodBar = segCodBar;
   }

   public String getDescrDoc() {
        return descrDoc;
   }

   public void setDescrDoc(String descrDoc) {
        this.descrDoc = descrDoc;
   }

   public BigDecimal getPesoB() {
        return pesoB;
   }

   public void setPesoB(BigDecimal pesoB) {
        this.pesoB = pesoB;
   }

   public BigDecimal getPesoL() {
        return pesoL;
   }

   public void setPesoL(BigDecimal pesoL) {
        this.pesoL = pesoL;
   }

   @Override
   public String getTableName() {
        return "TGFNCT";
   }

   @Override
   public String getEntityName() {
        return "NotaConhecimentoTransporte";
   }

   @Override
   public NotaConhecimentoTransporte fromVO(DynamicVO vo) {
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.dtEmissao = vo.asTimestamp("DTEMISSAO");
        this.numero = vo.asString("NUMERO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serie = vo.asString("SERIE");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.baseSt = vo.asBigDecimal("BASEST");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.cfop = vo.asBigDecimal("CFOP");
        this.vlrSt = vo.asBigDecimal("VLRST");
        this.vlrTotProd = vo.asBigDecimal("VLRTOTPROD");
        this.segCodBar = vo.asString("SEGCODBAR");
        this.descrDoc = vo.asString("DESCRDOC");
        this.pesoB = vo.asBigDecimal("PESOB");
        this.pesoL = vo.asBigDecimal("PESOL");
        return this;
   }
}
