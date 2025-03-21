package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfigsOAuth extends AbstractSankhyaEntity<ConfigsOAuth> {
   private String clientId;
   private String clientSecret;
   private BigDecimal codAth;
   private String nome;
   private String nomeDaApi;
   private String redirectUri;
   private String scopes;
   private String urlApiGoogle;
   private String urlGetAccessToken;
   private String urlGooglePeople;
   private String provedor;
   private String tenant;

   public String getClientId() {
        return clientId;
   }

   public void setClientId(String clientId) {
        markAsChanged("CLIENTID", clientId);
        this.clientId = clientId;
   }

   public String getClientSecret() {
        return clientSecret;
   }

   public void setClientSecret(String clientSecret) {
        markAsChanged("CLIENTSECRET", clientSecret);
        this.clientSecret = clientSecret;
   }

   public BigDecimal getCodAth() {
        return codAth;
   }

   public void setCodAth(BigDecimal codAth) {
        markAsChanged("CODATH", codAth);
        this.codAth = codAth;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public String getNomeDaApi() {
        return nomeDaApi;
   }

   public void setNomeDaApi(String nomeDaApi) {
        markAsChanged("NOMEDAAPI", nomeDaApi);
        this.nomeDaApi = nomeDaApi;
   }

   public String getRedirectUri() {
        return redirectUri;
   }

   public void setRedirectUri(String redirectUri) {
        markAsChanged("REDIRECTURI", redirectUri);
        this.redirectUri = redirectUri;
   }

   public String getScopes() {
        return scopes;
   }

   public void setScopes(String scopes) {
        markAsChanged("SCOPES", scopes);
        this.scopes = scopes;
   }

   public String getUrlApiGoogle() {
        return urlApiGoogle;
   }

   public void setUrlApiGoogle(String urlApiGoogle) {
        markAsChanged("URLAPIGOOGLE", urlApiGoogle);
        this.urlApiGoogle = urlApiGoogle;
   }

   public String getUrlGetAccessToken() {
        return urlGetAccessToken;
   }

   public void setUrlGetAccessToken(String urlGetAccessToken) {
        markAsChanged("URLGETACCESSTOKEN", urlGetAccessToken);
        this.urlGetAccessToken = urlGetAccessToken;
   }

   public String getUrlGooglePeople() {
        return urlGooglePeople;
   }

   public void setUrlGooglePeople(String urlGooglePeople) {
        markAsChanged("URLGOOGLEPEOPLE", urlGooglePeople);
        this.urlGooglePeople = urlGooglePeople;
   }

   public String getProvedor() {
        return provedor;
   }

   public void setProvedor(String provedor) {
        markAsChanged("PROVEDOR", provedor);
        this.provedor = provedor;
   }

   public String getTenant() {
        return tenant;
   }

   public void setTenant(String tenant) {
        markAsChanged("TENANT", tenant);
        this.tenant = tenant;
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
        this.setOriginalVO(vo);
        this.clientId = vo.asString("CLIENTID");
        this.clientSecret = vo.asString("CLIENTSECRET");
        this.codAth = vo.asBigDecimal("CODATH");
        this.nome = vo.asString("NOME");
        this.nomeDaApi = vo.asString("NOMEDAAPI");
        this.redirectUri = vo.asString("REDIRECTURI");
        this.scopes = vo.asString("SCOPES");
        this.urlApiGoogle = vo.asString("URLAPIGOOGLE");
        this.urlGetAccessToken = vo.asString("URLGETACCESSTOKEN");
        this.urlGooglePeople = vo.asString("URLGOOGLEPEOPLE");
        this.provedor = vo.asString("PROVEDOR");
        this.tenant = vo.asString("TENANT");
        return this;
   }
}
