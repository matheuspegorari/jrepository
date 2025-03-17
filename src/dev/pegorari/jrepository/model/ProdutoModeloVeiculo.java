package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ProdutoModeloVeiculo implements SankhyaEntity<ProdutoModeloVeiculo> {

   private BigDecimal codModVei;
   private BigDecimal codProd;

   public BigDecimal getCodModVei() {
        return codModVei;
   }

   public void setCodModVei(BigDecimal codModVei) {
        this.codModVei = codModVei;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   @Override
   public String getEntityName() {
        return "ProdutoModeloVeiculo";
   }

   @Override
   public ProdutoModeloVeiculo fromVO(DynamicVO vo) {
        this.codModVei = vo.asBigDecimal("CODMODVEI");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
