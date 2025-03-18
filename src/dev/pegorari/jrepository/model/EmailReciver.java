package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmailReciver extends AbstractSankhyaEntity<EmailReciver> {
   private String situacaoNfe;
   private BigDecimal nuMail;
   private String chaveDoc;
   private Timestamp dtDownload;
   private char[] xml;
   private String tipoNota;
   private BigDecimal nuArquivo;
   private String mensagem;

   public String getSituacaoNfe() {
        return situacaoNfe;
   }

   public void setSituacaoNfe(String situacaoNfe) {
        markAsChanged("SITUACAONFE", situacaoNfe);
        this.situacaoNfe = situacaoNfe;
   }

   public BigDecimal getNuMail() {
        return nuMail;
   }

   public void setNuMail(BigDecimal nuMail) {
        markAsChanged("NUMAIL", nuMail);
        this.nuMail = nuMail;
   }

   public String getChaveDoc() {
        return chaveDoc;
   }

   public void setChaveDoc(String chaveDoc) {
        markAsChanged("CHAVEDOC", chaveDoc);
        this.chaveDoc = chaveDoc;
   }

   public Timestamp getDtDownload() {
        return dtDownload;
   }

   public void setDtDownload(Timestamp dtDownload) {
        markAsChanged("DTDOWNLOAD", dtDownload);
        this.dtDownload = dtDownload;
   }

   public char[] getXml() {
        return xml;
   }

   public void setXml(char[] xml) {
        markAsChanged("XML", xml);
        this.xml = xml;
   }

   public String getTipoNota() {
        return tipoNota;
   }

   public void setTipoNota(String tipoNota) {
        markAsChanged("TIPONOTA", tipoNota);
        this.tipoNota = tipoNota;
   }

   public BigDecimal getNuArquivo() {
        return nuArquivo;
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        markAsChanged("NUARQUIVO", nuArquivo);
        this.nuArquivo = nuArquivo;
   }

   public String getMensagem() {
        return mensagem;
   }

   public void setMensagem(String mensagem) {
        markAsChanged("MENSAGEM", mensagem);
        this.mensagem = mensagem;
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
        this.setOriginalVO(vo);
        this.situacaoNfe = vo.asString("SITUACAONFE");
        this.nuMail = vo.asBigDecimal("NUMAIL");
        this.chaveDoc = vo.asString("CHAVEDOC");
        this.dtDownload = vo.asTimestamp("DTDOWNLOAD");
        this.xml = vo.asClob("XML");
        this.tipoNota = vo.asString("TIPONOTA");
        this.nuArquivo = vo.asBigDecimal("NUARQUIVO");
        this.mensagem = vo.asString("MENSAGEM");
        return this;
   }
}
