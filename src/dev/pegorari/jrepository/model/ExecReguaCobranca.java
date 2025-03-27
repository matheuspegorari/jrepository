package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecReguaCobranca extends AbstractSankhyaEntity<ExecReguaCobranca> {
   public String getAcontece() {
        return this.getVo().asString("ACONTECE");
   }

   public void setAcontece(String acontece) {
        markAsChanged("ACONTECE", acontece);
   }

   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodRegua() {
        return this.getVo().asBigDecimal("CODREGUA");
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhExec() {
        return this.getVo().asTimestamp("DHEXEC");
   }

   public void setDhExec(Timestamp dhExec) {
        markAsChanged("DHEXEC", dhExec);
   }

   public BigDecimal getQtdTituloFalha() {
        return this.getVo().asBigDecimal("QTDTITULOFALHA");
   }

   public void setQtdTituloFalha(BigDecimal qtdTituloFalha) {
        markAsChanged("QTDTITULOFALHA", qtdTituloFalha);
   }

   public BigDecimal getQtdTituloSucesso() {
        return this.getVo().asBigDecimal("QTDTITULOSUCESSO");
   }

   public void setQtdTituloSucesso(BigDecimal qtdTituloSucesso) {
        markAsChanged("QTDTITULOSUCESSO", qtdTituloSucesso);
   }

   public String getResultado() {
        return this.getVo().asString("RESULTADO");
   }

   public void setResultado(String resultado) {
        markAsChanged("RESULTADO", resultado);
   }

   public String getResumo() {
        return this.getVo().asString("RESUMO");
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
   }

   public BigDecimal getSeqExec() {
        return this.getVo().asBigDecimal("SEQEXEC");
   }

   public void setSeqExec(BigDecimal seqExec) {
        markAsChanged("SEQEXEC", seqExec);
   }

   public BigDecimal getTempoExecucao() {
        return this.getVo().asBigDecimal("TEMPOEXECUCAO");
   }

   public void setTempoExecucao(BigDecimal tempoExecucao) {
        markAsChanged("TEMPOEXECUCAO", tempoExecucao);
   }

   public BigDecimal getTipoEvento() {
        return this.getVo().asBigDecimal("TIPOEVENTO");
   }

   public void setTipoEvento(BigDecimal tipoEvento) {
        markAsChanged("TIPOEVENTO", tipoEvento);
   }

   public Timestamp getUltimaAlteracaoEvento() {
        return this.getVo().asTimestamp("ULTIMAALTERACAOEVENTO");
   }

   public void setUltimaAlteracaoEvento(Timestamp ultimaAlteracaoEvento) {
        markAsChanged("ULTIMAALTERACAOEVENTO", ultimaAlteracaoEvento);
   }

   @Override
   public String getTableName() {
        return "TGFEXR";
   }

   @Override
   public String getEntityName() {
        return "ExecReguaCobranca";
   }

   @Override
   public ExecReguaCobranca fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
