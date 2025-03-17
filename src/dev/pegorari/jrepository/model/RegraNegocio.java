package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegraNegocio extends AbstractSankhyaEntity<RegraNegocio> {
   private String ativo;
   private BigDecimal codUsuLib;
   private String descricao;
   private BigDecimal evento;
   private String expressao;
   private BigDecimal nuRng;
   private String onde;
   private String quando;
   private String tipoExpressao;
   private String inibeLib;
   private char[] config;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodUsuLib() {
        return codUsuLib;
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        this.codUsuLib = codUsuLib;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getEvento() {
        return evento;
   }

   public void setEvento(BigDecimal evento) {
        this.evento = evento;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   public BigDecimal getNuRng() {
        return nuRng;
   }

   public void setNuRng(BigDecimal nuRng) {
        this.nuRng = nuRng;
   }

   public String getOnde() {
        return onde;
   }

   public void setOnde(String onde) {
        this.onde = onde;
   }

   public String getQuando() {
        return quando;
   }

   public void setQuando(String quando) {
        this.quando = quando;
   }

   public String getTipoExpressao() {
        return tipoExpressao;
   }

   public void setTipoExpressao(String tipoExpressao) {
        this.tipoExpressao = tipoExpressao;
   }

   public String getInibeLib() {
        return inibeLib;
   }

   public void setInibeLib(String inibeLib) {
        this.inibeLib = inibeLib;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        this.config = config;
   }

   @Override
   public String getTableName() {
        return "TGFRNG";
   }

   @Override
   public String getEntityName() {
        return "RegraNegocio";
   }

   @Override
   public RegraNegocio fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codUsuLib = vo.asBigDecimal("CODUSULIB");
        this.descricao = vo.asString("DESCRICAO");
        this.evento = vo.asBigDecimal("EVENTO");
        this.expressao = vo.asString("EXPRESSAO");
        this.nuRng = vo.asBigDecimal("NURNG");
        this.onde = vo.asString("ONDE");
        this.quando = vo.asString("QUANDO");
        this.tipoExpressao = vo.asString("TIPOEXPRESSAO");
        this.inibeLib = vo.asString("INIBELIB");
        this.config = vo.asClob("CONFIG");
        return this;
   }
}
