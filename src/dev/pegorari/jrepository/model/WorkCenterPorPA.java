package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class WorkCenterPorPA extends AbstractSankhyaEntity<WorkCenterPorPA> {
   public BigDecimal getCodCap() {
        return this.getVo().asBigDecimal("CODCAP");
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
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

   public BigDecimal getSeq() {
        return this.getVo().asBigDecimal("SEQ");
   }

   public void setSeq(BigDecimal seq) {
        markAsChanged("SEQ", seq);
   }

   public BigDecimal getTempoCleanup() {
        return this.getVo().asBigDecimal("TEMPOCLEANUP");
   }

   public void setTempoCleanup(BigDecimal tempoCleanup) {
        markAsChanged("TEMPOCLEANUP", tempoCleanup);
   }

   public BigDecimal getTempoSetup() {
        return this.getVo().asBigDecimal("TEMPOSETUP");
   }

   public void setTempoSetup(BigDecimal tempoSetup) {
        markAsChanged("TEMPOSETUP", tempoSetup);
   }

   @Override
   public String getTableName() {
        return "TPRWXP";
   }

   @Override
   public String getEntityName() {
        return "WorkCenterPorPA";
   }

   @Override
   public WorkCenterPorPA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
