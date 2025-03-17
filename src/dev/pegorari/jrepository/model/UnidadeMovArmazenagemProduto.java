package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMovArmazenagemProduto implements SankhyaEntity<UnidadeMovArmazenagemProduto> {

   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal codUma;
   private String codVol;
   private String padrao;

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUma() {
        return codUma;
   }

   public void setCodUma(BigDecimal codUma) {
        this.codUma = codUma;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   @Override
   public String getEntityName() {
        return "UnidadeMovArmazenagemProduto";
   }

   @Override
   public UnidadeMovArmazenagemProduto fromVO(DynamicVO vo) {
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUma = vo.asBigDecimal("CODUMA");
        this.codVol = vo.asString("CODVOL");
        this.padrao = vo.asString("PADRAO");
        return this;
   }
}
