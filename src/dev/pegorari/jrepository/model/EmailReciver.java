package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmailReciver extends AbstractSankhyaEntity<EmailReciver> {
   public String getSituacaoNfe() {
        return this.getVo().asString("SITUACAONFE");
   }

   public void setSituacaoNfe(String situacaoNfe) {
        markAsChanged("SITUACAONFE", situacaoNfe);
   }

   public BigDecimal getNuMail() {
        return this.getVo().asBigDecimal("NUMAIL");
   }

   public void setNuMail(BigDecimal nuMail) {
        markAsChanged("NUMAIL", nuMail);
   }

   public String getChaveDoc() {
        return this.getVo().asString("CHAVEDOC");
   }

   public void setChaveDoc(String chaveDoc) {
        markAsChanged("CHAVEDOC", chaveDoc);
   }

   public Timestamp getDtDownload() {
        return this.getVo().asTimestamp("DTDOWNLOAD");
   }

   public void setDtDownload(Timestamp dtDownload) {
        markAsChanged("DTDOWNLOAD", dtDownload);
   }

   public char[] getXml() {
        return this.getVo().asClob("XML");
   }

   public void setXml(char[] xml) {
        markAsChanged("XML", xml);
   }

   public String getTipoNota() {
        return this.getVo().asString("TIPONOTA");
   }

   public void setTipoNota(String tipoNota) {
        markAsChanged("TIPONOTA", tipoNota);
   }

   public BigDecimal getNuArquivo() {
        return this.getVo().asBigDecimal("NUARQUIVO");
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        markAsChanged("NUARQUIVO", nuArquivo);
   }

   public String getMensagem() {
        return this.getVo().asString("MENSAGEM");
   }

   public void setMensagem(String mensagem) {
        markAsChanged("MENSAGEM", mensagem);
   }

   @Override
   public String getTableName() {
        return "TGFMDT";
   }

   @Override
   public String getEntityName() {
        return "EmailReciver";
   }

   @Override
   public EmailReciver fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
