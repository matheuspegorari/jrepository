package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EventoProdutoIntermediario extends AbstractSankhyaEntity<EventoProdutoIntermediario> {
   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public String getControlePi() {
        return this.getVo().asString("CONTROLEPI");
   }

   public void setControlePi(String controlePi) {
        markAsChanged("CONTROLEPI", controlePi);
   }

   public BigDecimal getCodProdPi() {
        return this.getVo().asBigDecimal("CODPRODPI");
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        markAsChanged("CODPRODPI", codProdPi);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
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
        this.setVo(vo);
        return this;
   }
}
