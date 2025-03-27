package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContaSincAgenda extends AbstractSankhyaEntity<ContaSincAgenda> {
   public String getAuthCode() {
        return this.getVo().asString("AUTHCODE");
   }

   public void setAuthCode(String authCode) {
        markAsChanged("AUTHCODE", authCode);
   }

   public String getEmailEnviado() {
        return this.getVo().asString("EMAILENVIADO");
   }

   public void setEmailEnviado(String emailEnviado) {
        markAsChanged("EMAILENVIADO", emailEnviado);
   }

   public String getRefreshToken() {
        return this.getVo().asString("REFRESHTOKEN");
   }

   public void setRefreshToken(String refreshToken) {
        markAsChanged("REFRESHTOKEN", refreshToken);
   }

   public String getToken() {
        return this.getVo().asString("TOKEN");
   }

   public void setToken(String token) {
        markAsChanged("TOKEN", token);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getContaSincAgenda() {
        return this.getVo().asString("CONTASINCAGENDA");
   }

   public void setContaSincAgenda(String contaSincAgenda) {
        markAsChanged("CONTASINCAGENDA", contaSincAgenda);
   }

   public Timestamp getDhUltSincAgenda() {
        return this.getVo().asTimestamp("DHULTSINCAGENDA");
   }

   public void setDhUltSincAgenda(Timestamp dhUltSincAgenda) {
        markAsChanged("DHULTSINCAGENDA", dhUltSincAgenda);
   }

   public String getIdSincAgenda() {
        return this.getVo().asString("IDSINCAGENDA");
   }

   public void setIdSincAgenda(String idSincAgenda) {
        markAsChanged("IDSINCAGENDA", idSincAgenda);
   }

   public String getSenhaSincAgenda() {
        return this.getVo().asString("SENHASINCAGENDA");
   }

   public void setSenhaSincAgenda(String senhaSincAgenda) {
        markAsChanged("SENHASINCAGENDA", senhaSincAgenda);
   }

   public String getSincAgenda() {
        return this.getVo().asString("SINCAGENDA");
   }

   public void setSincAgenda(String sincAgenda) {
        markAsChanged("SINCAGENDA", sincAgenda);
   }

   public Timestamp getDhToken() {
        return this.getVo().asTimestamp("DHTOKEN");
   }

   public void setDhToken(Timestamp dhToken) {
        markAsChanged("DHTOKEN", dhToken);
   }

   public BigDecimal getExpireIn() {
        return this.getVo().asBigDecimal("EXPIREIN");
   }

   public void setExpireIn(BigDecimal expireIn) {
        markAsChanged("EXPIREIN", expireIn);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getSincStatus() {
        return this.getVo().asString("SINCSTATUS");
   }

   public void setSincStatus(String sincStatus) {
        markAsChanged("SINCSTATUS", sincStatus);
   }

   @Override
   public String getTableName() {
        return "TCSSAG";
   }

   @Override
   public String getEntityName() {
        return "ContaSincAgenda";
   }

   @Override
   public ContaSincAgenda fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
