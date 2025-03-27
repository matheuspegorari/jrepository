package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class IpiProdutoParceiro extends AbstractSankhyaEntity<IpiProdutoParceiro> {
   public BigDecimal getCodIpi() {
        return this.getVo().asBigDecimal("CODIPI");
   }

   public void setCodIpi(BigDecimal codIpi) {
        markAsChanged("CODIPI", codIpi);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   @Override
   public String getTableName() {
        return "TGFIPP";
   }

   @Override
   public String getEntityName() {
        return "IpiProdutoParceiro";
   }

   @Override
   public IpiProdutoParceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
