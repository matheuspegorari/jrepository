package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoProcessoNegocio extends AbstractSankhyaEntity<EventoProcessoNegocio> {
   private String acao;
   private BigDecimal codPrn;
   private String descRevento;
   private String formato;
   private String formulario;
   private String idElemento;
   private BigDecimal nuEvent;
   private String onde;
   private String quando;
   private String referencia;
   private BigDecimal tipoAcao;
   private BigDecimal versao;

   public String getAcao() {
        return acao;
   }

   public void setAcao(String acao) {
        markAsChanged("ACAO", acao);
        this.acao = acao;
   }

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
        this.codPrn = codPrn;
   }

   public String getDescRevento() {
        return descRevento;
   }

   public void setDescRevento(String descRevento) {
        markAsChanged("DESCREVENTO", descRevento);
        this.descRevento = descRevento;
   }

   public String getFormato() {
        return formato;
   }

   public void setFormato(String formato) {
        markAsChanged("FORMATO", formato);
        this.formato = formato;
   }

   public String getFormulario() {
        return formulario;
   }

   public void setFormulario(String formulario) {
        markAsChanged("FORMULARIO", formulario);
        this.formulario = formulario;
   }

   public String getIdElemento() {
        return idElemento;
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
        this.idElemento = idElemento;
   }

   public BigDecimal getNuEvent() {
        return nuEvent;
   }

   public void setNuEvent(BigDecimal nuEvent) {
        markAsChanged("NUEVENT", nuEvent);
        this.nuEvent = nuEvent;
   }

   public String getOnde() {
        return onde;
   }

   public void setOnde(String onde) {
        markAsChanged("ONDE", onde);
        this.onde = onde;
   }

   public String getQuando() {
        return quando;
   }

   public void setQuando(String quando) {
        markAsChanged("QUANDO", quando);
        this.quando = quando;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getTipoAcao() {
        return tipoAcao;
   }

   public void setTipoAcao(BigDecimal tipoAcao) {
        markAsChanged("TIPOACAO", tipoAcao);
        this.tipoAcao = tipoAcao;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   @Override
   public String getTableName() {
        return "TWFEVE";
   }

   @Override
   public String getEntityName() {
        return "EventoProcessoNegocio";
   }

   @Override
   public EventoProcessoNegocio fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.acao = vo.asString("ACAO");
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.descRevento = vo.asString("DESCREVENTO");
        this.formato = vo.asString("FORMATO");
        this.formulario = vo.asString("FORMULARIO");
        this.idElemento = vo.asString("IDELEMENTO");
        this.nuEvent = vo.asBigDecimal("NUEVENT");
        this.onde = vo.asString("ONDE");
        this.quando = vo.asString("QUANDO");
        this.referencia = vo.asString("REFERENCIA");
        this.tipoAcao = vo.asBigDecimal("TIPOACAO");
        this.versao = vo.asBigDecimal("VERSAO");
        return this;
   }
}
