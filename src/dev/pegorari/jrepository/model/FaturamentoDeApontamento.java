package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FaturamentoDeApontamento extends AbstractSankhyaEntity<FaturamentoDeApontamento> {
   private BigDecimal nuNota;
   private BigDecimal nuApo;
   private BigDecimal seqApa;
   private BigDecimal seqIte;
   private BigDecimal qtd;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        this.seqApa = seqApa;
   }

   public BigDecimal getSeqIte() {
        return seqIte;
   }

   public void setSeqIte(BigDecimal seqIte) {
        this.seqIte = seqIte;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
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
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        this.seqIte = vo.asBigDecimal("SEQITE");
        this.qtd = vo.asBigDecimal("QTD");
        return this;
   }
}
