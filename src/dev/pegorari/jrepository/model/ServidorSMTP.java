package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ServidorSMTP extends AbstractSankhyaEntity<ServidorSMTP> {
   private String senha;
   private String usuario;
   private String servidor;
   private BigDecimal porta;
   private BigDecimal codSmtp;
   private String remetente;
   private String ignoraCertificado;
   private String padrao;
   private String tipo;
   private BigDecimal portaPop;
   private String servidorPop;
   private String utilDownXml;
   private String accessToken;
   private BigDecimal codAth;
   private String expiresIn;
   private String refreshToken;
   private String useOauth;

   public String getSenha() {
        return senha;
   }

   public void setSenha(String senha) {
        markAsChanged("SENHA", senha);
        this.senha = senha;
   }

   public String getUsuario() {
        return usuario;
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
        this.usuario = usuario;
   }

   public String getServidor() {
        return servidor;
   }

   public void setServidor(String servidor) {
        markAsChanged("SERVIDOR", servidor);
        this.servidor = servidor;
   }

   public BigDecimal getPorta() {
        return porta;
   }

   public void setPorta(BigDecimal porta) {
        markAsChanged("PORTA", porta);
        this.porta = porta;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
        this.codSmtp = codSmtp;
   }

   public String getRemetente() {
        return remetente;
   }

   public void setRemetente(String remetente) {
        markAsChanged("REMETENTE", remetente);
        this.remetente = remetente;
   }

   public String getIgnoraCertificado() {
        return ignoraCertificado;
   }

   public void setIgnoraCertificado(String ignoraCertificado) {
        markAsChanged("IGNORACERTIFICADO", ignoraCertificado);
        this.ignoraCertificado = ignoraCertificado;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
        this.padrao = padrao;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getPortaPop() {
        return portaPop;
   }

   public void setPortaPop(BigDecimal portaPop) {
        markAsChanged("PORTAPOP", portaPop);
        this.portaPop = portaPop;
   }

   public String getServidorPop() {
        return servidorPop;
   }

   public void setServidorPop(String servidorPop) {
        markAsChanged("SERVIDORPOP", servidorPop);
        this.servidorPop = servidorPop;
   }

   public String getUtilDownXml() {
        return utilDownXml;
   }

   public void setUtilDownXml(String utilDownXml) {
        markAsChanged("UTILDOWNXML", utilDownXml);
        this.utilDownXml = utilDownXml;
   }

   public String getAccessToken() {
        return accessToken;
   }

   public void setAccessToken(String accessToken) {
        markAsChanged("ACCESSTOKEN", accessToken);
        this.accessToken = accessToken;
   }

   public BigDecimal getCodAth() {
        return codAth;
   }

   public void setCodAth(BigDecimal codAth) {
        markAsChanged("CODATH", codAth);
        this.codAth = codAth;
   }

   public String getExpiresIn() {
        return expiresIn;
   }

   public void setExpiresIn(String expiresIn) {
        markAsChanged("EXPIRESIN", expiresIn);
        this.expiresIn = expiresIn;
   }

   public String getRefreshToken() {
        return refreshToken;
   }

   public void setRefreshToken(String refreshToken) {
        markAsChanged("REFRESHTOKEN", refreshToken);
        this.refreshToken = refreshToken;
   }

   public String getUseOauth() {
        return useOauth;
   }

   public void setUseOauth(String useOauth) {
        markAsChanged("USEOAUTH", useOauth);
        this.useOauth = useOauth;
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
        this.senha = vo.asString("SENHA");
        this.usuario = vo.asString("USUARIO");
        this.servidor = vo.asString("SERVIDOR");
        this.porta = vo.asBigDecimal("PORTA");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        this.remetente = vo.asString("REMETENTE");
        this.ignoraCertificado = vo.asString("IGNORACERTIFICADO");
        this.padrao = vo.asString("PADRAO");
        this.tipo = vo.asString("TIPO");
        this.portaPop = vo.asBigDecimal("PORTAPOP");
        this.servidorPop = vo.asString("SERVIDORPOP");
        this.utilDownXml = vo.asString("UTILDOWNXML");
        this.accessToken = vo.asString("ACCESSTOKEN");
        this.codAth = vo.asBigDecimal("CODATH");
        this.expiresIn = vo.asString("EXPIRESIN");
        this.refreshToken = vo.asString("REFRESHTOKEN");
        this.useOauth = vo.asString("USEOAUTH");
        return this;
   }
}
