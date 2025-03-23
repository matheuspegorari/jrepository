package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EmailBoletos extends AbstractSankhyaEntity<EmailBoletos> {
   private BigDecimal nuFin;
   private BigDecimal codFila;

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
        this.codFila = codFila;
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
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.codFila = vo.asBigDecimal("CODFILA");
        return this;
   }
}
