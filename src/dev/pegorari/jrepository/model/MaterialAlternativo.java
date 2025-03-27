package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MaterialAlternativo extends AbstractSankhyaEntity<MaterialAlternativo> {
   public String getReferenciaMpAlt() {
        return this.getVo().asString("REFERENCIAMPALT");
   }

   public void setReferenciaMpAlt(String referenciaMpAlt) {
        markAsChanged("REFERENCIAMPALT", referenciaMpAlt);
   }

   public String getReferenciaMp() {
        return this.getVo().asString("REFERENCIAMP");
   }

   public void setReferenciaMp(String referenciaMp) {
        markAsChanged("REFERENCIAMP", referenciaMp);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public BigDecimal getCodProdMpAlt() {
        return this.getVo().asBigDecimal("CODPRODMPALT");
   }

   public void setCodProdMpAlt(BigDecimal codProdMpAlt) {
        markAsChanged("CODPRODMPALT", codProdMpAlt);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public String getControleMpAlt() {
        return this.getVo().asString("CONTROLEMPALT");
   }

   public void setControleMpAlt(String controleMpAlt) {
        markAsChanged("CONTROLEMPALT", controleMpAlt);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getQtdMistura() {
        return this.getVo().asBigDecimal("QTDMISTURA");
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
   }

   public BigDecimal getSeqMpa() {
        return this.getVo().asBigDecimal("SEQMPA");
   }

   public void setSeqMpa(BigDecimal seqMpa) {
        markAsChanged("SEQMPA", seqMpa);
   }

   public String getUsoMpa() {
        return this.getVo().asString("USOMPA");
   }

   public void setUsoMpa(String usoMpa) {
        markAsChanged("USOMPA", usoMpa);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getConjunto() {
        return this.getVo().asBigDecimal("CONJUNTO");
   }

   public void setConjunto(BigDecimal conjunto) {
        markAsChanged("CONJUNTO", conjunto);
   }

   public BigDecimal getCodLocalBaixa() {
        return this.getVo().asBigDecimal("CODLOCALBAIXA");
   }

   public void setCodLocalBaixa(BigDecimal codLocalBaixa) {
        markAsChanged("CODLOCALBAIXA", codLocalBaixa);
   }

   public BigDecimal getCodLocalOrig() {
        return this.getVo().asBigDecimal("CODLOCALORIG");
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public BigDecimal getCodUsuCad() {
        return this.getVo().asBigDecimal("CODUSUCAD");
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   @Override
   public String getTableName() {
        return "TPRMPA";
   }

   @Override
   public String getEntityName() {
        return "MaterialAlternativo";
   }

   @Override
   public MaterialAlternativo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
