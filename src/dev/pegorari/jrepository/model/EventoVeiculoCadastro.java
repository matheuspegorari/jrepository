package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoVeiculoCadastro extends AbstractSankhyaEntity<EventoVeiculoCadastro> {
   private BigDecimal codEvento;
   private BigDecimal codVeiculo;
   private Timestamp dtRef;
   private String formula;
   private BigDecimal valor;

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
        this.codEvento = codEvento;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
        this.formula = formula;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   @Override
   public String getTableName() {
        return "TGFEVEVEI";
   }

   @Override
   public String getEntityName() {
        return "EventoVeiculoCadastro";
   }

   @Override
   public EventoVeiculoCadastro fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.dtRef = vo.asTimestamp("DTREF");
        this.formula = vo.asString("FORMULA");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
