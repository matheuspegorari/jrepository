package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoIntermediarioProcesso extends AbstractSankhyaEntity<ProdutoIntermediarioProcesso> {
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
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getTipoNroLote() {
        return tipoNroLote;
   }

   public void setTipoNroLote(String tipoNroLote) {
        markAsChanged("TIPONROLOTE", tipoNroLote);
        this.tipoNroLote = tipoNroLote;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public String getAguardarSubop() {
        return aguardarSubop;
   }

   public void setAguardarSubop(String aguardarSubop) {
        markAsChanged("AGUARDARSUBOP", aguardarSubop);
        this.aguardarSubop = aguardarSubop;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getTipoSubop() {
        return tipoSubop;
   }

   public void setTipoSubop(String tipoSubop) {
        markAsChanged("TIPOSUBOP", tipoSubop);
        this.tipoSubop = tipoSubop;
   }

   public BigDecimal getCodProdPi() {
        return codProdPi;
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        markAsChanged("CODPRODPI", codProdPi);
        this.codProdPi = codProdPi;
   }

   public String getControlePi() {
        return controlePi;
   }

   public void setControlePi(String controlePi) {
        markAsChanged("CONTROLEPI", controlePi);
        this.controlePi = controlePi;
   }

   public String getTipoPi() {
        return tipoPi;
   }

   public void setTipoPi(String tipoPi) {
        markAsChanged("TIPOPI", tipoPi);
        this.tipoPi = tipoPi;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public String getConsideraQtdEst() {
        return consideraQtdEst;
   }

   public void setConsideraQtdEst(String consideraQtdEst) {
        markAsChanged("CONSIDERAQTDEST", consideraQtdEst);
        this.consideraQtdEst = consideraQtdEst;
   }

   public String getRedimensionaPa() {
        return redimensionaPa;
   }

   public void setRedimensionaPa(String redimensionaPa) {
        markAsChanged("REDIMENSIONAPA", redimensionaPa);
        this.redimensionaPa = redimensionaPa;
   }

   public String getRedimensionaPaPerda() {
        return redimensionaPaPerda;
   }

   public void setRedimensionaPaPerda(String redimensionaPaPerda) {
        markAsChanged("REDIMENSIONAPAPERDA", redimensionaPaPerda);
        this.redimensionaPaPerda = redimensionaPaPerda;
   }

   public String getBloqInitPa() {
        return bloqInitPa;
   }

   public void setBloqInitPa(String bloqInitPa) {
        markAsChanged("BLOQINITPA", bloqInitPa);
        this.bloqInitPa = bloqInitPa;
   }

   public String getConsideraLotePi() {
        return consideraLotePi;
   }

   public void setConsideraLotePi(String consideraLotePi) {
        markAsChanged("CONSIDERALOTEPI", consideraLotePi);
        this.consideraLotePi = consideraLotePi;
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
        return "TPRLPI";
   }

   @Override
   public String getEntityName() {
        return "ProdutoIntermediarioProcesso";
   }

   @Override
   public ProdutoIntermediarioProcesso fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
