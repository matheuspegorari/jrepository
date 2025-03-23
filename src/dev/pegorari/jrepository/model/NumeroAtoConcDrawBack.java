package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NumeroAtoConcDrawBack extends AbstractSankhyaEntity<NumeroAtoConcDrawBack> {
   private BigDecimal sequenciaDraw;
   private BigDecimal sequencia;
   private BigDecimal nuNota;
   private String nroAtoConcDraw;

   public BigDecimal getSequenciaDraw() {
        return sequenciaDraw;
   }

   public void setSequenciaDraw(BigDecimal sequenciaDraw) {
        markAsChanged("SEQUENCIADRAW", sequenciaDraw);
        this.sequenciaDraw = sequenciaDraw;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getNroAtoConcDraw() {
        return nroAtoConcDraw;
   }

   public void setNroAtoConcDraw(String nroAtoConcDraw) {
        markAsChanged("NROATOCONCDRAW", nroAtoConcDraw);
        this.nroAtoConcDraw = nroAtoConcDraw;
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
        this.sequenciaDraw = vo.asBigDecimal("SEQUENCIADRAW");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nroAtoConcDraw = vo.asString("NROATOCONCDRAW");
        return this;
   }
}
