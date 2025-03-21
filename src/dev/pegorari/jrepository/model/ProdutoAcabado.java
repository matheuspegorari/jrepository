package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoAcabado extends AbstractSankhyaEntity<ProdutoAcabado> {
   private String basCalcDtVal;
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal idProc;
   private BigDecimal multiDeal;
   private BigDecimal qtdProdMin;
   private BigDecimal tamLotePad;
   private BigDecimal tempoAtravess;
   private String unTempoAtravess;
   private String referencia;
   private String mascSerie;
   private BigDecimal tempoFixo;
   private String tipoGeraSerie;
   private String tipoTempo;
   private String validaVersao;
   private BigDecimal idFormula;
   private BigDecimal codLocDest;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;

   public String getBasCalcDtVal() {
        return basCalcDtVal;
   }

   public void setBasCalcDtVal(String basCalcDtVal) {
        markAsChanged("BASCALCDTVAL", basCalcDtVal);
        this.basCalcDtVal = basCalcDtVal;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public BigDecimal getMultiDeal() {
        return multiDeal;
   }

   public void setMultiDeal(BigDecimal multiDeal) {
        markAsChanged("MULTIDEAL", multiDeal);
        this.multiDeal = multiDeal;
   }

   public BigDecimal getQtdProdMin() {
        return qtdProdMin;
   }

   public void setQtdProdMin(BigDecimal qtdProdMin) {
        markAsChanged("QTDPRODMIN", qtdProdMin);
        this.qtdProdMin = qtdProdMin;
   }

   public BigDecimal getTamLotePad() {
        return tamLotePad;
   }

   public void setTamLotePad(BigDecimal tamLotePad) {
        markAsChanged("TAMLOTEPAD", tamLotePad);
        this.tamLotePad = tamLotePad;
   }

   public BigDecimal getTempoAtravess() {
        return tempoAtravess;
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        markAsChanged("TEMPOATRAVESS", tempoAtravess);
        this.tempoAtravess = tempoAtravess;
   }

   public String getUnTempoAtravess() {
        return unTempoAtravess;
   }

   public void setUnTempoAtravess(String unTempoAtravess) {
        markAsChanged("UNTEMPOATRAVESS", unTempoAtravess);
        this.unTempoAtravess = unTempoAtravess;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getMascSerie() {
        return mascSerie;
   }

   public void setMascSerie(String mascSerie) {
        markAsChanged("MASCSERIE", mascSerie);
        this.mascSerie = mascSerie;
   }

   public BigDecimal getTempoFixo() {
        return tempoFixo;
   }

   public void setTempoFixo(BigDecimal tempoFixo) {
        markAsChanged("TEMPOFIXO", tempoFixo);
        this.tempoFixo = tempoFixo;
   }

   public String getTipoGeraSerie() {
        return tipoGeraSerie;
   }

   public void setTipoGeraSerie(String tipoGeraSerie) {
        markAsChanged("TIPOGERASERIE", tipoGeraSerie);
        this.tipoGeraSerie = tipoGeraSerie;
   }

   public String getTipoTempo() {
        return tipoTempo;
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
        this.tipoTempo = tipoTempo;
   }

   public String getValidaVersao() {
        return validaVersao;
   }

   public void setValidaVersao(String validaVersao) {
        markAsChanged("VALIDAVERSAO", validaVersao);
        this.validaVersao = validaVersao;
   }

   public BigDecimal getIdFormula() {
        return idFormula;
   }

   public void setIdFormula(BigDecimal idFormula) {
        markAsChanged("IDFORMULA", idFormula);
        this.idFormula = idFormula;
   }

   public BigDecimal getCodLocDest() {
        return codLocDest;
   }

   public void setCodLocDest(BigDecimal codLocDest) {
        markAsChanged("CODLOCDEST", codLocDest);
        this.codLocDest = codLocDest;
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
        return "TPRLPA";
   }

   @Override
   public String getEntityName() {
        return "ProdutoAcabado";
   }

   @Override
   public ProdutoAcabado fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.basCalcDtVal = vo.asString("BASCALCDTVAL");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.multiDeal = vo.asBigDecimal("MULTIDEAL");
        this.qtdProdMin = vo.asBigDecimal("QTDPRODMIN");
        this.tamLotePad = vo.asBigDecimal("TAMLOTEPAD");
        this.tempoAtravess = vo.asBigDecimal("TEMPOATRAVESS");
        this.unTempoAtravess = vo.asString("UNTEMPOATRAVESS");
        this.referencia = vo.asString("REFERENCIA");
        this.mascSerie = vo.asString("MASCSERIE");
        this.tempoFixo = vo.asBigDecimal("TEMPOFIXO");
        this.tipoGeraSerie = vo.asString("TIPOGERASERIE");
        this.tipoTempo = vo.asString("TIPOTEMPO");
        this.validaVersao = vo.asString("VALIDAVERSAO");
        this.idFormula = vo.asBigDecimal("IDFORMULA");
        this.codLocDest = vo.asBigDecimal("CODLOCDEST");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        return this;
   }
}
