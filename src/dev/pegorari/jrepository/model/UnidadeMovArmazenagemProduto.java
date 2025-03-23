package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMovArmazenagemProduto extends AbstractSankhyaEntity<UnidadeMovArmazenagemProduto> {
   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal codUma;
   private String codVol;
   private String padrao;

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUma() {
        return codUma;
   }

   public void setCodUma(BigDecimal codUma) {
        markAsChanged("CODUMA", codUma);
        this.codUma = codUma;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
        this.padrao = padrao;
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
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUma = vo.asBigDecimal("CODUMA");
        this.codVol = vo.asString("CODVOL");
        this.padrao = vo.asString("PADRAO");
        return this;
   }
}
