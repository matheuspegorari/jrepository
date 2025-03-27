package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDFilaMensagem extends AbstractSankhyaEntity<MSDFilaMensagem> {
   public Timestamp getDhUltTenta() {
        return this.getVo().asTimestamp("DHULTTENTA");
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        markAsChanged("DHULTTENTA", dhUltTenta);
   }

   public String getAssunto() {
        return this.getVo().asString("ASSUNTO");
   }

   public void setAssunto(String assunto) {
        markAsChanged("ASSUNTO", assunto);
   }

   public BigDecimal getCodCon() {
        return this.getVo().asBigDecimal("CODCON");
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
   }

   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   public BigDecimal getCodMsg() {
        return this.getVo().asBigDecimal("CODMSG");
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuRemet() {
        return this.getVo().asBigDecimal("CODUSUREMET");
   }

   public void setCodUsuRemet(BigDecimal codUsuRemet) {
        markAsChanged("CODUSUREMET", codUsuRemet);
   }

   public Timestamp getDtEntrada() {
        return this.getVo().asTimestamp("DTENTRADA");
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        markAsChanged("DTENTRADA", dtEntrada);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getEmailSemCopia() {
        return this.getVo().asString("EMAILSEMCOPIA");
   }

   public void setEmailSemCopia(String emailSemCopia) {
        markAsChanged("EMAILSEMCOPIA", emailSemCopia);
   }

   public BigDecimal getMaxTentEnvio() {
        return this.getVo().asBigDecimal("MAXTENTENVIO");
   }

   public void setMaxTentEnvio(BigDecimal maxTentEnvio) {
        markAsChanged("MAXTENTENVIO", maxTentEnvio);
   }

   public char[] getMensagem() {
        return this.getVo().asClob("MENSAGEM");
   }

   public void setMensagem(char[] mensagem) {
        markAsChanged("MENSAGEM", mensagem);
   }

   public String getMimeType() {
        return this.getVo().asString("MIMETYPE");
   }

   public void setMimeType(String mimeType) {
        markAsChanged("MIMETYPE", mimeType);
   }

   public BigDecimal getNuAnexo() {
        return this.getVo().asBigDecimal("NUANEXO");
   }

   public void setNuAnexo(BigDecimal nuAnexo) {
        markAsChanged("NUANEXO", nuAnexo);
   }

   public BigDecimal getNuChave() {
        return this.getVo().asBigDecimal("NUCHAVE");
   }

   public void setNuChave(BigDecimal nuChave) {
        markAsChanged("NUCHAVE", nuChave);
   }

   public String getReenviar() {
        return this.getVo().asString("REENVIAR");
   }

   public void setReenviar(String reenviar) {
        markAsChanged("REENVIAR", reenviar);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getTentEnvio() {
        return this.getVo().asBigDecimal("TENTENVIO");
   }

   public void setTentEnvio(BigDecimal tentEnvio) {
        markAsChanged("TENTENVIO", tentEnvio);
   }

   public String getTipoDoc() {
        return this.getVo().asString("TIPODOC");
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   public String getTipoEnvio() {
        return this.getVo().asString("TIPOENVIO");
   }

   public void setTipoEnvio(String tipoEnvio) {
        markAsChanged("TIPOENVIO", tipoEnvio);
   }

   public String getMsgErro() {
        return this.getVo().asString("MSGERRO");
   }

   public void setMsgErro(String msgErro) {
        markAsChanged("MSGERRO", msgErro);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
   }

   public String getCelular() {
        return this.getVo().asString("CELULAR");
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
   }

   public BigDecimal getCodContaSms() {
        return this.getVo().asBigDecimal("CODCONTASMS");
   }

   public void setCodContaSms(BigDecimal codContaSms) {
        markAsChanged("CODCONTASMS", codContaSms);
   }

   public String getDbHashCode() {
        return this.getVo().asString("DBHASHCODE");
   }

   public void setDbHashCode(String dbHashCode) {
        markAsChanged("DBHASHCODE", dbHashCode);
   }

   @Override
   public String getTableName() {
        return "TMDFMG";
   }

   @Override
   public String getEntityName() {
        return "MSDFilaMensagem";
   }

   @Override
   public MSDFilaMensagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
