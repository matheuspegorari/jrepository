package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoLimite extends AbstractSankhyaEntity<LiberacaoLimite> {
   public String getAntecipacao() {
        return this.getVo().asString("ANTECIPACAO");
   }

   public void setAntecipacao(String antecipacao) {
        markAsChanged("ANTECIPACAO", antecipacao);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodUsuLib() {
        return this.getVo().asBigDecimal("CODUSULIB");
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
   }

   public BigDecimal getCodUsuSolicit() {
        return this.getVo().asBigDecimal("CODUSUSOLICIT");
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        markAsChanged("CODUSUSOLICIT", codUsuSolicit);
   }

   public Timestamp getDhLib() {
        return this.getVo().asTimestamp("DHLIB");
   }

   public void setDhLib(Timestamp dhLib) {
        markAsChanged("DHLIB", dhLib);
   }

   public Timestamp getDhSolicit() {
        return this.getVo().asTimestamp("DHSOLICIT");
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        markAsChanged("DHSOLICIT", dhSolicit);
   }

   public BigDecimal getEvento() {
        return this.getVo().asBigDecimal("EVENTO");
   }

   public void setEvento(BigDecimal evento) {
        markAsChanged("EVENTO", evento);
   }

   public BigDecimal getNuChave() {
        return this.getVo().asBigDecimal("NUCHAVE");
   }

   public void setNuChave(BigDecimal nuChave) {
        markAsChanged("NUCHAVE", nuChave);
   }

   public BigDecimal getNuCll() {
        return this.getVo().asBigDecimal("NUCLL");
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
   }

   public BigDecimal getNuLbo() {
        return this.getVo().asBigDecimal("NULBO");
   }

   public void setNuLbo(BigDecimal nuLbo) {
        markAsChanged("NULBO", nuLbo);
   }

   public BigDecimal getNuRng() {
        return this.getVo().asBigDecimal("NURNG");
   }

   public void setNuRng(BigDecimal nuRng) {
        markAsChanged("NURNG", nuRng);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getObsLib() {
        return this.getVo().asString("OBSLIB");
   }

   public void setObsLib(String obsLib) {
        markAsChanged("OBSLIB", obsLib);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public BigDecimal getPercAnterior() {
        return this.getVo().asBigDecimal("PERCANTERIOR");
   }

   public void setPercAnterior(BigDecimal percAnterior) {
        markAsChanged("PERCANTERIOR", percAnterior);
   }

   public BigDecimal getPercLimite() {
        return this.getVo().asBigDecimal("PERCLIMITE");
   }

   public void setPercLimite(BigDecimal percLimite) {
        markAsChanged("PERCLIMITE", percLimite);
   }

   public String getReprovado() {
        return this.getVo().asString("REPROVADO");
   }

   public void setReprovado(String reprovado) {
        markAsChanged("REPROVADO", reprovado);
   }

   public BigDecimal getSeqCascata() {
        return this.getVo().asBigDecimal("SEQCASCATA");
   }

   public void setSeqCascata(BigDecimal seqCascata) {
        markAsChanged("SEQCASCATA", seqCascata);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSuplemento() {
        return this.getVo().asString("SUPLEMENTO");
   }

   public void setSuplemento(String suplemento) {
        markAsChanged("SUPLEMENTO", suplemento);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public String getTransf() {
        return this.getVo().asString("TRANSF");
   }

   public void setTransf(String transf) {
        markAsChanged("TRANSF", transf);
   }

   public BigDecimal getVlrAnterior() {
        return this.getVo().asBigDecimal("VLRANTERIOR");
   }

   public void setVlrAnterior(BigDecimal vlrAnterior) {
        markAsChanged("VLRANTERIOR", vlrAnterior);
   }

   public BigDecimal getVlrAtual() {
        return this.getVo().asBigDecimal("VLRATUAL");
   }

   public void setVlrAtual(BigDecimal vlrAtual) {
        markAsChanged("VLRATUAL", vlrAtual);
   }

   public BigDecimal getVlrDesdob() {
        return this.getVo().asBigDecimal("VLRDESDOB");
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        markAsChanged("VLRDESDOB", vlrDesdob);
   }

   public BigDecimal getVlrLiberado() {
        return this.getVo().asBigDecimal("VLRLIBERADO");
   }

   public void setVlrLiberado(BigDecimal vlrLiberado) {
        markAsChanged("VLRLIBERADO", vlrLiberado);
   }

   public BigDecimal getVlrLimite() {
        return this.getVo().asBigDecimal("VLRLIMITE");
   }

   public void setVlrLimite(BigDecimal vlrLimite) {
        markAsChanged("VLRLIMITE", vlrLimite);
   }

   public BigDecimal getVlrTotal() {
        return this.getVo().asBigDecimal("VLRTOTAL");
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        markAsChanged("VLRTOTAL", vlrTotal);
   }

   public String getObsCompl() {
        return this.getVo().asString("OBSCOMPL");
   }

   public void setObsCompl(String obsCompl) {
        markAsChanged("OBSCOMPL", obsCompl);
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
        this.setVo(vo);
        return this;
   }
}
