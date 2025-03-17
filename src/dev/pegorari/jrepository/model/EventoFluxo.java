package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoFluxo extends AbstractSankhyaEntity<EventoFluxo> {
   private BigDecimal ideFx;
   private BigDecimal ideFxAnexado;
   private String identificador;
   private BigDecimal idRpAInicializa;
   private String interrompe;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxAnexado() {
        return ideFxAnexado;
   }

   public void setIdeFxAnexado(BigDecimal ideFxAnexado) {
        this.ideFxAnexado = ideFxAnexado;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        this.identificador = identificador;
   }

   public BigDecimal getIdRpAInicializa() {
        return idRpAInicializa;
   }

   public void setIdRpAInicializa(BigDecimal idRpAInicializa) {
        this.idRpAInicializa = idRpAInicializa;
   }

   public String getInterrompe() {
        return interrompe;
   }

   public void setInterrompe(String interrompe) {
        this.interrompe = interrompe;
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
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxAnexado = vo.asBigDecimal("IDEFXANEXADO");
        this.identificador = vo.asString("IDENTIFICADOR");
        this.idRpAInicializa = vo.asBigDecimal("IDRPAINICIALIZA");
        this.interrompe = vo.asString("INTERROMPE");
        return this;
   }
}
