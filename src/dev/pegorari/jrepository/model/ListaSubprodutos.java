package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ListaSubprodutos extends AbstractSankhyaEntity<ListaSubprodutos> {
   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getCodProdSp() {
        return this.getVo().asBigDecimal("CODPRODSP");
   }

   public void setCodProdSp(BigDecimal codProdSp) {
        markAsChanged("CODPRODSP", codProdSp);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getControleSp() {
        return this.getVo().asString("CONTROLESP");
   }

   public void setControleSp(String controleSp) {
        markAsChanged("CONTROLESP", controleSp);
   }

   public String getExigeApontamento() {
        return this.getVo().asString("EXIGEAPONTAMENTO");
   }

   public void setExigeApontamento(String exigeApontamento) {
        markAsChanged("EXIGEAPONTAMENTO", exigeApontamento);
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

   public BigDecimal getSeqLsp() {
        return this.getVo().asBigDecimal("SEQLSP");
   }

   public void setSeqLsp(BigDecimal seqLsp) {
        markAsChanged("SEQLSP", seqLsp);
   }

   public String getTipoControleSp() {
        return this.getVo().asString("TIPOCONTROLESP");
   }

   public void setTipoControleSp(String tipoControleSp) {
        markAsChanged("TIPOCONTROLESP", tipoControleSp);
   }

   public String getTipoQtd() {
        return this.getVo().asString("TIPOQTD");
   }

   public void setTipoQtd(String tipoQtd) {
        markAsChanged("TIPOQTD", tipoQtd);
   }

   public String getSubprodutoPerda() {
        return this.getVo().asString("SUBPRODUTOPERDA");
   }

   public void setSubprodutoPerda(String subprodutoPerda) {
        markAsChanged("SUBPRODUTOPERDA", subprodutoPerda);
   }

   public String getBasCalcDtValSp() {
        return this.getVo().asString("BASCALCDTVALSP");
   }

   public void setBasCalcDtValSp(String basCalcDtValSp) {
        markAsChanged("BASCALCDTVALSP", basCalcDtValSp);
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
        return "TPRLSP";
   }

   @Override
   public String getEntityName() {
        return "ListaSubprodutos";
   }

   @Override
   public ListaSubprodutos fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
