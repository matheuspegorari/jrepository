package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ProdutoLancamentoDeOP extends AbstractSankhyaEntity<ProdutoLancamentoDeOP> {
   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
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

   public BigDecimal getTamLote() {
        return this.getVo().asBigDecimal("TAMLOTE");
   }

   public void setTamLote(BigDecimal tamLote) {
        markAsChanged("TAMLOTE", tamLote);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public String getEditado() {
        return this.getVo().asString("EDITADO");
   }

   public void setEditado(String editado) {
        markAsChanged("EDITADO", editado);
   }

   public String getNroLote() {
        return this.getVo().asString("NROLOTE");
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public BigDecimal getMinLote() {
        return this.getVo().asBigDecimal("MINLOTE");
   }

   public void setMinLote(BigDecimal minLote) {
        markAsChanged("MINLOTE", minLote);
   }

   public BigDecimal getMultLote() {
        return this.getVo().asBigDecimal("MULTLOTE");
   }

   public void setMultLote(BigDecimal multLote) {
        markAsChanged("MULTLOTE", multLote);
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

   public String getTipoGeraSerie() {
        return this.getVo().asString("TIPOGERASERIE");
   }

   public void setTipoGeraSerie(String tipoGeraSerie) {
        markAsChanged("TIPOGERASERIE", tipoGeraSerie);
   }

   public BigDecimal getCalcTamLote() {
        return this.getVo().asBigDecimal("CALCTAMLOTE");
   }

   public void setCalcTamLote(BigDecimal calcTamLote) {
        markAsChanged("CALCTAMLOTE", calcTamLote);
   }

   public BigDecimal getCodFormula() {
        return this.getVo().asBigDecimal("CODFORMULA");
   }

   public void setCodFormula(BigDecimal codFormula) {
        markAsChanged("CODFORMULA", codFormula);
   }

   @Override
   public String getTableName() {
        return "TPRPLOP";
   }

   @Override
   public String getEntityName() {
        return "ProdutoLancamentoDeOP";
   }

   @Override
   public ProdutoLancamentoDeOP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
