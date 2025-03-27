package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotificacaoSonora extends AbstractSankhyaEntity<NotificacaoSonora> {
   public String getArqSom() {
        return this.getVo().asString("ARQSOM");
   }

   public void setArqSom(String arqSom) {
        markAsChanged("ARQSOM", arqSom);
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

   @Override
   public String getTableName() {
        return "TCSSNS";
   }

   @Override
   public String getEntityName() {
        return "NotificacaoSonora";
   }

   @Override
   public NotificacaoSonora fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
