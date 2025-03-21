package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class WorkCenterPorPA extends AbstractSankhyaEntity<WorkCenterPorPA> {
   private BigDecimal codCap;
   private BigDecimal codProdPa;
   private BigDecimal codWcp;
   private String controlePa;
   private BigDecimal qtdCapacidadeMax;
   private BigDecimal qtdCapacidadeMin;
   private BigDecimal qtdCapacidadePad;
   private BigDecimal seq;
   private BigDecimal tempoCleanup;
   private BigDecimal tempoSetup;

   public BigDecimal getCodCap() {
        return codCap;
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
        this.codCap = codCap;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getQtdCapacidadeMax() {
        return qtdCapacidadeMax;
   }

   public void setQtdCapacidadeMax(BigDecimal qtdCapacidadeMax) {
        markAsChanged("QTDCAPACIDADEMAX", qtdCapacidadeMax);
        this.qtdCapacidadeMax = qtdCapacidadeMax;
   }

   public BigDecimal getQtdCapacidadeMin() {
        return qtdCapacidadeMin;
   }

   public void setQtdCapacidadeMin(BigDecimal qtdCapacidadeMin) {
        markAsChanged("QTDCAPACIDADEMIN", qtdCapacidadeMin);
        this.qtdCapacidadeMin = qtdCapacidadeMin;
   }

   public BigDecimal getQtdCapacidadePad() {
        return qtdCapacidadePad;
   }

   public void setQtdCapacidadePad(BigDecimal qtdCapacidadePad) {
        markAsChanged("QTDCAPACIDADEPAD", qtdCapacidadePad);
        this.qtdCapacidadePad = qtdCapacidadePad;
   }

   public BigDecimal getSeq() {
        return seq;
   }

   public void setSeq(BigDecimal seq) {
        markAsChanged("SEQ", seq);
        this.seq = seq;
   }

   public BigDecimal getTempoCleanup() {
        return tempoCleanup;
   }

   public void setTempoCleanup(BigDecimal tempoCleanup) {
        markAsChanged("TEMPOCLEANUP", tempoCleanup);
        this.tempoCleanup = tempoCleanup;
   }

   public BigDecimal getTempoSetup() {
        return tempoSetup;
   }

   public void setTempoSetup(BigDecimal tempoSetup) {
        markAsChanged("TEMPOSETUP", tempoSetup);
        this.tempoSetup = tempoSetup;
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
        this.setOriginalVO(vo);
        this.codCap = vo.asBigDecimal("CODCAP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.controlePa = vo.asString("CONTROLEPA");
        this.qtdCapacidadeMax = vo.asBigDecimal("QTDCAPACIDADEMAX");
        this.qtdCapacidadeMin = vo.asBigDecimal("QTDCAPACIDADEMIN");
        this.qtdCapacidadePad = vo.asBigDecimal("QTDCAPACIDADEPAD");
        this.seq = vo.asBigDecimal("SEQ");
        this.tempoCleanup = vo.asBigDecimal("TEMPOCLEANUP");
        this.tempoSetup = vo.asBigDecimal("TEMPOSETUP");
        return this;
   }
}
