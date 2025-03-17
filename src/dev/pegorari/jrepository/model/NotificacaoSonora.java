package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotificacaoSonora extends AbstractSankhyaEntity<NotificacaoSonora> {
   private String arqSom;
   private BigDecimal numItem;
   private BigDecimal numOs;

   public String getArqSom() {
        return arqSom;
   }

   public void setArqSom(String arqSom) {
        this.arqSom = arqSom;
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
        this.arqSom = vo.asString("ARQSOM");
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        return this;
   }
}
