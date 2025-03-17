package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MaterialMRP extends AbstractSankhyaEntity<MaterialMRP> {
   private String tipoQtd;
   private BigDecimal qtdMistura;
   private BigDecimal qtdTotal;
   private BigDecimal codProdMp;
   private BigDecimal numPs;
   private BigDecimal seqImps;
   private String controleMp;
   private String prodInterm;
   private String tipoPi;
   private String tipoSubOp;

   public String getTipoQtd() {
        return tipoQtd;
   }

   public void setTipoQtd(String tipoQtd) {
        this.tipoQtd = tipoQtd;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getQtdTotal() {
        return qtdTotal;
   }

   public void setQtdTotal(BigDecimal qtdTotal) {
        this.qtdTotal = qtdTotal;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        this.codProdMp = codProdMp;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        this.numPs = numPs;
   }

   public BigDecimal getSeqImps() {
        return seqImps;
   }

   public void setSeqImps(BigDecimal seqImps) {
        this.seqImps = seqImps;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        this.controleMp = controleMp;
   }

   public String getProdInterm() {
        return prodInterm;
   }

   public void setProdInterm(String prodInterm) {
        this.prodInterm = prodInterm;
   }

   public String getTipoPi() {
        return tipoPi;
   }

   public void setTipoPi(String tipoPi) {
        this.tipoPi = tipoPi;
   }

   public String getTipoSubOp() {
        return tipoSubOp;
   }

   public void setTipoSubOp(String tipoSubOp) {
        this.tipoSubOp = tipoSubOp;
   }

   @Override
   public String getTableName() {
        return "TPRBOM";
   }

   @Override
   public String getEntityName() {
        return "MaterialMRP";
   }

   @Override
   public MaterialMRP fromVO(DynamicVO vo) {
        this.tipoQtd = vo.asString("TIPOQTD");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.qtdTotal = vo.asBigDecimal("QTDTOTAL");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.numPs = vo.asBigDecimal("NUMPS");
        this.seqImps = vo.asBigDecimal("SEQIMPS");
        this.controleMp = vo.asString("CONTROLEMP");
        this.prodInterm = vo.asString("PRODINTERM");
        this.tipoPi = vo.asString("TIPOPI");
        this.tipoSubOp = vo.asString("TIPOSUBOP");
        return this;
   }
}
