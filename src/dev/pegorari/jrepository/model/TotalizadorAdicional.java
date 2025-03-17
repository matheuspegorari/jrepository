package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class TotalizadorAdicional implements SankhyaEntity<TotalizadorAdicional> {

   private BigDecimal nuNota;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   @Override
   public String getEntityName() {
        return "TotalizadorAdicional";
   }

   @Override
   public TotalizadorAdicional fromVO(DynamicVO vo) {
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
