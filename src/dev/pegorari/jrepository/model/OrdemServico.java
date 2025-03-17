package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemServico implements SankhyaEntity<OrdemServico> {

   private String contato;
   private String descricao;
   private Timestamp dhChamada;
   private Timestamp dhFechamentoSla;
   private Timestamp dtAlter;
   private BigDecimal codParCatend;
   private BigDecimal codPla;
   private String bairro;
   private String cidade;
   private BigDecimal codAtend;
   private String codBem;
   private BigDecimal codCencus;
   private BigDecimal codContato;
   private BigDecimal codContatoPap;
   private BigDecimal codCos;
   private BigDecimal codCosAnt;
   private BigDecimal codOat;
   private BigDecimal codPap;
   private BigDecimal codParc;
   private String complemento;
   private String endereco;
   private String etapaNeg;
   private String identificador;
   private String nomeContato;
   private String nomeModelo;
   private BigDecimal nuFap;
   private BigDecimal numContrato;
   private BigDecimal numEtapa;
   private Timestamp dtFechamento;
   private Timestamp dtPrevista;
   private BigDecimal codServFluxo;
   private BigDecimal codTpn;
   private BigDecimal codUsuAlter;
   private BigDecimal codUsuFech;
   private BigDecimal codUsuResp;
   private BigDecimal codUsuSolicitante;
   private BigDecimal codVend;
   private BigDecimal numOs;
   private String numOsCliente;
   private BigDecimal numOsRelacionada;
   private BigDecimal nuNota;
   private String possuiSla;
   private String serie;
   private String situacao;
   private String statusNeg;
   private String telContato;
   private BigDecimal tempGasto;
   private BigDecimal tempoGastoSla;
   private BigDecimal tempoSla;
   private BigDecimal tempPrevisto;
   private String tipo;
   private BigDecimal variacaoFluxo;
   private String modeloVisivelAppos;
   private BigDecimal codProcMaha;
   private String impacto;
   private String urgencia;

   public String getContato() {
        return contato;
   }

   public void setContato(String contato) {
        this.contato = contato;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhChamada() {
        return dhChamada;
   }

   public void setDhChamada(Timestamp dhChamada) {
        this.dhChamada = dhChamada;
   }

   public Timestamp getDhFechamentoSla() {
        return dhFechamentoSla;
   }

   public void setDhFechamentoSla(Timestamp dhFechamentoSla) {
        this.dhFechamentoSla = dhFechamentoSla;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodParCatend() {
        return codParCatend;
   }

   public void setCodParCatend(BigDecimal codParCatend) {
        this.codParCatend = codParCatend;
   }

   public BigDecimal getCodPla() {
        return codPla;
   }

   public void setCodPla(BigDecimal codPla) {
        this.codPla = codPla;
   }

   public String getBairro() {
        return bairro;
   }

   public void setBairro(String bairro) {
        this.bairro = bairro;
   }

   public String getCidade() {
        return cidade;
   }

   public void setCidade(String cidade) {
        this.cidade = cidade;
   }

   public BigDecimal getCodAtend() {
        return codAtend;
   }

   public void setCodAtend(BigDecimal codAtend) {
        this.codAtend = codAtend;
   }

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        this.codBem = codBem;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodContatoPap() {
        return codContatoPap;
   }

   public void setCodContatoPap(BigDecimal codContatoPap) {
        this.codContatoPap = codContatoPap;
   }

   public BigDecimal getCodCos() {
        return codCos;
   }

   public void setCodCos(BigDecimal codCos) {
        this.codCos = codCos;
   }

   public BigDecimal getCodCosAnt() {
        return codCosAnt;
   }

   public void setCodCosAnt(BigDecimal codCosAnt) {
        this.codCosAnt = codCosAnt;
   }

   public BigDecimal getCodOat() {
        return codOat;
   }

   public void setCodOat(BigDecimal codOat) {
        this.codOat = codOat;
   }

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        this.codPap = codPap;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        this.complemento = complemento;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        this.endereco = endereco;
   }

   public String getEtapaNeg() {
        return etapaNeg;
   }

   public void setEtapaNeg(String etapaNeg) {
        this.etapaNeg = etapaNeg;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        this.identificador = identificador;
   }

   public String getNomeContato() {
        return nomeContato;
   }

   public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
   }

   public String getNomeModelo() {
        return nomeModelo;
   }

   public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getNumEtapa() {
        return numEtapa;
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        this.numEtapa = numEtapa;
   }

   public Timestamp getDtFechamento() {
        return dtFechamento;
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        this.dtFechamento = dtFechamento;
   }

   public Timestamp getDtPrevista() {
        return dtPrevista;
   }

   public void setDtPrevista(Timestamp dtPrevista) {
        this.dtPrevista = dtPrevista;
   }

   public BigDecimal getCodServFluxo() {
        return codServFluxo;
   }

   public void setCodServFluxo(BigDecimal codServFluxo) {
        this.codServFluxo = codServFluxo;
   }

   public BigDecimal getCodTpn() {
        return codTpn;
   }

   public void setCodTpn(BigDecimal codTpn) {
        this.codTpn = codTpn;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getCodUsuFech() {
        return codUsuFech;
   }

   public void setCodUsuFech(BigDecimal codUsuFech) {
        this.codUsuFech = codUsuFech;
   }

   public BigDecimal getCodUsuResp() {
        return codUsuResp;
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        this.codUsuResp = codUsuResp;
   }

   public BigDecimal getCodUsuSolicitante() {
        return codUsuSolicitante;
   }

   public void setCodUsuSolicitante(BigDecimal codUsuSolicitante) {
        this.codUsuSolicitante = codUsuSolicitante;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public String getNumOsCliente() {
        return numOsCliente;
   }

   public void setNumOsCliente(String numOsCliente) {
        this.numOsCliente = numOsCliente;
   }

   public BigDecimal getNumOsRelacionada() {
        return numOsRelacionada;
   }

   public void setNumOsRelacionada(BigDecimal numOsRelacionada) {
        this.numOsRelacionada = numOsRelacionada;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getPossuiSla() {
        return possuiSla;
   }

   public void setPossuiSla(String possuiSla) {
        this.possuiSla = possuiSla;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getStatusNeg() {
        return statusNeg;
   }

   public void setStatusNeg(String statusNeg) {
        this.statusNeg = statusNeg;
   }

   public String getTelContato() {
        return telContato;
   }

   public void setTelContato(String telContato) {
        this.telContato = telContato;
   }

   public BigDecimal getTempGasto() {
        return tempGasto;
   }

   public void setTempGasto(BigDecimal tempGasto) {
        this.tempGasto = tempGasto;
   }

   public BigDecimal getTempoGastoSla() {
        return tempoGastoSla;
   }

   public void setTempoGastoSla(BigDecimal tempoGastoSla) {
        this.tempoGastoSla = tempoGastoSla;
   }

   public BigDecimal getTempoSla() {
        return tempoSla;
   }

   public void setTempoSla(BigDecimal tempoSla) {
        this.tempoSla = tempoSla;
   }

   public BigDecimal getTempPrevisto() {
        return tempPrevisto;
   }

   public void setTempPrevisto(BigDecimal tempPrevisto) {
        this.tempPrevisto = tempPrevisto;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getVariacaoFluxo() {
        return variacaoFluxo;
   }

   public void setVariacaoFluxo(BigDecimal variacaoFluxo) {
        this.variacaoFluxo = variacaoFluxo;
   }

   public String getModeloVisivelAppos() {
        return modeloVisivelAppos;
   }

   public void setModeloVisivelAppos(String modeloVisivelAppos) {
        this.modeloVisivelAppos = modeloVisivelAppos;
   }

   public BigDecimal getCodProcMaha() {
        return codProcMaha;
   }

   public void setCodProcMaha(BigDecimal codProcMaha) {
        this.codProcMaha = codProcMaha;
   }

   public String getImpacto() {
        return impacto;
   }

   public void setImpacto(String impacto) {
        this.impacto = impacto;
   }

   public String getUrgencia() {
        return urgencia;
   }

   public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
   }

   @Override
   public String getEntityName() {
        return "OrdemServico";
   }

   @Override
   public OrdemServico fromVO(DynamicVO vo) {
        this.contato = vo.asString("CONTATO");
        this.descricao = vo.asString("DESCRICAO");
        this.dhChamada = vo.asTimestamp("DHCHAMADA");
        this.dhFechamentoSla = vo.asTimestamp("DHFECHAMENTOSLA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codParCatend = vo.asBigDecimal("CODPARCATEND");
        this.codPla = vo.asBigDecimal("CODPLA");
        this.bairro = vo.asString("BAIRRO");
        this.cidade = vo.asString("CIDADE");
        this.codAtend = vo.asBigDecimal("CODATEND");
        this.codBem = vo.asString("CODBEM");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codContatoPap = vo.asBigDecimal("CODCONTATOPAP");
        this.codCos = vo.asBigDecimal("CODCOS");
        this.codCosAnt = vo.asBigDecimal("CODCOSANT");
        this.codOat = vo.asBigDecimal("CODOAT");
        this.codPap = vo.asBigDecimal("CODPAP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.complemento = vo.asString("COMPLEMENTO");
        this.endereco = vo.asString("ENDERECO");
        this.etapaNeg = vo.asString("ETAPANEG");
        this.identificador = vo.asString("IDENTIFICADOR");
        this.nomeContato = vo.asString("NOMECONTATO");
        this.nomeModelo = vo.asString("NOMEMODELO");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numEtapa = vo.asBigDecimal("NUMETAPA");
        this.dtFechamento = vo.asTimestamp("DTFECHAMENTO");
        this.dtPrevista = vo.asTimestamp("DTPREVISTA");
        this.codServFluxo = vo.asBigDecimal("CODSERVFLUXO");
        this.codTpn = vo.asBigDecimal("CODTPN");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuFech = vo.asBigDecimal("CODUSUFECH");
        this.codUsuResp = vo.asBigDecimal("CODUSURESP");
        this.codUsuSolicitante = vo.asBigDecimal("CODUSUSOLICITANTE");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numOsCliente = vo.asString("NUMOSCLIENTE");
        this.numOsRelacionada = vo.asBigDecimal("NUMOSRELACIONADA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.possuiSla = vo.asString("POSSUISLA");
        this.serie = vo.asString("SERIE");
        this.situacao = vo.asString("SITUACAO");
        this.statusNeg = vo.asString("STATUSNEG");
        this.telContato = vo.asString("TELCONTATO");
        this.tempGasto = vo.asBigDecimal("TEMPGASTO");
        this.tempoGastoSla = vo.asBigDecimal("TEMPOGASTOSLA");
        this.tempoSla = vo.asBigDecimal("TEMPOSLA");
        this.tempPrevisto = vo.asBigDecimal("TEMPPREVISTO");
        this.tipo = vo.asString("TIPO");
        this.variacaoFluxo = vo.asBigDecimal("VARIACAOFLUXO");
        this.modeloVisivelAppos = vo.asString("MODELOVISIVELAPPOS");
        this.codProcMaha = vo.asBigDecimal("CODPROCMAHA");
        this.impacto = vo.asString("IMPACTO");
        this.urgencia = vo.asString("URGENCIA");
        return this;
   }
}
