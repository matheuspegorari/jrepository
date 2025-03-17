package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BemNotafiscal extends AbstractSankhyaEntity<BemNotafiscal> {
   private String codBem;
   private BigDecimal codProd;
   private BigDecimal nuNota;
   private BigDecimal ordem;
   private BigDecimal sequencia;

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        this.codBem = codBem;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TCIIBE";
   }

   @Override
   public String getEntityName() {
        return "BemNotafiscal";
   }

   @Override
   public BemNotafiscal fromVO(DynamicVO vo) {
        this.codBem = vo.asString("CODBEM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
