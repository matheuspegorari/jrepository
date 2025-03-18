package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemComposicaoProduto extends AbstractSankhyaEntity<ItemComposicaoProduto> {
   private BigDecimal preco;
   private String referenciaMp;
   private String atualEstoque;
   private String calcAtivo;
   private String calcCodVolPro;
   private BigDecimal calcCusGer;
   private BigDecimal calcCusGerUnid;
   private BigDecimal calcCusMed;
   private BigDecimal calcCusMedUnid;
   private BigDecimal calcCusRep;
   private BigDecimal calcCusRepUnid;
   private BigDecimal calcCusVar;
   private BigDecimal calcCusVarUnid;
   private String calcMarca;
   private BigDecimal calcPercCalcCusVar;
   private BigDecimal calcPercCusRep;
   private BigDecimal calcPercUsCger;
   private BigDecimal calcPercVlrVendaFixo;
   private String calcReferencia;
   private BigDecimal calcVlrVendaFixo;
   private BigDecimal calcVlrVendaFixoUnid;
   private BigDecimal codEtapa;
   private BigDecimal codLocal;
   private BigDecimal codLocalMp;
   private BigDecimal codMatPrima;
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private String controleMp;
   private BigDecimal desvioPadrao;
   private String fixo;
   private String mantemQtd;
   private BigDecimal niveisRecuo;
   private String observacao;
   private String ondeExec;
   private String opcional;
   private String podeConcluir;
   private BigDecimal qtdMistura;
   private String variarControle;
   private String segueAnterior;
   private String selecionaProx;
   private BigDecimal sequencia;
   private String sincrFluxo;
   private String terceiros;
   private String tipTransicao;
   private String transicao;
   private BigDecimal variacao;
   private BigDecimal mpDecQtd;

   public BigDecimal getPreco() {
        return preco;
   }

   public void setPreco(BigDecimal preco) {
        markAsChanged("PRECO", preco);
        this.preco = preco;
   }

   public String getReferenciaMp() {
        return referenciaMp;
   }

   public void setReferenciaMp(String referenciaMp) {
        markAsChanged("REFERENCIAMP", referenciaMp);
        this.referenciaMp = referenciaMp;
   }

   public String getAtualEstoque() {
        return atualEstoque;
   }

   public void setAtualEstoque(String atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
        this.atualEstoque = atualEstoque;
   }

   public String getCalcAtivo() {
        return calcAtivo;
   }

   public void setCalcAtivo(String calcAtivo) {
        markAsChanged("CALCATIVO", calcAtivo);
        this.calcAtivo = calcAtivo;
   }

   public String getCalcCodVolPro() {
        return calcCodVolPro;
   }

   public void setCalcCodVolPro(String calcCodVolPro) {
        markAsChanged("CALCCODVOLPRO", calcCodVolPro);
        this.calcCodVolPro = calcCodVolPro;
   }

   public BigDecimal getCalcCusGer() {
        return calcCusGer;
   }

   public void setCalcCusGer(BigDecimal calcCusGer) {
        markAsChanged("CALCCUSGER", calcCusGer);
        this.calcCusGer = calcCusGer;
   }

   public BigDecimal getCalcCusGerUnid() {
        return calcCusGerUnid;
   }

   public void setCalcCusGerUnid(BigDecimal calcCusGerUnid) {
        markAsChanged("CALCCUSGERUNID", calcCusGerUnid);
        this.calcCusGerUnid = calcCusGerUnid;
   }

   public BigDecimal getCalcCusMed() {
        return calcCusMed;
   }

   public void setCalcCusMed(BigDecimal calcCusMed) {
        markAsChanged("CALCCUSMED", calcCusMed);
        this.calcCusMed = calcCusMed;
   }

   public BigDecimal getCalcCusMedUnid() {
        return calcCusMedUnid;
   }

   public void setCalcCusMedUnid(BigDecimal calcCusMedUnid) {
        markAsChanged("CALCCUSMEDUNID", calcCusMedUnid);
        this.calcCusMedUnid = calcCusMedUnid;
   }

   public BigDecimal getCalcCusRep() {
        return calcCusRep;
   }

   public void setCalcCusRep(BigDecimal calcCusRep) {
        markAsChanged("CALCCUSREP", calcCusRep);
        this.calcCusRep = calcCusRep;
   }

   public BigDecimal getCalcCusRepUnid() {
        return calcCusRepUnid;
   }

   public void setCalcCusRepUnid(BigDecimal calcCusRepUnid) {
        markAsChanged("CALCCUSREPUNID", calcCusRepUnid);
        this.calcCusRepUnid = calcCusRepUnid;
   }

   public BigDecimal getCalcCusVar() {
        return calcCusVar;
   }

   public void setCalcCusVar(BigDecimal calcCusVar) {
        markAsChanged("CALCCUSVAR", calcCusVar);
        this.calcCusVar = calcCusVar;
   }

   public BigDecimal getCalcCusVarUnid() {
        return calcCusVarUnid;
   }

   public void setCalcCusVarUnid(BigDecimal calcCusVarUnid) {
        markAsChanged("CALCCUSVARUNID", calcCusVarUnid);
        this.calcCusVarUnid = calcCusVarUnid;
   }

   public String getCalcMarca() {
        return calcMarca;
   }

   public void setCalcMarca(String calcMarca) {
        markAsChanged("CALCMARCA", calcMarca);
        this.calcMarca = calcMarca;
   }

   public BigDecimal getCalcPercCalcCusVar() {
        return calcPercCalcCusVar;
   }

   public void setCalcPercCalcCusVar(BigDecimal calcPercCalcCusVar) {
        markAsChanged("CALCPERCCALCCUSVAR", calcPercCalcCusVar);
        this.calcPercCalcCusVar = calcPercCalcCusVar;
   }

   public BigDecimal getCalcPercCusRep() {
        return calcPercCusRep;
   }

   public void setCalcPercCusRep(BigDecimal calcPercCusRep) {
        markAsChanged("CALCPERCCUSREP", calcPercCusRep);
        this.calcPercCusRep = calcPercCusRep;
   }

   public BigDecimal getCalcPercUsCger() {
        return calcPercUsCger;
   }

   public void setCalcPercUsCger(BigDecimal calcPercUsCger) {
        markAsChanged("CALCPERCUSCGER", calcPercUsCger);
        this.calcPercUsCger = calcPercUsCger;
   }

   public BigDecimal getCalcPercVlrVendaFixo() {
        return calcPercVlrVendaFixo;
   }

   public void setCalcPercVlrVendaFixo(BigDecimal calcPercVlrVendaFixo) {
        markAsChanged("CALCPERCVLRVENDAFIXO", calcPercVlrVendaFixo);
        this.calcPercVlrVendaFixo = calcPercVlrVendaFixo;
   }

   public String getCalcReferencia() {
        return calcReferencia;
   }

   public void setCalcReferencia(String calcReferencia) {
        markAsChanged("CALCREFERENCIA", calcReferencia);
        this.calcReferencia = calcReferencia;
   }

   public BigDecimal getCalcVlrVendaFixo() {
        return calcVlrVendaFixo;
   }

   public void setCalcVlrVendaFixo(BigDecimal calcVlrVendaFixo) {
        markAsChanged("CALCVLRVENDAFIXO", calcVlrVendaFixo);
        this.calcVlrVendaFixo = calcVlrVendaFixo;
   }

   public BigDecimal getCalcVlrVendaFixoUnid() {
        return calcVlrVendaFixoUnid;
   }

   public void setCalcVlrVendaFixoUnid(BigDecimal calcVlrVendaFixoUnid) {
        markAsChanged("CALCVLRVENDAFIXOUNID", calcVlrVendaFixoUnid);
        this.calcVlrVendaFixoUnid = calcVlrVendaFixoUnid;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodLocalMp() {
        return codLocalMp;
   }

   public void setCodLocalMp(BigDecimal codLocalMp) {
        markAsChanged("CODLOCALMP", codLocalMp);
        this.codLocalMp = codLocalMp;
   }

   public BigDecimal getCodMatPrima() {
        return codMatPrima;
   }

   public void setCodMatPrima(BigDecimal codMatPrima) {
        markAsChanged("CODMATPRIMA", codMatPrima);
        this.codMatPrima = codMatPrima;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public BigDecimal getDesvioPadrao() {
        return desvioPadrao;
   }

   public void setDesvioPadrao(BigDecimal desvioPadrao) {
        markAsChanged("DESVIOPADRAO", desvioPadrao);
        this.desvioPadrao = desvioPadrao;
   }

   public String getFixo() {
        return fixo;
   }

   public void setFixo(String fixo) {
        markAsChanged("FIXO", fixo);
        this.fixo = fixo;
   }

   public String getMantemQtd() {
        return mantemQtd;
   }

   public void setMantemQtd(String mantemQtd) {
        markAsChanged("MANTEMQTD", mantemQtd);
        this.mantemQtd = mantemQtd;
   }

   public BigDecimal getNiveisRecuo() {
        return niveisRecuo;
   }

   public void setNiveisRecuo(BigDecimal niveisRecuo) {
        markAsChanged("NIVEISRECUO", niveisRecuo);
        this.niveisRecuo = niveisRecuo;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getOndeExec() {
        return ondeExec;
   }

   public void setOndeExec(String ondeExec) {
        markAsChanged("ONDEEXEC", ondeExec);
        this.ondeExec = ondeExec;
   }

   public String getOpcional() {
        return opcional;
   }

   public void setOpcional(String opcional) {
        markAsChanged("OPCIONAL", opcional);
        this.opcional = opcional;
   }

   public String getPodeConcluir() {
        return podeConcluir;
   }

   public void setPodeConcluir(String podeConcluir) {
        markAsChanged("PODECONCLUIR", podeConcluir);
        this.podeConcluir = podeConcluir;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
        this.qtdMistura = qtdMistura;
   }

   public String getVariarControle() {
        return variarControle;
   }

   public void setVariarControle(String variarControle) {
        markAsChanged("VARIARCONTROLE", variarControle);
        this.variarControle = variarControle;
   }

   public String getSegueAnterior() {
        return segueAnterior;
   }

   public void setSegueAnterior(String segueAnterior) {
        markAsChanged("SEGUEANTERIOR", segueAnterior);
        this.segueAnterior = segueAnterior;
   }

   public String getSelecionaProx() {
        return selecionaProx;
   }

   public void setSelecionaProx(String selecionaProx) {
        markAsChanged("SELECIONAPROX", selecionaProx);
        this.selecionaProx = selecionaProx;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSincrFluxo() {
        return sincrFluxo;
   }

   public void setSincrFluxo(String sincrFluxo) {
        markAsChanged("SINCRFLUXO", sincrFluxo);
        this.sincrFluxo = sincrFluxo;
   }

   public String getTerceiros() {
        return terceiros;
   }

   public void setTerceiros(String terceiros) {
        markAsChanged("TERCEIROS", terceiros);
        this.terceiros = terceiros;
   }

   public String getTipTransicao() {
        return tipTransicao;
   }

   public void setTipTransicao(String tipTransicao) {
        markAsChanged("TIPTRANSICAO", tipTransicao);
        this.tipTransicao = tipTransicao;
   }

   public String getTransicao() {
        return transicao;
   }

   public void setTransicao(String transicao) {
        markAsChanged("TRANSICAO", transicao);
        this.transicao = transicao;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
        this.variacao = variacao;
   }

   public BigDecimal getMpDecQtd() {
        return mpDecQtd;
   }

   public void setMpDecQtd(BigDecimal mpDecQtd) {
        markAsChanged("MPDECQTD", mpDecQtd);
        this.mpDecQtd = mpDecQtd;
   }

   @Override
   public String getTableName() {
        return "TGFICP";
   }

   @Override
   public String getEntityName() {
        return "ItemComposicaoProduto";
   }

   @Override
   public ItemComposicaoProduto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.preco = vo.asBigDecimal("PRECO");
        this.referenciaMp = vo.asString("REFERENCIAMP");
        this.atualEstoque = vo.asString("ATUALESTOQUE");
        this.calcAtivo = vo.asString("CALCATIVO");
        this.calcCodVolPro = vo.asString("CALCCODVOLPRO");
        this.calcCusGer = vo.asBigDecimal("CALCCUSGER");
        this.calcCusGerUnid = vo.asBigDecimal("CALCCUSGERUNID");
        this.calcCusMed = vo.asBigDecimal("CALCCUSMED");
        this.calcCusMedUnid = vo.asBigDecimal("CALCCUSMEDUNID");
        this.calcCusRep = vo.asBigDecimal("CALCCUSREP");
        this.calcCusRepUnid = vo.asBigDecimal("CALCCUSREPUNID");
        this.calcCusVar = vo.asBigDecimal("CALCCUSVAR");
        this.calcCusVarUnid = vo.asBigDecimal("CALCCUSVARUNID");
        this.calcMarca = vo.asString("CALCMARCA");
        this.calcPercCalcCusVar = vo.asBigDecimal("CALCPERCCALCCUSVAR");
        this.calcPercCusRep = vo.asBigDecimal("CALCPERCCUSREP");
        this.calcPercUsCger = vo.asBigDecimal("CALCPERCUSCGER");
        this.calcPercVlrVendaFixo = vo.asBigDecimal("CALCPERCVLRVENDAFIXO");
        this.calcReferencia = vo.asString("CALCREFERENCIA");
        this.calcVlrVendaFixo = vo.asBigDecimal("CALCVLRVENDAFIXO");
        this.calcVlrVendaFixoUnid = vo.asBigDecimal("CALCVLRVENDAFIXOUNID");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codLocalMp = vo.asBigDecimal("CODLOCALMP");
        this.codMatPrima = vo.asBigDecimal("CODMATPRIMA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.controleMp = vo.asString("CONTROLEMP");
        this.desvioPadrao = vo.asBigDecimal("DESVIOPADRAO");
        this.fixo = vo.asString("FIXO");
        this.mantemQtd = vo.asString("MANTEMQTD");
        this.niveisRecuo = vo.asBigDecimal("NIVEISRECUO");
        this.observacao = vo.asString("OBSERVACAO");
        this.ondeExec = vo.asString("ONDEEXEC");
        this.opcional = vo.asString("OPCIONAL");
        this.podeConcluir = vo.asString("PODECONCLUIR");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.variarControle = vo.asString("VARIARCONTROLE");
        this.segueAnterior = vo.asString("SEGUEANTERIOR");
        this.selecionaProx = vo.asString("SELECIONAPROX");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sincrFluxo = vo.asString("SINCRFLUXO");
        this.terceiros = vo.asString("TERCEIROS");
        this.tipTransicao = vo.asString("TIPTRANSICAO");
        this.transicao = vo.asString("TRANSICAO");
        this.variacao = vo.asBigDecimal("VARIACAO");
        this.mpDecQtd = vo.asBigDecimal("MPDECQTD");
        return this;
   }
}
