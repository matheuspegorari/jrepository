package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Financeira extends AbstractSankhyaEntity<Financeira> {
   private BigDecimal codFila;
   private String email;
   private BigDecimal sequencia;

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
        this.codFila = codFila;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TMDFMD";
   }

   @Override
   public String getEntityName() {
        return "Financeira";
   }

   @Override
   public Financeira fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codFila = vo.asBigDecimal("CODFILA");
        this.email = vo.asString("EMAIL");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
