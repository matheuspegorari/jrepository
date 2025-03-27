package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecolhimentoMesAnteriorAIRPJ extends AbstractSankhyaEntity<RecolhimentoMesAnteriorAIRPJ> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getMesPagamento() {
        return this.getVo().asTimestamp("MESPAGAMENTO");
   }

   public void setMesPagamento(Timestamp mesPagamento) {
        markAsChanged("MESPAGAMENTO", mesPagamento);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getVlrImposto() {
        return this.getVo().asBigDecimal("VLRIMPOSTO");
   }

   public void setVlrImposto(BigDecimal vlrImposto) {
        markAsChanged("VLRIMPOSTO", vlrImposto);
   }

   public BigDecimal getVlrImpostoCsll() {
        return this.getVo().asBigDecimal("VLRIMPOSTO_CSLL");
   }

   public void setVlrImpostoCsll(BigDecimal vlrImpostoCsll) {
        markAsChanged("VLRIMPOSTO_CSLL", vlrImpostoCsll);
   }

   @Override
   public String getTableName() {
        return "TCBIRPJREC";
   }

   @Override
   public String getEntityName() {
        return "RecolhimentoMesAnteriorAIRPJ";
   }

   @Override
   public RecolhimentoMesAnteriorAIRPJ fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
