package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMovArmazenagemProduto extends AbstractSankhyaEntity<UnidadeMovArmazenagemProduto> {
   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUma() {
        return this.getVo().asBigDecimal("CODUMA");
   }

   public void setCodUma(BigDecimal codUma) {
        markAsChanged("CODUMA", codUma);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   @Override
   public String getTableName() {
        return "TGFPUMA";
   }

   @Override
   public String getEntityName() {
        return "UnidadeMovArmazenagemProduto";
   }

   @Override
   public UnidadeMovArmazenagemProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
