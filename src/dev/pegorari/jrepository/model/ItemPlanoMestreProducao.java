package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemPlanoMestreProducao extends AbstractSankhyaEntity<ItemPlanoMestreProducao> {
   public BigDecimal getQtdDemAjustada() {
        return this.getVo().asBigDecimal("QTDDEMAJUSTADA");
   }

   public void setQtdDemAjustada(BigDecimal qtdDemAjustada) {
        markAsChanged("QTDDEMAJUSTADA", qtdDemAjustada);
   }

   public String getFixado() {
        return this.getVo().asString("FIXADO");
   }

   public void setFixado(String fixado) {
        markAsChanged("FIXADO", fixado);
   }

   public String getProdInterm() {
        return this.getVo().asString("PRODINTERM");
   }

   public void setProdInterm(String prodInterm) {
        markAsChanged("PRODINTERM", prodInterm);
   }

   public BigDecimal getQtdDemIndireta() {
        return this.getVo().asBigDecimal("QTDDEMINDIRETA");
   }

   public void setQtdDemIndireta(BigDecimal qtdDemIndireta) {
        markAsChanged("QTDDEMINDIRETA", qtdDemIndireta);
   }

   public Timestamp getDtInicioMax() {
        return this.getVo().asTimestamp("DTINICIOMAX");
   }

   public void setDtInicioMax(Timestamp dtInicioMax) {
        markAsChanged("DTINICIOMAX", dtInicioMax);
   }

   public Timestamp getDtPrevent() {
        return this.getVo().asTimestamp("DTPREVENT");
   }

   public void setDtPrevent(Timestamp dtPrevent) {
        markAsChanged("DTPREVENT", dtPrevent);
   }

   public Timestamp getDtPreventPai() {
        return this.getVo().asTimestamp("DTPREVENTPAI");
   }

   public void setDtPreventPai(Timestamp dtPreventPai) {
        markAsChanged("DTPREVENTPAI", dtPreventPai);
   }

   public BigDecimal getQtdOppendente() {
        return this.getVo().asBigDecimal("QTDOPPENDENTE");
   }

   public void setQtdOppendente(BigDecimal qtdOppendente) {
        markAsChanged("QTDOPPENDENTE", qtdOppendente);
   }

   public BigDecimal getTempoAtravess() {
        return this.getVo().asBigDecimal("TEMPOATRAVESS");
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        markAsChanged("TEMPOATRAVESS", tempoAtravess);
   }

   public BigDecimal getQtdProduzirCalc() {
        return this.getVo().asBigDecimal("QTDPRODUZIRCALC");
   }

   public void setQtdProduzirCalc(BigDecimal qtdProduzirCalc) {
        markAsChanged("QTDPRODUZIRCALC", qtdProduzirCalc);
   }

   public BigDecimal getQtdSaldoProduzir() {
        return this.getVo().asBigDecimal("QTDSALDOPRODUZIR");
   }

   public void setQtdSaldoProduzir(BigDecimal qtdSaldoProduzir) {
        markAsChanged("QTDSALDOPRODUZIR", qtdSaldoProduzir);
   }

   public BigDecimal getQtdPedCompra() {
        return this.getVo().asBigDecimal("QTDPEDCOMPRA");
   }

   public void setQtdPedCompra(BigDecimal qtdPedCompra) {
        markAsChanged("QTDPEDCOMPRA", qtdPedCompra);
   }

   public BigDecimal getQtdProduzirAd() {
        return this.getVo().asBigDecimal("QTDPRODUZIRAD");
   }

   public void setQtdProduzirAd(BigDecimal qtdProduzirAd) {
        markAsChanged("QTDPRODUZIRAD", qtdProduzirAd);
   }

   public BigDecimal getPercEstSobDemanda() {
        return this.getVo().asBigDecimal("PERCESTSOBDEMANDA");
   }

   public void setPercEstSobDemanda(BigDecimal percEstSobDemanda) {
        markAsChanged("PERCESTSOBDEMANDA", percEstSobDemanda);
   }

   public BigDecimal getQtdDemandaLiq() {
        return this.getVo().asBigDecimal("QTDDEMANDALIQ");
   }

   public void setQtdDemandaLiq(BigDecimal qtdDemandaLiq) {
        markAsChanged("QTDDEMANDALIQ", qtdDemandaLiq);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getNumPs() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public BigDecimal getQtdEmProgramacao() {
        return this.getVo().asBigDecimal("QTDEMPROGRAMACAO");
   }

   public void setQtdEmProgramacao(BigDecimal qtdEmProgramacao) {
        markAsChanged("QTDEMPROGRAMACAO", qtdEmProgramacao);
   }

   public BigDecimal getCodPrc() {
        return this.getVo().asBigDecimal("CODPRC");
   }

   public void setCodPrc(BigDecimal codPrc) {
        markAsChanged("CODPRC", codPrc);
   }

   public BigDecimal getQtdGiroMedioCalc() {
        return this.getVo().asBigDecimal("QTDGIROMEDIOCALC");
   }

   public void setQtdGiroMedioCalc(BigDecimal qtdGiroMedioCalc) {
        markAsChanged("QTDGIROMEDIOCALC", qtdGiroMedioCalc);
   }

   public BigDecimal getSeqImpsPai() {
        return this.getVo().asBigDecimal("SEQIMPSPAI");
   }

   public void setSeqImpsPai(BigDecimal seqImpsPai) {
        markAsChanged("SEQIMPSPAI", seqImpsPai);
   }

   public BigDecimal getSeqImps() {
        return this.getVo().asBigDecimal("SEQIMPS");
   }

   public void setSeqImps(BigDecimal seqImps) {
        markAsChanged("SEQIMPS", seqImps);
   }

   public BigDecimal getQtdOutrosPlan() {
        return this.getVo().asBigDecimal("QTDOUTROSPLAN");
   }

   public void setQtdOutrosPlan(BigDecimal qtdOutrosPlan) {
        markAsChanged("QTDOUTROSPLAN", qtdOutrosPlan);
   }

   public BigDecimal getQtdGirMedio() {
        return this.getVo().asBigDecimal("QTDGIRMEDIO");
   }

   public void setQtdGirMedio(BigDecimal qtdGirMedio) {
        markAsChanged("QTDGIRMEDIO", qtdGirMedio);
   }

   public BigDecimal getQtdDemBruta() {
        return this.getVo().asBigDecimal("QTDDEMBRUTA");
   }

   public void setQtdDemBruta(BigDecimal qtdDemBruta) {
        markAsChanged("QTDDEMBRUTA", qtdDemBruta);
   }

   public BigDecimal getQtdBaseMrp() {
        return this.getVo().asBigDecimal("QTDBASEMRP");
   }

   public void setQtdBaseMrp(BigDecimal qtdBaseMrp) {
        markAsChanged("QTDBASEMRP", qtdBaseMrp);
   }

   public BigDecimal getQtdEstoque() {
        return this.getVo().asBigDecimal("QTDESTOQUE");
   }

   public void setQtdEstoque(BigDecimal qtdEstoque) {
        markAsChanged("QTDESTOQUE", qtdEstoque);
   }

   public BigDecimal getQtdEmOp() {
        return this.getVo().asBigDecimal("QTDEMOP");
   }

   public void setQtdEmOp(BigDecimal qtdEmOp) {
        markAsChanged("QTDEMOP", qtdEmOp);
   }

   public BigDecimal getQtdProduzirLiq() {
        return this.getVo().asBigDecimal("QTDPRODUZIRLIQ");
   }

   public void setQtdProduzirLiq(BigDecimal qtdProduzirLiq) {
        markAsChanged("QTDPRODUZIRLIQ", qtdProduzirLiq);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqNota() {
        return this.getVo().asBigDecimal("SEQNOTA");
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
   }

   @Override
   public String getTableName() {
        return "TPRIMPS";
   }

   @Override
   public String getEntityName() {
        return "ItemPlanoMestreProducao";
   }

   @Override
   public ItemPlanoMestreProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
