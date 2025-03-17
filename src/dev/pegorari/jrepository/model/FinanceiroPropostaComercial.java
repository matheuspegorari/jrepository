package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FinanceiroPropostaComercial extends AbstractSankhyaEntity<FinanceiroPropostaComercial> {
   private BigDecimal codNat;
   private BigDecimal nuProjeto;
   private String rateado;
   private String tipFin;
   private String versaoProjeto;
   private BigDecimal vlrDesp;

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getNuProjeto() {
        return nuProjeto;
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        this.nuProjeto = nuProjeto;
   }

   public String getRateado() {
        return rateado;
   }

   public void setRateado(String rateado) {
        this.rateado = rateado;
   }

   public String getTipFin() {
        return tipFin;
   }

   public void setTipFin(String tipFin) {
        this.tipFin = tipFin;
   }

   public String getVersaoProjeto() {
        return versaoProjeto;
   }

   public void setVersaoProjeto(String versaoProjeto) {
        this.versaoProjeto = versaoProjeto;
   }

   public BigDecimal getVlrDesp() {
        return vlrDesp;
   }

   public void setVlrDesp(BigDecimal vlrDesp) {
        this.vlrDesp = vlrDesp;
   }

   @Override
   public String getTableName() {
        return "TGIFIN";
   }

   @Override
   public String getEntityName() {
        return "FinanceiroPropostaComercial";
   }

   @Override
   public FinanceiroPropostaComercial fromVO(DynamicVO vo) {
        this.codNat = vo.asBigDecimal("CODNAT");
        this.nuProjeto = vo.asBigDecimal("NUPROJETO");
        this.rateado = vo.asString("RATEADO");
        this.tipFin = vo.asString("TIPFIN");
        this.versaoProjeto = vo.asString("VERSAOPROJETO");
        this.vlrDesp = vo.asBigDecimal("VLRDESP");
        return this;
   }
}
