package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class TaxasEspeciais implements SankhyaEntity<TaxasEspeciais> {

   private BigDecimal codProd;
   private BigDecimal codTipVenda;
   private BigDecimal taxaJuro;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getTaxaJuro() {
        return taxaJuro;
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        this.taxaJuro = taxaJuro;
   }

   @Override
   public String getEntityName() {
        return "TaxasEspeciais";
   }

   @Override
   public TaxasEspeciais fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.taxaJuro = vo.asBigDecimal("TAXAJURO");
        return this;
   }
}
