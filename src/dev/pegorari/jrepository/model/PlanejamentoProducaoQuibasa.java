package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanejamentoProducaoQuibasa extends AbstractSankhyaEntity<PlanejamentoProducaoQuibasa> {
   private BigDecimal numPlan;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private String concluido;
   private Timestamp dtAlter;
   private BigDecimal numLote;
   private String observacao;
   private BigDecimal qtdProd;
   private Timestamp dtVal;

   public BigDecimal getNumPlan() {
        return numPlan;
   }

   public void setNumPlan(BigDecimal numPlan) {
        this.numPlan = numPlan;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getConcluido() {
        return concluido;
   }

   public void setConcluido(String concluido) {
        this.concluido = concluido;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNumLote() {
        return numLote;
   }

   public void setNumLote(BigDecimal numLote) {
        this.numLote = numLote;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getQtdProd() {
        return qtdProd;
   }

   public void setQtdProd(BigDecimal qtdProd) {
        this.qtdProd = qtdProd;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   @Override
   public String getTableName() {
        return "TGFPLP";
   }

   @Override
   public String getEntityName() {
        return "PlanejamentoProducaoQuibasa";
   }

   @Override
   public PlanejamentoProducaoQuibasa fromVO(DynamicVO vo) {
        this.numPlan = vo.asBigDecimal("NUMPLAN");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.concluido = vo.asString("CONCLUIDO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.numLote = vo.asBigDecimal("NUMLOTE");
        this.observacao = vo.asString("OBSERVACAO");
        this.qtdProd = vo.asBigDecimal("QTDPROD");
        this.dtVal = vo.asTimestamp("DTVAL");
        return this;
   }
}
