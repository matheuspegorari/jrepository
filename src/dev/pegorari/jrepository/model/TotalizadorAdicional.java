package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TotalizadorAdicional extends AbstractSankhyaEntity<TotalizadorAdicional> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   @Override
   public String getTableName() {
        return "TGFTCA";
   }

   @Override
   public String getEntityName() {
        return "TotalizadorAdicional";
   }

   @Override
   public TotalizadorAdicional fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
