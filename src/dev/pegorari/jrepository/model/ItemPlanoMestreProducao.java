package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemPlanoMestreProducao extends AbstractSankhyaEntity<ItemPlanoMestreProducao> {
   private BigDecimal qtdDemAjustada;
   private String fixado;
   private String prodInterm;
   private BigDecimal qtdDemIndireta;
   private Timestamp dtInicioMax;
   private Timestamp dtPrevent;
   private Timestamp dtPreventPai;
   private BigDecimal qtdOppendente;
   private BigDecimal tempoAtravess;
   private BigDecimal qtdProduzirCalc;
   private BigDecimal qtdSaldoProduzir;
   private BigDecimal qtdPedCompra;
   private BigDecimal qtdProduzirAd;
   private BigDecimal percEstSobDemanda;
   private BigDecimal qtdDemandaLiq;
   private String controle;
   private BigDecimal codProd;
   private BigDecimal prioridade;
   private BigDecimal idProc;
   private String codVol;
   private BigDecimal numPs;
   private BigDecimal versao;
   private BigDecimal qtdEmProgramacao;
   private BigDecimal codPrc;
   private BigDecimal qtdGiroMedioCalc;
   private BigDecimal seqImpsPai;
   private BigDecimal seqImps;
   private BigDecimal qtdOutrosPlan;
   private BigDecimal qtdGirMedio;
   private BigDecimal qtdDemBruta;
   private BigDecimal qtdBaseMrp;
   private BigDecimal qtdEstoque;
   private BigDecimal qtdEmOp;
   private BigDecimal qtdProduzirLiq;
   private BigDecimal nuNota;
   private BigDecimal seqNota;

   public BigDecimal getQtdDemAjustada() {
        return qtdDemAjustada;
   }

   public void setQtdDemAjustada(BigDecimal qtdDemAjustada) {
        markAsChanged("QTDDEMAJUSTADA", qtdDemAjustada);
        this.qtdDemAjustada = qtdDemAjustada;
   }

   public String getFixado() {
        return fixado;
   }

   public void setFixado(String fixado) {
        markAsChanged("FIXADO", fixado);
        this.fixado = fixado;
   }

   public String getProdInterm() {
        return prodInterm;
   }

   public void setProdInterm(String prodInterm) {
        markAsChanged("PRODINTERM", prodInterm);
        this.prodInterm = prodInterm;
   }

   public BigDecimal getQtdDemIndireta() {
        return qtdDemIndireta;
   }

   public void setQtdDemIndireta(BigDecimal qtdDemIndireta) {
        markAsChanged("QTDDEMINDIRETA", qtdDemIndireta);
        this.qtdDemIndireta = qtdDemIndireta;
   }

   public Timestamp getDtInicioMax() {
        return dtInicioMax;
   }

   public void setDtInicioMax(Timestamp dtInicioMax) {
        markAsChanged("DTINICIOMAX", dtInicioMax);
        this.dtInicioMax = dtInicioMax;
   }

   public Timestamp getDtPrevent() {
        return dtPrevent;
   }

   public void setDtPrevent(Timestamp dtPrevent) {
        markAsChanged("DTPREVENT", dtPrevent);
        this.dtPrevent = dtPrevent;
   }

   public Timestamp getDtPreventPai() {
        return dtPreventPai;
   }

   public void setDtPreventPai(Timestamp dtPreventPai) {
        markAsChanged("DTPREVENTPAI", dtPreventPai);
        this.dtPreventPai = dtPreventPai;
   }

   public BigDecimal getQtdOppendente() {
        return qtdOppendente;
   }

   public void setQtdOppendente(BigDecimal qtdOppendente) {
        markAsChanged("QTDOPPENDENTE", qtdOppendente);
        this.qtdOppendente = qtdOppendente;
   }

   public BigDecimal getTempoAtravess() {
        return tempoAtravess;
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        markAsChanged("TEMPOATRAVESS", tempoAtravess);
        this.tempoAtravess = tempoAtravess;
   }

   public BigDecimal getQtdProduzirCalc() {
        return qtdProduzirCalc;
   }

   public void setQtdProduzirCalc(BigDecimal qtdProduzirCalc) {
        markAsChanged("QTDPRODUZIRCALC", qtdProduzirCalc);
        this.qtdProduzirCalc = qtdProduzirCalc;
   }

   public BigDecimal getQtdSaldoProduzir() {
        return qtdSaldoProduzir;
   }

   public void setQtdSaldoProduzir(BigDecimal qtdSaldoProduzir) {
        markAsChanged("QTDSALDOPRODUZIR", qtdSaldoProduzir);
        this.qtdSaldoProduzir = qtdSaldoProduzir;
   }

   public BigDecimal getQtdPedCompra() {
        return qtdPedCompra;
   }

   public void setQtdPedCompra(BigDecimal qtdPedCompra) {
        markAsChanged("QTDPEDCOMPRA", qtdPedCompra);
        this.qtdPedCompra = qtdPedCompra;
   }

   public BigDecimal getQtdProduzirAd() {
        return qtdProduzirAd;
   }

   public void setQtdProduzirAd(BigDecimal qtdProduzirAd) {
        markAsChanged("QTDPRODUZIRAD", qtdProduzirAd);
        this.qtdProduzirAd = qtdProduzirAd;
   }

   public BigDecimal getPercEstSobDemanda() {
        return percEstSobDemanda;
   }

   public void setPercEstSobDemanda(BigDecimal percEstSobDemanda) {
        markAsChanged("PERCESTSOBDEMANDA", percEstSobDemanda);
        this.percEstSobDemanda = percEstSobDemanda;
   }

   public BigDecimal getQtdDemandaLiq() {
        return qtdDemandaLiq;
   }

   public void setQtdDemandaLiq(BigDecimal qtdDemandaLiq) {
        markAsChanged("QTDDEMANDALIQ", qtdDemandaLiq);
        this.qtdDemandaLiq = qtdDemandaLiq;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
        this.numPs = numPs;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   public BigDecimal getQtdEmProgramacao() {
        return qtdEmProgramacao;
   }

   public void setQtdEmProgramacao(BigDecimal qtdEmProgramacao) {
        markAsChanged("QTDEMPROGRAMACAO", qtdEmProgramacao);
        this.qtdEmProgramacao = qtdEmProgramacao;
   }

   public BigDecimal getCodPrc() {
        return codPrc;
   }

   public void setCodPrc(BigDecimal codPrc) {
        markAsChanged("CODPRC", codPrc);
        this.codPrc = codPrc;
   }

   public BigDecimal getQtdGiroMedioCalc() {
        return qtdGiroMedioCalc;
   }

   public void setQtdGiroMedioCalc(BigDecimal qtdGiroMedioCalc) {
        markAsChanged("QTDGIROMEDIOCALC", qtdGiroMedioCalc);
        this.qtdGiroMedioCalc = qtdGiroMedioCalc;
   }

   public BigDecimal getSeqImpsPai() {
        return seqImpsPai;
   }

   public void setSeqImpsPai(BigDecimal seqImpsPai) {
        markAsChanged("SEQIMPSPAI", seqImpsPai);
        this.seqImpsPai = seqImpsPai;
   }

   public BigDecimal getSeqImps() {
        return seqImps;
   }

   public void setSeqImps(BigDecimal seqImps) {
        markAsChanged("SEQIMPS", seqImps);
        this.seqImps = seqImps;
   }

   public BigDecimal getQtdOutrosPlan() {
        return qtdOutrosPlan;
   }

   public void setQtdOutrosPlan(BigDecimal qtdOutrosPlan) {
        markAsChanged("QTDOUTROSPLAN", qtdOutrosPlan);
        this.qtdOutrosPlan = qtdOutrosPlan;
   }

   public BigDecimal getQtdGirMedio() {
        return qtdGirMedio;
   }

   public void setQtdGirMedio(BigDecimal qtdGirMedio) {
        markAsChanged("QTDGIRMEDIO", qtdGirMedio);
        this.qtdGirMedio = qtdGirMedio;
   }

   public BigDecimal getQtdDemBruta() {
        return qtdDemBruta;
   }

   public void setQtdDemBruta(BigDecimal qtdDemBruta) {
        markAsChanged("QTDDEMBRUTA", qtdDemBruta);
        this.qtdDemBruta = qtdDemBruta;
   }

   public BigDecimal getQtdBaseMrp() {
        return qtdBaseMrp;
   }

   public void setQtdBaseMrp(BigDecimal qtdBaseMrp) {
        markAsChanged("QTDBASEMRP", qtdBaseMrp);
        this.qtdBaseMrp = qtdBaseMrp;
   }

   public BigDecimal getQtdEstoque() {
        return qtdEstoque;
   }

   public void setQtdEstoque(BigDecimal qtdEstoque) {
        markAsChanged("QTDESTOQUE", qtdEstoque);
        this.qtdEstoque = qtdEstoque;
   }

   public BigDecimal getQtdEmOp() {
        return qtdEmOp;
   }

   public void setQtdEmOp(BigDecimal qtdEmOp) {
        markAsChanged("QTDEMOP", qtdEmOp);
        this.qtdEmOp = qtdEmOp;
   }

   public BigDecimal getQtdProduzirLiq() {
        return qtdProduzirLiq;
   }

   public void setQtdProduzirLiq(BigDecimal qtdProduzirLiq) {
        markAsChanged("QTDPRODUZIRLIQ", qtdProduzirLiq);
        this.qtdProduzirLiq = qtdProduzirLiq;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
        this.seqNota = seqNota;
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
        this.qtdDemAjustada = vo.asBigDecimal("QTDDEMAJUSTADA");
        this.fixado = vo.asString("FIXADO");
        this.prodInterm = vo.asString("PRODINTERM");
        this.qtdDemIndireta = vo.asBigDecimal("QTDDEMINDIRETA");
        this.dtInicioMax = vo.asTimestamp("DTINICIOMAX");
        this.dtPrevent = vo.asTimestamp("DTPREVENT");
        this.dtPreventPai = vo.asTimestamp("DTPREVENTPAI");
        this.qtdOppendente = vo.asBigDecimal("QTDOPPENDENTE");
        this.tempoAtravess = vo.asBigDecimal("TEMPOATRAVESS");
        this.qtdProduzirCalc = vo.asBigDecimal("QTDPRODUZIRCALC");
        this.qtdSaldoProduzir = vo.asBigDecimal("QTDSALDOPRODUZIR");
        this.qtdPedCompra = vo.asBigDecimal("QTDPEDCOMPRA");
        this.qtdProduzirAd = vo.asBigDecimal("QTDPRODUZIRAD");
        this.percEstSobDemanda = vo.asBigDecimal("PERCESTSOBDEMANDA");
        this.qtdDemandaLiq = vo.asBigDecimal("QTDDEMANDALIQ");
        this.controle = vo.asString("CONTROLE");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.codVol = vo.asString("CODVOL");
        this.numPs = vo.asBigDecimal("NUMPS");
        this.versao = vo.asBigDecimal("VERSAO");
        this.qtdEmProgramacao = vo.asBigDecimal("QTDEMPROGRAMACAO");
        this.codPrc = vo.asBigDecimal("CODPRC");
        this.qtdGiroMedioCalc = vo.asBigDecimal("QTDGIROMEDIOCALC");
        this.seqImpsPai = vo.asBigDecimal("SEQIMPSPAI");
        this.seqImps = vo.asBigDecimal("SEQIMPS");
        this.qtdOutrosPlan = vo.asBigDecimal("QTDOUTROSPLAN");
        this.qtdGirMedio = vo.asBigDecimal("QTDGIRMEDIO");
        this.qtdDemBruta = vo.asBigDecimal("QTDDEMBRUTA");
        this.qtdBaseMrp = vo.asBigDecimal("QTDBASEMRP");
        this.qtdEstoque = vo.asBigDecimal("QTDESTOQUE");
        this.qtdEmOp = vo.asBigDecimal("QTDEMOP");
        this.qtdProduzirLiq = vo.asBigDecimal("QTDPRODUZIRLIQ");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        return this;
   }
}
