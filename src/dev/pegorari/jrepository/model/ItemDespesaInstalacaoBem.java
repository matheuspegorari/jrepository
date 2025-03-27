package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemDespesaInstalacaoBem extends AbstractSankhyaEntity<ItemDespesaInstalacaoBem> {
   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getNuRateio() {
        return this.getVo().asBigDecimal("NURATEIO");
   }

   public void setNuRateio(BigDecimal nuRateio) {
        markAsChanged("NURATEIO", nuRateio);
   }

   public BigDecimal getVlrIcmsRateio() {
        return this.getVo().asBigDecimal("VLRICMSRATEIO");
   }

   public void setVlrIcmsRateio(BigDecimal vlrIcmsRateio) {
        markAsChanged("VLRICMSRATEIO", vlrIcmsRateio);
   }

   public BigDecimal getVlrRateio() {
        return this.getVo().asBigDecimal("VLRRATEIO");
   }

   public void setVlrRateio(BigDecimal vlrRateio) {
        markAsChanged("VLRRATEIO", vlrRateio);
   }

   @Override
   public String getTableName() {
        return "TCIDIBI";
   }

   @Override
   public String getEntityName() {
        return "ItemDespesaInstalacaoBem";
   }

   @Override
   public ItemDespesaInstalacaoBem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
