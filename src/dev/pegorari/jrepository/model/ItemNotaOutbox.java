package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemNotaOutbox implements SankhyaEntity<ItemNotaOutbox> {

   private String idOutbox;
   private BigDecimal nuNota;
   private BigDecimal qtd;
   private BigDecimal sequencia;

   public String getIdOutbox() {
        return idOutbox;
   }

   public void setIdOutbox(String idOutbox) {
        this.idOutbox = idOutbox;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "ItemNotaOutbox";
   }

   @Override
   public ItemNotaOutbox fromVO(DynamicVO vo) {
        this.idOutbox = vo.asString("IDOUTBOX");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtd = vo.asBigDecimal("QTD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
