package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FinanceiroPropostaComercial extends AbstractSankhyaEntity<FinanceiroPropostaComercial> {
   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getNuProjeto() {
        return this.getVo().asBigDecimal("NUPROJETO");
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
   }

   public String getRateado() {
        return this.getVo().asString("RATEADO");
   }

   public void setRateado(String rateado) {
        markAsChanged("RATEADO", rateado);
   }

   public String getTipFin() {
        return this.getVo().asString("TIPFIN");
   }

   public void setTipFin(String tipFin) {
        markAsChanged("TIPFIN", tipFin);
   }

   public String getVersaoProjeto() {
        return this.getVo().asString("VERSAOPROJETO");
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
   }

   public BigDecimal getVlrDesp() {
        return this.getVo().asBigDecimal("VLRDESP");
   }

   public void setVlrDesp(BigDecimal vlrDesp) {
        markAsChanged("VLRDESP", vlrDesp);
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
        this.setVo(vo);
        return this;
   }
}
