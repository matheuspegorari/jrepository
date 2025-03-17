package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDFilaMensagem implements SankhyaEntity<MSDFilaMensagem> {

   private Timestamp dhUltTenta;
   private String assunto;
   private BigDecimal codCon;
   private BigDecimal codFila;
   private BigDecimal codMsg;
   private BigDecimal codUsu;
   private BigDecimal codUsuRemet;
   private Timestamp dtEntrada;
   private String email;
   private String emailSemCopia;
   private BigDecimal maxTentEnvio;
   private char[] mensagem;
   private String mimeType;
   private BigDecimal nuAnexo;
   private BigDecimal nuChave;
   private String reenviar;
   private String status;
   private BigDecimal tentEnvio;
   private String tipoDoc;
   private String tipoEnvio;
   private String msgErro;
   private BigDecimal codSmtp;
   private String celular;
   private BigDecimal codContaSms;
   private String dbHashCode;

   public Timestamp getDhUltTenta() {
        return dhUltTenta;
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        this.dhUltTenta = dhUltTenta;
   }

   public String getAssunto() {
        return assunto;
   }

   public void setAssunto(String assunto) {
        this.assunto = assunto;
   }

   public BigDecimal getCodCon() {
        return codCon;
   }

   public void setCodCon(BigDecimal codCon) {
        this.codCon = codCon;
   }

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        this.codFila = codFila;
   }

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        this.codMsg = codMsg;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuRemet() {
        return codUsuRemet;
   }

   public void setCodUsuRemet(BigDecimal codUsuRemet) {
        this.codUsuRemet = codUsuRemet;
   }

   public Timestamp getDtEntrada() {
        return dtEntrada;
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        this.dtEntrada = dtEntrada;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getEmailSemCopia() {
        return emailSemCopia;
   }

   public void setEmailSemCopia(String emailSemCopia) {
        this.emailSemCopia = emailSemCopia;
   }

   public BigDecimal getMaxTentEnvio() {
        return maxTentEnvio;
   }

   public void setMaxTentEnvio(BigDecimal maxTentEnvio) {
        this.maxTentEnvio = maxTentEnvio;
   }

   public char[] getMensagem() {
        return mensagem;
   }

   public void setMensagem(char[] mensagem) {
        this.mensagem = mensagem;
   }

   public String getMimeType() {
        return mimeType;
   }

   public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
   }

   public BigDecimal getNuAnexo() {
        return nuAnexo;
   }

   public void setNuAnexo(BigDecimal nuAnexo) {
        this.nuAnexo = nuAnexo;
   }

   public BigDecimal getNuChave() {
        return nuChave;
   }

   public void setNuChave(BigDecimal nuChave) {
        this.nuChave = nuChave;
   }

   public String getReenviar() {
        return reenviar;
   }

   public void setReenviar(String reenviar) {
        this.reenviar = reenviar;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public BigDecimal getTentEnvio() {
        return tentEnvio;
   }

   public void setTentEnvio(BigDecimal tentEnvio) {
        this.tentEnvio = tentEnvio;
   }

   public String getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
   }

   public String getTipoEnvio() {
        return tipoEnvio;
   }

   public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
   }

   public String getMsgErro() {
        return msgErro;
   }

   public void setMsgErro(String msgErro) {
        this.msgErro = msgErro;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        this.codSmtp = codSmtp;
   }

   public String getCelular() {
        return celular;
   }

   public void setCelular(String celular) {
        this.celular = celular;
   }

   public BigDecimal getCodContaSms() {
        return codContaSms;
   }

   public void setCodContaSms(BigDecimal codContaSms) {
        this.codContaSms = codContaSms;
   }

   public String getDbHashCode() {
        return dbHashCode;
   }

   public void setDbHashCode(String dbHashCode) {
        this.dbHashCode = dbHashCode;
   }

   @Override
   public String getEntityName() {
        return "MSDFilaMensagem";
   }

   @Override
   public MSDFilaMensagem fromVO(DynamicVO vo) {
        this.dhUltTenta = vo.asTimestamp("DHULTTENTA");
        this.assunto = vo.asString("ASSUNTO");
        this.codCon = vo.asBigDecimal("CODCON");
        this.codFila = vo.asBigDecimal("CODFILA");
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuRemet = vo.asBigDecimal("CODUSUREMET");
        this.dtEntrada = vo.asTimestamp("DTENTRADA");
        this.email = vo.asString("EMAIL");
        this.emailSemCopia = vo.asString("EMAILSEMCOPIA");
        this.maxTentEnvio = vo.asBigDecimal("MAXTENTENVIO");
        this.mensagem = vo.asClob("MENSAGEM");
        this.mimeType = vo.asString("MIMETYPE");
        this.nuAnexo = vo.asBigDecimal("NUANEXO");
        this.nuChave = vo.asBigDecimal("NUCHAVE");
        this.reenviar = vo.asString("REENVIAR");
        this.status = vo.asString("STATUS");
        this.tentEnvio = vo.asBigDecimal("TENTENVIO");
        this.tipoDoc = vo.asString("TIPODOC");
        this.tipoEnvio = vo.asString("TIPOENVIO");
        this.msgErro = vo.asString("MSGERRO");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        this.celular = vo.asString("CELULAR");
        this.codContaSms = vo.asBigDecimal("CODCONTASMS");
        this.dbHashCode = vo.asString("DBHASHCODE");
        return this;
   }
}
