package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TaxasEspeciais extends AbstractSankhyaEntity<TaxasEspeciais> {
   private BigDecimal codProd;
   private BigDecimal codTipVenda;
   private BigDecimal taxaJuro;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getTaxaJuro() {
        return taxaJuro;
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        markAsChanged("TAXAJURO", taxaJuro);
        this.taxaJuro = taxaJuro;
   }

   @Override
   public String getTableName() {
        return "TGFTAX";
   }

   @Override
   public String getEntityName() {
        return "TaxasEspeciais";
   }

   @Override
   public TaxasEspeciais fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.taxaJuro = vo.asBigDecimal("TAXAJURO");
        return this;
   }
}
