package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemOrdemServico implements SankhyaEntity<ItemOrdemServico> {

   private String classificacao;
   private String cobrar;
   private BigDecimal codCencusPad;
   private BigDecimal codEpv;
   private BigDecimal codOcorOs;
   private BigDecimal codProd;
   private BigDecimal codProj;
   private BigDecimal codReq;
   private BigDecimal codServ;
   private BigDecimal codServRaiz;
   private BigDecimal codSit;
   private BigDecimal codUnnExec;
   private BigDecimal codUnnOs;
   private BigDecimal codUsu;
   private BigDecimal codUsuAlter;
   private BigDecimal codUsuRem;
   private BigDecimal codVend;
   private BigDecimal completude;
   private BigDecimal contadorFluxo;
   private BigDecimal corSla;
   private String descrCencus;
   private String descServ;
   private Timestamp dhEmailVal;
   private Timestamp dhEntrada;
   private Timestamp dhLimiteSla;
   private Timestamp dhPrevista;
   private Timestamp dhValidacao;
   private Timestamp dtAlter;
   private Timestamp dtPrevFechamento;
   private String executante;
   private BigDecimal grauDific;
   private BigDecimal hrFinal;
   private BigDecimal hrInicial;
   private Timestamp inicExec;
   private BigDecimal intervalo;
   private String liberado;
   private BigDecimal numEtapa;
   private BigDecimal numFluxo;
   private BigDecimal numItem;
   private BigDecimal numOs;
   private BigDecimal prioridade;
   private BigDecimal produtividade;
   private BigDecimal qtdHora;
   private BigDecimal qtdHoraBonif;
   private BigDecimal qtdHoraComBonif;
   private BigDecimal qtdHoraExt;
   private BigDecimal qtdHoraExtBonif;
   private BigDecimal qtdHoraExtComBonif;
   private BigDecimal qtdServ;
   private String retrabalho;
   private BigDecimal seqFluxo;
   private String serie;
   private String solucao;
   private BigDecimal tempGasto;
   private BigDecimal tempoGastoSlaProc;
   private BigDecimal tempoGastoSlaSub;
   private Timestamp tempPrevisto;
   private Timestamp termExec;
   private String tipo;
   private String tipoOs;
   private BigDecimal turno;
   private BigDecimal vlrCobrado;
   private BigDecimal vlrComissao;
   private BigDecimal vlrHoraCom;
   private BigDecimal vlrHoraExtCom;
   private BigDecimal vlrHoraExtFat;
   private BigDecimal vlrHoraFat;
   private BigDecimal nuNegociacao;
   private BigDecimal nuNota;
   private Timestamp dhPauseApp;

   public String getClassificacao() {
        return classificacao;
   }

   public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
   }

   public String getCobrar() {
        return cobrar;
   }

   public void setCobrar(String cobrar) {
        this.cobrar = cobrar;
   }

   public BigDecimal getCodCencusPad() {
        return codCencusPad;
   }

   public void setCodCencusPad(BigDecimal codCencusPad) {
        this.codCencusPad = codCencusPad;
   }

   public BigDecimal getCodEpv() {
        return codEpv;
   }

   public void setCodEpv(BigDecimal codEpv) {
        this.codEpv = codEpv;
   }

   public BigDecimal getCodOcorOs() {
        return codOcorOs;
   }

   public void setCodOcorOs(BigDecimal codOcorOs) {
        this.codOcorOs = codOcorOs;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodReq() {
        return codReq;
   }

   public void setCodReq(BigDecimal codReq) {
        this.codReq = codReq;
   }

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        this.codServ = codServ;
   }

   public BigDecimal getCodServRaiz() {
        return codServRaiz;
   }

   public void setCodServRaiz(BigDecimal codServRaiz) {
        this.codServRaiz = codServRaiz;
   }

   public BigDecimal getCodSit() {
        return codSit;
   }

   public void setCodSit(BigDecimal codSit) {
        this.codSit = codSit;
   }

   public BigDecimal getCodUnnExec() {
        return codUnnExec;
   }

   public void setCodUnnExec(BigDecimal codUnnExec) {
        this.codUnnExec = codUnnExec;
   }

   public BigDecimal getCodUnnOs() {
        return codUnnOs;
   }

   public void setCodUnnOs(BigDecimal codUnnOs) {
        this.codUnnOs = codUnnOs;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getCodUsuRem() {
        return codUsuRem;
   }

   public void setCodUsuRem(BigDecimal codUsuRem) {
        this.codUsuRem = codUsuRem;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getCompletude() {
        return completude;
   }

   public void setCompletude(BigDecimal completude) {
        this.completude = completude;
   }

   public BigDecimal getContadorFluxo() {
        return contadorFluxo;
   }

   public void setContadorFluxo(BigDecimal contadorFluxo) {
        this.contadorFluxo = contadorFluxo;
   }

   public BigDecimal getCorSla() {
        return corSla;
   }

   public void setCorSla(BigDecimal corSla) {
        this.corSla = corSla;
   }

   public String getDescrCencus() {
        return descrCencus;
   }

   public void setDescrCencus(String descrCencus) {
        this.descrCencus = descrCencus;
   }

   public String getDescServ() {
        return descServ;
   }

   public void setDescServ(String descServ) {
        this.descServ = descServ;
   }

   public Timestamp getDhEmailVal() {
        return dhEmailVal;
   }

   public void setDhEmailVal(Timestamp dhEmailVal) {
        this.dhEmailVal = dhEmailVal;
   }

   public Timestamp getDhEntrada() {
        return dhEntrada;
   }

   public void setDhEntrada(Timestamp dhEntrada) {
        this.dhEntrada = dhEntrada;
   }

   public Timestamp getDhLimiteSla() {
        return dhLimiteSla;
   }

   public void setDhLimiteSla(Timestamp dhLimiteSla) {
        this.dhLimiteSla = dhLimiteSla;
   }

   public Timestamp getDhPrevista() {
        return dhPrevista;
   }

   public void setDhPrevista(Timestamp dhPrevista) {
        this.dhPrevista = dhPrevista;
   }

   public Timestamp getDhValidacao() {
        return dhValidacao;
   }

   public void setDhValidacao(Timestamp dhValidacao) {
        this.dhValidacao = dhValidacao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtPrevFechamento() {
        return dtPrevFechamento;
   }

   public void setDtPrevFechamento(Timestamp dtPrevFechamento) {
        this.dtPrevFechamento = dtPrevFechamento;
   }

   public String getExecutante() {
        return executante;
   }

   public void setExecutante(String executante) {
        this.executante = executante;
   }

   public BigDecimal getGrauDific() {
        return grauDific;
   }

   public void setGrauDific(BigDecimal grauDific) {
        this.grauDific = grauDific;
   }

   public BigDecimal getHrFinal() {
        return hrFinal;
   }

   public void setHrFinal(BigDecimal hrFinal) {
        this.hrFinal = hrFinal;
   }

   public BigDecimal getHrInicial() {
        return hrInicial;
   }

   public void setHrInicial(BigDecimal hrInicial) {
        this.hrInicial = hrInicial;
   }

   public Timestamp getInicExec() {
        return inicExec;
   }

   public void setInicExec(Timestamp inicExec) {
        this.inicExec = inicExec;
   }

   public BigDecimal getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(BigDecimal intervalo) {
        this.intervalo = intervalo;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        this.liberado = liberado;
   }

   public BigDecimal getNumEtapa() {
        return numEtapa;
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        this.numEtapa = numEtapa;
   }

   public BigDecimal getNumFluxo() {
        return numFluxo;
   }

   public void setNumFluxo(BigDecimal numFluxo) {
        this.numFluxo = numFluxo;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   public BigDecimal getProdutividade() {
        return produtividade;
   }

   public void setProdutividade(BigDecimal produtividade) {
        this.produtividade = produtividade;
   }

   public BigDecimal getQtdHora() {
        return qtdHora;
   }

   public void setQtdHora(BigDecimal qtdHora) {
        this.qtdHora = qtdHora;
   }

   public BigDecimal getQtdHoraBonif() {
        return qtdHoraBonif;
   }

   public void setQtdHoraBonif(BigDecimal qtdHoraBonif) {
        this.qtdHoraBonif = qtdHoraBonif;
   }

   public BigDecimal getQtdHoraComBonif() {
        return qtdHoraComBonif;
   }

   public void setQtdHoraComBonif(BigDecimal qtdHoraComBonif) {
        this.qtdHoraComBonif = qtdHoraComBonif;
   }

   public BigDecimal getQtdHoraExt() {
        return qtdHoraExt;
   }

   public void setQtdHoraExt(BigDecimal qtdHoraExt) {
        this.qtdHoraExt = qtdHoraExt;
   }

   public BigDecimal getQtdHoraExtBonif() {
        return qtdHoraExtBonif;
   }

   public void setQtdHoraExtBonif(BigDecimal qtdHoraExtBonif) {
        this.qtdHoraExtBonif = qtdHoraExtBonif;
   }

   public BigDecimal getQtdHoraExtComBonif() {
        return qtdHoraExtComBonif;
   }

   public void setQtdHoraExtComBonif(BigDecimal qtdHoraExtComBonif) {
        this.qtdHoraExtComBonif = qtdHoraExtComBonif;
   }

   public BigDecimal getQtdServ() {
        return qtdServ;
   }

   public void setQtdServ(BigDecimal qtdServ) {
        this.qtdServ = qtdServ;
   }

   public String getRetrabalho() {
        return retrabalho;
   }

   public void setRetrabalho(String retrabalho) {
        this.retrabalho = retrabalho;
   }

   public BigDecimal getSeqFluxo() {
        return seqFluxo;
   }

   public void setSeqFluxo(BigDecimal seqFluxo) {
        this.seqFluxo = seqFluxo;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public String getSolucao() {
        return solucao;
   }

   public void setSolucao(String solucao) {
        this.solucao = solucao;
   }

   public BigDecimal getTempGasto() {
        return tempGasto;
   }

   public void setTempGasto(BigDecimal tempGasto) {
        this.tempGasto = tempGasto;
   }

   public BigDecimal getTempoGastoSlaProc() {
        return tempoGastoSlaProc;
   }

   public void setTempoGastoSlaProc(BigDecimal tempoGastoSlaProc) {
        this.tempoGastoSlaProc = tempoGastoSlaProc;
   }

   public BigDecimal getTempoGastoSlaSub() {
        return tempoGastoSlaSub;
   }

   public void setTempoGastoSlaSub(BigDecimal tempoGastoSlaSub) {
        this.tempoGastoSlaSub = tempoGastoSlaSub;
   }

   public Timestamp getTempPrevisto() {
        return tempPrevisto;
   }

   public void setTempPrevisto(Timestamp tempPrevisto) {
        this.tempPrevisto = tempPrevisto;
   }

   public Timestamp getTermExec() {
        return termExec;
   }

   public void setTermExec(Timestamp termExec) {
        this.termExec = termExec;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipoOs() {
        return tipoOs;
   }

   public void setTipoOs(String tipoOs) {
        this.tipoOs = tipoOs;
   }

   public BigDecimal getTurno() {
        return turno;
   }

   public void setTurno(BigDecimal turno) {
        this.turno = turno;
   }

   public BigDecimal getVlrCobrado() {
        return vlrCobrado;
   }

   public void setVlrCobrado(BigDecimal vlrCobrado) {
        this.vlrCobrado = vlrCobrado;
   }

   public BigDecimal getVlrComissao() {
        return vlrComissao;
   }

   public void setVlrComissao(BigDecimal vlrComissao) {
        this.vlrComissao = vlrComissao;
   }

   public BigDecimal getVlrHoraCom() {
        return vlrHoraCom;
   }

   public void setVlrHoraCom(BigDecimal vlrHoraCom) {
        this.vlrHoraCom = vlrHoraCom;
   }

   public BigDecimal getVlrHoraExtCom() {
        return vlrHoraExtCom;
   }

   public void setVlrHoraExtCom(BigDecimal vlrHoraExtCom) {
        this.vlrHoraExtCom = vlrHoraExtCom;
   }

   public BigDecimal getVlrHoraExtFat() {
        return vlrHoraExtFat;
   }

   public void setVlrHoraExtFat(BigDecimal vlrHoraExtFat) {
        this.vlrHoraExtFat = vlrHoraExtFat;
   }

   public BigDecimal getVlrHoraFat() {
        return vlrHoraFat;
   }

   public void setVlrHoraFat(BigDecimal vlrHoraFat) {
        this.vlrHoraFat = vlrHoraFat;
   }

   public BigDecimal getNuNegociacao() {
        return nuNegociacao;
   }

   public void setNuNegociacao(BigDecimal nuNegociacao) {
        this.nuNegociacao = nuNegociacao;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public Timestamp getDhPauseApp() {
        return dhPauseApp;
   }

   public void setDhPauseApp(Timestamp dhPauseApp) {
        this.dhPauseApp = dhPauseApp;
   }

   @Override
   public String getEntityName() {
        return "ItemOrdemServico";
   }

   @Override
   public ItemOrdemServico fromVO(DynamicVO vo) {
        this.classificacao = vo.asString("CLASSIFICACAO");
        this.cobrar = vo.asString("COBRAR");
        this.codCencusPad = vo.asBigDecimal("CODCENCUSPAD");
        this.codEpv = vo.asBigDecimal("CODEPV");
        this.codOcorOs = vo.asBigDecimal("CODOCOROS");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codReq = vo.asBigDecimal("CODREQ");
        this.codServ = vo.asBigDecimal("CODSERV");
        this.codServRaiz = vo.asBigDecimal("CODSERVRAIZ");
        this.codSit = vo.asBigDecimal("CODSIT");
        this.codUnnExec = vo.asBigDecimal("CODUNNEXEC");
        this.codUnnOs = vo.asBigDecimal("CODUNNOS");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuRem = vo.asBigDecimal("CODUSUREM");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.completude = vo.asBigDecimal("COMPLETUDE");
        this.contadorFluxo = vo.asBigDecimal("CONTADORFLUXO");
        this.corSla = vo.asBigDecimal("CORSLA");
        this.descrCencus = vo.asString("DESCRCENCUS");
        this.descServ = vo.asString("DESCSERV");
        this.dhEmailVal = vo.asTimestamp("DHEMAILVAL");
        this.dhEntrada = vo.asTimestamp("DHENTRADA");
        this.dhLimiteSla = vo.asTimestamp("DHLIMITESLA");
        this.dhPrevista = vo.asTimestamp("DHPREVISTA");
        this.dhValidacao = vo.asTimestamp("DHVALIDACAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtPrevFechamento = vo.asTimestamp("DTPREVFECHAMENTO");
        this.executante = vo.asString("EXECUTANTE");
        this.grauDific = vo.asBigDecimal("GRAUDIFIC");
        this.hrFinal = vo.asBigDecimal("HRFINAL");
        this.hrInicial = vo.asBigDecimal("HRINICIAL");
        this.inicExec = vo.asTimestamp("INICEXEC");
        this.intervalo = vo.asBigDecimal("INTERVALO");
        this.liberado = vo.asString("LIBERADO");
        this.numEtapa = vo.asBigDecimal("NUMETAPA");
        this.numFluxo = vo.asBigDecimal("NUMFLUXO");
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.produtividade = vo.asBigDecimal("PRODUTIVIDADE");
        this.qtdHora = vo.asBigDecimal("QTDHORA");
        this.qtdHoraBonif = vo.asBigDecimal("QTDHORABONIF");
        this.qtdHoraComBonif = vo.asBigDecimal("QTDHORACOMBONIF");
        this.qtdHoraExt = vo.asBigDecimal("QTDHORAEXT");
        this.qtdHoraExtBonif = vo.asBigDecimal("QTDHORAEXTBONIF");
        this.qtdHoraExtComBonif = vo.asBigDecimal("QTDHORAEXTCOMBONIF");
        this.qtdServ = vo.asBigDecimal("QTDSERV");
        this.retrabalho = vo.asString("RETRABALHO");
        this.seqFluxo = vo.asBigDecimal("SEQFLUXO");
        this.serie = vo.asString("SERIE");
        this.solucao = vo.asString("SOLUCAO");
        this.tempGasto = vo.asBigDecimal("TEMPGASTO");
        this.tempoGastoSlaProc = vo.asBigDecimal("TEMPOGASTOSLAPROC");
        this.tempoGastoSlaSub = vo.asBigDecimal("TEMPOGASTOSLASUB");
        this.tempPrevisto = vo.asTimestamp("TEMPPREVISTO");
        this.termExec = vo.asTimestamp("TERMEXEC");
        this.tipo = vo.asString("TIPO");
        this.tipoOs = vo.asString("TIPOOS");
        this.turno = vo.asBigDecimal("TURNO");
        this.vlrCobrado = vo.asBigDecimal("VLRCOBRADO");
        this.vlrComissao = vo.asBigDecimal("VLRCOMISSAO");
        this.vlrHoraCom = vo.asBigDecimal("VLRHORACOM");
        this.vlrHoraExtCom = vo.asBigDecimal("VLRHORAEXTCOM");
        this.vlrHoraExtFat = vo.asBigDecimal("VLRHORAEXTFAT");
        this.vlrHoraFat = vo.asBigDecimal("VLRHORAFAT");
        this.nuNegociacao = vo.asBigDecimal("NUNEGOCIACAO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.dhPauseApp = vo.asTimestamp("DHPAUSEAPP");
        return this;
   }
}
