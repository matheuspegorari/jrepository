package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ArquivoCTe extends AbstractSankhyaEntity<ArquivoCTe> {
   public char[] getXmlProtAutCte() {
        return this.getVo().asClob("XMLPROTAUTCTE");
   }

   public void setXmlProtAutCte(char[] xmlProtAutCte) {
        markAsChanged("XMLPROTAUTCTE", xmlProtAutCte);
   }

   public char[] getXmlEnvCartEnvCli() {
        return this.getVo().asClob("XMLENVCARTENVCLI");
   }

   public void setXmlEnvCartEnvCli(char[] xmlEnvCartEnvCli) {
        markAsChanged("XMLENVCARTENVCLI", xmlEnvCartEnvCli);
   }

   public char[] getXmlEnvCli() {
        return this.getVo().asClob("XMLENVCLI");
   }

   public void setXmlEnvCli(char[] xmlEnvCli) {
        markAsChanged("XMLENVCLI", xmlEnvCli);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public char[] getXml() {
        return this.getVo().asClob("XML");
   }

   public void setXml(char[] xml) {
        markAsChanged("XML", xml);
   }

   public String getChaveCte() {
        return this.getVo().asString("CHAVECTE");
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
   }

   public char[] getXmlEnvCarta() {
        return this.getVo().asClob("XMLENVCARTA");
   }

   public void setXmlEnvCarta(char[] xmlEnvCarta) {
        markAsChanged("XMLENVCARTA", xmlEnvCarta);
   }

   public char[] getXmlCanc() {
        return this.getVo().asClob("XMLCANC");
   }

   public void setXmlCanc(char[] xmlCanc) {
        markAsChanged("XMLCANC", xmlCanc);
   }

   public char[] getXmlCancProtAut() {
        return this.getVo().asClob("XMLCANCPROTAUT");
   }

   public void setXmlCancProtAut(char[] xmlCancProtAut) {
        markAsChanged("XMLCANCPROTAUT", xmlCancProtAut);
   }

   public char[] getXmlCancEnvCli() {
        return this.getVo().asClob("XMLCANCENVCLI");
   }

   public void setXmlCancEnvCli(char[] xmlCancEnvCli) {
        markAsChanged("XMLCANCENVCLI", xmlCancEnvCli);
   }

   public char[] getXmlEnvCartRotAut() {
        return this.getVo().asClob("XMLENVCARTROTAUT");
   }

   public void setXmlEnvCartRotAut(char[] xmlEnvCartRotAut) {
        markAsChanged("XMLENVCARTROTAUT", xmlEnvCartRotAut);
   }

   public char[] getXmlProtAutEpec() {
        return this.getVo().asClob("XMLPROTAUTEPEC");
   }

   public void setXmlProtAutEpec(char[] xmlProtAutEpec) {
        markAsChanged("XMLPROTAUTEPEC", xmlProtAutEpec);
   }

   public char[] getXmlEnvEpec() {
        return this.getVo().asClob("XMLENVEPEC");
   }

   public void setXmlEnvEpec(char[] xmlEnvEpec) {
        markAsChanged("XMLENVEPEC", xmlEnvEpec);
   }

   public char[] getXmlEnvCliCanc() {
        return this.getVo().asClob("XMLENVCLICANC");
   }

   public void setXmlEnvCliCanc(char[] xmlEnvCliCanc) {
        markAsChanged("XMLENVCLICANC", xmlEnvCliCanc);
   }

   public char[] getXmlProtCanc() {
        return this.getVo().asClob("XMLPROTCANC");
   }

   public void setXmlProtCanc(char[] xmlProtCanc) {
        markAsChanged("XMLPROTCANC", xmlProtCanc);
   }

   public String getQrCode() {
        return this.getVo().asString("QRCODE");
   }

   public void setQrCode(String qrCode) {
        markAsChanged("QRCODE", qrCode);
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
        this.setVo(vo);
        return this;
   }
}
