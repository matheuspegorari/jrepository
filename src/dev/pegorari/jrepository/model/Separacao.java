package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Separacao implements SankhyaEntity<Separacao> {

   private BigDecimal statusConf;
   private BigDecimal tipoSplit;
   private BigDecimal codAreaConf;
   private BigDecimal codAreaSep;
   private BigDecimal codDoca;
   private BigDecimal codEmpOc;
   private BigDecimal codEndDoca;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private Timestamp dtSeparacao;
   private String flowRack;
   private String liberada;
   private String liberaReab;
   private BigDecimal nroPalete;
   private BigDecimal nuConferencia;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private BigDecimal nuSeparacao;
   private BigDecimal nuTarefa;
   private BigDecimal ordemCarga;
   private BigDecimal prioridade;
   private BigDecimal qtdCxsFlowRack;
   private BigDecimal situacao;
   private String enviadoDoca;
   private String cancelada;
   private String observacao;
   private BigDecimal codUsuConf;
   private String nomeUsuConf;
   private String triado;
   private BigDecimal pesoBruto;
   private BigDecimal descrSituacao;
   private BigDecimal m3Bruto;
   private BigDecimal codOnda;
   private String tipoSep;
   private BigDecimal qtdTarefas;
   private BigDecimal nuSepMae;
   private BigDecimal qtdCheckouts;
   private BigDecimal situacaoAnt;
   private BigDecimal codParc;

   public BigDecimal getStatusConf() {
        return statusConf;
   }

   public void setStatusConf(BigDecimal statusConf) {
        this.statusConf = statusConf;
   }

   public BigDecimal getTipoSplit() {
        return tipoSplit;
   }

   public void setTipoSplit(BigDecimal tipoSplit) {
        this.tipoSplit = tipoSplit;
   }

   public BigDecimal getCodAreaConf() {
        return codAreaConf;
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        this.codAreaConf = codAreaConf;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        this.codAreaSep = codAreaSep;
   }

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        this.codDoca = codDoca;
   }

   public BigDecimal getCodEmpOc() {
        return codEmpOc;
   }

   public void setCodEmpOc(BigDecimal codEmpOc) {
        this.codEmpOc = codEmpOc;
   }

   public BigDecimal getCodEndDoca() {
        return codEndDoca;
   }

   public void setCodEndDoca(BigDecimal codEndDoca) {
        this.codEndDoca = codEndDoca;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtSeparacao() {
        return dtSeparacao;
   }

   public void setDtSeparacao(Timestamp dtSeparacao) {
        this.dtSeparacao = dtSeparacao;
   }

   public String getFlowRack() {
        return flowRack;
   }

   public void setFlowRack(String flowRack) {
        this.flowRack = flowRack;
   }

   public String getLiberada() {
        return liberada;
   }

   public void setLiberada(String liberada) {
        this.liberada = liberada;
   }

   public String getLiberaReab() {
        return liberaReab;
   }

   public void setLiberaReab(String liberaReab) {
        this.liberaReab = liberaReab;
   }

   public BigDecimal getNroPalete() {
        return nroPalete;
   }

   public void setNroPalete(BigDecimal nroPalete) {
        this.nroPalete = nroPalete;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        this.nuConferencia = nuConferencia;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        this.ordemCarga = ordemCarga;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   public BigDecimal getQtdCxsFlowRack() {
        return qtdCxsFlowRack;
   }

   public void setQtdCxsFlowRack(BigDecimal qtdCxsFlowRack) {
        this.qtdCxsFlowRack = qtdCxsFlowRack;
   }

   public BigDecimal getSituacao() {
        return situacao;
   }

   public void setSituacao(BigDecimal situacao) {
        this.situacao = situacao;
   }

   public String getEnviadoDoca() {
        return enviadoDoca;
   }

   public void setEnviadoDoca(String enviadoDoca) {
        this.enviadoDoca = enviadoDoca;
   }

   public String getCancelada() {
        return cancelada;
   }

   public void setCancelada(String cancelada) {
        this.cancelada = cancelada;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getCodUsuConf() {
        return codUsuConf;
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        this.codUsuConf = codUsuConf;
   }

   public String getNomeUsuConf() {
        return nomeUsuConf;
   }

   public void setNomeUsuConf(String nomeUsuConf) {
        this.nomeUsuConf = nomeUsuConf;
   }

   public String getTriado() {
        return triado;
   }

   public void setTriado(String triado) {
        this.triado = triado;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getDescrSituacao() {
        return descrSituacao;
   }

   public void setDescrSituacao(BigDecimal descrSituacao) {
        this.descrSituacao = descrSituacao;
   }

   public BigDecimal getM3Bruto() {
        return m3Bruto;
   }

   public void setM3Bruto(BigDecimal m3Bruto) {
        this.m3Bruto = m3Bruto;
   }

   public BigDecimal getCodOnda() {
        return codOnda;
   }

   public void setCodOnda(BigDecimal codOnda) {
        this.codOnda = codOnda;
   }

   public String getTipoSep() {
        return tipoSep;
   }

   public void setTipoSep(String tipoSep) {
        this.tipoSep = tipoSep;
   }

   public BigDecimal getQtdTarefas() {
        return qtdTarefas;
   }

   public void setQtdTarefas(BigDecimal qtdTarefas) {
        this.qtdTarefas = qtdTarefas;
   }

   public BigDecimal getNuSepMae() {
        return nuSepMae;
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        this.nuSepMae = nuSepMae;
   }

   public BigDecimal getQtdCheckouts() {
        return qtdCheckouts;
   }

   public void setQtdCheckouts(BigDecimal qtdCheckouts) {
        this.qtdCheckouts = qtdCheckouts;
   }

   public BigDecimal getSituacaoAnt() {
        return situacaoAnt;
   }

   public void setSituacaoAnt(BigDecimal situacaoAnt) {
        this.situacaoAnt = situacaoAnt;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   @Override
   public String getEntityName() {
        return "Separacao";
   }

   @Override
   public Separacao fromVO(DynamicVO vo) {
        this.statusConf = vo.asBigDecimal("STATUSCONF");
        this.tipoSplit = vo.asBigDecimal("TIPOSPLIT");
        this.codAreaConf = vo.asBigDecimal("CODAREACONF");
        this.codAreaSep = vo.asBigDecimal("CODAREASEP");
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codEmpOc = vo.asBigDecimal("CODEMPOC");
        this.codEndDoca = vo.asBigDecimal("CODENDDOCA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtSeparacao = vo.asTimestamp("DTSEPARACAO");
        this.flowRack = vo.asString("FLOWRACK");
        this.liberada = vo.asString("LIBERADA");
        this.liberaReab = vo.asString("LIBERAREAB");
        this.nroPalete = vo.asBigDecimal("NROPALETE");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.qtdCxsFlowRack = vo.asBigDecimal("QTDCXSFLOWRACK");
        this.situacao = vo.asBigDecimal("SITUACAO");
        this.enviadoDoca = vo.asString("ENVIADODOCA");
        this.cancelada = vo.asString("CANCELADA");
        this.observacao = vo.asString("OBSERVACAO");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.nomeUsuConf = vo.asString("NOMEUSUCONF");
        this.triado = vo.asString("TRIADO");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.descrSituacao = vo.asBigDecimal("DESCRSITUACAO");
        this.m3Bruto = vo.asBigDecimal("M3BRUTO");
        this.codOnda = vo.asBigDecimal("CODONDA");
        this.tipoSep = vo.asString("TIPOSEP");
        this.qtdTarefas = vo.asBigDecimal("QTDTAREFAS");
        this.nuSepMae = vo.asBigDecimal("NUSEPMAE");
        this.qtdCheckouts = vo.asBigDecimal("QTDCHECKOUTS");
        this.situacaoAnt = vo.asBigDecimal("SITUACAOANT");
        this.codParc = vo.asBigDecimal("CODPARC");
        return this;
   }
}
