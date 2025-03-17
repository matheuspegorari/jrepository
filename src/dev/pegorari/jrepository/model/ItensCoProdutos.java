package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensCoProdutos extends AbstractSankhyaEntity<ItensCoProdutos> {
   private BigDecimal codProdPa;
   private String codVol;
   private String controlePa;
   private BigDecimal idCop;
   private BigDecimal percQtdRend;
   private BigDecimal percDesvioInf;
   private BigDecimal percDesvioSup;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getIdCop() {
        return idCop;
   }

   public void setIdCop(BigDecimal idCop) {
        this.idCop = idCop;
   }

   public BigDecimal getPercQtdRend() {
        return percQtdRend;
   }

   public void setPercQtdRend(BigDecimal percQtdRend) {
        this.percQtdRend = percQtdRend;
   }

   public BigDecimal getPercDesvioInf() {
        return percDesvioInf;
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        this.percDesvioInf = percDesvioInf;
   }

   public BigDecimal getPercDesvioSup() {
        return percDesvioSup;
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        this.percDesvioSup = percDesvioSup;
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
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codVol = vo.asString("CODVOL");
        this.controlePa = vo.asString("CONTROLEPA");
        this.idCop = vo.asBigDecimal("IDCOP");
        this.percQtdRend = vo.asBigDecimal("PERCQTDREND");
        this.percDesvioInf = vo.asBigDecimal("PERCDESVIOINF");
        this.percDesvioSup = vo.asBigDecimal("PERCDESVIOSUP");
        return this;
   }
}
