package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoLimite extends AbstractSankhyaEntity<LiberacaoLimite> {
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
        markAsChanged("ANTECIPACAO", antecipacao);
        this.antecipacao = antecipacao;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodUsuLib() {
        return codUsuLib;
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
        this.codUsuLib = codUsuLib;
   }

   public BigDecimal getCodUsuSolicit() {
        return codUsuSolicit;
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        markAsChanged("CODUSUSOLICIT", codUsuSolicit);
        this.codUsuSolicit = codUsuSolicit;
   }

   public Timestamp getDhLib() {
        return dhLib;
   }

   public void setDhLib(Timestamp dhLib) {
        markAsChanged("DHLIB", dhLib);
        this.dhLib = dhLib;
   }

   public Timestamp getDhSolicit() {
        return dhSolicit;
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        markAsChanged("DHSOLICIT", dhSolicit);
        this.dhSolicit = dhSolicit;
   }

   public BigDecimal getEvento() {
        return evento;
   }

   public void setEvento(BigDecimal evento) {
        markAsChanged("EVENTO", evento);
        this.evento = evento;
   }

   public BigDecimal getNuChave() {
        return nuChave;
   }

   public void setNuChave(BigDecimal nuChave) {
        markAsChanged("NUCHAVE", nuChave);
        this.nuChave = nuChave;
   }

   public BigDecimal getNuCll() {
        return nuCll;
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
        this.nuCll = nuCll;
   }

   public BigDecimal getNuLbo() {
        return nuLbo;
   }

   public void setNuLbo(BigDecimal nuLbo) {
        markAsChanged("NULBO", nuLbo);
        this.nuLbo = nuLbo;
   }

   public BigDecimal getNuRng() {
        return nuRng;
   }

   public void setNuRng(BigDecimal nuRng) {
        markAsChanged("NURNG", nuRng);
        this.nuRng = nuRng;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getObsLib() {
        return obsLib;
   }

   public void setObsLib(String obsLib) {
        markAsChanged("OBSLIB", obsLib);
        this.obsLib = obsLib;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public BigDecimal getPercAnterior() {
        return percAnterior;
   }

   public void setPercAnterior(BigDecimal percAnterior) {
        markAsChanged("PERCANTERIOR", percAnterior);
        this.percAnterior = percAnterior;
   }

   public BigDecimal getPercLimite() {
        return percLimite;
   }

   public void setPercLimite(BigDecimal percLimite) {
        markAsChanged("PERCLIMITE", percLimite);
        this.percLimite = percLimite;
   }

   public String getReprovado() {
        return reprovado;
   }

   public void setReprovado(String reprovado) {
        markAsChanged("REPROVADO", reprovado);
        this.reprovado = reprovado;
   }

   public BigDecimal getSeqCascata() {
        return seqCascata;
   }

   public void setSeqCascata(BigDecimal seqCascata) {
        markAsChanged("SEQCASCATA", seqCascata);
        this.seqCascata = seqCascata;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSuplemento() {
        return suplemento;
   }

   public void setSuplemento(String suplemento) {
        markAsChanged("SUPLEMENTO", suplemento);
        this.suplemento = suplemento;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public String getTransf() {
        return transf;
   }

   public void setTransf(String transf) {
        markAsChanged("TRANSF", transf);
        this.transf = transf;
   }

   public BigDecimal getVlrAnterior() {
        return vlrAnterior;
   }

   public void setVlrAnterior(BigDecimal vlrAnterior) {
        markAsChanged("VLRANTERIOR", vlrAnterior);
        this.vlrAnterior = vlrAnterior;
   }

   public BigDecimal getVlrAtual() {
        return vlrAtual;
   }

   public void setVlrAtual(BigDecimal vlrAtual) {
        markAsChanged("VLRATUAL", vlrAtual);
        this.vlrAtual = vlrAtual;
   }

   public BigDecimal getVlrDesdob() {
        return vlrDesdob;
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        markAsChanged("VLRDESDOB", vlrDesdob);
        this.vlrDesdob = vlrDesdob;
   }

   public BigDecimal getVlrLiberado() {
        return vlrLiberado;
   }

   public void setVlrLiberado(BigDecimal vlrLiberado) {
        markAsChanged("VLRLIBERADO", vlrLiberado);
        this.vlrLiberado = vlrLiberado;
   }

   public BigDecimal getVlrLimite() {
        return vlrLimite;
   }

   public void setVlrLimite(BigDecimal vlrLimite) {
        markAsChanged("VLRLIMITE", vlrLimite);
        this.vlrLimite = vlrLimite;
   }

   public BigDecimal getVlrTotal() {
        return vlrTotal;
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        markAsChanged("VLRTOTAL", vlrTotal);
        this.vlrTotal = vlrTotal;
   }

   public String getObsCompl() {
        return obsCompl;
   }

   public void setObsCompl(String obsCompl) {
        markAsChanged("OBSCOMPL", obsCompl);
        this.obsCompl = obsCompl;
   }

   @Override
   public String getTableName() {
        return "TSILIB";
   }

   @Override
   public String getEntityName() {
        return "LiberacaoLimite";
   }

   @Override
   public LiberacaoLimite fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
