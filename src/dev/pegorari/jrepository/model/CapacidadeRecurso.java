package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CapacidadeRecurso extends AbstractSankhyaEntity<CapacidadeRecurso> {
   public BigDecimal getCodCap() {
        return this.getVo().asBigDecimal("CODCAP");
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
   }

   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getNuCpr() {
        return this.getVo().asBigDecimal("NUCPR");
   }

   public void setNuCpr(BigDecimal nuCpr) {
        markAsChanged("NUCPR", nuCpr);
   }

   public BigDecimal getQtdCapacidadeMax() {
        return this.getVo().asBigDecimal("QTDCAPACIDADEMAX");
   }

   public void setQtdCapacidadeMax(BigDecimal qtdCapacidadeMax) {
        markAsChanged("QTDCAPACIDADEMAX", qtdCapacidadeMax);
   }

   public BigDecimal getQtdCapacidadeMin() {
        return this.getVo().asBigDecimal("QTDCAPACIDADEMIN");
   }

   public void setQtdCapacidadeMin(BigDecimal qtdCapacidadeMin) {
        markAsChanged("QTDCAPACIDADEMIN", qtdCapacidadeMin);
   }

   public BigDecimal getQtdCapacidadePad() {
        return this.getVo().asBigDecimal("QTDCAPACIDADEPAD");
   }

   public void setQtdCapacidadePad(BigDecimal qtdCapacidadePad) {
        markAsChanged("QTDCAPACIDADEPAD", qtdCapacidadePad);
   }

   public String getTipoCapacidade() {
        return this.getVo().asString("TIPOCAPACIDADE");
   }

   public void setTipoCapacidade(String tipoCapacidade) {
        markAsChanged("TIPOCAPACIDADE", tipoCapacidade);
   }

   @Override
   public String getTableName() {
        return "TPRCPR";
   }

   @Override
   public String getEntityName() {
        return "CapacidadeRecurso";
   }

   @Override
   public CapacidadeRecurso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
