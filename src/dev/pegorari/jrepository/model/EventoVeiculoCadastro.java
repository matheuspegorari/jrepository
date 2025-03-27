package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoVeiculoCadastro extends AbstractSankhyaEntity<EventoVeiculoCadastro> {
   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
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
        this.setVo(vo);
        return this;
   }
}
