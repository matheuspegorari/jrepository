package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ProdutoLancamentoDeOP implements SankhyaEntity<ProdutoLancamentoDeOP> {

   private BigDecimal seqOp;
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal tamLote;
   private BigDecimal nuLop;
   private String editado;
   private String nroLote;
   private BigDecimal estoque;
   private BigDecimal minLote;
   private BigDecimal multLote;
   private BigDecimal qtdProdMin;
   private BigDecimal tamLotePad;
   private String tipoGeraSerie;
   private BigDecimal calcTamLote;
   private BigDecimal codFormula;

   public BigDecimal getSeqOp() {
        return seqOp;
   }

   public void setSeqOp(BigDecimal seqOp) {
        this.seqOp = seqOp;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getTamLote() {
        return tamLote;
   }

   public void setTamLote(BigDecimal tamLote) {
        this.tamLote = tamLote;
   }

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        this.nuLop = nuLop;
   }

   public String getEditado() {
        return editado;
   }

   public void setEditado(String editado) {
        this.editado = editado;
   }

   public String getNroLote() {
        return nroLote;
   }

   public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
   }

   public BigDecimal getMinLote() {
        return minLote;
   }

   public void setMinLote(BigDecimal minLote) {
        this.minLote = minLote;
   }

   public BigDecimal getMultLote() {
        return multLote;
   }

   public void setMultLote(BigDecimal multLote) {
        this.multLote = multLote;
   }

   public BigDecimal getQtdProdMin() {
        return qtdProdMin;
   }

   public void setQtdProdMin(BigDecimal qtdProdMin) {
        this.qtdProdMin = qtdProdMin;
   }

   public BigDecimal getTamLotePad() {
        return tamLotePad;
   }

   public void setTamLotePad(BigDecimal tamLotePad) {
        this.tamLotePad = tamLotePad;
   }

   public String getTipoGeraSerie() {
        return tipoGeraSerie;
   }

   public void setTipoGeraSerie(String tipoGeraSerie) {
        this.tipoGeraSerie = tipoGeraSerie;
   }

   public BigDecimal getCalcTamLote() {
        return calcTamLote;
   }

   public void setCalcTamLote(BigDecimal calcTamLote) {
        this.calcTamLote = calcTamLote;
   }

   public BigDecimal getCodFormula() {
        return codFormula;
   }

   public void setCodFormula(BigDecimal codFormula) {
        this.codFormula = codFormula;
   }

   @Override
   public String getEntityName() {
        return "ProdutoLancamentoDeOP";
   }

   @Override
   public ProdutoLancamentoDeOP fromVO(DynamicVO vo) {
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.tamLote = vo.asBigDecimal("TAMLOTE");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.editado = vo.asString("EDITADO");
        this.nroLote = vo.asString("NROLOTE");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.minLote = vo.asBigDecimal("MINLOTE");
        this.multLote = vo.asBigDecimal("MULTLOTE");
        this.qtdProdMin = vo.asBigDecimal("QTDPRODMIN");
        this.tamLotePad = vo.asBigDecimal("TAMLOTEPAD");
        this.tipoGeraSerie = vo.asString("TIPOGERASERIE");
        this.calcTamLote = vo.asBigDecimal("CALCTAMLOTE");
        this.codFormula = vo.asBigDecimal("CODFORMULA");
        return this;
   }
}
