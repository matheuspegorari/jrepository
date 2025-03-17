package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class EventoProgramavel implements SankhyaEntity<EventoProgramavel> {

   private String ativo;
   private char[] config;
   private String descricao;
   private String nomeInstancia;
   private BigDecimal nuEvento;
   private BigDecimal ordem;
   private String resourceId;
   private String tipo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        this.config = config;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        this.nomeInstancia = nomeInstancia;
   }

   public BigDecimal getNuEvento() {
        return nuEvento;
   }

   public void setNuEvento(BigDecimal nuEvento) {
        this.nuEvento = nuEvento;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "EventoProgramavel";
   }

   @Override
   public EventoProgramavel fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.config = vo.asClob("CONFIG");
        this.descricao = vo.asString("DESCRICAO");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.nuEvento = vo.asBigDecimal("NUEVENTO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.resourceId = vo.asString("RESOURCEID");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
