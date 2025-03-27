package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TaxasEspeciais extends AbstractSankhyaEntity<TaxasEspeciais> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getTaxaJuro() {
        return this.getVo().asBigDecimal("TAXAJURO");
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        markAsChanged("TAXAJURO", taxaJuro);
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
        this.setVo(vo);
        return this;
   }
}
