package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ArquivoCTe implements SankhyaEntity<ArquivoCTe> {

   private char[] xmlProtAutCte;
   private char[] xmlEnvCartaEnvCli;
   private char[] xmlEnvCli;
   private BigDecimal nuNota;
   private char[] xml;
   private String chaveCte;
   private char[] xmlEnvCarta;
   private char[] xmlCanc;
   private char[] xmlCancProtAut;
   private char[] xmlCancEnvCli;
   private char[] xmlEnvCartaRotAut;
   private char[] xmlProtAutEpec;
   private char[] xmlEnvEpec;
   private char[] xmlEnvCliCanc;
   private char[] xmlProtCanc;
   private String qrCode;

   public char[] getXmlProtAutCte() {
        return xmlProtAutCte;
   }

   public void setXmlProtAutCte(char[] xmlProtAutCte) {
        this.xmlProtAutCte = xmlProtAutCte;
   }

   public char[] getXmlEnvCartaEnvCli() {
        return xmlEnvCartaEnvCli;
   }

   public void setXmlEnvCartaEnvCli(char[] xmlEnvCartaEnvCli) {
        this.xmlEnvCartaEnvCli = xmlEnvCartaEnvCli;
   }

   public char[] getXmlEnvCli() {
        return xmlEnvCli;
   }

   public void setXmlEnvCli(char[] xmlEnvCli) {
        this.xmlEnvCli = xmlEnvCli;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public char[] getXml() {
        return xml;
   }

   public void setXml(char[] xml) {
        this.xml = xml;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        this.chaveCte = chaveCte;
   }

   public char[] getXmlEnvCarta() {
        return xmlEnvCarta;
   }

   public void setXmlEnvCarta(char[] xmlEnvCarta) {
        this.xmlEnvCarta = xmlEnvCarta;
   }

   public char[] getXmlCanc() {
        return xmlCanc;
   }

   public void setXmlCanc(char[] xmlCanc) {
        this.xmlCanc = xmlCanc;
   }

   public char[] getXmlCancProtAut() {
        return xmlCancProtAut;
   }

   public void setXmlCancProtAut(char[] xmlCancProtAut) {
        this.xmlCancProtAut = xmlCancProtAut;
   }

   public char[] getXmlCancEnvCli() {
        return xmlCancEnvCli;
   }

   public void setXmlCancEnvCli(char[] xmlCancEnvCli) {
        this.xmlCancEnvCli = xmlCancEnvCli;
   }

   public char[] getXmlEnvCartaRotAut() {
        return xmlEnvCartaRotAut;
   }

   public void setXmlEnvCartaRotAut(char[] xmlEnvCartaRotAut) {
        this.xmlEnvCartaRotAut = xmlEnvCartaRotAut;
   }

   public char[] getXmlProtAutEpec() {
        return xmlProtAutEpec;
   }

   public void setXmlProtAutEpec(char[] xmlProtAutEpec) {
        this.xmlProtAutEpec = xmlProtAutEpec;
   }

   public char[] getXmlEnvEpec() {
        return xmlEnvEpec;
   }

   public void setXmlEnvEpec(char[] xmlEnvEpec) {
        this.xmlEnvEpec = xmlEnvEpec;
   }

   public char[] getXmlEnvCliCanc() {
        return xmlEnvCliCanc;
   }

   public void setXmlEnvCliCanc(char[] xmlEnvCliCanc) {
        this.xmlEnvCliCanc = xmlEnvCliCanc;
   }

   public char[] getXmlProtCanc() {
        return xmlProtCanc;
   }

   public void setXmlProtCanc(char[] xmlProtCanc) {
        this.xmlProtCanc = xmlProtCanc;
   }

   public String getQrCode() {
        return qrCode;
   }

   public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
   }

   @Override
   public String getEntityName() {
        return "ArquivoCTe";
   }

   @Override
   public ArquivoCTe fromVO(DynamicVO vo) {
        this.xmlProtAutCte = vo.asClob("XMLPROTAUTCTE");
        this.xmlEnvCartaEnvCli = vo.asClob("XMLENVCARTAENVCLI");
        this.xmlEnvCli = vo.asClob("XMLENVCLI");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.xml = vo.asClob("XML");
        this.chaveCte = vo.asString("CHAVECTE");
        this.xmlEnvCarta = vo.asClob("XMLENVCARTA");
        this.xmlCanc = vo.asClob("XMLCANC");
        this.xmlCancProtAut = vo.asClob("XMLCANCPROTAUT");
        this.xmlCancEnvCli = vo.asClob("XMLCANCENVCLI");
        this.xmlEnvCartaRotAut = vo.asClob("XMLENVCARTAROTAUT");
        this.xmlProtAutEpec = vo.asClob("XMLPROTAUTEPEC");
        this.xmlEnvEpec = vo.asClob("XMLENVEPEC");
        this.xmlEnvCliCanc = vo.asClob("XMLENVCLICANC");
        this.xmlProtCanc = vo.asClob("XMLPROTCANC");
        this.qrCode = vo.asString("QRCODE");
        return this;
   }
}
