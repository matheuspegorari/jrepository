package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoFluxo extends AbstractSankhyaEntity<EventoFluxo> {
   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdeFxAnexado() {
        return this.getVo().asBigDecimal("IDEFXANEXADO");
   }

   public void setIdeFxAnexado(BigDecimal ideFxAnexado) {
        markAsChanged("IDEFXANEXADO", ideFxAnexado);
   }

   public String getIdentificador() {
        return this.getVo().asString("IDENTIFICADOR");
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
   }

   public BigDecimal getIdRpAInicializa() {
        return this.getVo().asBigDecimal("IDRPAINICIALIZA");
   }

   public void setIdRpAInicializa(BigDecimal idRpAInicializa) {
        markAsChanged("IDRPAINICIALIZA", idRpAInicializa);
   }

   public String getInterrompe() {
        return this.getVo().asString("INTERROMPE");
   }

   public void setInterrompe(String interrompe) {
        markAsChanged("INTERROMPE", interrompe);
   }

   @Override
   public String getTableName() {
        return "TPREVT";
   }

   @Override
   public String getEntityName() {
        return "EventoFluxo";
   }

   @Override
   public EventoFluxo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
