package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoCompManufatura extends AbstractSankhyaEntity<ApontamentoCompManufatura> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public BigDecimal getSeqApa() {
        return this.getVo().asBigDecimal("SEQAPA");
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
   }

   public BigDecimal getSeqIte() {
        return this.getVo().asBigDecimal("SEQITE");
   }

   public void setSeqIte(BigDecimal seqIte) {
        markAsChanged("SEQITE", seqIte);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   @Override
   public String getTableName() {
        return "TPRAPF";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoCompManufatura";
   }

   @Override
   public ApontamentoCompManufatura fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
