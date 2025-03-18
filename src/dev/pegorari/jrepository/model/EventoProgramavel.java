package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoProgramavel extends AbstractSankhyaEntity<EventoProgramavel> {
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
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
        this.nomeInstancia = nomeInstancia;
   }

   public BigDecimal getNuEvento() {
        return nuEvento;
   }

   public void setNuEvento(BigDecimal nuEvento) {
        markAsChanged("NUEVENTO", nuEvento);
        this.nuEvento = nuEvento;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
        this.resourceId = resourceId;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TSIEVP";
   }

   @Override
   public String getEntityName() {
        return "EventoProgramavel";
   }

   @Override
   public EventoProgramavel fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
