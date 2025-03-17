package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ProdutoDivergente extends AbstractSankhyaEntity<ProdutoDivergente> {
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private BigDecimal nuConf;
   private BigDecimal sequencia;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        this.nuConf = nuConf;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TGFPDD";
   }

   @Override
   public String getEntityName() {
        return "ProdutoDivergente";
   }

   @Override
   public ProdutoDivergente fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
