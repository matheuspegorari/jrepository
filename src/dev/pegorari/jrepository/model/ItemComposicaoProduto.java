package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemComposicaoProduto extends AbstractSankhyaEntity<ItemComposicaoProduto> {
   public BigDecimal getPreco() {
        return this.getVo().asBigDecimal("PRECO");
   }

   public void setPreco(BigDecimal preco) {
        markAsChanged("PRECO", preco);
   }

   public String getReferenciaMp() {
        return this.getVo().asString("REFERENCIAMP");
   }

   public void setReferenciaMp(String referenciaMp) {
        markAsChanged("REFERENCIAMP", referenciaMp);
   }

   public String getAtualEstoque() {
        return this.getVo().asString("ATUALESTOQUE");
   }

   public void setAtualEstoque(String atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
   }

   public String getCalcAtivo() {
        return this.getVo().asString("CALCATIVO");
   }

   public void setCalcAtivo(String calcAtivo) {
        markAsChanged("CALCATIVO", calcAtivo);
   }

   public String getCalcCodVolPro() {
        return this.getVo().asString("CALCCODVOLPRO");
   }

   public void setCalcCodVolPro(String calcCodVolPro) {
        markAsChanged("CALCCODVOLPRO", calcCodVolPro);
   }

   public BigDecimal getCalcCusGer() {
        return this.getVo().asBigDecimal("CALCCUSGER");
   }

   public void setCalcCusGer(BigDecimal calcCusGer) {
        markAsChanged("CALCCUSGER", calcCusGer);
   }

   public BigDecimal getCalcCusGerUnid() {
        return this.getVo().asBigDecimal("CALCCUSGERUNID");
   }

   public void setCalcCusGerUnid(BigDecimal calcCusGerUnid) {
        markAsChanged("CALCCUSGERUNID", calcCusGerUnid);
   }

   public BigDecimal getCalcCusMed() {
        return this.getVo().asBigDecimal("CALCCUSMED");
   }

   public void setCalcCusMed(BigDecimal calcCusMed) {
        markAsChanged("CALCCUSMED", calcCusMed);
   }

   public BigDecimal getCalcCusMedUnid() {
        return this.getVo().asBigDecimal("CALCCUSMEDUNID");
   }

   public void setCalcCusMedUnid(BigDecimal calcCusMedUnid) {
        markAsChanged("CALCCUSMEDUNID", calcCusMedUnid);
   }

   public BigDecimal getCalcCusRep() {
        return this.getVo().asBigDecimal("CALCCUSREP");
   }

   public void setCalcCusRep(BigDecimal calcCusRep) {
        markAsChanged("CALCCUSREP", calcCusRep);
   }

   public BigDecimal getCalcCusRepUnid() {
        return this.getVo().asBigDecimal("CALCCUSREPUNID");
   }

   public void setCalcCusRepUnid(BigDecimal calcCusRepUnid) {
        markAsChanged("CALCCUSREPUNID", calcCusRepUnid);
   }

   public BigDecimal getCalcCusVar() {
        return this.getVo().asBigDecimal("CALCCUSVAR");
   }

   public void setCalcCusVar(BigDecimal calcCusVar) {
        markAsChanged("CALCCUSVAR", calcCusVar);
   }

   public BigDecimal getCalcCusVarUnid() {
        return this.getVo().asBigDecimal("CALCCUSVARUNID");
   }

   public void setCalcCusVarUnid(BigDecimal calcCusVarUnid) {
        markAsChanged("CALCCUSVARUNID", calcCusVarUnid);
   }

   public String getCalcMarca() {
        return this.getVo().asString("CALCMARCA");
   }

   public void setCalcMarca(String calcMarca) {
        markAsChanged("CALCMARCA", calcMarca);
   }

   public BigDecimal getCalcPercCalcCusVar() {
        return this.getVo().asBigDecimal("CALCPERCCALCCUSVAR");
   }

   public void setCalcPercCalcCusVar(BigDecimal calcPercCalcCusVar) {
        markAsChanged("CALCPERCCALCCUSVAR", calcPercCalcCusVar);
   }

   public BigDecimal getCalcPercCusRep() {
        return this.getVo().asBigDecimal("CALCPERCCUSREP");
   }

   public void setCalcPercCusRep(BigDecimal calcPercCusRep) {
        markAsChanged("CALCPERCCUSREP", calcPercCusRep);
   }

   public BigDecimal getCalcPercUsCger() {
        return this.getVo().asBigDecimal("CALCPERCUSCGER");
   }

   public void setCalcPercUsCger(BigDecimal calcPercUsCger) {
        markAsChanged("CALCPERCUSCGER", calcPercUsCger);
   }

   public BigDecimal getCalcPercVlrVendaFixo() {
        return this.getVo().asBigDecimal("CALCPERCVLRVENDAFIXO");
   }

   public void setCalcPercVlrVendaFixo(BigDecimal calcPercVlrVendaFixo) {
        markAsChanged("CALCPERCVLRVENDAFIXO", calcPercVlrVendaFixo);
   }

   public String getCalcReferencia() {
        return this.getVo().asString("CALCREFERENCIA");
   }

   public void setCalcReferencia(String calcReferencia) {
        markAsChanged("CALCREFERENCIA", calcReferencia);
   }

   public BigDecimal getCalcVlrVendaFixo() {
        return this.getVo().asBigDecimal("CALCVLRVENDAFIXO");
   }

   public void setCalcVlrVendaFixo(BigDecimal calcVlrVendaFixo) {
        markAsChanged("CALCVLRVENDAFIXO", calcVlrVendaFixo);
   }

   public BigDecimal getCalcVlrVendaFixoUnid() {
        return this.getVo().asBigDecimal("CALCVLRVENDAFIXOUNID");
   }

   public void setCalcVlrVendaFixoUnid(BigDecimal calcVlrVendaFixoUnid) {
        markAsChanged("CALCVLRVENDAFIXOUNID", calcVlrVendaFixoUnid);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodLocalMp() {
        return this.getVo().asBigDecimal("CODLOCALMP");
   }

   public void setCodLocalMp(BigDecimal codLocalMp) {
        markAsChanged("CODLOCALMP", codLocalMp);
   }

   public BigDecimal getCodMatPrima() {
        return this.getVo().asBigDecimal("CODMATPRIMA");
   }

   public void setCodMatPrima(BigDecimal codMatPrima) {
        markAsChanged("CODMATPRIMA", codMatPrima);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public BigDecimal getDesvioPadrao() {
        return this.getVo().asBigDecimal("DESVIOPADRAO");
   }

   public void setDesvioPadrao(BigDecimal desvioPadrao) {
        markAsChanged("DESVIOPADRAO", desvioPadrao);
   }

   public String getFixo() {
        return this.getVo().asString("FIXO");
   }

   public void setFixo(String fixo) {
        markAsChanged("FIXO", fixo);
   }

   public String getMantemQtd() {
        return this.getVo().asString("MANTEMQTD");
   }

   public void setMantemQtd(String mantemQtd) {
        markAsChanged("MANTEMQTD", mantemQtd);
   }

   public BigDecimal getNiveisRecuo() {
        return this.getVo().asBigDecimal("NIVEISRECUO");
   }

   public void setNiveisRecuo(BigDecimal niveisRecuo) {
        markAsChanged("NIVEISRECUO", niveisRecuo);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getOndeExec() {
        return this.getVo().asString("ONDEEXEC");
   }

   public void setOndeExec(String ondeExec) {
        markAsChanged("ONDEEXEC", ondeExec);
   }

   public String getOpcional() {
        return this.getVo().asString("OPCIONAL");
   }

   public void setOpcional(String opcional) {
        markAsChanged("OPCIONAL", opcional);
   }

   public String getPodeConcluir() {
        return this.getVo().asString("PODECONCLUIR");
   }

   public void setPodeConcluir(String podeConcluir) {
        markAsChanged("PODECONCLUIR", podeConcluir);
   }

   public BigDecimal getQtdMistura() {
        return this.getVo().asBigDecimal("QTDMISTURA");
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
   }

   public String getVariarControle() {
        return this.getVo().asString("VARIARCONTROLE");
   }

   public void setVariarControle(String variarControle) {
        markAsChanged("VARIARCONTROLE", variarControle);
   }

   public String getSegueAnterior() {
        return this.getVo().asString("SEGUEANTERIOR");
   }

   public void setSegueAnterior(String segueAnterior) {
        markAsChanged("SEGUEANTERIOR", segueAnterior);
   }

   public String getSelecionaProx() {
        return this.getVo().asString("SELECIONAPROX");
   }

   public void setSelecionaProx(String selecionaProx) {
        markAsChanged("SELECIONAPROX", selecionaProx);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSincrFluxo() {
        return this.getVo().asString("SINCRFLUXO");
   }

   public void setSincrFluxo(String sincrFluxo) {
        markAsChanged("SINCRFLUXO", sincrFluxo);
   }

   public String getTerceiros() {
        return this.getVo().asString("TERCEIROS");
   }

   public void setTerceiros(String terceiros) {
        markAsChanged("TERCEIROS", terceiros);
   }

   public String getTipTransicao() {
        return this.getVo().asString("TIPTRANSICAO");
   }

   public void setTipTransicao(String tipTransicao) {
        markAsChanged("TIPTRANSICAO", tipTransicao);
   }

   public String getTransicao() {
        return this.getVo().asString("TRANSICAO");
   }

   public void setTransicao(String transicao) {
        markAsChanged("TRANSICAO", transicao);
   }

   public BigDecimal getVariacao() {
        return this.getVo().asBigDecimal("VARIACAO");
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
   }

   public BigDecimal getMpDecQtd() {
        return this.getVo().asBigDecimal("MPDECQTD");
   }

   public void setMpDecQtd(BigDecimal mpDecQtd) {
        markAsChanged("MPDECQTD", mpDecQtd);
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
        this.setVo(vo);
        return this;
   }
}
