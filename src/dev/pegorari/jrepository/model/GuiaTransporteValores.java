package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GuiaTransporteValores extends AbstractSankhyaEntity<GuiaTransporteValores> {
   private String descEvento;
   private BigDecimal nuNota;

   public String getDescEvento() {
        return descEvento;
   }

   public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   @Override
   public String getTableName() {
        return "TGFGTV";
   }

   @Override
   public String getEntityName() {
        return "GuiaTransporteValores";
   }

   @Override
   public GuiaTransporteValores fromVO(DynamicVO vo) {
        this.descEvento = vo.asString("DESCEVENTO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
