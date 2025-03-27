package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemNotaOutbox extends AbstractSankhyaEntity<ItemNotaOutbox> {
   public String getIdOutbox() {
        return this.getVo().asString("IDOUTBOX");
   }

   public void setIdOutbox(String idOutbox) {
        markAsChanged("IDOUTBOX", idOutbox);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFIBX";
   }

   @Override
   public String getEntityName() {
        return "ItemNotaOutbox";
   }

   @Override
   public ItemNotaOutbox fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
