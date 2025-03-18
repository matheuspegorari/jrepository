package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExplosaoLote extends AbstractSankhyaEntity<ExplosaoLote> {
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
        markAsChanged("CODENDORIGEM", codEndOrigem);
        this.codEndOrigem = codEndOrigem;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getQuantidade() {
        return quantidade;
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
        this.quantidade = quantidade;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TGWEXPL";
   }

   @Override
   public String getEntityName() {
        return "ExplosaoLote";
   }

   @Override
   public ExplosaoLote fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
