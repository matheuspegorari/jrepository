package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemNotaWMS extends AbstractSankhyaEntity<ItemNotaWMS> {
   private BigDecimal nuNota;
   private BigDecimal nuSeparacao;
   private BigDecimal qtdWms;
   private BigDecimal seqNota;
   private BigDecimal sequencia;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getQtdWms() {
        return qtdWms;
   }

   public void setQtdWms(BigDecimal qtdWms) {
        this.qtdWms = qtdWms;
   }

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        this.seqNota = seqNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TGWITE";
   }

   @Override
   public String getEntityName() {
        return "ItemNotaWMS";
   }

   @Override
   public ItemNotaWMS fromVO(DynamicVO vo) {
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.qtdWms = vo.asBigDecimal("QTDWMS");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
