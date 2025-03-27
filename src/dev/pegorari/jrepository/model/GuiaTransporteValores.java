package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GuiaTransporteValores extends AbstractSankhyaEntity<GuiaTransporteValores> {
   public String getDescEvento() {
        return this.getVo().asString("DESCEVENTO");
   }

   public void setDescEvento(String descEvento) {
        markAsChanged("DESCEVENTO", descEvento);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
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
        this.setVo(vo);
        return this;
   }
}
