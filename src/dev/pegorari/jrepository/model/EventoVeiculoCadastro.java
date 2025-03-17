package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoVeiculoCadastro implements SankhyaEntity<EventoVeiculoCadastro> {

   private BigDecimal codEvento;
   private BigDecimal codVeiculo;
   private Timestamp dtRef;
   private String formula;
   private BigDecimal valor;

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        this.codEvento = codEvento;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        this.codVeiculo = codVeiculo;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        this.formula = formula;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "EventoVeiculoCadastro";
   }

   @Override
   public EventoVeiculoCadastro fromVO(DynamicVO vo) {
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.dtRef = vo.asTimestamp("DTREF");
        this.formula = vo.asString("FORMULA");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
