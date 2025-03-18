package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecReguaCobranca extends AbstractSankhyaEntity<ExecReguaCobranca> {
   private String acontece;
   private BigDecimal codEvento;
   private BigDecimal codRegua;
   private String descricao;
   private Timestamp dhExec;
   private BigDecimal qtdTituloFalha;
   private BigDecimal qtdTituloSucesso;
   private String resultado;
   private String resumo;
   private BigDecimal seqExec;
   private BigDecimal tempoExecucao;
   private BigDecimal tipoEvento;
   private Timestamp ultimaAlteracaoEvento;

   public String getAcontece() {
        return acontece;
   }

   public void setAcontece(String acontece) {
        markAsChanged("ACONTECE", acontece);
        this.acontece = acontece;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
        this.codEvento = codEvento;
   }

   public BigDecimal getCodRegua() {
        return codRegua;
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
        this.codRegua = codRegua;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhExec() {
        return dhExec;
   }

   public void setDhExec(Timestamp dhExec) {
        markAsChanged("DHEXEC", dhExec);
        this.dhExec = dhExec;
   }

   public BigDecimal getQtdTituloFalha() {
        return qtdTituloFalha;
   }

   public void setQtdTituloFalha(BigDecimal qtdTituloFalha) {
        markAsChanged("QTDTITULOFALHA", qtdTituloFalha);
        this.qtdTituloFalha = qtdTituloFalha;
   }

   public BigDecimal getQtdTituloSucesso() {
        return qtdTituloSucesso;
   }

   public void setQtdTituloSucesso(BigDecimal qtdTituloSucesso) {
        markAsChanged("QTDTITULOSUCESSO", qtdTituloSucesso);
        this.qtdTituloSucesso = qtdTituloSucesso;
   }

   public String getResultado() {
        return resultado;
   }

   public void setResultado(String resultado) {
        markAsChanged("RESULTADO", resultado);
        this.resultado = resultado;
   }

   public String getResumo() {
        return resumo;
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
        this.resumo = resumo;
   }

   public BigDecimal getSeqExec() {
        return seqExec;
   }

   public void setSeqExec(BigDecimal seqExec) {
        markAsChanged("SEQEXEC", seqExec);
        this.seqExec = seqExec;
   }

   public BigDecimal getTempoExecucao() {
        return tempoExecucao;
   }

   public void setTempoExecucao(BigDecimal tempoExecucao) {
        markAsChanged("TEMPOEXECUCAO", tempoExecucao);
        this.tempoExecucao = tempoExecucao;
   }

   public BigDecimal getTipoEvento() {
        return tipoEvento;
   }

   public void setTipoEvento(BigDecimal tipoEvento) {
        markAsChanged("TIPOEVENTO", tipoEvento);
        this.tipoEvento = tipoEvento;
   }

   public Timestamp getUltimaAlteracaoEvento() {
        return ultimaAlteracaoEvento;
   }

   public void setUltimaAlteracaoEvento(Timestamp ultimaAlteracaoEvento) {
        markAsChanged("ULTIMAALTERACAOEVENTO", ultimaAlteracaoEvento);
        this.ultimaAlteracaoEvento = ultimaAlteracaoEvento;
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
        this.setOriginalVO(vo);
        this.acontece = vo.asString("ACONTECE");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codRegua = vo.asBigDecimal("CODREGUA");
        this.descricao = vo.asString("DESCRICAO");
        this.dhExec = vo.asTimestamp("DHEXEC");
        this.qtdTituloFalha = vo.asBigDecimal("QTDTITULOFALHA");
        this.qtdTituloSucesso = vo.asBigDecimal("QTDTITULOSUCESSO");
        this.resultado = vo.asString("RESULTADO");
        this.resumo = vo.asString("RESUMO");
        this.seqExec = vo.asBigDecimal("SEQEXEC");
        this.tempoExecucao = vo.asBigDecimal("TEMPOEXECUCAO");
        this.tipoEvento = vo.asBigDecimal("TIPOEVENTO");
        this.ultimaAlteracaoEvento = vo.asTimestamp("ULTIMAALTERACAOEVENTO");
        return this;
   }
}
