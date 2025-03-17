package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoIntermediarioProcesso implements SankhyaEntity<ProdutoIntermediarioProcesso> {

   private String referencia;
   private String tipoNroLote;
   private String controlePa;
   private String aguardarSubop;
   private BigDecimal codProdPa;
   private String tipoSubop;
   private BigDecimal codProdPi;
   private String controlePi;
   private String tipoPi;
   private BigDecimal idProc;
   private String consideraQtdEst;
   private String redimensionaPa;
   private String redimensionaPaPerda;
   private String bloqInitPa;
   private String consideraLotePi;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getTipoNroLote() {
        return tipoNroLote;
   }

   public void setTipoNroLote(String tipoNroLote) {
        this.tipoNroLote = tipoNroLote;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public String getAguardarSubop() {
        return aguardarSubop;
   }

   public void setAguardarSubop(String aguardarSubop) {
        this.aguardarSubop = aguardarSubop;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getTipoSubop() {
        return tipoSubop;
   }

   public void setTipoSubop(String tipoSubop) {
        this.tipoSubop = tipoSubop;
   }

   public BigDecimal getCodProdPi() {
        return codProdPi;
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        this.codProdPi = codProdPi;
   }

   public String getControlePi() {
        return controlePi;
   }

   public void setControlePi(String controlePi) {
        this.controlePi = controlePi;
   }

   public String getTipoPi() {
        return tipoPi;
   }

   public void setTipoPi(String tipoPi) {
        this.tipoPi = tipoPi;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public String getConsideraQtdEst() {
        return consideraQtdEst;
   }

   public void setConsideraQtdEst(String consideraQtdEst) {
        this.consideraQtdEst = consideraQtdEst;
   }

   public String getRedimensionaPa() {
        return redimensionaPa;
   }

   public void setRedimensionaPa(String redimensionaPa) {
        this.redimensionaPa = redimensionaPa;
   }

   public String getRedimensionaPaPerda() {
        return redimensionaPaPerda;
   }

   public void setRedimensionaPaPerda(String redimensionaPaPerda) {
        this.redimensionaPaPerda = redimensionaPaPerda;
   }

   public String getBloqInitPa() {
        return bloqInitPa;
   }

   public void setBloqInitPa(String bloqInitPa) {
        this.bloqInitPa = bloqInitPa;
   }

   public String getConsideraLotePi() {
        return consideraLotePi;
   }

   public void setConsideraLotePi(String consideraLotePi) {
        this.consideraLotePi = consideraLotePi;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        this.dhCad = dhCad;
   }

   @Override
   public String getEntityName() {
        return "ProdutoIntermediarioProcesso";
   }

   @Override
   public ProdutoIntermediarioProcesso fromVO(DynamicVO vo) {
        this.referencia = vo.asString("REFERENCIA");
        this.tipoNroLote = vo.asString("TIPONROLOTE");
        this.controlePa = vo.asString("CONTROLEPA");
        this.aguardarSubop = vo.asString("AGUARDARSUBOP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.tipoSubop = vo.asString("TIPOSUBOP");
        this.codProdPi = vo.asBigDecimal("CODPRODPI");
        this.controlePi = vo.asString("CONTROLEPI");
        this.tipoPi = vo.asString("TIPOPI");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.consideraQtdEst = vo.asString("CONSIDERAQTDEST");
        this.redimensionaPa = vo.asString("REDIMENSIONAPA");
        this.redimensionaPaPerda = vo.asString("REDIMENSIONAPAPERDA");
        this.bloqInitPa = vo.asString("BLOQINITPA");
        this.consideraLotePi = vo.asString("CONSIDERALOTEPI");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        return this;
   }
}
