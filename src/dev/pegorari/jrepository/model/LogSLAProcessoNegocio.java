package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LogSLAProcessoNegocio implements SankhyaEntity<LogSLAProcessoNegocio> {

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
        this.codPrn = codPrn;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        this.codSmtp = codSmtp;
   }

   public char[] getExprDestinatarios() {
        return exprDestinatarios;
   }

   public void setExprDestinatarios(char[] exprDestinatarios) {
        this.exprDestinatarios = exprDestinatarios;
   }

   public String getNotificaPadrao() {
        return notificaPadrao;
   }

   public void setNotificaPadrao(String notificaPadrao) {
        this.notificaPadrao = notificaPadrao;
   }

   public BigDecimal getRegra() {
        return regra;
   }

   public void setRegra(BigDecimal regra) {
        this.regra = regra;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public BigDecimal getTempoLimite() {
        return tempoLimite;
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        this.tempoLimite = tempoLimite;
   }

   public String getTipoNotificacao() {
        return tipoNotificacao;
   }

   public void setTipoNotificacao(String tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   @Override
   public String getEntityName() {
        return "LogSLAProcessoNegocio";
   }

   @Override
   public LogSLAProcessoNegocio fromVO(DynamicVO vo) {
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
