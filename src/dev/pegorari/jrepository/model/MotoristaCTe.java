package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class MotoristaCTe implements SankhyaEntity<MotoristaCTe> {

   private BigDecimal nuNota;
   private BigDecimal codParc;
   private BigDecimal seqMot;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getSeqMot() {
        return seqMot;
   }

   public void setSeqMot(BigDecimal seqMot) {
        this.seqMot = seqMot;
   }

   @Override
   public String getEntityName() {
        return "MotoristaCTe";
   }

   @Override
   public MotoristaCTe fromVO(DynamicVO vo) {
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.seqMot = vo.asBigDecimal("SEQMOT");
        return this;
   }
}
