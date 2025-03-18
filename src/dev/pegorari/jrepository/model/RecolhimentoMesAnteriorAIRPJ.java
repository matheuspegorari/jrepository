package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecolhimentoMesAnteriorAIRPJ extends AbstractSankhyaEntity<RecolhimentoMesAnteriorAIRPJ> {
   private BigDecimal codEmp;
   private String digitado;
   private Timestamp mesPagamento;
   private Timestamp referencia;
   private BigDecimal vlrImposto;
   private BigDecimal vlrImpostoCsll;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getMesPagamento() {
        return mesPagamento;
   }

   public void setMesPagamento(Timestamp mesPagamento) {
        markAsChanged("MESPAGAMENTO", mesPagamento);
        this.mesPagamento = mesPagamento;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getVlrImposto() {
        return vlrImposto;
   }

   public void setVlrImposto(BigDecimal vlrImposto) {
        markAsChanged("VLRIMPOSTO", vlrImposto);
        this.vlrImposto = vlrImposto;
   }

   public BigDecimal getVlrImpostoCsll() {
        return vlrImpostoCsll;
   }

   public void setVlrImpostoCsll(BigDecimal vlrImpostoCsll) {
        markAsChanged("VLRIMPOSTO_CSLL", vlrImpostoCsll);
        this.vlrImpostoCsll = vlrImpostoCsll;
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
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.digitado = vo.asString("DIGITADO");
        this.mesPagamento = vo.asTimestamp("MESPAGAMENTO");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.vlrImposto = vo.asBigDecimal("VLRIMPOSTO");
        this.vlrImpostoCsll = vo.asBigDecimal("VLRIMPOSTO_CSLL");
        return this;
   }
}
