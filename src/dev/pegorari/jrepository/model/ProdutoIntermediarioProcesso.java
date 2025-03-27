package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoIntermediarioProcesso extends AbstractSankhyaEntity<ProdutoIntermediarioProcesso> {
   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getTipoNroLote() {
        return this.getVo().asString("TIPONROLOTE");
   }

   public void setTipoNroLote(String tipoNroLote) {
        markAsChanged("TIPONROLOTE", tipoNroLote);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getAguardarSubop() {
        return this.getVo().asString("AGUARDARSUBOP");
   }

   public void setAguardarSubop(String aguardarSubop) {
        markAsChanged("AGUARDARSUBOP", aguardarSubop);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getTipoSubop() {
        return this.getVo().asString("TIPOSUBOP");
   }

   public void setTipoSubop(String tipoSubop) {
        markAsChanged("TIPOSUBOP", tipoSubop);
   }

   public BigDecimal getCodProdPi() {
        return this.getVo().asBigDecimal("CODPRODPI");
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        markAsChanged("CODPRODPI", codProdPi);
   }

   public String getControlePi() {
        return this.getVo().asString("CONTROLEPI");
   }

   public void setControlePi(String controlePi) {
        markAsChanged("CONTROLEPI", controlePi);
   }

   public String getTipoPi() {
        return this.getVo().asString("TIPOPI");
   }

   public void setTipoPi(String tipoPi) {
        markAsChanged("TIPOPI", tipoPi);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public String getConsideraQtdEst() {
        return this.getVo().asString("CONSIDERAQTDEST");
   }

   public void setConsideraQtdEst(String consideraQtdEst) {
        markAsChanged("CONSIDERAQTDEST", consideraQtdEst);
   }

   public String getRedimensionaPa() {
        return this.getVo().asString("REDIMENSIONAPA");
   }

   public void setRedimensionaPa(String redimensionaPa) {
        markAsChanged("REDIMENSIONAPA", redimensionaPa);
   }

   public String getRedimensionaPaPerda() {
        return this.getVo().asString("REDIMENSIONAPAPERDA");
   }

   public void setRedimensionaPaPerda(String redimensionaPaPerda) {
        markAsChanged("REDIMENSIONAPAPERDA", redimensionaPaPerda);
   }

   public String getBloqInitPa() {
        return this.getVo().asString("BLOQINITPA");
   }

   public void setBloqInitPa(String bloqInitPa) {
        markAsChanged("BLOQINITPA", bloqInitPa);
   }

   public String getConsideraLotePi() {
        return this.getVo().asString("CONSIDERALOTEPI");
   }

   public void setConsideraLotePi(String consideraLotePi) {
        markAsChanged("CONSIDERALOTEPI", consideraLotePi);
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
        return "TPRLPI";
   }

   @Override
   public String getEntityName() {
        return "ProdutoIntermediarioProcesso";
   }

   @Override
   public ProdutoIntermediarioProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
