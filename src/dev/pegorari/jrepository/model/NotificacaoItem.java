package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotificacaoItem extends AbstractSankhyaEntity<NotificacaoItem> {
   public Timestamp getDhUltPostagem() {
        return this.getVo().asTimestamp("DHULTPOSTAGEM");
   }

   public void setDhUltPostagem(Timestamp dhUltPostagem) {
        markAsChanged("DHULTPOSTAGEM", dhUltPostagem);
   }

   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNumReg() {
        return this.getVo().asBigDecimal("NUMREG");
   }

   public void setNumReg(BigDecimal numReg) {
        markAsChanged("NUMREG", numReg);
   }

   public BigDecimal getNuSla() {
        return this.getVo().asBigDecimal("NUSLA");
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
   }

   public BigDecimal getSeqNotifica() {
        return this.getVo().asBigDecimal("SEQNOTIFICA");
   }

   public void setSeqNotifica(BigDecimal seqNotifica) {
        markAsChanged("SEQNOTIFICA", seqNotifica);
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
        this.setVo(vo);
        return this;
   }
}
