package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoProcessoNegocio extends AbstractSankhyaEntity<EventoProcessoNegocio> {
   public String getAcao() {
        return this.getVo().asString("ACAO");
   }

   public void setAcao(String acao) {
        markAsChanged("ACAO", acao);
   }

   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public String getDescRevento() {
        return this.getVo().asString("DESCREVENTO");
   }

   public void setDescRevento(String descRevento) {
        markAsChanged("DESCREVENTO", descRevento);
   }

   public String getFormato() {
        return this.getVo().asString("FORMATO");
   }

   public void setFormato(String formato) {
        markAsChanged("FORMATO", formato);
   }

   public String getFormulario() {
        return this.getVo().asString("FORMULARIO");
   }

   public void setFormulario(String formulario) {
        markAsChanged("FORMULARIO", formulario);
   }

   public String getIdElemento() {
        return this.getVo().asString("IDELEMENTO");
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
   }

   public BigDecimal getNuEvent() {
        return this.getVo().asBigDecimal("NUEVENT");
   }

   public void setNuEvent(BigDecimal nuEvent) {
        markAsChanged("NUEVENT", nuEvent);
   }

   public String getOnde() {
        return this.getVo().asString("ONDE");
   }

   public void setOnde(String onde) {
        markAsChanged("ONDE", onde);
   }

   public String getQuando() {
        return this.getVo().asString("QUANDO");
   }

   public void setQuando(String quando) {
        markAsChanged("QUANDO", quando);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getTipoAcao() {
        return this.getVo().asBigDecimal("TIPOACAO");
   }

   public void setTipoAcao(BigDecimal tipoAcao) {
        markAsChanged("TIPOACAO", tipoAcao);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
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
        this.setVo(vo);
        return this;
   }
}
