package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ServidorSMTP extends AbstractSankhyaEntity<ServidorSMTP> {
   public String getSenha() {
        return this.getVo().asString("SENHA");
   }

   public void setSenha(String senha) {
        markAsChanged("SENHA", senha);
   }

   public String getUsuario() {
        return this.getVo().asString("USUARIO");
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
   }

   public String getServidor() {
        return this.getVo().asString("SERVIDOR");
   }

   public void setServidor(String servidor) {
        markAsChanged("SERVIDOR", servidor);
   }

   public BigDecimal getPorta() {
        return this.getVo().asBigDecimal("PORTA");
   }

   public void setPorta(BigDecimal porta) {
        markAsChanged("PORTA", porta);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
   }

   public String getRemetente() {
        return this.getVo().asString("REMETENTE");
   }

   public void setRemetente(String remetente) {
        markAsChanged("REMETENTE", remetente);
   }

   public String getIgnoraCertificado() {
        return this.getVo().asString("IGNORACERTIFICADO");
   }

   public void setIgnoraCertificado(String ignoraCertificado) {
        markAsChanged("IGNORACERTIFICADO", ignoraCertificado);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getPortaPop() {
        return this.getVo().asBigDecimal("PORTAPOP");
   }

   public void setPortaPop(BigDecimal portaPop) {
        markAsChanged("PORTAPOP", portaPop);
   }

   public String getServidorPop() {
        return this.getVo().asString("SERVIDORPOP");
   }

   public void setServidorPop(String servidorPop) {
        markAsChanged("SERVIDORPOP", servidorPop);
   }

   public String getUtilDownXml() {
        return this.getVo().asString("UTILDOWNXML");
   }

   public void setUtilDownXml(String utilDownXml) {
        markAsChanged("UTILDOWNXML", utilDownXml);
   }

   public String getAccessToken() {
        return this.getVo().asString("ACCESSTOKEN");
   }

   public void setAccessToken(String accessToken) {
        markAsChanged("ACCESSTOKEN", accessToken);
   }

   public BigDecimal getCodAth() {
        return this.getVo().asBigDecimal("CODATH");
   }

   public void setCodAth(BigDecimal codAth) {
        markAsChanged("CODATH", codAth);
   }

   public String getExpiresIn() {
        return this.getVo().asString("EXPIRESIN");
   }

   public void setExpiresIn(String expiresIn) {
        markAsChanged("EXPIRESIN", expiresIn);
   }

   public String getRefreshToken() {
        return this.getVo().asString("REFRESHTOKEN");
   }

   public void setRefreshToken(String refreshToken) {
        markAsChanged("REFRESHTOKEN", refreshToken);
   }

   public String getUseOauth() {
        return this.getVo().asString("USEOAUTH");
   }

   public void setUseOauth(String useOauth) {
        markAsChanged("USEOAUTH", useOauth);
   }

   @Override
   public String getTableName() {
        return "TSISMTP";
   }

   @Override
   public String getEntityName() {
        return "ServidorSMTP";
   }

   @Override
   public ServidorSMTP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
