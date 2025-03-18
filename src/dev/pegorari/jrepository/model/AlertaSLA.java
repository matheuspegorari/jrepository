package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AlertaSLA extends AbstractSankhyaEntity<AlertaSLA> {
   private BigDecimal codPrn;
   private BigDecimal codSmtp;
   private char[] exprDestinatarios;
   private String notificaPadrao;
   private BigDecimal regra;
   private BigDecimal sequencia;
   private String situacao;
   private BigDecimal tempoLimite;
   private String tipoNotificacao;
   private BigDecimal versao;
   private String ativo;

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
        this.codPrn = codPrn;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
        this.codSmtp = codSmtp;
   }

   public char[] getExprDestinatarios() {
        return exprDestinatarios;
   }

   public void setExprDestinatarios(char[] exprDestinatarios) {
        markAsChanged("EXPRDESTINATARIOS", exprDestinatarios);
        this.exprDestinatarios = exprDestinatarios;
   }

   public String getNotificaPadrao() {
        return notificaPadrao;
   }

   public void setNotificaPadrao(String notificaPadrao) {
        markAsChanged("NOTIFICAPADRAO", notificaPadrao);
        this.notificaPadrao = notificaPadrao;
   }

   public BigDecimal getRegra() {
        return regra;
   }

   public void setRegra(BigDecimal regra) {
        markAsChanged("REGRA", regra);
        this.regra = regra;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public BigDecimal getTempoLimite() {
        return tempoLimite;
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        markAsChanged("TEMPOLIMITE", tempoLimite);
        this.tempoLimite = tempoLimite;
   }

   public String getTipoNotificacao() {
        return tipoNotificacao;
   }

   public void setTipoNotificacao(String tipoNotificacao) {
        markAsChanged("TIPONOTIFICACAO", tipoNotificacao);
        this.tipoNotificacao = tipoNotificacao;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   @Override
   public String getTableName() {
        return "TWFASLA";
   }

   @Override
   public String getEntityName() {
        return "AlertaSLA";
   }

   @Override
   public AlertaSLA fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        this.exprDestinatarios = vo.asClob("EXPRDESTINATARIOS");
        this.notificaPadrao = vo.asString("NOTIFICAPADRAO");
        this.regra = vo.asBigDecimal("REGRA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.situacao = vo.asString("SITUACAO");
        this.tempoLimite = vo.asBigDecimal("TEMPOLIMITE");
        this.tipoNotificacao = vo.asString("TIPONOTIFICACAO");
        this.versao = vo.asBigDecimal("VERSAO");
        this.ativo = vo.asString("ATIVO");
        return this;
   }
}
