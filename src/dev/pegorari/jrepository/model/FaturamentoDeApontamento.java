package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FaturamentoDeApontamento extends AbstractSankhyaEntity<FaturamentoDeApontamento> {
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
        return "FaturamentoDeApontamento";
   }

   @Override
   public FaturamentoDeApontamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
