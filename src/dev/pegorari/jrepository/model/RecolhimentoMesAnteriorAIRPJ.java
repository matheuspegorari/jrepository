package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecolhimentoMesAnteriorAIRPJ implements SankhyaEntity<RecolhimentoMesAnteriorAIRPJ> {

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
        this.codEmp = codEmp;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getMesPagamento() {
        return mesPagamento;
   }

   public void setMesPagamento(Timestamp mesPagamento) {
        this.mesPagamento = mesPagamento;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getVlrImposto() {
        return vlrImposto;
   }

   public void setVlrImposto(BigDecimal vlrImposto) {
        this.vlrImposto = vlrImposto;
   }

   public BigDecimal getVlrImpostoCsll() {
        return vlrImpostoCsll;
   }

   public void setVlrImpostoCsll(BigDecimal vlrImpostoCsll) {
        this.vlrImpostoCsll = vlrImpostoCsll;
   }

   @Override
   public String getEntityName() {
        return "RecolhimentoMesAnteriorAIRPJ";
   }

   @Override
   public RecolhimentoMesAnteriorAIRPJ fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.digitado = vo.asString("DIGITADO");
        this.mesPagamento = vo.asTimestamp("MESPAGAMENTO");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.vlrImposto = vo.asBigDecimal("VLRIMPOSTO");
        this.vlrImpostoCsll = vo.asBigDecimal("VLRIMPOSTOCSLL");
        return this;
   }
}
