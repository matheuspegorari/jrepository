package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ArquivoNFSe extends AbstractSankhyaEntity<ArquivoNFSe> {
   public char[] getXmlIntegracao() {
        return this.getVo().asClob("XMLINTEGRACAO");
   }

   public void setXmlIntegracao(char[] xmlIntegracao) {
        markAsChanged("XMLINTEGRACAO", xmlIntegracao);
   }

   public String getCodVerifNfse() {
        return this.getVo().asString("CODVERIFNFSE");
   }

   public void setCodVerifNfse(String codVerifNfse) {
        markAsChanged("CODVERIFNFSE", codVerifNfse);
   }

   public Timestamp getDhemissNfse() {
        return this.getVo().asTimestamp("DHEMISSNFSE");
   }

   public void setDhemissNfse(Timestamp dhemissNfse) {
        markAsChanged("DHEMISSNFSE", dhemissNfse);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public char[] getXmlConfCanc() {
        return this.getVo().asClob("XMLCONFCANC");
   }

   public void setXmlConfCanc(char[] xmlConfCanc) {
        markAsChanged("XMLCONFCANC", xmlConfCanc);
   }

   public char[] getXmlNfse() {
        return this.getVo().asClob("XMLNFSE");
   }

   public void setXmlNfse(char[] xmlNfse) {
        markAsChanged("XMLNFSE", xmlNfse);
   }

   public char[] getXmlPedCanc() {
        return this.getVo().asClob("XMLPEDCANC");
   }

   public void setXmlPedCanc(char[] xmlPedCanc) {
        markAsChanged("XMLPEDCANC", xmlPedCanc);
   }

   public char[] getXmlRps() {
        return this.getVo().asClob("XMLRPS");
   }

   public void setXmlRps(char[] xmlRps) {
        markAsChanged("XMLRPS", xmlRps);
   }

   public String getLinkNfse() {
        return this.getVo().asString("LINKNFSE");
   }

   public void setLinkNfse(String linkNfse) {
        markAsChanged("LINKNFSE", linkNfse);
   }

   public char[] getXmlDps() {
        return this.getVo().asClob("XMLDPS");
   }

   public void setXmlDps(char[] xmlDps) {
        markAsChanged("XMLDPS", xmlDps);
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
        this.setVo(vo);
        return this;
   }
}
