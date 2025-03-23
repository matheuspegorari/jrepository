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
        markAsChanged("TIPOQTD", tipoQtd);
        this.tipoQtd = tipoQtd;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getQtdTotal() {
        return qtdTotal;
   }

   public void setQtdTotal(BigDecimal qtdTotal) {
        markAsChanged("QTDTOTAL", qtdTotal);
        this.qtdTotal = qtdTotal;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
        this.numPs = numPs;
   }

   public BigDecimal getSeqImps() {
        return seqImps;
   }

   public void setSeqImps(BigDecimal seqImps) {
        markAsChanged("SEQIMPS", seqImps);
        this.seqImps = seqImps;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public String getProdInterm() {
        return prodInterm;
   }

   public void setProdInterm(String prodInterm) {
        markAsChanged("PRODINTERM", prodInterm);
        this.prodInterm = prodInterm;
   }

   public String getTipoPi() {
        return tipoPi;
   }

   public void setTipoPi(String tipoPi) {
        markAsChanged("TIPOPI", tipoPi);
        this.tipoPi = tipoPi;
   }

   public String getTipoSubOp() {
        return tipoSubOp;
   }

   public void setTipoSubOp(String tipoSubOp) {
        markAsChanged("TIPOSUBOP", tipoSubOp);
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
        this.setVo(vo);
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
