package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoProdutoIntermediario extends AbstractSankhyaEntity<EventoProdutoIntermediario> {
   private BigDecimal ideFx;
   private String controlePi;
   private BigDecimal codProdPi;
   private String controlePa;
   private BigDecimal codProdPa;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public String getControlePi() {
        return controlePi;
   }

   public void setControlePi(String controlePi) {
        this.controlePi = controlePi;
   }

   public BigDecimal getCodProdPi() {
        return codProdPi;
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        this.codProdPi = codProdPi;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   @Override
   public String getTableName() {
        return "TPREVPI";
   }

   @Override
   public String getEntityName() {
        return "EventoProdutoIntermediario";
   }

   @Override
   public EventoProdutoIntermediario fromVO(DynamicVO vo) {
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.controlePi = vo.asString("CONTROLEPI");
        this.codProdPi = vo.asBigDecimal("CODPRODPI");
        this.controlePa = vo.asString("CONTROLEPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        return this;
   }
}
