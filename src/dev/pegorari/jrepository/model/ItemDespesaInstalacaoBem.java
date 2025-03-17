package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemDespesaInstalacaoBem implements SankhyaEntity<ItemDespesaInstalacaoBem> {

   private String codBem;
   private BigDecimal codProd;
   private BigDecimal nuRateio;
   private BigDecimal vlrIcmsRateio;
   private BigDecimal vlrRateio;

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        this.codBem = codBem;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getNuRateio() {
        return nuRateio;
   }

   public void setNuRateio(BigDecimal nuRateio) {
        this.nuRateio = nuRateio;
   }

   public BigDecimal getVlrIcmsRateio() {
        return vlrIcmsRateio;
   }

   public void setVlrIcmsRateio(BigDecimal vlrIcmsRateio) {
        this.vlrIcmsRateio = vlrIcmsRateio;
   }

   public BigDecimal getVlrRateio() {
        return vlrRateio;
   }

   public void setVlrRateio(BigDecimal vlrRateio) {
        this.vlrRateio = vlrRateio;
   }

   @Override
   public String getEntityName() {
        return "ItemDespesaInstalacaoBem";
   }

   @Override
   public ItemDespesaInstalacaoBem fromVO(DynamicVO vo) {
        this.codBem = vo.asString("CODBEM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.nuRateio = vo.asBigDecimal("NURATEIO");
        this.vlrIcmsRateio = vo.asBigDecimal("VLRICMSRATEIO");
        this.vlrRateio = vo.asBigDecimal("VLRRATEIO");
        return this;
   }
}
