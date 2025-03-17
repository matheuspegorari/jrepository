package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class DependenciaLancamentoOP implements SankhyaEntity<DependenciaLancamentoOP> {

   private String controlePa;
   private String tipoNroLote;
   private BigDecimal codProdPa;
   private BigDecimal seqOppi;
   private BigDecimal codProdPi;
   private BigDecimal nuLop;
   private BigDecimal seqOp;
   private String controlePi;
   private BigDecimal qtdPi;
   private String tipoSubOp;
   private BigDecimal qtdNecessario;
   private BigDecimal qtdEstoque;
   private BigDecimal necessidadeTotal;
   private String consideraEstoque;

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public String getTipoNroLote() {
        return tipoNroLote;
   }

   public void setTipoNroLote(String tipoNroLote) {
        this.tipoNroLote = tipoNroLote;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getSeqOppi() {
        return seqOppi;
   }

   public void setSeqOppi(BigDecimal seqOppi) {
        this.seqOppi = seqOppi;
   }

   public BigDecimal getCodProdPi() {
        return codProdPi;
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        this.codProdPi = codProdPi;
   }

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        this.nuLop = nuLop;
   }

   public BigDecimal getSeqOp() {
        return seqOp;
   }

   public void setSeqOp(BigDecimal seqOp) {
        this.seqOp = seqOp;
   }

   public String getControlePi() {
        return controlePi;
   }

   public void setControlePi(String controlePi) {
        this.controlePi = controlePi;
   }

   public BigDecimal getQtdPi() {
        return qtdPi;
   }

   public void setQtdPi(BigDecimal qtdPi) {
        this.qtdPi = qtdPi;
   }

   public String getTipoSubOp() {
        return tipoSubOp;
   }

   public void setTipoSubOp(String tipoSubOp) {
        this.tipoSubOp = tipoSubOp;
   }

   public BigDecimal getQtdNecessario() {
        return qtdNecessario;
   }

   public void setQtdNecessario(BigDecimal qtdNecessario) {
        this.qtdNecessario = qtdNecessario;
   }

   public BigDecimal getQtdEstoque() {
        return qtdEstoque;
   }

   public void setQtdEstoque(BigDecimal qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
   }

   public BigDecimal getNecessidadeTotal() {
        return necessidadeTotal;
   }

   public void setNecessidadeTotal(BigDecimal necessidadeTotal) {
        this.necessidadeTotal = necessidadeTotal;
   }

   public String getConsideraEstoque() {
        return consideraEstoque;
   }

   public void setConsideraEstoque(String consideraEstoque) {
        this.consideraEstoque = consideraEstoque;
   }

   @Override
   public String getEntityName() {
        return "DependenciaLancamentoOP";
   }

   @Override
   public DependenciaLancamentoOP fromVO(DynamicVO vo) {
        this.controlePa = vo.asString("CONTROLEPA");
        this.tipoNroLote = vo.asString("TIPONROLOTE");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.seqOppi = vo.asBigDecimal("SEQOPPI");
        this.codProdPi = vo.asBigDecimal("CODPRODPI");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.controlePi = vo.asString("CONTROLEPI");
        this.qtdPi = vo.asBigDecimal("QTDPI");
        this.tipoSubOp = vo.asString("TIPOSUBOP");
        this.qtdNecessario = vo.asBigDecimal("QTDNECESSARIO");
        this.qtdEstoque = vo.asBigDecimal("QTDESTOQUE");
        this.necessidadeTotal = vo.asBigDecimal("NECESSIDADETOTAL");
        this.consideraEstoque = vo.asString("CONSIDERAESTOQUE");
        return this;
   }
}
