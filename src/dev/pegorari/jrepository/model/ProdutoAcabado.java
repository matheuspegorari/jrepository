package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoAcabado extends AbstractSankhyaEntity<ProdutoAcabado> {
   public String getBasCalcDtVal() {
        return this.getVo().asString("BASCALCDTVAL");
   }

   public void setBasCalcDtVal(String basCalcDtVal) {
        markAsChanged("BASCALCDTVAL", basCalcDtVal);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public BigDecimal getMultiDeal() {
        return this.getVo().asBigDecimal("MULTIDEAL");
   }

   public void setMultiDeal(BigDecimal multiDeal) {
        markAsChanged("MULTIDEAL", multiDeal);
   }

   public BigDecimal getQtdProdMin() {
        return this.getVo().asBigDecimal("QTDPRODMIN");
   }

   public void setQtdProdMin(BigDecimal qtdProdMin) {
        markAsChanged("QTDPRODMIN", qtdProdMin);
   }

   public BigDecimal getTamLotePad() {
        return this.getVo().asBigDecimal("TAMLOTEPAD");
   }

   public void setTamLotePad(BigDecimal tamLotePad) {
        markAsChanged("TAMLOTEPAD", tamLotePad);
   }

   public BigDecimal getTempoAtravess() {
        return this.getVo().asBigDecimal("TEMPOATRAVESS");
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        markAsChanged("TEMPOATRAVESS", tempoAtravess);
   }

   public String getUnTempoAtravess() {
        return this.getVo().asString("UNTEMPOATRAVESS");
   }

   public void setUnTempoAtravess(String unTempoAtravess) {
        markAsChanged("UNTEMPOATRAVESS", unTempoAtravess);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getMascSerie() {
        return this.getVo().asString("MASCSERIE");
   }

   public void setMascSerie(String mascSerie) {
        markAsChanged("MASCSERIE", mascSerie);
   }

   public BigDecimal getTempoFixo() {
        return this.getVo().asBigDecimal("TEMPOFIXO");
   }

   public void setTempoFixo(BigDecimal tempoFixo) {
        markAsChanged("TEMPOFIXO", tempoFixo);
   }

   public String getTipoGeraSerie() {
        return this.getVo().asString("TIPOGERASERIE");
   }

   public void setTipoGeraSerie(String tipoGeraSerie) {
        markAsChanged("TIPOGERASERIE", tipoGeraSerie);
   }

   public String getTipoTempo() {
        return this.getVo().asString("TIPOTEMPO");
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
   }

   public String getValidaVersao() {
        return this.getVo().asString("VALIDAVERSAO");
   }

   public void setValidaVersao(String validaVersao) {
        markAsChanged("VALIDAVERSAO", validaVersao);
   }

   public BigDecimal getIdFormula() {
        return this.getVo().asBigDecimal("IDFORMULA");
   }

   public void setIdFormula(BigDecimal idFormula) {
        markAsChanged("IDFORMULA", idFormula);
   }

   public BigDecimal getCodLocDest() {
        return this.getVo().asBigDecimal("CODLOCDEST");
   }

   public void setCodLocDest(BigDecimal codLocDest) {
        markAsChanged("CODLOCDEST", codLocDest);
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
        return "TPRLPA";
   }

   @Override
   public String getEntityName() {
        return "ProdutoAcabado";
   }

   @Override
   public ProdutoAcabado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
