package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemNotaRecebimento extends AbstractSankhyaEntity<ItemNotaRecebimento> {
   private BigDecimal nuNota;
   private BigDecimal nuRecebimento;
   private BigDecimal qtdWms;
   private BigDecimal seqNota;
   private BigDecimal sequencia;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getQtdWms() {
        return qtdWms;
   }

   public void setQtdWms(BigDecimal qtdWms) {
        markAsChanged("QTDWMS", qtdWms);
        this.qtdWms = qtdWms;
   }

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

   @Override
   public String getTableName() {
        return "TGWITER";
   }

   @Override
   public String getEntityName() {
        return "ItemNotaRecebimento";
   }

   @Override
   public ItemNotaRecebimento fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.qtdWms = vo.asBigDecimal("QTDWMS");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
