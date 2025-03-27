package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemServico extends AbstractSankhyaEntity<OrdemServico> {
   public String getContato() {
        return this.getVo().asString("CONTATO");
   }

   public void setContato(String contato) {
        markAsChanged("CONTATO", contato);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhChamada() {
        return this.getVo().asTimestamp("DHCHAMADA");
   }

   public void setDhChamada(Timestamp dhChamada) {
        markAsChanged("DHCHAMADA", dhChamada);
   }

   public Timestamp getDhFechamentoSla() {
        return this.getVo().asTimestamp("DHFECHAMENTOSLA");
   }

   public void setDhFechamentoSla(Timestamp dhFechamentoSla) {
        markAsChanged("DHFECHAMENTOSLA", dhFechamentoSla);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodParcAtend() {
        return this.getVo().asBigDecimal("CODPARCATEND");
   }

   public void setCodParcAtend(BigDecimal codParcAtend) {
        markAsChanged("CODPARCATEND", codParcAtend);
   }

   public BigDecimal getCodPla() {
        return this.getVo().asBigDecimal("CODPLA");
   }

   public void setCodPla(BigDecimal codPla) {
        markAsChanged("CODPLA", codPla);
   }

   public String getBairro() {
        return this.getVo().asString("BAIRRO");
   }

   public void setBairro(String bairro) {
        markAsChanged("BAIRRO", bairro);
   }

   public String getCidade() {
        return this.getVo().asString("CIDADE");
   }

   public void setCidade(String cidade) {
        markAsChanged("CIDADE", cidade);
   }

   public BigDecimal getCodAtend() {
        return this.getVo().asBigDecimal("CODATEND");
   }

   public void setCodAtend(BigDecimal codAtend) {
        markAsChanged("CODATEND", codAtend);
   }

   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodContatoPap() {
        return this.getVo().asBigDecimal("CODCONTATOPAP");
   }

   public void setCodContatoPap(BigDecimal codContatoPap) {
        markAsChanged("CODCONTATOPAP", codContatoPap);
   }

   public BigDecimal getCodCos() {
        return this.getVo().asBigDecimal("CODCOS");
   }

   public void setCodCos(BigDecimal codCos) {
        markAsChanged("CODCOS", codCos);
   }

   public BigDecimal getCodCosAnt() {
        return this.getVo().asBigDecimal("CODCOSANT");
   }

   public void setCodCosAnt(BigDecimal codCosAnt) {
        markAsChanged("CODCOSANT", codCosAnt);
   }

   public BigDecimal getCodOat() {
        return this.getVo().asBigDecimal("CODOAT");
   }

   public void setCodOat(BigDecimal codOat) {
        markAsChanged("CODOAT", codOat);
   }

   public BigDecimal getCodPap() {
        return this.getVo().asBigDecimal("CODPAP");
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public String getEndereco() {
        return this.getVo().asString("ENDERECO");
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
   }

   public String getEtapaNeg() {
        return this.getVo().asString("ETAPANEG");
   }

   public void setEtapaNeg(String etapaNeg) {
        markAsChanged("ETAPANEG", etapaNeg);
   }

   public String getIdentificador() {
        return this.getVo().asString("IDENTIFICADOR");
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
   }

   public String getNomeContato() {
        return this.getVo().asString("NOMECONTATO");
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
   }

   public String getNomeModelo() {
        return this.getVo().asString("NOMEMODELO");
   }

   public void setNomeModelo(String nomeModelo) {
        markAsChanged("NOMEMODELO", nomeModelo);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumEtapa() {
        return this.getVo().asBigDecimal("NUMETAPA");
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        markAsChanged("NUMETAPA", numEtapa);
   }

   public Timestamp getDtFechamento() {
        return this.getVo().asTimestamp("DTFECHAMENTO");
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        markAsChanged("DTFECHAMENTO", dtFechamento);
   }

   public Timestamp getDtPrevista() {
        return this.getVo().asTimestamp("DTPREVISTA");
   }

   public void setDtPrevista(Timestamp dtPrevista) {
        markAsChanged("DTPREVISTA", dtPrevista);
   }

   public BigDecimal getCodServFluxo() {
        return this.getVo().asBigDecimal("CODSERVFLUXO");
   }

   public void setCodServFluxo(BigDecimal codServFluxo) {
        markAsChanged("CODSERVFLUXO", codServFluxo);
   }

   public BigDecimal getCodTpn() {
        return this.getVo().asBigDecimal("CODTPN");
   }

   public void setCodTpn(BigDecimal codTpn) {
        markAsChanged("CODTPN", codTpn);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public BigDecimal getCodUsuFech() {
        return this.getVo().asBigDecimal("CODUSUFECH");
   }

   public void setCodUsuFech(BigDecimal codUsuFech) {
        markAsChanged("CODUSUFECH", codUsuFech);
   }

   public BigDecimal getCodUsuResp() {
        return this.getVo().asBigDecimal("CODUSURESP");
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
   }

   public BigDecimal getCodUsuSolicitante() {
        return this.getVo().asBigDecimal("CODUSUSOLICITANTE");
   }

   public void setCodUsuSolicitante(BigDecimal codUsuSolicitante) {
        markAsChanged("CODUSUSOLICITANTE", codUsuSolicitante);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public String getNumOsCliente() {
        return this.getVo().asString("NUMOSCLIENTE");
   }

   public void setNumOsCliente(String numOsCliente) {
        markAsChanged("NUMOSCLIENTE", numOsCliente);
   }

   public BigDecimal getNumOsRelacionada() {
        return this.getVo().asBigDecimal("NUMOSRELACIONADA");
   }

   public void setNumOsRelacionada(BigDecimal numOsRelacionada) {
        markAsChanged("NUMOSRELACIONADA", numOsRelacionada);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getPossuiSla() {
        return this.getVo().asString("POSSUISLA");
   }

   public void setPossuiSla(String possuiSla) {
        markAsChanged("POSSUISLA", possuiSla);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getStatusNeg() {
        return this.getVo().asString("STATUSNEG");
   }

   public void setStatusNeg(String statusNeg) {
        markAsChanged("STATUSNEG", statusNeg);
   }

   public String getTelContato() {
        return this.getVo().asString("TELCONTATO");
   }

   public void setTelContato(String telContato) {
        markAsChanged("TELCONTATO", telContato);
   }

   public BigDecimal getTempGasto() {
        return this.getVo().asBigDecimal("TEMPGASTO");
   }

   public void setTempGasto(BigDecimal tempGasto) {
        markAsChanged("TEMPGASTO", tempGasto);
   }

   public BigDecimal getTempoGastoSla() {
        return this.getVo().asBigDecimal("TEMPOGASTOSLA");
   }

   public void setTempoGastoSla(BigDecimal tempoGastoSla) {
        markAsChanged("TEMPOGASTOSLA", tempoGastoSla);
   }

   public BigDecimal getTempoSla() {
        return this.getVo().asBigDecimal("TEMPOSLA");
   }

   public void setTempoSla(BigDecimal tempoSla) {
        markAsChanged("TEMPOSLA", tempoSla);
   }

   public BigDecimal getTempPrevisto() {
        return this.getVo().asBigDecimal("TEMPPREVISTO");
   }

   public void setTempPrevisto(BigDecimal tempPrevisto) {
        markAsChanged("TEMPPREVISTO", tempPrevisto);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVariacaoFluxo() {
        return this.getVo().asBigDecimal("VARIACAOFLUXO");
   }

   public void setVariacaoFluxo(BigDecimal variacaoFluxo) {
        markAsChanged("VARIACAOFLUXO", variacaoFluxo);
   }

   public String getModeloVisivelAppOs() {
        return this.getVo().asString("MODELOVISIVELAPPOS");
   }

   public void setModeloVisivelAppOs(String modeloVisivelAppOs) {
        markAsChanged("MODELOVISIVELAPPOS", modeloVisivelAppOs);
   }

   public BigDecimal getCodProcMaHa() {
        return this.getVo().asBigDecimal("CODPROCMAHA");
   }

   public void setCodProcMaHa(BigDecimal codProcMaHa) {
        markAsChanged("CODPROCMAHA", codProcMaHa);
   }

   public String getImpacto() {
        return this.getVo().asString("IMPACTO");
   }

   public void setImpacto(String impacto) {
        markAsChanged("IMPACTO", impacto);
   }

   public String getUrgencia() {
        return this.getVo().asString("URGENCIA");
   }

   public void setUrgencia(String urgencia) {
        markAsChanged("URGENCIA", urgencia);
   }

   @Override
   public String getTableName() {
        return "TCSOSE";
   }

   @Override
   public String getEntityName() {
        return "OrdemServico";
   }

   @Override
   public OrdemServico fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
