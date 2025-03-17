package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Atividade extends AbstractSankhyaEntity<Atividade> {
   private String tipoConferencia;
   private String concluIcq;
   private String usaSeqCodBar;
   private String sepSeqCodBar;
   private BigDecimal idProc;
   private String execTerceiro;
   private BigDecimal codUsuLogon;
   private String liberarWcManual;
   private String listaMpPadrao;
   private String operCq;
   private String permiteNovoPa;
   private String permiteParcial;
   private String qtdBaseApon;
   private BigDecimal tempoAtividade;
   private String tipoReprocesso;
   private String unTempo;
   private String validaCq;
   private BigDecimal idAwc;
   private BigDecimal idCcq;
   private BigDecimal idEfx;
   private BigDecimal idRpadEst;
   private BigDecimal idRpaOper;
   private String inicializarPa;
   private String liberarWcFinal;
   private String altStatusProc;
   private String apontaComp;
   private String apontaMp;
   private String apontaPa;
   private String apontaSp;
   private BigDecimal codPrcSub;
   private String apontaRecWc;
   private BigDecimal codMtpFinTurno;
   private String multiTurno;
   private String contCumulativa;
   private String subApoPorConf;
   private BigDecimal qtdConfiguais;
   private BigDecimal qtdRecontagens;
   private String tipoTempo;
   private String proibeApont;
   private String seqExecucao;
   private String descricao;
   private String permitePerdaTotal;
   private String setup;
   private String aprovarStatusLote;
   private String dataHoraApontamento;
   private String geraMlaudo;
   private String permiteAltLocMp;

   public String getTipoConferencia() {
        return tipoConferencia;
   }

   public void setTipoConferencia(String tipoConferencia) {
        this.tipoConferencia = tipoConferencia;
   }

   public String getConcluIcq() {
        return concluIcq;
   }

   public void setConcluIcq(String concluIcq) {
        this.concluIcq = concluIcq;
   }

   public String getUsaSeqCodBar() {
        return usaSeqCodBar;
   }

   public void setUsaSeqCodBar(String usaSeqCodBar) {
        this.usaSeqCodBar = usaSeqCodBar;
   }

   public String getSepSeqCodBar() {
        return sepSeqCodBar;
   }

   public void setSepSeqCodBar(String sepSeqCodBar) {
        this.sepSeqCodBar = sepSeqCodBar;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public String getExecTerceiro() {
        return execTerceiro;
   }

   public void setExecTerceiro(String execTerceiro) {
        this.execTerceiro = execTerceiro;
   }

   public BigDecimal getCodUsuLogon() {
        return codUsuLogon;
   }

   public void setCodUsuLogon(BigDecimal codUsuLogon) {
        this.codUsuLogon = codUsuLogon;
   }

   public String getLiberarWcManual() {
        return liberarWcManual;
   }

   public void setLiberarWcManual(String liberarWcManual) {
        this.liberarWcManual = liberarWcManual;
   }

   public String getListaMpPadrao() {
        return listaMpPadrao;
   }

   public void setListaMpPadrao(String listaMpPadrao) {
        this.listaMpPadrao = listaMpPadrao;
   }

   public String getOperCq() {
        return operCq;
   }

   public void setOperCq(String operCq) {
        this.operCq = operCq;
   }

   public String getPermiteNovoPa() {
        return permiteNovoPa;
   }

   public void setPermiteNovoPa(String permiteNovoPa) {
        this.permiteNovoPa = permiteNovoPa;
   }

   public String getPermiteParcial() {
        return permiteParcial;
   }

   public void setPermiteParcial(String permiteParcial) {
        this.permiteParcial = permiteParcial;
   }

   public String getQtdBaseApon() {
        return qtdBaseApon;
   }

   public void setQtdBaseApon(String qtdBaseApon) {
        this.qtdBaseApon = qtdBaseApon;
   }

   public BigDecimal getTempoAtividade() {
        return tempoAtividade;
   }

   public void setTempoAtividade(BigDecimal tempoAtividade) {
        this.tempoAtividade = tempoAtividade;
   }

   public String getTipoReprocesso() {
        return tipoReprocesso;
   }

   public void setTipoReprocesso(String tipoReprocesso) {
        this.tipoReprocesso = tipoReprocesso;
   }

   public String getUnTempo() {
        return unTempo;
   }

   public void setUnTempo(String unTempo) {
        this.unTempo = unTempo;
   }

   public String getValidaCq() {
        return validaCq;
   }

   public void setValidaCq(String validaCq) {
        this.validaCq = validaCq;
   }

   public BigDecimal getIdAwc() {
        return idAwc;
   }

   public void setIdAwc(BigDecimal idAwc) {
        this.idAwc = idAwc;
   }

   public BigDecimal getIdCcq() {
        return idCcq;
   }

   public void setIdCcq(BigDecimal idCcq) {
        this.idCcq = idCcq;
   }

   public BigDecimal getIdEfx() {
        return idEfx;
   }

   public void setIdEfx(BigDecimal idEfx) {
        this.idEfx = idEfx;
   }

   public BigDecimal getIdRpadEst() {
        return idRpadEst;
   }

   public void setIdRpadEst(BigDecimal idRpadEst) {
        this.idRpadEst = idRpadEst;
   }

   public BigDecimal getIdRpaOper() {
        return idRpaOper;
   }

   public void setIdRpaOper(BigDecimal idRpaOper) {
        this.idRpaOper = idRpaOper;
   }

   public String getInicializarPa() {
        return inicializarPa;
   }

   public void setInicializarPa(String inicializarPa) {
        this.inicializarPa = inicializarPa;
   }

   public String getLiberarWcFinal() {
        return liberarWcFinal;
   }

   public void setLiberarWcFinal(String liberarWcFinal) {
        this.liberarWcFinal = liberarWcFinal;
   }

   public String getAltStatusProc() {
        return altStatusProc;
   }

   public void setAltStatusProc(String altStatusProc) {
        this.altStatusProc = altStatusProc;
   }

   public String getApontaComp() {
        return apontaComp;
   }

   public void setApontaComp(String apontaComp) {
        this.apontaComp = apontaComp;
   }

   public String getApontaMp() {
        return apontaMp;
   }

   public void setApontaMp(String apontaMp) {
        this.apontaMp = apontaMp;
   }

   public String getApontaPa() {
        return apontaPa;
   }

   public void setApontaPa(String apontaPa) {
        this.apontaPa = apontaPa;
   }

   public String getApontaSp() {
        return apontaSp;
   }

   public void setApontaSp(String apontaSp) {
        this.apontaSp = apontaSp;
   }

   public BigDecimal getCodPrcSub() {
        return codPrcSub;
   }

   public void setCodPrcSub(BigDecimal codPrcSub) {
        this.codPrcSub = codPrcSub;
   }

   public String getApontaRecWc() {
        return apontaRecWc;
   }

   public void setApontaRecWc(String apontaRecWc) {
        this.apontaRecWc = apontaRecWc;
   }

   public BigDecimal getCodMtpFinTurno() {
        return codMtpFinTurno;
   }

   public void setCodMtpFinTurno(BigDecimal codMtpFinTurno) {
        this.codMtpFinTurno = codMtpFinTurno;
   }

   public String getMultiTurno() {
        return multiTurno;
   }

   public void setMultiTurno(String multiTurno) {
        this.multiTurno = multiTurno;
   }

   public String getContCumulativa() {
        return contCumulativa;
   }

   public void setContCumulativa(String contCumulativa) {
        this.contCumulativa = contCumulativa;
   }

   public String getSubApoPorConf() {
        return subApoPorConf;
   }

   public void setSubApoPorConf(String subApoPorConf) {
        this.subApoPorConf = subApoPorConf;
   }

   public BigDecimal getQtdConfiguais() {
        return qtdConfiguais;
   }

   public void setQtdConfiguais(BigDecimal qtdConfiguais) {
        this.qtdConfiguais = qtdConfiguais;
   }

   public BigDecimal getQtdRecontagens() {
        return qtdRecontagens;
   }

   public void setQtdRecontagens(BigDecimal qtdRecontagens) {
        this.qtdRecontagens = qtdRecontagens;
   }

   public String getTipoTempo() {
        return tipoTempo;
   }

   public void setTipoTempo(String tipoTempo) {
        this.tipoTempo = tipoTempo;
   }

   public String getProibeApont() {
        return proibeApont;
   }

   public void setProibeApont(String proibeApont) {
        this.proibeApont = proibeApont;
   }

   public String getSeqExecucao() {
        return seqExecucao;
   }

   public void setSeqExecucao(String seqExecucao) {
        this.seqExecucao = seqExecucao;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getPermitePerdaTotal() {
        return permitePerdaTotal;
   }

   public void setPermitePerdaTotal(String permitePerdaTotal) {
        this.permitePerdaTotal = permitePerdaTotal;
   }

   public String getSetup() {
        return setup;
   }

   public void setSetup(String setup) {
        this.setup = setup;
   }

   public String getAprovarStatusLote() {
        return aprovarStatusLote;
   }

   public void setAprovarStatusLote(String aprovarStatusLote) {
        this.aprovarStatusLote = aprovarStatusLote;
   }

   public String getDataHoraApontamento() {
        return dataHoraApontamento;
   }

   public void setDataHoraApontamento(String dataHoraApontamento) {
        this.dataHoraApontamento = dataHoraApontamento;
   }

   public String getGeraMlaudo() {
        return geraMlaudo;
   }

   public void setGeraMlaudo(String geraMlaudo) {
        this.geraMlaudo = geraMlaudo;
   }

   public String getPermiteAltLocMp() {
        return permiteAltLocMp;
   }

   public void setPermiteAltLocMp(String permiteAltLocMp) {
        this.permiteAltLocMp = permiteAltLocMp;
   }

   @Override
   public String getTableName() {
        return "TPRATV";
   }

   @Override
   public String getEntityName() {
        return "Atividade";
   }

   @Override
   public Atividade fromVO(DynamicVO vo) {
        this.tipoConferencia = vo.asString("TIPOCONFERENCIA");
        this.concluIcq = vo.asString("CONCLUICQ");
        this.usaSeqCodBar = vo.asString("USASEQCODBAR");
        this.sepSeqCodBar = vo.asString("SEPSEQCODBAR");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.execTerceiro = vo.asString("EXECTERCEIRO");
        this.codUsuLogon = vo.asBigDecimal("CODUSULOGON");
        this.liberarWcManual = vo.asString("LIBERARWCMANUAL");
        this.listaMpPadrao = vo.asString("LISTAMPPADRAO");
        this.operCq = vo.asString("OPERCQ");
        this.permiteNovoPa = vo.asString("PERMITENOVOPA");
        this.permiteParcial = vo.asString("PERMITEPARCIAL");
        this.qtdBaseApon = vo.asString("QTDBASEAPON");
        this.tempoAtividade = vo.asBigDecimal("TEMPOATIVIDADE");
        this.tipoReprocesso = vo.asString("TIPOREPROCESSO");
        this.unTempo = vo.asString("UNTEMPO");
        this.validaCq = vo.asString("VALIDACQ");
        this.idAwc = vo.asBigDecimal("IDAWC");
        this.idCcq = vo.asBigDecimal("IDCCQ");
        this.idEfx = vo.asBigDecimal("IDEFX");
        this.idRpadEst = vo.asBigDecimal("IDRPADEST");
        this.idRpaOper = vo.asBigDecimal("IDRPAOPER");
        this.inicializarPa = vo.asString("INICIALIZARPA");
        this.liberarWcFinal = vo.asString("LIBERARWCFINAL");
        this.altStatusProc = vo.asString("ALTSTATUSPROC");
        this.apontaComp = vo.asString("APONTACOMP");
        this.apontaMp = vo.asString("APONTAMP");
        this.apontaPa = vo.asString("APONTAPA");
        this.apontaSp = vo.asString("APONTASP");
        this.codPrcSub = vo.asBigDecimal("CODPRCSUB");
        this.apontaRecWc = vo.asString("APONTARECWC");
        this.codMtpFinTurno = vo.asBigDecimal("CODMTPFINTURNO");
        this.multiTurno = vo.asString("MULTITURNO");
        this.contCumulativa = vo.asString("CONTCUMULATIVA");
        this.subApoPorConf = vo.asString("SUBAPOPORCONF");
        this.qtdConfiguais = vo.asBigDecimal("QTDCONFIGUAIS");
        this.qtdRecontagens = vo.asBigDecimal("QTDRECONTAGENS");
        this.tipoTempo = vo.asString("TIPOTEMPO");
        this.proibeApont = vo.asString("PROIBEAPONT");
        this.seqExecucao = vo.asString("SEQEXECUCAO");
        this.descricao = vo.asString("DESCRICAO");
        this.permitePerdaTotal = vo.asString("PERMITEPERDATOTAL");
        this.setup = vo.asString("SETUP");
        this.aprovarStatusLote = vo.asString("APROVARSTATUSLOTE");
        this.dataHoraApontamento = vo.asString("DATAHORAAPONTAMENTO");
        this.geraMlaudo = vo.asString("GERAMLAUDO");
        this.permiteAltLocMp = vo.asString("PERMITEALTLOCMP");
        return this;
   }
}
