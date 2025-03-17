package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class HierarquiaDemonstrativo implements SankhyaEntity<HierarquiaDemonstrativo> {

   private String geradra;
   private String grupDemonSdfc;
   private String grupoDemonst;
   private String indGrpdre;
   private String invertVlrAlt;
   private String sitDfc;
   private String indDcctaFin;
   private String indDcctaIni;
   private BigDecimal nuOrdem;
   private BigDecimal grau;
   private String agrupDlpa;
   private String indGrubal;
   private String analitico;
   private String codDmtPai;
   private BigDecimal codEmp;
   private String codDmt;
   private BigDecimal codTdm;
   private String ativo;
   private String situacao;
   private String descrDmt;

   public String getGeradra() {
        return geradra;
   }

   public void setGeradra(String geradra) {
        this.geradra = geradra;
   }

   public String getGrupDemonSdfc() {
        return grupDemonSdfc;
   }

   public void setGrupDemonSdfc(String grupDemonSdfc) {
        this.grupDemonSdfc = grupDemonSdfc;
   }

   public String getGrupoDemonst() {
        return grupoDemonst;
   }

   public void setGrupoDemonst(String grupoDemonst) {
        this.grupoDemonst = grupoDemonst;
   }

   public String getIndGrpdre() {
        return indGrpdre;
   }

   public void setIndGrpdre(String indGrpdre) {
        this.indGrpdre = indGrpdre;
   }

   public String getInvertVlrAlt() {
        return invertVlrAlt;
   }

   public void setInvertVlrAlt(String invertVlrAlt) {
        this.invertVlrAlt = invertVlrAlt;
   }

   public String getSitDfc() {
        return sitDfc;
   }

   public void setSitDfc(String sitDfc) {
        this.sitDfc = sitDfc;
   }

   public String getIndDcctaFin() {
        return indDcctaFin;
   }

   public void setIndDcctaFin(String indDcctaFin) {
        this.indDcctaFin = indDcctaFin;
   }

   public String getIndDcctaIni() {
        return indDcctaIni;
   }

   public void setIndDcctaIni(String indDcctaIni) {
        this.indDcctaIni = indDcctaIni;
   }

   public BigDecimal getNuOrdem() {
        return nuOrdem;
   }

   public void setNuOrdem(BigDecimal nuOrdem) {
        this.nuOrdem = nuOrdem;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public String getAgrupDlpa() {
        return agrupDlpa;
   }

   public void setAgrupDlpa(String agrupDlpa) {
        this.agrupDlpa = agrupDlpa;
   }

   public String getIndGrubal() {
        return indGrubal;
   }

   public void setIndGrubal(String indGrubal) {
        this.indGrubal = indGrubal;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getCodDmtPai() {
        return codDmtPai;
   }

   public void setCodDmtPai(String codDmtPai) {
        this.codDmtPai = codDmtPai;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCodDmt() {
        return codDmt;
   }

   public void setCodDmt(String codDmt) {
        this.codDmt = codDmt;
   }

   public BigDecimal getCodTdm() {
        return codTdm;
   }

   public void setCodTdm(BigDecimal codTdm) {
        this.codTdm = codTdm;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getDescrDmt() {
        return descrDmt;
   }

   public void setDescrDmt(String descrDmt) {
        this.descrDmt = descrDmt;
   }

   @Override
   public String getEntityName() {
        return "HierarquiaDemonstrativo";
   }

   @Override
   public HierarquiaDemonstrativo fromVO(DynamicVO vo) {
        this.geradra = vo.asString("GERADRA");
        this.grupDemonSdfc = vo.asString("GRUPDEMONSDFC");
        this.grupoDemonst = vo.asString("GRUPODEMONST");
        this.indGrpdre = vo.asString("INDGRPDRE");
        this.invertVlrAlt = vo.asString("INVERTVLRALT");
        this.sitDfc = vo.asString("SITDFC");
        this.indDcctaFin = vo.asString("INDDCCTAFIN");
        this.indDcctaIni = vo.asString("INDDCCTAINI");
        this.nuOrdem = vo.asBigDecimal("NUORDEM");
        this.grau = vo.asBigDecimal("GRAU");
        this.agrupDlpa = vo.asString("AGRUPDLPA");
        this.indGrubal = vo.asString("INDGRUBAL");
        this.analitico = vo.asString("ANALITICO");
        this.codDmtPai = vo.asString("CODDMTPAI");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codDmt = vo.asString("CODDMT");
        this.codTdm = vo.asBigDecimal("CODTDM");
        this.ativo = vo.asString("ATIVO");
        this.situacao = vo.asString("SITUACAO");
        this.descrDmt = vo.asString("DESCRDMT");
        return this;
   }
}
