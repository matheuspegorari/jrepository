package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoLimite implements SankhyaEntity<LiberacaoLimite> {

   private String antecipacao;
   private BigDecimal codCencus;
   private BigDecimal codMeta;
   private BigDecimal codTipOper;
   private BigDecimal codUsuLib;
   private BigDecimal codUsuSolicit;
   private Timestamp dhLib;
   private Timestamp dhSolicit;
   private BigDecimal evento;
   private BigDecimal nuChave;
   private BigDecimal nuCll;
   private BigDecimal nuLbo;
   private BigDecimal nuRng;
   private String observacao;
   private String obsLib;
   private BigDecimal ordem;
   private BigDecimal percAnterior;
   private BigDecimal percLimite;
   private String reprovado;
   private BigDecimal seqCascata;
   private BigDecimal sequencia;
   private String suplemento;
   private String tabela;
   private String transf;
   private BigDecimal vlrAnterior;
   private BigDecimal vlrAtual;
   private BigDecimal vlrDesdob;
   private BigDecimal vlrLiberado;
   private BigDecimal vlrLimite;
   private BigDecimal vlrTotal;
   private String obsCompl;

   public String getAntecipacao() {
        return antecipacao;
   }

   public void setAntecipacao(String antecipacao) {
        this.antecipacao = antecipacao;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodUsuLib() {
        return codUsuLib;
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        this.codUsuLib = codUsuLib;
   }

   public BigDecimal getCodUsuSolicit() {
        return codUsuSolicit;
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        this.codUsuSolicit = codUsuSolicit;
   }

   public Timestamp getDhLib() {
        return dhLib;
   }

   public void setDhLib(Timestamp dhLib) {
        this.dhLib = dhLib;
   }

   public Timestamp getDhSolicit() {
        return dhSolicit;
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        this.dhSolicit = dhSolicit;
   }

   public BigDecimal getEvento() {
        return evento;
   }

   public void setEvento(BigDecimal evento) {
        this.evento = evento;
   }

   public BigDecimal getNuChave() {
        return nuChave;
   }

   public void setNuChave(BigDecimal nuChave) {
        this.nuChave = nuChave;
   }

   public BigDecimal getNuCll() {
        return nuCll;
   }

   public void setNuCll(BigDecimal nuCll) {
        this.nuCll = nuCll;
   }

   public BigDecimal getNuLbo() {
        return nuLbo;
   }

   public void setNuLbo(BigDecimal nuLbo) {
        this.nuLbo = nuLbo;
   }

   public BigDecimal getNuRng() {
        return nuRng;
   }

   public void setNuRng(BigDecimal nuRng) {
        this.nuRng = nuRng;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getObsLib() {
        return obsLib;
   }

   public void setObsLib(String obsLib) {
        this.obsLib = obsLib;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getPercAnterior() {
        return percAnterior;
   }

   public void setPercAnterior(BigDecimal percAnterior) {
        this.percAnterior = percAnterior;
   }

   public BigDecimal getPercLimite() {
        return percLimite;
   }

   public void setPercLimite(BigDecimal percLimite) {
        this.percLimite = percLimite;
   }

   public String getReprovado() {
        return reprovado;
   }

   public void setReprovado(String reprovado) {
        this.reprovado = reprovado;
   }

   public BigDecimal getSeqCascata() {
        return seqCascata;
   }

   public void setSeqCascata(BigDecimal seqCascata) {
        this.seqCascata = seqCascata;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSuplemento() {
        return suplemento;
   }

   public void setSuplemento(String suplemento) {
        this.suplemento = suplemento;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        this.tabela = tabela;
   }

   public String getTransf() {
        return transf;
   }

   public void setTransf(String transf) {
        this.transf = transf;
   }

   public BigDecimal getVlrAnterior() {
        return vlrAnterior;
   }

   public void setVlrAnterior(BigDecimal vlrAnterior) {
        this.vlrAnterior = vlrAnterior;
   }

   public BigDecimal getVlrAtual() {
        return vlrAtual;
   }

   public void setVlrAtual(BigDecimal vlrAtual) {
        this.vlrAtual = vlrAtual;
   }

   public BigDecimal getVlrDesdob() {
        return vlrDesdob;
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        this.vlrDesdob = vlrDesdob;
   }

   public BigDecimal getVlrLiberado() {
        return vlrLiberado;
   }

   public void setVlrLiberado(BigDecimal vlrLiberado) {
        this.vlrLiberado = vlrLiberado;
   }

   public BigDecimal getVlrLimite() {
        return vlrLimite;
   }

   public void setVlrLimite(BigDecimal vlrLimite) {
        this.vlrLimite = vlrLimite;
   }

   public BigDecimal getVlrTotal() {
        return vlrTotal;
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        this.vlrTotal = vlrTotal;
   }

   public String getObsCompl() {
        return obsCompl;
   }

   public void setObsCompl(String obsCompl) {
        this.obsCompl = obsCompl;
   }

   @Override
   public String getEntityName() {
        return "LiberacaoLimite";
   }

   @Override
   public LiberacaoLimite fromVO(DynamicVO vo) {
        this.antecipacao = vo.asString("ANTECIPACAO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codUsuLib = vo.asBigDecimal("CODUSULIB");
        this.codUsuSolicit = vo.asBigDecimal("CODUSUSOLICIT");
        this.dhLib = vo.asTimestamp("DHLIB");
        this.dhSolicit = vo.asTimestamp("DHSOLICIT");
        this.evento = vo.asBigDecimal("EVENTO");
        this.nuChave = vo.asBigDecimal("NUCHAVE");
        this.nuCll = vo.asBigDecimal("NUCLL");
        this.nuLbo = vo.asBigDecimal("NULBO");
        this.nuRng = vo.asBigDecimal("NURNG");
        this.observacao = vo.asString("OBSERVACAO");
        this.obsLib = vo.asString("OBSLIB");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.percAnterior = vo.asBigDecimal("PERCANTERIOR");
        this.percLimite = vo.asBigDecimal("PERCLIMITE");
        this.reprovado = vo.asString("REPROVADO");
        this.seqCascata = vo.asBigDecimal("SEQCASCATA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.suplemento = vo.asString("SUPLEMENTO");
        this.tabela = vo.asString("TABELA");
        this.transf = vo.asString("TRANSF");
        this.vlrAnterior = vo.asBigDecimal("VLRANTERIOR");
        this.vlrAtual = vo.asBigDecimal("VLRATUAL");
        this.vlrDesdob = vo.asBigDecimal("VLRDESDOB");
        this.vlrLiberado = vo.asBigDecimal("VLRLIBERADO");
        this.vlrLimite = vo.asBigDecimal("VLRLIMITE");
        this.vlrTotal = vo.asBigDecimal("VLRTOTAL");
        this.obsCompl = vo.asString("OBSCOMPL");
        return this;
   }
}
