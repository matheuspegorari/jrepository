package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ArquivoNFSe extends AbstractSankhyaEntity<ArquivoNFSe> {
   private char[] xmlIntegracao;
   private String codVerifNfse;
   private Timestamp dhemissNfse;
   private BigDecimal nuNota;
   private char[] xmlConfCanc;
   private char[] xmlNfse;
   private char[] xmlPedCanc;
   private char[] xmlRps;
   private String linkNfse;
   private char[] xmlDps;

   public char[] getXmlIntegracao() {
        return xmlIntegracao;
   }

   public void setXmlIntegracao(char[] xmlIntegracao) {
        this.xmlIntegracao = xmlIntegracao;
   }

   public String getCodVerifNfse() {
        return codVerifNfse;
   }

   public void setCodVerifNfse(String codVerifNfse) {
        this.codVerifNfse = codVerifNfse;
   }

   public Timestamp getDhemissNfse() {
        return dhemissNfse;
   }

   public void setDhemissNfse(Timestamp dhemissNfse) {
        this.dhemissNfse = dhemissNfse;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public char[] getXmlConfCanc() {
        return xmlConfCanc;
   }

   public void setXmlConfCanc(char[] xmlConfCanc) {
        this.xmlConfCanc = xmlConfCanc;
   }

   public char[] getXmlNfse() {
        return xmlNfse;
   }

   public void setXmlNfse(char[] xmlNfse) {
        this.xmlNfse = xmlNfse;
   }

   public char[] getXmlPedCanc() {
        return xmlPedCanc;
   }

   public void setXmlPedCanc(char[] xmlPedCanc) {
        this.xmlPedCanc = xmlPedCanc;
   }

   public char[] getXmlRps() {
        return xmlRps;
   }

   public void setXmlRps(char[] xmlRps) {
        this.xmlRps = xmlRps;
   }

   public String getLinkNfse() {
        return linkNfse;
   }

   public void setLinkNfse(String linkNfse) {
        this.linkNfse = linkNfse;
   }

   public char[] getXmlDps() {
        return xmlDps;
   }

   public void setXmlDps(char[] xmlDps) {
        this.xmlDps = xmlDps;
   }

   @Override
   public String getTableName() {
        return "TGFNFSE";
   }

   @Override
   public String getEntityName() {
        return "ArquivoNFSe";
   }

   @Override
   public ArquivoNFSe fromVO(DynamicVO vo) {
        this.xmlIntegracao = vo.asClob("XMLINTEGRACAO");
        this.codVerifNfse = vo.asString("CODVERIFNFSE");
        this.dhemissNfse = vo.asTimestamp("DHEMISSNFSE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.xmlConfCanc = vo.asClob("XMLCONFCANC");
        this.xmlNfse = vo.asClob("XMLNFSE");
        this.xmlPedCanc = vo.asClob("XMLPEDCANC");
        this.xmlRps = vo.asClob("XMLRPS");
        this.linkNfse = vo.asString("LINKNFSE");
        this.xmlDps = vo.asClob("XMLDPS");
        return this;
   }
}
