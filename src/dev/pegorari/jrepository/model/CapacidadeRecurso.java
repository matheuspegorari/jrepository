package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CapacidadeRecurso implements SankhyaEntity<CapacidadeRecurso> {

   private BigDecimal codCap;
   private BigDecimal codCre;
   private BigDecimal codProdPa;
   private BigDecimal codWcp;
   private String controlePa;
   private BigDecimal nuCpr;
   private BigDecimal qtdCapacidadeMax;
   private BigDecimal qtdCapacidadeMin;
   private BigDecimal qtdCapacidadePad;
   private String tipoCapacidade;

   public BigDecimal getCodCap() {
        return codCap;
   }

   public void setCodCap(BigDecimal codCap) {
        this.codCap = codCap;
   }

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        this.codCre = codCre;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getNuCpr() {
        return nuCpr;
   }

   public void setNuCpr(BigDecimal nuCpr) {
        this.nuCpr = nuCpr;
   }

   public BigDecimal getQtdCapacidadeMax() {
        return qtdCapacidadeMax;
   }

   public void setQtdCapacidadeMax(BigDecimal qtdCapacidadeMax) {
        this.qtdCapacidadeMax = qtdCapacidadeMax;
   }

   public BigDecimal getQtdCapacidadeMin() {
        return qtdCapacidadeMin;
   }

   public void setQtdCapacidadeMin(BigDecimal qtdCapacidadeMin) {
        this.qtdCapacidadeMin = qtdCapacidadeMin;
   }

   public BigDecimal getQtdCapacidadePad() {
        return qtdCapacidadePad;
   }

   public void setQtdCapacidadePad(BigDecimal qtdCapacidadePad) {
        this.qtdCapacidadePad = qtdCapacidadePad;
   }

   public String getTipoCapacidade() {
        return tipoCapacidade;
   }

   public void setTipoCapacidade(String tipoCapacidade) {
        this.tipoCapacidade = tipoCapacidade;
   }

   @Override
   public String getEntityName() {
        return "CapacidadeRecurso";
   }

   @Override
   public CapacidadeRecurso fromVO(DynamicVO vo) {
        this.codCap = vo.asBigDecimal("CODCAP");
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.controlePa = vo.asString("CONTROLEPA");
        this.nuCpr = vo.asBigDecimal("NUCPR");
        this.qtdCapacidadeMax = vo.asBigDecimal("QTDCAPACIDADEMAX");
        this.qtdCapacidadeMin = vo.asBigDecimal("QTDCAPACIDADEMIN");
        this.qtdCapacidadePad = vo.asBigDecimal("QTDCAPACIDADEPAD");
        this.tipoCapacidade = vo.asString("TIPOCAPACIDADE");
        return this;
   }
}
