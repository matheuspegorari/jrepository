package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensCoProdutos extends AbstractSankhyaEntity<ItensCoProdutos> {
   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdCop() {
        return this.getVo().asBigDecimal("IDCOP");
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
   }

   public BigDecimal getPercQtdRend() {
        return this.getVo().asBigDecimal("PERCQTDREND");
   }

   public void setPercQtdRend(BigDecimal percQtdRend) {
        markAsChanged("PERCQTDREND", percQtdRend);
   }

   public BigDecimal getPercDesvioInf() {
        return this.getVo().asBigDecimal("PERCDESVIOINF");
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        markAsChanged("PERCDESVIOINF", percDesvioInf);
   }

   public BigDecimal getPercDesvioSup() {
        return this.getVo().asBigDecimal("PERCDESVIOSUP");
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        markAsChanged("PERCDESVIOSUP", percDesvioSup);
   }

   @Override
   public String getTableName() {
        return "TPRITECOP";
   }

   @Override
   public String getEntityName() {
        return "ItensCoProdutos";
   }

   @Override
   public ItensCoProdutos fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
