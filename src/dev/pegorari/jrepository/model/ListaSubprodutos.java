package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ListaSubprodutos implements SankhyaEntity<ListaSubprodutos> {

   private BigDecimal codLocal;
   private String referencia;
   private BigDecimal codProdPa;
   private BigDecimal codProdSp;
   private String codVol;
   private String controlePa;
   private String controleSp;
   private String exigeApontamento;
   private BigDecimal ideFx;
   private BigDecimal qtdMistura;
   private BigDecimal seqLsp;
   private String tipoControleSp;
   private String tipoQtd;
   private String subprodutoPerda;
   private String basCalcDtValSp;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getCodProdSp() {
        return codProdSp;
   }

   public void setCodProdSp(BigDecimal codProdSp) {
        this.codProdSp = codProdSp;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public String getControleSp() {
        return controleSp;
   }

   public void setControleSp(String controleSp) {
        this.controleSp = controleSp;
   }

   public String getExigeApontamento() {
        return exigeApontamento;
   }

   public void setExigeApontamento(String exigeApontamento) {
        this.exigeApontamento = exigeApontamento;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getSeqLsp() {
        return seqLsp;
   }

   public void setSeqLsp(BigDecimal seqLsp) {
        this.seqLsp = seqLsp;
   }

   public String getTipoControleSp() {
        return tipoControleSp;
   }

   public void setTipoControleSp(String tipoControleSp) {
        this.tipoControleSp = tipoControleSp;
   }

   public String getTipoQtd() {
        return tipoQtd;
   }

   public void setTipoQtd(String tipoQtd) {
        this.tipoQtd = tipoQtd;
   }

   public String getSubprodutoPerda() {
        return subprodutoPerda;
   }

   public void setSubprodutoPerda(String subprodutoPerda) {
        this.subprodutoPerda = subprodutoPerda;
   }

   public String getBasCalcDtValSp() {
        return basCalcDtValSp;
   }

   public void setBasCalcDtValSp(String basCalcDtValSp) {
        this.basCalcDtValSp = basCalcDtValSp;
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
        return "ListaSubprodutos";
   }

   @Override
   public ListaSubprodutos fromVO(DynamicVO vo) {
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.referencia = vo.asString("REFERENCIA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codProdSp = vo.asBigDecimal("CODPRODSP");
        this.codVol = vo.asString("CODVOL");
        this.controlePa = vo.asString("CONTROLEPA");
        this.controleSp = vo.asString("CONTROLESP");
        this.exigeApontamento = vo.asString("EXIGEAPONTAMENTO");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.seqLsp = vo.asBigDecimal("SEQLSP");
        this.tipoControleSp = vo.asString("TIPOCONTROLESP");
        this.tipoQtd = vo.asString("TIPOQTD");
        this.subprodutoPerda = vo.asString("SUBPRODUTOPERDA");
        this.basCalcDtValSp = vo.asString("BASCALCDTVALSP");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        return this;
   }
}
