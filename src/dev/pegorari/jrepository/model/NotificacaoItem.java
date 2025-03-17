package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotificacaoItem extends AbstractSankhyaEntity<NotificacaoItem> {
   private Timestamp dhUltPostagem;
   private BigDecimal numItem;
   private BigDecimal numOs;
   private BigDecimal numReg;
   private BigDecimal nuSla;
   private BigDecimal seqNotifica;

   public Timestamp getDhUltPostagem() {
        return dhUltPostagem;
   }

   public void setDhUltPostagem(Timestamp dhUltPostagem) {
        this.dhUltPostagem = dhUltPostagem;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNumReg() {
        return numReg;
   }

   public void setNumReg(BigDecimal numReg) {
        this.numReg = numReg;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        this.nuSla = nuSla;
   }

   public BigDecimal getSeqNotifica() {
        return seqNotifica;
   }

   public void setSeqNotifica(BigDecimal seqNotifica) {
        this.seqNotifica = seqNotifica;
   }

   @Override
   public String getTableName() {
        return "TCSSNI";
   }

   @Override
   public String getEntityName() {
        return "NotificacaoItem";
   }

   @Override
   public NotificacaoItem fromVO(DynamicVO vo) {
        this.dhUltPostagem = vo.asTimestamp("DHULTPOSTAGEM");
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numReg = vo.asBigDecimal("NUMREG");
        this.nuSla = vo.asBigDecimal("NUSLA");
        this.seqNotifica = vo.asBigDecimal("SEQNOTIFICA");
        return this;
   }
}
