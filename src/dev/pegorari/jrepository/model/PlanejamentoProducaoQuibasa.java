package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanejamentoProducaoQuibasa extends AbstractSankhyaEntity<PlanejamentoProducaoQuibasa> {
   public BigDecimal getNumPlan() {
        return this.getVo().asBigDecimal("NUMPLAN");
   }

   public void setNumPlan(BigDecimal numPlan) {
        markAsChanged("NUMPLAN", numPlan);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getConcluido() {
        return this.getVo().asString("CONCLUIDO");
   }

   public void setConcluido(String concluido) {
        markAsChanged("CONCLUIDO", concluido);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNumLote() {
        return this.getVo().asBigDecimal("NUMLOTE");
   }

   public void setNumLote(BigDecimal numLote) {
        markAsChanged("NUMLOTE", numLote);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getQtdProd() {
        return this.getVo().asBigDecimal("QTDPROD");
   }

   public void setQtdProd(BigDecimal qtdProd) {
        markAsChanged("QTDPROD", qtdProd);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
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
        this.setVo(vo);
        return this;
   }
}
