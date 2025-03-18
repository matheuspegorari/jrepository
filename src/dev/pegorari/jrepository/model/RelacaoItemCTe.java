package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelacaoItemCTe extends AbstractSankhyaEntity<RelacaoItemCTe> {
   private BigDecimal seqNota;
   private BigDecimal sequencia;
   private BigDecimal valUnit;
   private BigDecimal valTotal;
   private BigDecimal nuNota;
   private String descProd;
   private String unidade;
   private BigDecimal quantidade;

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
        this.seqNota = seqNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getValUnit() {
        return valUnit;
   }

   public void setValUnit(BigDecimal valUnit) {
        markAsChanged("VALUNIT", valUnit);
        this.valUnit = valUnit;
   }

   public BigDecimal getValTotal() {
        return valTotal;
   }

   public void setValTotal(BigDecimal valTotal) {
        markAsChanged("VALTOTAL", valTotal);
        this.valTotal = valTotal;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getDescProd() {
        return descProd;
   }

   public void setDescProd(String descProd) {
        markAsChanged("DESCPROD", descProd);
        this.descProd = descProd;
   }

   public String getUnidade() {
        return unidade;
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
        this.unidade = unidade;
   }

   public BigDecimal getQuantidade() {
        return quantidade;
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
        this.quantidade = quantidade;
   }

   @Override
   public String getTableName() {
        return "TGFINCT";
   }

   @Override
   public String getEntityName() {
        return "RelacaoItemCTe";
   }

   @Override
   public RelacaoItemCTe fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.valUnit = vo.asBigDecimal("VALUNIT");
        this.valTotal = vo.asBigDecimal("VALTOTAL");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.descProd = vo.asString("DESCPROD");
        this.unidade = vo.asString("UNIDADE");
        this.quantidade = vo.asBigDecimal("QUANTIDADE");
        return this;
   }
}
