package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemOSDocAssinados implements SankhyaEntity<ItemOSDocAssinados> {

   private BigDecimal numOs;
   private BigDecimal numItem;
   private BigDecimal nuDoc;

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   public BigDecimal getNuDoc() {
        return nuDoc;
   }

   public void setNuDoc(BigDecimal nuDoc) {
        this.nuDoc = nuDoc;
   }

   @Override
   public String getEntityName() {
        return "ItemOSDocAssinados";
   }

   @Override
   public ItemOSDocAssinados fromVO(DynamicVO vo) {
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.nuDoc = vo.asBigDecimal("NUDOC");
        return this;
   }
}
