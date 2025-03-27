package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemPlanejamentoEntrega extends AbstractSankhyaEntity<ItemPlanejamentoEntrega> {
   public BigDecimal getNuPlan() {
        return this.getVo().asBigDecimal("NUPLAN");
   }

   public void setNuPlan(BigDecimal nuPlan) {
        markAsChanged("NUPLAN", nuPlan);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodParcFat() {
        return this.getVo().asBigDecimal("CODPARCFAT");
   }

   public void setCodParcFat(BigDecimal codParcFat) {
        markAsChanged("CODPARCFAT", codParcFat);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getSequenciaOrig() {
        return this.getVo().asBigDecimal("SEQUENCIAORIG");
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
   }

   public BigDecimal getNuNotaOrig() {
        return this.getVo().asBigDecimal("NUNOTAORIG");
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
   }

   @Override
   public String getTableName() {
        return "TGFPLAI";
   }

   @Override
   public String getEntityName() {
        return "ItemPlanejamentoEntrega";
   }

   @Override
   public ItemPlanejamentoEntrega fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
