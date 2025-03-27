package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemOSDocAssinados extends AbstractSankhyaEntity<ItemOSDocAssinados> {
   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
   }

   public BigDecimal getNuDoc() {
        return this.getVo().asBigDecimal("NUDOC");
   }

   public void setNuDoc(BigDecimal nuDoc) {
        markAsChanged("NUDOC", nuDoc);
   }

   @Override
   public String getTableName() {
        return "TCSITE_DAS";
   }

   @Override
   public String getEntityName() {
        return "ItemOSDocAssinados";
   }

   @Override
   public ItemOSDocAssinados fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
