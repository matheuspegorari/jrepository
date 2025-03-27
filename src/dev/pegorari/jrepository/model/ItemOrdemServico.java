package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemOrdemServico extends AbstractSankhyaEntity<ItemOrdemServico> {
   public String getClassificacao() {
        return this.getVo().asString("CLASSIFICACAO");
   }

   public void setClassificacao(String classificacao) {
        markAsChanged("CLASSIFICACAO", classificacao);
   }

   public String getCobrar() {
        return this.getVo().asString("COBRAR");
   }

   public void setCobrar(String cobrar) {
        markAsChanged("COBRAR", cobrar);
   }

   public BigDecimal getCodCencusPad() {
        return this.getVo().asBigDecimal("CODCENCUSPAD");
   }

   public void setCodCencusPad(BigDecimal codCencusPad) {
        markAsChanged("CODCENCUSPAD", codCencusPad);
   }

   public BigDecimal getCodEpv() {
        return this.getVo().asBigDecimal("CODEPV");
   }

   public void setCodEpv(BigDecimal codEpv) {
        markAsChanged("CODEPV", codEpv);
   }

   public BigDecimal getCodOcorOs() {
        return this.getVo().asBigDecimal("CODOCOROS");
   }

   public void setCodOcorOs(BigDecimal codOcorOs) {
        markAsChanged("CODOCOROS", codOcorOs);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodReq() {
        return this.getVo().asBigDecimal("CODREQ");
   }

   public void setCodReq(BigDecimal codReq) {
        markAsChanged("CODREQ", codReq);
   }

   public BigDecimal getCodServ() {
        return this.getVo().asBigDecimal("CODSERV");
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
   }

   public BigDecimal getCodServRaiz() {
        return this.getVo().asBigDecimal("CODSERVRAIZ");
   }

   public void setCodServRaiz(BigDecimal codServRaiz) {
        markAsChanged("CODSERVRAIZ", codServRaiz);
   }

   public BigDecimal getCodSit() {
        return this.getVo().asBigDecimal("CODSIT");
   }

   public void setCodSit(BigDecimal codSit) {
        markAsChanged("CODSIT", codSit);
   }

   public BigDecimal getCodUnnExec() {
        return this.getVo().asBigDecimal("CODUNNEXEC");
   }

   public void setCodUnnExec(BigDecimal codUnnExec) {
        markAsChanged("CODUNNEXEC", codUnnExec);
   }

   public BigDecimal getCodUnnOs() {
        return this.getVo().asBigDecimal("CODUNNOS");
   }

   public void setCodUnnOs(BigDecimal codUnnOs) {
        markAsChanged("CODUNNOS", codUnnOs);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public BigDecimal getCodUsuRem() {
        return this.getVo().asBigDecimal("CODUSUREM");
   }

   public void setCodUsuRem(BigDecimal codUsuRem) {
        markAsChanged("CODUSUREM", codUsuRem);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getCompletude() {
        return this.getVo().asBigDecimal("COMPLETUDE");
   }

   public void setCompletude(BigDecimal completude) {
        markAsChanged("COMPLETUDE", completude);
   }

   public BigDecimal getContadorFluxo() {
        return this.getVo().asBigDecimal("CONTADORFLUXO");
   }

   public void setContadorFluxo(BigDecimal contadorFluxo) {
        markAsChanged("CONTADORFLUXO", contadorFluxo);
   }

   public BigDecimal getCorSla() {
        return this.getVo().asBigDecimal("CORSLA");
   }

   public void setCorSla(BigDecimal corSla) {
        markAsChanged("CORSLA", corSla);
   }

   public String getDescrCencus() {
        return this.getVo().asString("DESCRCENCUS");
   }

   public void setDescrCencus(String descrCencus) {
        markAsChanged("DESCRCENCUS", descrCencus);
   }

   public String getDescServ() {
        return this.getVo().asString("DESCSERV");
   }

   public void setDescServ(String descServ) {
        markAsChanged("DESCSERV", descServ);
   }

   public Timestamp getDhEmailVal() {
        return this.getVo().asTimestamp("DHEMAILVAL");
   }

   public void setDhEmailVal(Timestamp dhEmailVal) {
        markAsChanged("DHEMAILVAL", dhEmailVal);
   }

   public Timestamp getDhEntrada() {
        return this.getVo().asTimestamp("DHENTRADA");
   }

   public void setDhEntrada(Timestamp dhEntrada) {
        markAsChanged("DHENTRADA", dhEntrada);
   }

   public Timestamp getDhLimiteSla() {
        return this.getVo().asTimestamp("DHLIMITESLA");
   }

   public void setDhLimiteSla(Timestamp dhLimiteSla) {
        markAsChanged("DHLIMITESLA", dhLimiteSla);
   }

   public Timestamp getDhPrevista() {
        return this.getVo().asTimestamp("DHPREVISTA");
   }

   public void setDhPrevista(Timestamp dhPrevista) {
        markAsChanged("DHPREVISTA", dhPrevista);
   }

   public Timestamp getDhValidacao() {
        return this.getVo().asTimestamp("DHVALIDACAO");
   }

   public void setDhValidacao(Timestamp dhValidacao) {
        markAsChanged("DHVALIDACAO", dhValidacao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtPrevFechamento() {
        return this.getVo().asTimestamp("DTPREVFECHAMENTO");
   }

   public void setDtPrevFechamento(Timestamp dtPrevFechamento) {
        markAsChanged("DTPREVFECHAMENTO", dtPrevFechamento);
   }

   public String getExecutante() {
        return this.getVo().asString("EXECUTANTE");
   }

   public void setExecutante(String executante) {
        markAsChanged("EXECUTANTE", executante);
   }

   public BigDecimal getGrauDific() {
        return this.getVo().asBigDecimal("GRAUDIFIC");
   }

   public void setGrauDific(BigDecimal grauDific) {
        markAsChanged("GRAUDIFIC", grauDific);
   }

   public BigDecimal getHrFinal() {
        return this.getVo().asBigDecimal("HRFINAL");
   }

   public void setHrFinal(BigDecimal hrFinal) {
        markAsChanged("HRFINAL", hrFinal);
   }

   public BigDecimal getHrInicial() {
        return this.getVo().asBigDecimal("HRINICIAL");
   }

   public void setHrInicial(BigDecimal hrInicial) {
        markAsChanged("HRINICIAL", hrInicial);
   }

   public Timestamp getInicExec() {
        return this.getVo().asTimestamp("INICEXEC");
   }

   public void setInicExec(Timestamp inicExec) {
        markAsChanged("INICEXEC", inicExec);
   }

   public BigDecimal getIntervalo() {
        return this.getVo().asBigDecimal("INTERVALO");
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
   }

   public String getLiberado() {
        return this.getVo().asString("LIBERADO");
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
   }

   public BigDecimal getNumEtapa() {
        return this.getVo().asBigDecimal("NUMETAPA");
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        markAsChanged("NUMETAPA", numEtapa);
   }

   public BigDecimal getNumFluxo() {
        return this.getVo().asBigDecimal("NUMFLUXO");
   }

   public void setNumFluxo(BigDecimal numFluxo) {
        markAsChanged("NUMFLUXO", numFluxo);
   }

   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getProdutividade() {
        return this.getVo().asBigDecimal("PRODUTIVIDADE");
   }

   public void setProdutividade(BigDecimal produtividade) {
        markAsChanged("PRODUTIVIDADE", produtividade);
   }

   public BigDecimal getQtdHora() {
        return this.getVo().asBigDecimal("QTDHORA");
   }

   public void setQtdHora(BigDecimal qtdHora) {
        markAsChanged("QTDHORA", qtdHora);
   }

   public BigDecimal getQtdHoraBonif() {
        return this.getVo().asBigDecimal("QTDHORABONIF");
   }

   public void setQtdHoraBonif(BigDecimal qtdHoraBonif) {
        markAsChanged("QTDHORABONIF", qtdHoraBonif);
   }

   public BigDecimal getQtdHoraComBonif() {
        return this.getVo().asBigDecimal("QTDHORACOMBONIF");
   }

   public void setQtdHoraComBonif(BigDecimal qtdHoraComBonif) {
        markAsChanged("QTDHORACOMBONIF", qtdHoraComBonif);
   }

   public BigDecimal getQtdHoraExt() {
        return this.getVo().asBigDecimal("QTDHORAEXT");
   }

   public void setQtdHoraExt(BigDecimal qtdHoraExt) {
        markAsChanged("QTDHORAEXT", qtdHoraExt);
   }

   public BigDecimal getQtdHoraExtBonif() {
        return this.getVo().asBigDecimal("QTDHORAEXTBONIF");
   }

   public void setQtdHoraExtBonif(BigDecimal qtdHoraExtBonif) {
        markAsChanged("QTDHORAEXTBONIF", qtdHoraExtBonif);
   }

   public BigDecimal getQtdHoraExtComBonif() {
        return this.getVo().asBigDecimal("QTDHORAEXTCOMBONIF");
   }

   public void setQtdHoraExtComBonif(BigDecimal qtdHoraExtComBonif) {
        markAsChanged("QTDHORAEXTCOMBONIF", qtdHoraExtComBonif);
   }

   public BigDecimal getQtdServ() {
        return this.getVo().asBigDecimal("QTDSERV");
   }

   public void setQtdServ(BigDecimal qtdServ) {
        markAsChanged("QTDSERV", qtdServ);
   }

   public String getRetrabalho() {
        return this.getVo().asString("RETRABALHO");
   }

   public void setRetrabalho(String retrabalho) {
        markAsChanged("RETRABALHO", retrabalho);
   }

   public BigDecimal getSeqFluxo() {
        return this.getVo().asBigDecimal("SEQFLUXO");
   }

   public void setSeqFluxo(BigDecimal seqFluxo) {
        markAsChanged("SEQFLUXO", seqFluxo);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getSolucao() {
        return this.getVo().asString("SOLUCAO");
   }

   public void setSolucao(String solucao) {
        markAsChanged("SOLUCAO", solucao);
   }

   public BigDecimal getTempGasto() {
        return this.getVo().asBigDecimal("TEMPGASTO");
   }

   public void setTempGasto(BigDecimal tempGasto) {
        markAsChanged("TEMPGASTO", tempGasto);
   }

   public BigDecimal getTempoGastoSlaProc() {
        return this.getVo().asBigDecimal("TEMPOGASTOSLAPROC");
   }

   public void setTempoGastoSlaProc(BigDecimal tempoGastoSlaProc) {
        markAsChanged("TEMPOGASTOSLAPROC", tempoGastoSlaProc);
   }

   public BigDecimal getTempoGastoSlaSub() {
        return this.getVo().asBigDecimal("TEMPOGASTOSLASUB");
   }

   public void setTempoGastoSlaSub(BigDecimal tempoGastoSlaSub) {
        markAsChanged("TEMPOGASTOSLASUB", tempoGastoSlaSub);
   }

   public Timestamp getTempPrevisto() {
        return this.getVo().asTimestamp("TEMPPREVISTO");
   }

   public void setTempPrevisto(Timestamp tempPrevisto) {
        markAsChanged("TEMPPREVISTO", tempPrevisto);
   }

   public Timestamp getTermExec() {
        return this.getVo().asTimestamp("TERMEXEC");
   }

   public void setTermExec(Timestamp termExec) {
        markAsChanged("TERMEXEC", termExec);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoOs() {
        return this.getVo().asString("TIPOOS");
   }

   public void setTipoOs(String tipoOs) {
        markAsChanged("TIPOOS", tipoOs);
   }

   public BigDecimal getTurno() {
        return this.getVo().asBigDecimal("TURNO");
   }

   public void setTurno(BigDecimal turno) {
        markAsChanged("TURNO", turno);
   }

   public BigDecimal getVlrCobrado() {
        return this.getVo().asBigDecimal("VLRCOBRADO");
   }

   public void setVlrCobrado(BigDecimal vlrCobrado) {
        markAsChanged("VLRCOBRADO", vlrCobrado);
   }

   public BigDecimal getVlrComissao() {
        return this.getVo().asBigDecimal("VLRCOMISSAO");
   }

   public void setVlrComissao(BigDecimal vlrComissao) {
        markAsChanged("VLRCOMISSAO", vlrComissao);
   }

   public BigDecimal getVlrHoraCom() {
        return this.getVo().asBigDecimal("VLRHORACOM");
   }

   public void setVlrHoraCom(BigDecimal vlrHoraCom) {
        markAsChanged("VLRHORACOM", vlrHoraCom);
   }

   public BigDecimal getVlrHoraExtCom() {
        return this.getVo().asBigDecimal("VLRHORAEXTCOM");
   }

   public void setVlrHoraExtCom(BigDecimal vlrHoraExtCom) {
        markAsChanged("VLRHORAEXTCOM", vlrHoraExtCom);
   }

   public BigDecimal getVlrHoraExtFat() {
        return this.getVo().asBigDecimal("VLRHORAEXTFAT");
   }

   public void setVlrHoraExtFat(BigDecimal vlrHoraExtFat) {
        markAsChanged("VLRHORAEXTFAT", vlrHoraExtFat);
   }

   public BigDecimal getVlrHoraFat() {
        return this.getVo().asBigDecimal("VLRHORAFAT");
   }

   public void setVlrHoraFat(BigDecimal vlrHoraFat) {
        markAsChanged("VLRHORAFAT", vlrHoraFat);
   }

   public BigDecimal getNuNegociacao() {
        return this.getVo().asBigDecimal("NUNEGOCIACAO");
   }

   public void setNuNegociacao(BigDecimal nuNegociacao) {
        markAsChanged("NUNEGOCIACAO", nuNegociacao);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public Timestamp getDhPauseApp() {
        return this.getVo().asTimestamp("DHPAUSEAPP");
   }

   public void setDhPauseApp(Timestamp dhPauseApp) {
        markAsChanged("DHPAUSEAPP", dhPauseApp);
   }

   @Override
   public String getTableName() {
        return "TCSITE";
   }

   @Override
   public String getEntityName() {
        return "ItemOrdemServico";
   }

   @Override
   public ItemOrdemServico fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
