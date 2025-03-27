package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NumeroAtoConcDrawBack extends AbstractSankhyaEntity<NumeroAtoConcDrawBack> {
   public BigDecimal getSequenciaDraw() {
        return this.getVo().asBigDecimal("SEQUENCIADRAW");
   }

   public void setSequenciaDraw(BigDecimal sequenciaDraw) {
        markAsChanged("SEQUENCIADRAW", sequenciaDraw);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getNroAtoConcDraw() {
        return this.getVo().asString("NROATOCONCDRAW");
   }

   public void setNroAtoConcDraw(String nroAtoConcDraw) {
        markAsChanged("NROATOCONCDRAW", nroAtoConcDraw);
   }

   @Override
   public String getTableName() {
        return "TGFDRAW";
   }

   @Override
   public String getEntityName() {
        return "NumeroAtoConcDrawBack";
   }

   @Override
   public NumeroAtoConcDrawBack fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
