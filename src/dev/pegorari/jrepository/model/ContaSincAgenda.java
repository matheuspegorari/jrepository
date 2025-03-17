package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContaSincAgenda implements SankhyaEntity<ContaSincAgenda> {

   private String authCode;
   private String emailEnviado;
   private String refreshToken;
   private String token;
   private BigDecimal codUsu;
   private String contaSincAgenda;
   private Timestamp dhUltSincAgenda;
   private String idSincAgenda;
   private String senhaSincAgenda;
   private String sincAgenda;
   private Timestamp dhToken;
   private BigDecimal expireIn;
   private String email;
   private String sincStatus;

   public String getAuthCode() {
        return authCode;
   }

   public void setAuthCode(String authCode) {
        this.authCode = authCode;
   }

   public String getEmailEnviado() {
        return emailEnviado;
   }

   public void setEmailEnviado(String emailEnviado) {
        this.emailEnviado = emailEnviado;
   }

   public String getRefreshToken() {
        return refreshToken;
   }

   public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
   }

   public String getToken() {
        return token;
   }

   public void setToken(String token) {
        this.token = token;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getContaSincAgenda() {
        return contaSincAgenda;
   }

   public void setContaSincAgenda(String contaSincAgenda) {
        this.contaSincAgenda = contaSincAgenda;
   }

   public Timestamp getDhUltSincAgenda() {
        return dhUltSincAgenda;
   }

   public void setDhUltSincAgenda(Timestamp dhUltSincAgenda) {
        this.dhUltSincAgenda = dhUltSincAgenda;
   }

   public String getIdSincAgenda() {
        return idSincAgenda;
   }

   public void setIdSincAgenda(String idSincAgenda) {
        this.idSincAgenda = idSincAgenda;
   }

   public String getSenhaSincAgenda() {
        return senhaSincAgenda;
   }

   public void setSenhaSincAgenda(String senhaSincAgenda) {
        this.senhaSincAgenda = senhaSincAgenda;
   }

   public String getSincAgenda() {
        return sincAgenda;
   }

   public void setSincAgenda(String sincAgenda) {
        this.sincAgenda = sincAgenda;
   }

   public Timestamp getDhToken() {
        return dhToken;
   }

   public void setDhToken(Timestamp dhToken) {
        this.dhToken = dhToken;
   }

   public BigDecimal getExpireIn() {
        return expireIn;
   }

   public void setExpireIn(BigDecimal expireIn) {
        this.expireIn = expireIn;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getSincStatus() {
        return sincStatus;
   }

   public void setSincStatus(String sincStatus) {
        this.sincStatus = sincStatus;
   }

   @Override
   public String getEntityName() {
        return "ContaSincAgenda";
   }

   @Override
   public ContaSincAgenda fromVO(DynamicVO vo) {
        this.authCode = vo.asString("AUTHCODE");
        this.emailEnviado = vo.asString("EMAILENVIADO");
        this.refreshToken = vo.asString("REFRESHTOKEN");
        this.token = vo.asString("TOKEN");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.contaSincAgenda = vo.asString("CONTASINCAGENDA");
        this.dhUltSincAgenda = vo.asTimestamp("DHULTSINCAGENDA");
        this.idSincAgenda = vo.asString("IDSINCAGENDA");
        this.senhaSincAgenda = vo.asString("SENHASINCAGENDA");
        this.sincAgenda = vo.asString("SINCAGENDA");
        this.dhToken = vo.asTimestamp("DHTOKEN");
        this.expireIn = vo.asBigDecimal("EXPIREIN");
        this.email = vo.asString("EMAIL");
        this.sincStatus = vo.asString("SINCSTATUS");
        return this;
   }
}
