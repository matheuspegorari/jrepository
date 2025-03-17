package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class IpiProdutoParceiro implements SankhyaEntity<IpiProdutoParceiro> {

   private BigDecimal codIpi;
   private BigDecimal codParc;
   private BigDecimal codProd;

   public BigDecimal getCodIpi() {
        return codIpi;
   }

   public void setCodIpi(BigDecimal codIpi) {
        this.codIpi = codIpi;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   @Override
   public String getEntityName() {
        return "IpiProdutoParceiro";
   }

   @Override
   public IpiProdutoParceiro fromVO(DynamicVO vo) {
        this.codIpi = vo.asBigDecimal("CODIPI");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
