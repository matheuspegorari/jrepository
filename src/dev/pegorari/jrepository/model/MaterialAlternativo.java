package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MaterialAlternativo extends AbstractSankhyaEntity<MaterialAlternativo> {
   private String referenciaMpAlt;
   private String referenciaMp;
   private BigDecimal codProdMp;
   private BigDecimal codProdMpAlt;
   private BigDecimal codProdPa;
   private String controleMp;
   private String controleMpAlt;
   private String controlePa;
   private BigDecimal ideFx;
   private BigDecimal qtdMistura;
   private BigDecimal seqMpa;
   private String usoMpa;
   private String codVol;
   private BigDecimal conjunto;
   private BigDecimal codLocalBaixa;
   private BigDecimal codLocalOrig;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;

   public String getReferenciaMpAlt() {
        return referenciaMpAlt;
   }

   public void setReferenciaMpAlt(String referenciaMpAlt) {
        markAsChanged("REFERENCIAMPALT", referenciaMpAlt);
        this.referenciaMpAlt = referenciaMpAlt;
   }

   public String getReferenciaMp() {
        return referenciaMp;
   }

   public void setReferenciaMp(String referenciaMp) {
        markAsChanged("REFERENCIAMP", referenciaMp);
        this.referenciaMp = referenciaMp;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public BigDecimal getCodProdMpAlt() {
        return codProdMpAlt;
   }

   public void setCodProdMpAlt(BigDecimal codProdMpAlt) {
        markAsChanged("CODPRODMPALT", codProdMpAlt);
        this.codProdMpAlt = codProdMpAlt;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public String getControleMpAlt() {
        return controleMpAlt;
   }

   public void setControleMpAlt(String controleMpAlt) {
        markAsChanged("CONTROLEMPALT", controleMpAlt);
        this.controleMpAlt = controleMpAlt;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getSeqMpa() {
        return seqMpa;
   }

   public void setSeqMpa(BigDecimal seqMpa) {
        markAsChanged("SEQMPA", seqMpa);
        this.seqMpa = seqMpa;
   }

   public String getUsoMpa() {
        return usoMpa;
   }

   public void setUsoMpa(String usoMpa) {
        markAsChanged("USOMPA", usoMpa);
        this.usoMpa = usoMpa;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public BigDecimal getConjunto() {
        return conjunto;
   }

   public void setConjunto(BigDecimal conjunto) {
        markAsChanged("CONJUNTO", conjunto);
        this.conjunto = conjunto;
   }

   public BigDecimal getCodLocalBaixa() {
        return codLocalBaixa;
   }

   public void setCodLocalBaixa(BigDecimal codLocalBaixa) {
        markAsChanged("CODLOCALBAIXA", codLocalBaixa);
        this.codLocalBaixa = codLocalBaixa;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
        this.dhCad = dhCad;
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
        this.setOriginalVO(vo);
        this.referenciaMpAlt = vo.asString("REFERENCIAMPALT");
        this.referenciaMp = vo.asString("REFERENCIAMP");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.codProdMpAlt = vo.asBigDecimal("CODPRODMPALT");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controleMp = vo.asString("CONTROLEMP");
        this.controleMpAlt = vo.asString("CONTROLEMPALT");
        this.controlePa = vo.asString("CONTROLEPA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.seqMpa = vo.asBigDecimal("SEQMPA");
        this.usoMpa = vo.asString("USOMPA");
        this.codVol = vo.asString("CODVOL");
        this.conjunto = vo.asBigDecimal("CONJUNTO");
        this.codLocalBaixa = vo.asBigDecimal("CODLOCALBAIXA");
        this.codLocalOrig = vo.asBigDecimal("CODLOCALORIG");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        return this;
   }
}
