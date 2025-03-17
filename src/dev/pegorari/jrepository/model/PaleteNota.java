package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PaleteNota implements SankhyaEntity<PaleteNota> {

   private BigDecimal idPalete;
   private BigDecimal nuNota;
   private BigDecimal sequencia;

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        this.idPalete = idPalete;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "PaleteNota";
   }

   @Override
   public PaleteNota fromVO(DynamicVO vo) {
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
