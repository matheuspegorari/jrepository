package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemServico extends AbstractSankhyaEntity<OrdemServico> {
   private String contato;
   private String descricao;
   private Timestamp dhChamada;
   private Timestamp dhFechamentoSla;
   private Timestamp dtAlter;
   private BigDecimal codParcAtend;
   private BigDecimal codPla;
   private String bairro;
   private String cidade;
   private BigDecimal codAtend;
   private String codBem;
   private BigDecimal codCenCus;
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
   private String modeloVisivelAppOs;
   private BigDecimal codProcMaHa;
   private String impacto;
   private String urgencia;

   public String getContato() {
        return contato;
   }

   public void setContato(String contato) {
        markAsChanged("CONTATO", contato);
        this.contato = contato;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhChamada() {
        return dhChamada;
   }

   public void setDhChamada(Timestamp dhChamada) {
        markAsChanged("DHCHAMADA", dhChamada);
        this.dhChamada = dhChamada;
   }

   public Timestamp getDhFechamentoSla() {
        return dhFechamentoSla;
   }

   public void setDhFechamentoSla(Timestamp dhFechamentoSla) {
        markAsChanged("DHFECHAMENTOSLA", dhFechamentoSla);
        this.dhFechamentoSla = dhFechamentoSla;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodParcAtend() {
        return codParcAtend;
   }

   public void setCodParcAtend(BigDecimal codParcAtend) {
        markAsChanged("CODPARCATEND", codParcAtend);
        this.codParcAtend = codParcAtend;
   }

   public BigDecimal getCodPla() {
        return codPla;
   }

   public void setCodPla(BigDecimal codPla) {
        markAsChanged("CODPLA", codPla);
        this.codPla = codPla;
   }

   public String getBairro() {
        return bairro;
   }

   public void setBairro(String bairro) {
        markAsChanged("BAIRRO", bairro);
        this.bairro = bairro;
   }

   public String getCidade() {
        return cidade;
   }

   public void setCidade(String cidade) {
        markAsChanged("CIDADE", cidade);
        this.cidade = cidade;
   }

   public BigDecimal getCodAtend() {
        return codAtend;
   }

   public void setCodAtend(BigDecimal codAtend) {
        markAsChanged("CODATEND", codAtend);
        this.codAtend = codAtend;
   }

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
        this.codBem = codBem;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodContatoPap() {
        return codContatoPap;
   }

   public void setCodContatoPap(BigDecimal codContatoPap) {
        markAsChanged("CODCONTATOPAP", codContatoPap);
        this.codContatoPap = codContatoPap;
   }

   public BigDecimal getCodCos() {
        return codCos;
   }

   public void setCodCos(BigDecimal codCos) {
        markAsChanged("CODCOS", codCos);
        this.codCos = codCos;
   }

   public BigDecimal getCodCosAnt() {
        return codCosAnt;
   }

   public void setCodCosAnt(BigDecimal codCosAnt) {
        markAsChanged("CODCOSANT", codCosAnt);
        this.codCosAnt = codCosAnt;
   }

   public BigDecimal getCodOat() {
        return codOat;
   }

   public void setCodOat(BigDecimal codOat) {
        markAsChanged("CODOAT", codOat);
        this.codOat = codOat;
   }

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
        this.codPap = codPap;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
        this.complemento = complemento;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
        this.endereco = endereco;
   }

   public String getEtapaNeg() {
        return etapaNeg;
   }

   public void setEtapaNeg(String etapaNeg) {
        markAsChanged("ETAPANEG", etapaNeg);
        this.etapaNeg = etapaNeg;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
        this.identificador = identificador;
   }

   public String getNomeContato() {
        return nomeContato;
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
        this.nomeContato = nomeContato;
   }

   public String getNomeModelo() {
        return nomeModelo;
   }

   public void setNomeModelo(String nomeModelo) {
        markAsChanged("NOMEMODELO", nomeModelo);
        this.nomeModelo = nomeModelo;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
        this.nuFap = nuFap;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getNumEtapa() {
        return numEtapa;
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        markAsChanged("NUMETAPA", numEtapa);
        this.numEtapa = numEtapa;
   }

   public Timestamp getDtFechamento() {
        return dtFechamento;
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        markAsChanged("DTFECHAMENTO", dtFechamento);
        this.dtFechamento = dtFechamento;
   }

   public Timestamp getDtPrevista() {
        return dtPrevista;
   }

   public void setDtPrevista(Timestamp dtPrevista) {
        markAsChanged("DTPREVISTA", dtPrevista);
        this.dtPrevista = dtPrevista;
   }

   public BigDecimal getCodServFluxo() {
        return codServFluxo;
   }

   public void setCodServFluxo(BigDecimal codServFluxo) {
        markAsChanged("CODSERVFLUXO", codServFluxo);
        this.codServFluxo = codServFluxo;
   }

   public BigDecimal getCodTpn() {
        return codTpn;
   }

   public void setCodTpn(BigDecimal codTpn) {
        markAsChanged("CODTPN", codTpn);
        this.codTpn = codTpn;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getCodUsuFech() {
        return codUsuFech;
   }

   public void setCodUsuFech(BigDecimal codUsuFech) {
        markAsChanged("CODUSUFECH", codUsuFech);
        this.codUsuFech = codUsuFech;
   }

   public BigDecimal getCodUsuResp() {
        return codUsuResp;
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
        this.codUsuResp = codUsuResp;
   }

   public BigDecimal getCodUsuSolicitante() {
        return codUsuSolicitante;
   }

   public void setCodUsuSolicitante(BigDecimal codUsuSolicitante) {
        markAsChanged("CODUSUSOLICITANTE", codUsuSolicitante);
        this.codUsuSolicitante = codUsuSolicitante;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   public String getNumOsCliente() {
        return numOsCliente;
   }

   public void setNumOsCliente(String numOsCliente) {
        markAsChanged("NUMOSCLIENTE", numOsCliente);
        this.numOsCliente = numOsCliente;
   }

   public BigDecimal getNumOsRelacionada() {
        return numOsRelacionada;
   }

   public void setNumOsRelacionada(BigDecimal numOsRelacionada) {
        markAsChanged("NUMOSRELACIONADA", numOsRelacionada);
        this.numOsRelacionada = numOsRelacionada;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getPossuiSla() {
        return possuiSla;
   }

   public void setPossuiSla(String possuiSla) {
        markAsChanged("POSSUISLA", possuiSla);
        this.possuiSla = possuiSla;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getStatusNeg() {
        return statusNeg;
   }

   public void setStatusNeg(String statusNeg) {
        markAsChanged("STATUSNEG", statusNeg);
        this.statusNeg = statusNeg;
   }

   public String getTelContato() {
        return telContato;
   }

   public void setTelContato(String telContato) {
        markAsChanged("TELCONTATO", telContato);
        this.telContato = telContato;
   }

   public BigDecimal getTempGasto() {
        return tempGasto;
   }

   public void setTempGasto(BigDecimal tempGasto) {
        markAsChanged("TEMPGASTO", tempGasto);
        this.tempGasto = tempGasto;
   }

   public BigDecimal getTempoGastoSla() {
        return tempoGastoSla;
   }

   public void setTempoGastoSla(BigDecimal tempoGastoSla) {
        markAsChanged("TEMPOGASTOSLA", tempoGastoSla);
        this.tempoGastoSla = tempoGastoSla;
   }

   public BigDecimal getTempoSla() {
        return tempoSla;
   }

   public void setTempoSla(BigDecimal tempoSla) {
        markAsChanged("TEMPOSLA", tempoSla);
        this.tempoSla = tempoSla;
   }

   public BigDecimal getTempPrevisto() {
        return tempPrevisto;
   }

   public void setTempPrevisto(BigDecimal tempPrevisto) {
        markAsChanged("TEMPPREVISTO", tempPrevisto);
        this.tempPrevisto = tempPrevisto;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getVariacaoFluxo() {
        return variacaoFluxo;
   }

   public void setVariacaoFluxo(BigDecimal variacaoFluxo) {
        markAsChanged("VARIACAOFLUXO", variacaoFluxo);
        this.variacaoFluxo = variacaoFluxo;
   }

   public String getModeloVisivelAppOs() {
        return modeloVisivelAppOs;
   }

   public void setModeloVisivelAppOs(String modeloVisivelAppOs) {
        markAsChanged("MODELOVISIVELAPPOS", modeloVisivelAppOs);
        this.modeloVisivelAppOs = modeloVisivelAppOs;
   }

   public BigDecimal getCodProcMaHa() {
        return codProcMaHa;
   }

   public void setCodProcMaHa(BigDecimal codProcMaHa) {
        markAsChanged("CODPROCMAHA", codProcMaHa);
        this.codProcMaHa = codProcMaHa;
   }

   public String getImpacto() {
        return impacto;
   }

   public void setImpacto(String impacto) {
        markAsChanged("IMPACTO", impacto);
        this.impacto = impacto;
   }

   public String getUrgencia() {
        return urgencia;
   }

   public void setUrgencia(String urgencia) {
        markAsChanged("URGENCIA", urgencia);
        this.urgencia = urgencia;
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
        this.setOriginalVO(vo);
        this.contato = vo.asString("CONTATO");
        this.descricao = vo.asString("DESCRICAO");
        this.dhChamada = vo.asTimestamp("DHCHAMADA");
        this.dhFechamentoSla = vo.asTimestamp("DHFECHAMENTOSLA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codParcAtend = vo.asBigDecimal("CODPARCATEND");
        this.codPla = vo.asBigDecimal("CODPLA");
        this.bairro = vo.asString("BAIRRO");
        this.cidade = vo.asString("CIDADE");
        this.codAtend = vo.asBigDecimal("CODATEND");
        this.codBem = vo.asString("CODBEM");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
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
        this.modeloVisivelAppOs = vo.asString("MODELOVISIVELAPPOS");
        this.codProcMaHa = vo.asBigDecimal("CODPROCMAHA");
        this.impacto = vo.asString("IMPACTO");
        this.urgencia = vo.asString("URGENCIA");
        return this;
   }
}
