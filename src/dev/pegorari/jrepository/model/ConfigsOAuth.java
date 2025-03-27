package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfigsOAuth extends AbstractSankhyaEntity<ConfigsOAuth> {
   public String getClientId() {
        return this.getVo().asString("CLIENTID");
   }

   public void setClientId(String clientId) {
        markAsChanged("CLIENTID", clientId);
   }

   public String getClientSecret() {
        return this.getVo().asString("CLIENTSECRET");
   }

   public void setClientSecret(String clientSecret) {
        markAsChanged("CLIENTSECRET", clientSecret);
   }

   public BigDecimal getCodAth() {
        return this.getVo().asBigDecimal("CODATH");
   }

   public void setCodAth(BigDecimal codAth) {
        markAsChanged("CODATH", codAth);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getNomeDaApi() {
        return this.getVo().asString("NOMEDAAPI");
   }

   public void setNomeDaApi(String nomeDaApi) {
        markAsChanged("NOMEDAAPI", nomeDaApi);
   }

   public String getRedirectUri() {
        return this.getVo().asString("REDIRECTURI");
   }

   public void setRedirectUri(String redirectUri) {
        markAsChanged("REDIRECTURI", redirectUri);
   }

   public String getScopes() {
        return this.getVo().asString("SCOPES");
   }

   public void setScopes(String scopes) {
        markAsChanged("SCOPES", scopes);
   }

   public String getUrlApiGoogle() {
        return this.getVo().asString("URLAPIGOOGLE");
   }

   public void setUrlApiGoogle(String urlApiGoogle) {
        markAsChanged("URLAPIGOOGLE", urlApiGoogle);
   }

   public String getUrlGetAccessToken() {
        return this.getVo().asString("URLGETACCESSTOKEN");
   }

   public void setUrlGetAccessToken(String urlGetAccessToken) {
        markAsChanged("URLGETACCESSTOKEN", urlGetAccessToken);
   }

   public String getUrlGooglePeople() {
        return this.getVo().asString("URLGOOGLEPEOPLE");
   }

   public void setUrlGooglePeople(String urlGooglePeople) {
        markAsChanged("URLGOOGLEPEOPLE", urlGooglePeople);
   }

   public String getProvedor() {
        return this.getVo().asString("PROVEDOR");
   }

   public void setProvedor(String provedor) {
        markAsChanged("PROVEDOR", provedor);
   }

   public String getTenant() {
        return this.getVo().asString("TENANT");
   }

   public void setTenant(String tenant) {
        markAsChanged("TENANT", tenant);
   }

   @Override
   public String getTableName() {
        return "TSIATH";
   }

   @Override
   public String getEntityName() {
        return "ConfigsOAuth";
   }

   @Override
   public ConfigsOAuth fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
