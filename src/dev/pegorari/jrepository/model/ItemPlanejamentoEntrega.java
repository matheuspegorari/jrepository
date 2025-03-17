package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemPlanejamentoEntrega implements SankhyaEntity<ItemPlanejamentoEntrega> {

   private BigDecimal nuPlan;
   private BigDecimal qtdNeg;
   private BigDecimal codContato;
   private BigDecimal codParcFat;
   private BigDecimal codProd;
   private BigDecimal sequenciaOrig;
   private BigDecimal nuNotaOrig;

   public BigDecimal getNuPlan() {
        return nuPlan;
   }

   public void setNuPlan(BigDecimal nuPlan) {
        this.nuPlan = nuPlan;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodParcFat() {
        return codParcFat;
   }

   public void setCodParcFat(BigDecimal codParcFat) {
        this.codParcFat = codParcFat;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getSequenciaOrig() {
        return sequenciaOrig;
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        this.sequenciaOrig = sequenciaOrig;
   }

   public BigDecimal getNuNotaOrig() {
        return nuNotaOrig;
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        this.nuNotaOrig = nuNotaOrig;
   }

   @Override
   public String getEntityName() {
        return "ItemPlanejamentoEntrega";
   }

   @Override
   public ItemPlanejamentoEntrega fromVO(DynamicVO vo) {
        this.nuPlan = vo.asBigDecimal("NUPLAN");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codParcFat = vo.asBigDecimal("CODPARCFAT");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.sequenciaOrig = vo.asBigDecimal("SEQUENCIAORIG");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        return this;
   }
}
