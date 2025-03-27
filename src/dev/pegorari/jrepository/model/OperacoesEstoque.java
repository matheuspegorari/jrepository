package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OperacoesEstoque extends AbstractSankhyaEntity<OperacoesEstoque> {
   public String getTipoMaterial() {
        return this.getVo().asString("TIPOMATERIAL");
   }

   public void setTipoMaterial(String tipoMaterial) {
        markAsChanged("TIPOMATERIAL", tipoMaterial);
   }

   public BigDecimal getSeqOper() {
        return this.getVo().asBigDecimal("SEQOPER");
   }

   public void setSeqOper(BigDecimal seqOper) {
        markAsChanged("SEQOPER", seqOper);
   }

   public String getStatusExec() {
        return this.getVo().asString("STATUSEXEC");
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
   }

   public String getTipoItens() {
        return this.getVo().asString("TIPOITENS");
   }

   public void setTipoItens(String tipoItens) {
        markAsChanged("TIPOITENS", tipoItens);
   }

   public String getBaixarReservaEst() {
        return this.getVo().asString("BAIXARESERVAEST");
   }

   public void setBaixarReservaEst(String baixarReservaEst) {
        markAsChanged("BAIXARESERVAEST", baixarReservaEst);
   }

   public String getUsarParcTerc() {
        return this.getVo().asString("USARPARCTERC");
   }

   public void setUsarParcTerc(String usarParcTerc) {
        markAsChanged("USARPARCTERC", usarParcTerc);
   }

   public String getTipoExec() {
        return this.getVo().asString("TIPOEXEC");
   }

   public void setTipoExec(String tipoExec) {
        markAsChanged("TIPOEXEC", tipoExec);
   }

   public BigDecimal getCodLocalBaixaMp() {
        return this.getVo().asBigDecimal("CODLOCALBAIXAMP");
   }

   public void setCodLocalBaixaMp(BigDecimal codLocalBaixaMp) {
        markAsChanged("CODLOCALBAIXAMP", codLocalBaixaMp);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodEmpDest() {
        return this.getVo().asBigDecimal("CODEMPDEST");
   }

   public void setCodEmpDest(BigDecimal codEmpDest) {
        markAsChanged("CODEMPDEST", codEmpDest);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public BigDecimal getCodLocalDest() {
        return this.getVo().asBigDecimal("CODLOCALDEST");
   }

   public void setCodLocalDest(BigDecimal codLocalDest) {
        markAsChanged("CODLOCALDEST", codLocalDest);
   }

   public BigDecimal getCodLocalOrig() {
        return this.getVo().asBigDecimal("CODLOCALORIG");
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public String getConfirmar() {
        return this.getVo().asString("CONFIRMAR");
   }

   public void setConfirmar(String confirmar) {
        markAsChanged("CONFIRMAR", confirmar);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdeFxBase() {
        return this.getVo().asBigDecimal("IDEFXBASE");
   }

   public void setIdeFxBase(BigDecimal ideFxBase) {
        markAsChanged("IDEFXBASE", ideFxBase);
   }

   public BigDecimal getIdForm() {
        return this.getVo().asBigDecimal("IDFORM");
   }

   public void setIdForm(BigDecimal idForm) {
        markAsChanged("IDFORM", idForm);
   }

   public String getNomeImpressora() {
        return this.getVo().asString("NOMEIMPRESSORA");
   }

   public void setNomeImpressora(String nomeImpressora) {
        markAsChanged("NOMEIMPRESSORA", nomeImpressora);
   }

   public BigDecimal getNuNotaModelo() {
        return this.getVo().asBigDecimal("NUNOTAMODELO");
   }

   public void setNuNotaModelo(BigDecimal nuNotaModelo) {
        markAsChanged("NUNOTAMODELO", nuNotaModelo);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getQuando() {
        return this.getVo().asString("QUANDO");
   }

   public void setQuando(String quando) {
        markAsChanged("QUANDO", quando);
   }

   public String getSelImpressora() {
        return this.getVo().asString("SELIMPRESSORA");
   }

   public void setSelImpressora(String selImpressora) {
        markAsChanged("SELIMPRESSORA", selImpressora);
   }

   public String getConsumirEstoque() {
        return this.getVo().asString("CONSUMIRESTOQUE");
   }

   public void setConsumirEstoque(String consumirEstoque) {
        markAsChanged("CONSUMIRESTOQUE", consumirEstoque);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getObrigatorio() {
        return this.getVo().asString("OBRIGATORIO");
   }

   public void setObrigatorio(String obrigatorio) {
        markAsChanged("OBRIGATORIO", obrigatorio);
   }

   public String getTipoOper() {
        return this.getVo().asString("TIPOOPER");
   }

   public void setTipoOper(String tipoOper) {
        markAsChanged("TIPOOPER", tipoOper);
   }

   public String getAnulaOperEst() {
        return this.getVo().asString("ANULAOPEREST");
   }

   public void setAnulaOperEst(String anulaOperEst) {
        markAsChanged("ANULAOPEREST", anulaOperEst);
   }

   public BigDecimal getCodLocalDestPerda() {
        return this.getVo().asBigDecimal("CODLOCALDESTPERDA");
   }

   public void setCodLocalDestPerda(BigDecimal codLocalDestPerda) {
        markAsChanged("CODLOCALDESTPERDA", codLocalDestPerda);
   }

   public BigDecimal getCodTipOperPerda() {
        return this.getVo().asBigDecimal("CODTIPOPERPERDA");
   }

   public void setCodTipOperPerda(BigDecimal codTipOperPerda) {
        markAsChanged("CODTIPOPERPERDA", codTipOperPerda);
   }

   public BigDecimal getCodEmpDestEncad() {
        return this.getVo().asBigDecimal("CODEMPDESTENCAD");
   }

   public void setCodEmpDestEncad(BigDecimal codEmpDestEncad) {
        markAsChanged("CODEMPDESTENCAD", codEmpDestEncad);
   }

   public BigDecimal getCodLocalDestEncad() {
        return this.getVo().asBigDecimal("CODLOCALDESTENCAD");
   }

   public void setCodLocalDestEncad(BigDecimal codLocalDestEncad) {
        markAsChanged("CODLOCALDESTENCAD", codLocalDestEncad);
   }

   public BigDecimal getCodParcEncad() {
        return this.getVo().asBigDecimal("CODPARCENCAD");
   }

   public void setCodParcEncad(BigDecimal codParcEncad) {
        markAsChanged("CODPARCENCAD", codParcEncad);
   }

   public BigDecimal getCodTipOperEncad() {
        return this.getVo().asBigDecimal("CODTIPOPERENCAD");
   }

   public void setCodTipOperEncad(BigDecimal codTipOperEncad) {
        markAsChanged("CODTIPOPERENCAD", codTipOperEncad);
   }

   public String getConfirmEncad() {
        return this.getVo().asString("CONFIRMENCAD");
   }

   public void setConfirmEncad(String confirmEncad) {
        markAsChanged("CONFIRMENCAD", confirmEncad);
   }

   public BigDecimal getNuModeloEncad() {
        return this.getVo().asBigDecimal("NUMODELOENCAD");
   }

   public void setNuModeloEncad(BigDecimal nuModeloEncad) {
        markAsChanged("NUMODELOENCAD", nuModeloEncad);
   }

   public String getObrigEncad() {
        return this.getVo().asString("OBRIGENCAD");
   }

   public void setObrigEncad(String obrigEncad) {
        markAsChanged("OBRIGENCAD", obrigEncad);
   }

   public String getTipoOperEncad() {
        return this.getVo().asString("TIPOOPERENCAD");
   }

   public void setTipoOperEncad(String tipoOperEncad) {
        markAsChanged("TIPOOPERENCAD", tipoOperEncad);
   }

   public String getTipoProducao() {
        return this.getVo().asString("TIPOPRODUCAO");
   }

   public void setTipoProducao(String tipoProducao) {
        markAsChanged("TIPOPRODUCAO", tipoProducao);
   }

   public String getUtilizaLocalOrig() {
        return this.getVo().asString("UTILIZALOCALORIG");
   }

   public void setUtilizaLocalOrig(String utilizaLocalOrig) {
        markAsChanged("UTILIZALOCALORIG", utilizaLocalOrig);
   }

   public BigDecimal getCodTipOperKanban() {
        return this.getVo().asBigDecimal("CODTIPOPERKANBAN");
   }

   public void setCodTipOperKanban(BigDecimal codTipOperKanban) {
        markAsChanged("CODTIPOPERKANBAN", codTipOperKanban);
   }

   public String getKanban() {
        return this.getVo().asString("KANBAN");
   }

   public void setKanban(String kanban) {
        markAsChanged("KANBAN", kanban);
   }

   public BigDecimal getNuNotaModeloKanban() {
        return this.getVo().asBigDecimal("NUNOTAMODELOKANBAN");
   }

   public void setNuNotaModeloKanban(BigDecimal nuNotaModeloKanban) {
        markAsChanged("NUNOTAMODELOKANBAN", nuNotaModeloKanban);
   }

   public String getUsarParcTercEncad() {
        return this.getVo().asString("USARPARCTERCENCAD");
   }

   public void setUsarParcTercEncad(String usarParcTercEncad) {
        markAsChanged("USARPARCTERCENCAD", usarParcTercEncad);
   }

   @Override
   public String getTableName() {
        return "TPROEST";
   }

   @Override
   public String getEntityName() {
        return "OperacoesEstoque";
   }

   @Override
   public OperacoesEstoque fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
