package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EmailBoletos extends AbstractSankhyaEntity<EmailBoletos> {
   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   @Override
   public String getTableName() {
        return "TGFEBOL";
   }

   @Override
   public String getEntityName() {
        return "EmailBoletos";
   }

   @Override
   public EmailBoletos fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
