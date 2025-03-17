package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExplosaoLote implements SankhyaEntity<ExplosaoLote> {

   private BigDecimal codEndOrigem;
   private BigDecimal codProd;
   private String controle;
   private Timestamp dtAlter;
   private BigDecimal nuTarefa;
   private BigDecimal quantidade;
   private BigDecimal sequencia;

   public BigDecimal getCodEndOrigem() {
        return codEndOrigem;
   }

   public void setCodEndOrigem(BigDecimal codEndOrigem) {
        this.codEndOrigem = codEndOrigem;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getQuantidade() {
        return quantidade;
   }

   public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "ExplosaoLote";
   }

   @Override
   public ExplosaoLote fromVO(DynamicVO vo) {
        this.codEndOrigem = vo.asBigDecimal("CODENDORIGEM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.quantidade = vo.asBigDecimal("QUANTIDADE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
