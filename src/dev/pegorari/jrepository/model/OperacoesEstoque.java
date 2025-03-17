package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OperacoesEstoque extends AbstractSankhyaEntity<OperacoesEstoque> {
   private String tipoMaterial;
   private BigDecimal seqOper;
   private String statusExec;
   private String tipoItens;
   private String baixarReservaEst;
   private String usarParcTerc;
   private String tipoExec;
   private BigDecimal codLocalBaixaMp;
   private BigDecimal codCencus;
   private BigDecimal codEmpDest;
   private BigDecimal codEmpOrig;
   private BigDecimal codLocalDest;
   private BigDecimal codLocalOrig;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal codProj;
   private BigDecimal codTipOper;
   private BigDecimal codTipVenda;
   private String confirmar;
   private BigDecimal ideFx;
   private BigDecimal ideFxBase;
   private BigDecimal idForm;
   private String nomeImpressora;
   private BigDecimal nuNotaModelo;
   private BigDecimal ordem;
   private String quando;
   private String selImpressora;
   private String consumirEstoque;
   private String descricao;
   private String obrigatorio;
   private String tipoOper;
   private String anulaOperEst;
   private BigDecimal codLocalDestPerda;
   private BigDecimal codTipOperPerda;
   private BigDecimal codEmpDestEncad;
   private BigDecimal codLocalDestEncad;
   private BigDecimal codParcEncad;
   private BigDecimal codTipOperEncad;
   private String confirmEncad;
   private BigDecimal nuModeloEncad;
   private String obrigEncad;
   private String tipoOperEncad;
   private String tipoProducao;
   private String utilizaLocalOrig;
   private BigDecimal codTipOperKanban;
   private String kanban;
   private BigDecimal nuNotaModeloKanban;
   private String usarParcTercEncad;

   public String getTipoMaterial() {
        return tipoMaterial;
   }

   public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
   }

   public BigDecimal getSeqOper() {
        return seqOper;
   }

   public void setSeqOper(BigDecimal seqOper) {
        this.seqOper = seqOper;
   }

   public String getStatusExec() {
        return statusExec;
   }

   public void setStatusExec(String statusExec) {
        this.statusExec = statusExec;
   }

   public String getTipoItens() {
        return tipoItens;
   }

   public void setTipoItens(String tipoItens) {
        this.tipoItens = tipoItens;
   }

   public String getBaixarReservaEst() {
        return baixarReservaEst;
   }

   public void setBaixarReservaEst(String baixarReservaEst) {
        this.baixarReservaEst = baixarReservaEst;
   }

   public String getUsarParcTerc() {
        return usarParcTerc;
   }

   public void setUsarParcTerc(String usarParcTerc) {
        this.usarParcTerc = usarParcTerc;
   }

   public String getTipoExec() {
        return tipoExec;
   }

   public void setTipoExec(String tipoExec) {
        this.tipoExec = tipoExec;
   }

   public BigDecimal getCodLocalBaixaMp() {
        return codLocalBaixaMp;
   }

   public void setCodLocalBaixaMp(BigDecimal codLocalBaixaMp) {
        this.codLocalBaixaMp = codLocalBaixaMp;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodEmpDest() {
        return codEmpDest;
   }

   public void setCodEmpDest(BigDecimal codEmpDest) {
        this.codEmpDest = codEmpDest;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        this.codEmpOrig = codEmpOrig;
   }

   public BigDecimal getCodLocalDest() {
        return codLocalDest;
   }

   public void setCodLocalDest(BigDecimal codLocalDest) {
        this.codLocalDest = codLocalDest;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public String getConfirmar() {
        return confirmar;
   }

   public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxBase() {
        return ideFxBase;
   }

   public void setIdeFxBase(BigDecimal ideFxBase) {
        this.ideFxBase = ideFxBase;
   }

   public BigDecimal getIdForm() {
        return idForm;
   }

   public void setIdForm(BigDecimal idForm) {
        this.idForm = idForm;
   }

   public String getNomeImpressora() {
        return nomeImpressora;
   }

   public void setNomeImpressora(String nomeImpressora) {
        this.nomeImpressora = nomeImpressora;
   }

   public BigDecimal getNuNotaModelo() {
        return nuNotaModelo;
   }

   public void setNuNotaModelo(BigDecimal nuNotaModelo) {
        this.nuNotaModelo = nuNotaModelo;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getQuando() {
        return quando;
   }

   public void setQuando(String quando) {
        this.quando = quando;
   }

   public String getSelImpressora() {
        return selImpressora;
   }

   public void setSelImpressora(String selImpressora) {
        this.selImpressora = selImpressora;
   }

   public String getConsumirEstoque() {
        return consumirEstoque;
   }

   public void setConsumirEstoque(String consumirEstoque) {
        this.consumirEstoque = consumirEstoque;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getObrigatorio() {
        return obrigatorio;
   }

   public void setObrigatorio(String obrigatorio) {
        this.obrigatorio = obrigatorio;
   }

   public String getTipoOper() {
        return tipoOper;
   }

   public void setTipoOper(String tipoOper) {
        this.tipoOper = tipoOper;
   }

   public String getAnulaOperEst() {
        return anulaOperEst;
   }

   public void setAnulaOperEst(String anulaOperEst) {
        this.anulaOperEst = anulaOperEst;
   }

   public BigDecimal getCodLocalDestPerda() {
        return codLocalDestPerda;
   }

   public void setCodLocalDestPerda(BigDecimal codLocalDestPerda) {
        this.codLocalDestPerda = codLocalDestPerda;
   }

   public BigDecimal getCodTipOperPerda() {
        return codTipOperPerda;
   }

   public void setCodTipOperPerda(BigDecimal codTipOperPerda) {
        this.codTipOperPerda = codTipOperPerda;
   }

   public BigDecimal getCodEmpDestEncad() {
        return codEmpDestEncad;
   }

   public void setCodEmpDestEncad(BigDecimal codEmpDestEncad) {
        this.codEmpDestEncad = codEmpDestEncad;
   }

   public BigDecimal getCodLocalDestEncad() {
        return codLocalDestEncad;
   }

   public void setCodLocalDestEncad(BigDecimal codLocalDestEncad) {
        this.codLocalDestEncad = codLocalDestEncad;
   }

   public BigDecimal getCodParcEncad() {
        return codParcEncad;
   }

   public void setCodParcEncad(BigDecimal codParcEncad) {
        this.codParcEncad = codParcEncad;
   }

   public BigDecimal getCodTipOperEncad() {
        return codTipOperEncad;
   }

   public void setCodTipOperEncad(BigDecimal codTipOperEncad) {
        this.codTipOperEncad = codTipOperEncad;
   }

   public String getConfirmEncad() {
        return confirmEncad;
   }

   public void setConfirmEncad(String confirmEncad) {
        this.confirmEncad = confirmEncad;
   }

   public BigDecimal getNuModeloEncad() {
        return nuModeloEncad;
   }

   public void setNuModeloEncad(BigDecimal nuModeloEncad) {
        this.nuModeloEncad = nuModeloEncad;
   }

   public String getObrigEncad() {
        return obrigEncad;
   }

   public void setObrigEncad(String obrigEncad) {
        this.obrigEncad = obrigEncad;
   }

   public String getTipoOperEncad() {
        return tipoOperEncad;
   }

   public void setTipoOperEncad(String tipoOperEncad) {
        this.tipoOperEncad = tipoOperEncad;
   }

   public String getTipoProducao() {
        return tipoProducao;
   }

   public void setTipoProducao(String tipoProducao) {
        this.tipoProducao = tipoProducao;
   }

   public String getUtilizaLocalOrig() {
        return utilizaLocalOrig;
   }

   public void setUtilizaLocalOrig(String utilizaLocalOrig) {
        this.utilizaLocalOrig = utilizaLocalOrig;
   }

   public BigDecimal getCodTipOperKanban() {
        return codTipOperKanban;
   }

   public void setCodTipOperKanban(BigDecimal codTipOperKanban) {
        this.codTipOperKanban = codTipOperKanban;
   }

   public String getKanban() {
        return kanban;
   }

   public void setKanban(String kanban) {
        this.kanban = kanban;
   }

   public BigDecimal getNuNotaModeloKanban() {
        return nuNotaModeloKanban;
   }

   public void setNuNotaModeloKanban(BigDecimal nuNotaModeloKanban) {
        this.nuNotaModeloKanban = nuNotaModeloKanban;
   }

   public String getUsarParcTercEncad() {
        return usarParcTercEncad;
   }

   public void setUsarParcTercEncad(String usarParcTercEncad) {
        this.usarParcTercEncad = usarParcTercEncad;
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
        this.tipoMaterial = vo.asString("TIPOMATERIAL");
        this.seqOper = vo.asBigDecimal("SEQOPER");
        this.statusExec = vo.asString("STATUSEXEC");
        this.tipoItens = vo.asString("TIPOITENS");
        this.baixarReservaEst = vo.asString("BAIXARESERVAEST");
        this.usarParcTerc = vo.asString("USARPARCTERC");
        this.tipoExec = vo.asString("TIPOEXEC");
        this.codLocalBaixaMp = vo.asBigDecimal("CODLOCALBAIXAMP");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codEmpDest = vo.asBigDecimal("CODEMPDEST");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.codLocalDest = vo.asBigDecimal("CODLOCALDEST");
        this.codLocalOrig = vo.asBigDecimal("CODLOCALORIG");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.confirmar = vo.asString("CONFIRMAR");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxBase = vo.asBigDecimal("IDEFXBASE");
        this.idForm = vo.asBigDecimal("IDFORM");
        this.nomeImpressora = vo.asString("NOMEIMPRESSORA");
        this.nuNotaModelo = vo.asBigDecimal("NUNOTAMODELO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.quando = vo.asString("QUANDO");
        this.selImpressora = vo.asString("SELIMPRESSORA");
        this.consumirEstoque = vo.asString("CONSUMIRESTOQUE");
        this.descricao = vo.asString("DESCRICAO");
        this.obrigatorio = vo.asString("OBRIGATORIO");
        this.tipoOper = vo.asString("TIPOOPER");
        this.anulaOperEst = vo.asString("ANULAOPEREST");
        this.codLocalDestPerda = vo.asBigDecimal("CODLOCALDESTPERDA");
        this.codTipOperPerda = vo.asBigDecimal("CODTIPOPERPERDA");
        this.codEmpDestEncad = vo.asBigDecimal("CODEMPDESTENCAD");
        this.codLocalDestEncad = vo.asBigDecimal("CODLOCALDESTENCAD");
        this.codParcEncad = vo.asBigDecimal("CODPARCENCAD");
        this.codTipOperEncad = vo.asBigDecimal("CODTIPOPERENCAD");
        this.confirmEncad = vo.asString("CONFIRMENCAD");
        this.nuModeloEncad = vo.asBigDecimal("NUMODELOENCAD");
        this.obrigEncad = vo.asString("OBRIGENCAD");
        this.tipoOperEncad = vo.asString("TIPOOPERENCAD");
        this.tipoProducao = vo.asString("TIPOPRODUCAO");
        this.utilizaLocalOrig = vo.asString("UTILIZALOCALORIG");
        this.codTipOperKanban = vo.asBigDecimal("CODTIPOPERKANBAN");
        this.kanban = vo.asString("KANBAN");
        this.nuNotaModeloKanban = vo.asBigDecimal("NUNOTAMODELOKANBAN");
        this.usarParcTercEncad = vo.asString("USARPARCTERCENCAD");
        return this;
   }
}
