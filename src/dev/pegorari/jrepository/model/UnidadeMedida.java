package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMedida implements SankhyaEntity<UnidadeMedida> {

   private String tipMed;
   private BigDecimal qtdMed;
   private BigDecimal seqMed;
   private BigDecimal nuNota;
   private String unMed;

   public String getTipMed() {
        return tipMed;
   }

   public void setTipMed(String tipMed) {
        this.tipMed = tipMed;
   }

   public BigDecimal getQtdMed() {
        return qtdMed;
   }

   public void setQtdMed(BigDecimal qtdMed) {
        this.qtdMed = qtdMed;
   }

   public BigDecimal getSeqMed() {
        return seqMed;
   }

   public void setSeqMed(BigDecimal seqMed) {
        this.seqMed = seqMed;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getUnMed() {
        return unMed;
   }

   public void setUnMed(String unMed) {
        this.unMed = unMed;
   }

   @Override
   public String getEntityName() {
        return "UnidadeMedida";
   }

   @Override
   public UnidadeMedida fromVO(DynamicVO vo) {
        this.tipMed = vo.asString("TIPMED");
        this.qtdMed = vo.asBigDecimal("QTDMED");
        this.seqMed = vo.asBigDecimal("SEQMED");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.unMed = vo.asString("UNMED");
        return this;
   }
}
