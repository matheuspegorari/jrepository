package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Atividade extends AbstractSankhyaEntity<Atividade> {
   public String getTipoConferencia() {
        return this.getVo().asString("TIPOCONFERENCIA");
   }

   public void setTipoConferencia(String tipoConferencia) {
        markAsChanged("TIPOCONFERENCIA", tipoConferencia);
   }

   public String getConcluIcq() {
        return this.getVo().asString("CONCLUICQ");
   }

   public void setConcluIcq(String concluIcq) {
        markAsChanged("CONCLUICQ", concluIcq);
   }

   public String getUsaSeqCodBar() {
        return this.getVo().asString("USASEQCODBAR");
   }

   public void setUsaSeqCodBar(String usaSeqCodBar) {
        markAsChanged("USASEQCODBAR", usaSeqCodBar);
   }

   public String getSepSeqCodBar() {
        return this.getVo().asString("SEPSEQCODBAR");
   }

   public void setSepSeqCodBar(String sepSeqCodBar) {
        markAsChanged("SEPSEQCODBAR", sepSeqCodBar);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public String getExecTerceiro() {
        return this.getVo().asString("EXECTERCEIRO");
   }

   public void setExecTerceiro(String execTerceiro) {
        markAsChanged("EXECTERCEIRO", execTerceiro);
   }

   public BigDecimal getCodUsuLogon() {
        return this.getVo().asBigDecimal("CODUSULOGON");
   }

   public void setCodUsuLogon(BigDecimal codUsuLogon) {
        markAsChanged("CODUSULOGON", codUsuLogon);
   }

   public String getLiberarWcManual() {
        return this.getVo().asString("LIBERARWCMANUAL");
   }

   public void setLiberarWcManual(String liberarWcManual) {
        markAsChanged("LIBERARWCMANUAL", liberarWcManual);
   }

   public String getListaMpPadrao() {
        return this.getVo().asString("LISTAMPPADRAO");
   }

   public void setListaMpPadrao(String listaMpPadrao) {
        markAsChanged("LISTAMPPADRAO", listaMpPadrao);
   }

   public String getOperCq() {
        return this.getVo().asString("OPERCQ");
   }

   public void setOperCq(String operCq) {
        markAsChanged("OPERCQ", operCq);
   }

   public String getPermiteNovoPa() {
        return this.getVo().asString("PERMITENOVOPA");
   }

   public void setPermiteNovoPa(String permiteNovoPa) {
        markAsChanged("PERMITENOVOPA", permiteNovoPa);
   }

   public String getPermiteParcial() {
        return this.getVo().asString("PERMITEPARCIAL");
   }

   public void setPermiteParcial(String permiteParcial) {
        markAsChanged("PERMITEPARCIAL", permiteParcial);
   }

   public String getQtdBaseApon() {
        return this.getVo().asString("QTDBASEAPON");
   }

   public void setQtdBaseApon(String qtdBaseApon) {
        markAsChanged("QTDBASEAPON", qtdBaseApon);
   }

   public BigDecimal getTempoAtividade() {
        return this.getVo().asBigDecimal("TEMPOATIVIDADE");
   }

   public void setTempoAtividade(BigDecimal tempoAtividade) {
        markAsChanged("TEMPOATIVIDADE", tempoAtividade);
   }

   public String getTipoReprocesso() {
        return this.getVo().asString("TIPOREPROCESSO");
   }

   public void setTipoReprocesso(String tipoReprocesso) {
        markAsChanged("TIPOREPROCESSO", tipoReprocesso);
   }

   public String getUnTempo() {
        return this.getVo().asString("UNTEMPO");
   }

   public void setUnTempo(String unTempo) {
        markAsChanged("UNTEMPO", unTempo);
   }

   public String getValidaCq() {
        return this.getVo().asString("VALIDACQ");
   }

   public void setValidaCq(String validaCq) {
        markAsChanged("VALIDACQ", validaCq);
   }

   public BigDecimal getIdAwc() {
        return this.getVo().asBigDecimal("IDAWC");
   }

   public void setIdAwc(BigDecimal idAwc) {
        markAsChanged("IDAWC", idAwc);
   }

   public BigDecimal getIdCcq() {
        return this.getVo().asBigDecimal("IDCCQ");
   }

   public void setIdCcq(BigDecimal idCcq) {
        markAsChanged("IDCCQ", idCcq);
   }

   public BigDecimal getIdEfx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdEfx(BigDecimal idEfx) {
        markAsChanged("IDEFX", idEfx);
   }

   public BigDecimal getIdRpadEst() {
        return this.getVo().asBigDecimal("IDRPADEST");
   }

   public void setIdRpadEst(BigDecimal idRpadEst) {
        markAsChanged("IDRPADEST", idRpadEst);
   }

   public BigDecimal getIdRpaOper() {
        return this.getVo().asBigDecimal("IDRPAOPER");
   }

   public void setIdRpaOper(BigDecimal idRpaOper) {
        markAsChanged("IDRPAOPER", idRpaOper);
   }

   public String getInicializarPa() {
        return this.getVo().asString("INICIALIZARPA");
   }

   public void setInicializarPa(String inicializarPa) {
        markAsChanged("INICIALIZARPA", inicializarPa);
   }

   public String getLiberarWcFinal() {
        return this.getVo().asString("LIBERARWCFINAL");
   }

   public void setLiberarWcFinal(String liberarWcFinal) {
        markAsChanged("LIBERARWCFINAL", liberarWcFinal);
   }

   public String getAltStatusProc() {
        return this.getVo().asString("ALTSTATUSPROC");
   }

   public void setAltStatusProc(String altStatusProc) {
        markAsChanged("ALTSTATUSPROC", altStatusProc);
   }

   public String getApontaComp() {
        return this.getVo().asString("APONTACOMP");
   }

   public void setApontaComp(String apontaComp) {
        markAsChanged("APONTACOMP", apontaComp);
   }

   public String getApontaMp() {
        return this.getVo().asString("APONTAMP");
   }

   public void setApontaMp(String apontaMp) {
        markAsChanged("APONTAMP", apontaMp);
   }

   public String getApontaPa() {
        return this.getVo().asString("APONTAPA");
   }

   public void setApontaPa(String apontaPa) {
        markAsChanged("APONTAPA", apontaPa);
   }

   public String getApontaSp() {
        return this.getVo().asString("APONTASP");
   }

   public void setApontaSp(String apontaSp) {
        markAsChanged("APONTASP", apontaSp);
   }

   public BigDecimal getCodPrcSub() {
        return this.getVo().asBigDecimal("CODPRCSUB");
   }

   public void setCodPrcSub(BigDecimal codPrcSub) {
        markAsChanged("CODPRCSUB", codPrcSub);
   }

   public String getApontaRecWc() {
        return this.getVo().asString("APONTARECWC");
   }

   public void setApontaRecWc(String apontaRecWc) {
        markAsChanged("APONTARECWC", apontaRecWc);
   }

   public BigDecimal getCodMtpFinTurno() {
        return this.getVo().asBigDecimal("CODMTPFINTURNO");
   }

   public void setCodMtpFinTurno(BigDecimal codMtpFinTurno) {
        markAsChanged("CODMTPFINTURNO", codMtpFinTurno);
   }

   public String getMultiTurno() {
        return this.getVo().asString("MULTITURNO");
   }

   public void setMultiTurno(String multiTurno) {
        markAsChanged("MULTITURNO", multiTurno);
   }

   public String getContCumulativa() {
        return this.getVo().asString("CONTCUMULATIVA");
   }

   public void setContCumulativa(String contCumulativa) {
        markAsChanged("CONTCUMULATIVA", contCumulativa);
   }

   public String getSubApoPorConf() {
        return this.getVo().asString("SUBAPOPORCONF");
   }

   public void setSubApoPorConf(String subApoPorConf) {
        markAsChanged("SUBAPOPORCONF", subApoPorConf);
   }

   public BigDecimal getQtdConfiguais() {
        return this.getVo().asBigDecimal("QTDCONFIGUAIS");
   }

   public void setQtdConfiguais(BigDecimal qtdConfiguais) {
        markAsChanged("QTDCONFIGUAIS", qtdConfiguais);
   }

   public BigDecimal getQtdRecontagens() {
        return this.getVo().asBigDecimal("QTDRECONTAGENS");
   }

   public void setQtdRecontagens(BigDecimal qtdRecontagens) {
        markAsChanged("QTDRECONTAGENS", qtdRecontagens);
   }

   public String getTipoTempo() {
        return this.getVo().asString("TIPOTEMPO");
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
   }

   public String getProibeApont() {
        return this.getVo().asString("PROIBEAPONT");
   }

   public void setProibeApont(String proibeApont) {
        markAsChanged("PROIBEAPONT", proibeApont);
   }

   public String getSeqExecucao() {
        return this.getVo().asString("SEQEXECUCAO");
   }

   public void setSeqExecucao(String seqExecucao) {
        markAsChanged("SEQEXECUCAO", seqExecucao);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getPermitePerdaTotal() {
        return this.getVo().asString("PERMITEPERDATOTAL");
   }

   public void setPermitePerdaTotal(String permitePerdaTotal) {
        markAsChanged("PERMITEPERDATOTAL", permitePerdaTotal);
   }

   public String getSetup() {
        return this.getVo().asString("SETUP");
   }

   public void setSetup(String setup) {
        markAsChanged("SETUP", setup);
   }

   public String getAprovarStatusLote() {
        return this.getVo().asString("APROVARSTATUSLOTE");
   }

   public void setAprovarStatusLote(String aprovarStatusLote) {
        markAsChanged("APROVARSTATUSLOTE", aprovarStatusLote);
   }

   public String getDataHoraApontamento() {
        return this.getVo().asString("DATAHORAAPONTAMENTO");
   }

   public void setDataHoraApontamento(String dataHoraApontamento) {
        markAsChanged("DATAHORAAPONTAMENTO", dataHoraApontamento);
   }

   public String getGeraMlaudo() {
        return this.getVo().asString("GERAMLAUDO");
   }

   public void setGeraMlaudo(String geraMlaudo) {
        markAsChanged("GERAMLAUDO", geraMlaudo);
   }

   public String getPermiteAltLocMp() {
        return this.getVo().asString("PERMITEALTLOCMP");
   }

   public void setPermiteAltLocMp(String permiteAltLocMp) {
        markAsChanged("PERMITEALTLOCMP", permiteAltLocMp);
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
        this.setVo(vo);
        return this;
   }
}
