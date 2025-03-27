package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MaterialMRP extends AbstractSankhyaEntity<MaterialMRP> {
   public String getTipoQtd() {
        return this.getVo().asString("TIPOQTD");
   }

   public void setTipoQtd(String tipoQtd) {
        markAsChanged("TIPOQTD", tipoQtd);
   }

   public BigDecimal getQtdMistura() {
        return this.getVo().asBigDecimal("QTDMISTURA");
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
   }

   public BigDecimal getQtdTotal() {
        return this.getVo().asBigDecimal("QTDTOTAL");
   }

   public void setQtdTotal(BigDecimal qtdTotal) {
        markAsChanged("QTDTOTAL", qtdTotal);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public BigDecimal getNumPs() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
   }

   public BigDecimal getSeqImps() {
        return this.getVo().asBigDecimal("SEQIMPS");
   }

   public void setSeqImps(BigDecimal seqImps) {
        markAsChanged("SEQIMPS", seqImps);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public String getProdInterm() {
        return this.getVo().asString("PRODINTERM");
   }

   public void setProdInterm(String prodInterm) {
        markAsChanged("PRODINTERM", prodInterm);
   }

   public String getTipoPi() {
        return this.getVo().asString("TIPOPI");
   }

   public void setTipoPi(String tipoPi) {
        markAsChanged("TIPOPI", tipoPi);
   }

   public String getTipoSubOp() {
        return this.getVo().asString("TIPOSUBOP");
   }

   public void setTipoSubOp(String tipoSubOp) {
        markAsChanged("TIPOSUBOP", tipoSubOp);
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
        return this;
   }
}
