package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemNotaWMS extends AbstractSankhyaEntity<ItemNotaWMS> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getQtdWms() {
        return this.getVo().asBigDecimal("QTDWMS");
   }

   public void setQtdWms(BigDecimal qtdWms) {
        markAsChanged("QTDWMS", qtdWms);
   }

   public BigDecimal getSeqNota() {
        return this.getVo().asBigDecimal("SEQNOTA");
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
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
        this.setVo(vo);
        return this;
   }
}
