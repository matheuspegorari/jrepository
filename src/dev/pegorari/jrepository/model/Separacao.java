package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Separacao extends AbstractSankhyaEntity<Separacao> {
   public BigDecimal getStatusConf() {
        return this.getVo().asBigDecimal("STATUSCONF");
   }

   public void setStatusConf(BigDecimal statusConf) {
        markAsChanged("STATUSCONF", statusConf);
   }

   public BigDecimal getTipoSplit() {
        return this.getVo().asBigDecimal("TIPOSPLIT");
   }

   public void setTipoSplit(BigDecimal tipoSplit) {
        markAsChanged("TIPOSPLIT", tipoSplit);
   }

   public BigDecimal getCodAreaConf() {
        return this.getVo().asBigDecimal("CODAREACONF");
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
   }

   public BigDecimal getCodAreaSep() {
        return this.getVo().asBigDecimal("CODAREASEP");
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
   }

   public BigDecimal getCodDoca() {
        return this.getVo().asBigDecimal("CODDOCA");
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
   }

   public BigDecimal getCodEmpoc() {
        return this.getVo().asBigDecimal("CODEMPOC");
   }

   public void setCodEmpoc(BigDecimal codEmpoc) {
        markAsChanged("CODEMPOC", codEmpoc);
   }

   public BigDecimal getCodEndDoca() {
        return this.getVo().asBigDecimal("CODENDDOCA");
   }

   public void setCodEndDoca(BigDecimal codEndDoca) {
        markAsChanged("CODENDDOCA", codEndDoca);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtSeparacao() {
        return this.getVo().asTimestamp("DTSEPARACAO");
   }

   public void setDtSeparacao(Timestamp dtSeparacao) {
        markAsChanged("DTSEPARACAO", dtSeparacao);
   }

   public String getFlowRack() {
        return this.getVo().asString("FLOWRACK");
   }

   public void setFlowRack(String flowRack) {
        markAsChanged("FLOWRACK", flowRack);
   }

   public String getLiberada() {
        return this.getVo().asString("LIBERADA");
   }

   public void setLiberada(String liberada) {
        markAsChanged("LIBERADA", liberada);
   }

   public String getLiberaReab() {
        return this.getVo().asString("LIBERAREAB");
   }

   public void setLiberaReab(String liberaReab) {
        markAsChanged("LIBERAREAB", liberaReab);
   }

   public BigDecimal getNroPalete() {
        return this.getVo().asBigDecimal("NROPALETE");
   }

   public void setNroPalete(BigDecimal nroPalete) {
        markAsChanged("NROPALETE", nroPalete);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getQtdCxsFlowRack() {
        return this.getVo().asBigDecimal("QTDCXSFLOWRACK");
   }

   public void setQtdCxsFlowRack(BigDecimal qtdCxsFlowRack) {
        markAsChanged("QTDCXSFLOWRACK", qtdCxsFlowRack);
   }

   public BigDecimal getSituacao() {
        return this.getVo().asBigDecimal("SITUACAO");
   }

   public void setSituacao(BigDecimal situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getEnviadoDoca() {
        return this.getVo().asString("ENVIADODOCA");
   }

   public void setEnviadoDoca(String enviadoDoca) {
        markAsChanged("ENVIADODOCA", enviadoDoca);
   }

   public String getCancelada() {
        return this.getVo().asString("CANCELADA");
   }

   public void setCancelada(String cancelada) {
        markAsChanged("CANCELADA", cancelada);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getCodUsuConf() {
        return this.getVo().asBigDecimal("CODUSUCONF");
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
   }

   public String getNomeUsuConf() {
        return this.getVo().asString("NOMEUSUCONF");
   }

   public void setNomeUsuConf(String nomeUsuConf) {
        markAsChanged("NOMEUSUCONF", nomeUsuConf);
   }

   public String getTriado() {
        return this.getVo().asString("TRIADO");
   }

   public void setTriado(String triado) {
        markAsChanged("TRIADO", triado);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getDescrSituacao() {
        return this.getVo().asBigDecimal("DESCRSITUACAO");
   }

   public void setDescrSituacao(BigDecimal descrSituacao) {
        markAsChanged("DESCRSITUACAO", descrSituacao);
   }

   public BigDecimal getM3Bruto() {
        return this.getVo().asBigDecimal("M3BRUTO");
   }

   public void setM3Bruto(BigDecimal m3Bruto) {
        markAsChanged("M3BRUTO", m3Bruto);
   }

   public BigDecimal getCodOnda() {
        return this.getVo().asBigDecimal("CODONDA");
   }

   public void setCodOnda(BigDecimal codOnda) {
        markAsChanged("CODONDA", codOnda);
   }

   public String getTipoSep() {
        return this.getVo().asString("TIPOSEP");
   }

   public void setTipoSep(String tipoSep) {
        markAsChanged("TIPOSEP", tipoSep);
   }

   public BigDecimal getQtdTarefas() {
        return this.getVo().asBigDecimal("QTDTAREFAS");
   }

   public void setQtdTarefas(BigDecimal qtdTarefas) {
        markAsChanged("QTDTAREFAS", qtdTarefas);
   }

   public BigDecimal getNuSepMae() {
        return this.getVo().asBigDecimal("NUSEPMAE");
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        markAsChanged("NUSEPMAE", nuSepMae);
   }

   public BigDecimal getQtdCheckouts() {
        return this.getVo().asBigDecimal("QTDCHECKOUTS");
   }

   public void setQtdCheckouts(BigDecimal qtdCheckouts) {
        markAsChanged("QTDCHECKOUTS", qtdCheckouts);
   }

   public BigDecimal getSituacaoAnt() {
        return this.getVo().asBigDecimal("SITUACAOANT");
   }

   public void setSituacaoAnt(BigDecimal situacaoAnt) {
        markAsChanged("SITUACAOANT", situacaoAnt);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   @Override
   public String getTableName() {
        return "TGWSEP";
   }

   @Override
   public String getEntityName() {
        return "Separacao";
   }

   @Override
   public Separacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
