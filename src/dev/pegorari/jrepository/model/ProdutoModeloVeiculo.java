package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ProdutoModeloVeiculo extends AbstractSankhyaEntity<ProdutoModeloVeiculo> {
   public BigDecimal getCodModVei() {
        return this.getVo().asBigDecimal("CODMODVEI");
   }

   public void setCodModVei(BigDecimal codModVei) {
        markAsChanged("CODMODVEI", codModVei);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   @Override
   public String getTableName() {
        return "TGFPLM";
   }

   @Override
   public String getEntityName() {
        return "ProdutoModeloVeiculo";
   }

   @Override
   public ProdutoModeloVeiculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
