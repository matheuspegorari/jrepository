package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class NumeroAtoConcDrawBack implements SankhyaEntity<NumeroAtoConcDrawBack> {

   private BigDecimal sequenciaDraw;
   private BigDecimal sequencia;
   private BigDecimal nuNota;
   private String nroAtoConcDraw;

   public BigDecimal getSequenciaDraw() {
        return sequenciaDraw;
   }

   public void setSequenciaDraw(BigDecimal sequenciaDraw) {
        this.sequenciaDraw = sequenciaDraw;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getNroAtoConcDraw() {
        return nroAtoConcDraw;
   }

   public void setNroAtoConcDraw(String nroAtoConcDraw) {
        this.nroAtoConcDraw = nroAtoConcDraw;
   }

   @Override
   public String getEntityName() {
        return "NumeroAtoConcDrawBack";
   }

   @Override
   public NumeroAtoConcDrawBack fromVO(DynamicVO vo) {
        this.sequenciaDraw = vo.asBigDecimal("SEQUENCIADRAW");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nroAtoConcDraw = vo.asString("NROATOCONCDRAW");
        return this;
   }
}
