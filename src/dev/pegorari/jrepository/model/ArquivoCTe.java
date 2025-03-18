package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ArquivoCTe extends AbstractSankhyaEntity<ArquivoCTe> {
   private char[] xmlProtAutCte;
   private char[] xmlEnvCartEnvCli;
   private char[] xmlEnvCli;
   private BigDecimal nuNota;
   private char[] xml;
   private String chaveCte;
   private char[] xmlEnvCarta;
   private char[] xmlCanc;
   private char[] xmlCancProtAut;
   private char[] xmlCancEnvCli;
   private char[] xmlEnvCartRotAut;
   private char[] xmlProtAutEpec;
   private char[] xmlEnvEpec;
   private char[] xmlEnvCliCanc;
   private char[] xmlProtCanc;
   private String qrCode;

   public char[] getXmlProtAutCte() {
        return xmlProtAutCte;
   }

   public void setXmlProtAutCte(char[] xmlProtAutCte) {
        markAsChanged("XMLPROTAUTCTE", xmlProtAutCte);
        this.xmlProtAutCte = xmlProtAutCte;
   }

   public char[] getXmlEnvCartEnvCli() {
        return xmlEnvCartEnvCli;
   }

   public void setXmlEnvCartEnvCli(char[] xmlEnvCartEnvCli) {
        markAsChanged("XMLENVCARTENVCLI", xmlEnvCartEnvCli);
        this.xmlEnvCartEnvCli = xmlEnvCartEnvCli;
   }

   public char[] getXmlEnvCli() {
        return xmlEnvCli;
   }

   public void setXmlEnvCli(char[] xmlEnvCli) {
        markAsChanged("XMLENVCLI", xmlEnvCli);
        this.xmlEnvCli = xmlEnvCli;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public char[] getXml() {
        return xml;
   }

   public void setXml(char[] xml) {
        markAsChanged("XML", xml);
        this.xml = xml;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
        this.chaveCte = chaveCte;
   }

   public char[] getXmlEnvCarta() {
        return xmlEnvCarta;
   }

   public void setXmlEnvCarta(char[] xmlEnvCarta) {
        markAsChanged("XMLENVCARTA", xmlEnvCarta);
        this.xmlEnvCarta = xmlEnvCarta;
   }

   public char[] getXmlCanc() {
        return xmlCanc;
   }

   public void setXmlCanc(char[] xmlCanc) {
        markAsChanged("XMLCANC", xmlCanc);
        this.xmlCanc = xmlCanc;
   }

   public char[] getXmlCancProtAut() {
        return xmlCancProtAut;
   }

   public void setXmlCancProtAut(char[] xmlCancProtAut) {
        markAsChanged("XMLCANCPROTAUT", xmlCancProtAut);
        this.xmlCancProtAut = xmlCancProtAut;
   }

   public char[] getXmlCancEnvCli() {
        return xmlCancEnvCli;
   }

   public void setXmlCancEnvCli(char[] xmlCancEnvCli) {
        markAsChanged("XMLCANCENVCLI", xmlCancEnvCli);
        this.xmlCancEnvCli = xmlCancEnvCli;
   }

   public char[] getXmlEnvCartRotAut() {
        return xmlEnvCartRotAut;
   }

   public void setXmlEnvCartRotAut(char[] xmlEnvCartRotAut) {
        markAsChanged("XMLENVCARTROTAUT", xmlEnvCartRotAut);
        this.xmlEnvCartRotAut = xmlEnvCartRotAut;
   }

   public char[] getXmlProtAutEpec() {
        return xmlProtAutEpec;
   }

   public void setXmlProtAutEpec(char[] xmlProtAutEpec) {
        markAsChanged("XMLPROTAUTEPEC", xmlProtAutEpec);
        this.xmlProtAutEpec = xmlProtAutEpec;
   }

   public char[] getXmlEnvEpec() {
        return xmlEnvEpec;
   }

   public void setXmlEnvEpec(char[] xmlEnvEpec) {
        markAsChanged("XMLENVEPEC", xmlEnvEpec);
        this.xmlEnvEpec = xmlEnvEpec;
   }

   public char[] getXmlEnvCliCanc() {
        return xmlEnvCliCanc;
   }

   public void setXmlEnvCliCanc(char[] xmlEnvCliCanc) {
        markAsChanged("XMLENVCLICANC", xmlEnvCliCanc);
        this.xmlEnvCliCanc = xmlEnvCliCanc;
   }

   public char[] getXmlProtCanc() {
        return xmlProtCanc;
   }

   public void setXmlProtCanc(char[] xmlProtCanc) {
        markAsChanged("XMLPROTCANC", xmlProtCanc);
        this.xmlProtCanc = xmlProtCanc;
   }

   public String getQrCode() {
        return qrCode;
   }

   public void setQrCode(String qrCode) {
        markAsChanged("QRCODE", qrCode);
        this.qrCode = qrCode;
   }

   @Override
   public String getTableName() {
        return "TGFNCTE";
   }

   @Override
   public String getEntityName() {
        return "ArquivoCTe";
   }

   @Override
   public ArquivoCTe fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.xmlProtAutCte = vo.asClob("XMLPROTAUTCTE");
        this.xmlEnvCartEnvCli = vo.asClob("XMLENVCARTENVCLI");
        this.xmlEnvCli = vo.asClob("XMLENVCLI");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.xml = vo.asClob("XML");
        this.chaveCte = vo.asString("CHAVECTE");
        this.xmlEnvCarta = vo.asClob("XMLENVCARTA");
        this.xmlCanc = vo.asClob("XMLCANC");
        this.xmlCancProtAut = vo.asClob("XMLCANCPROTAUT");
        this.xmlCancEnvCli = vo.asClob("XMLCANCENVCLI");
        this.xmlEnvCartRotAut = vo.asClob("XMLENVCARTROTAUT");
        this.xmlProtAutEpec = vo.asClob("XMLPROTAUTEPEC");
        this.xmlEnvEpec = vo.asClob("XMLENVEPEC");
        this.xmlEnvCliCanc = vo.asClob("XMLENVCLICANC");
        this.xmlProtCanc = vo.asClob("XMLPROTCANC");
        this.qrCode = vo.asString("QRCODE");
        return this;
   }
}
