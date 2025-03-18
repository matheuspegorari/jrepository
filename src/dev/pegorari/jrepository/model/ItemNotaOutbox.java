package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemNotaOutbox extends AbstractSankhyaEntity<ItemNotaOutbox> {
   private String idOutbox;
   private BigDecimal nuNota;
   private BigDecimal qtd;
   private BigDecimal sequencia;

   public String getIdOutbox() {
        return idOutbox;
   }

   public void setIdOutbox(String idOutbox) {
        markAsChanged("IDOUTBOX", idOutbox);
        this.idOutbox = idOutbox;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
        this.qtd = qtd;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.setOriginalVO(vo);
        this.idOutbox = vo.asString("IDOUTBOX");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtd = vo.asBigDecimal("QTD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
