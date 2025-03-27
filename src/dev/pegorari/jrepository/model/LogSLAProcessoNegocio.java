package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LogSLAProcessoNegocio extends AbstractSankhyaEntity<LogSLAProcessoNegocio> {
   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
   }

   public char[] getExprDestinatarios() {
        return this.getVo().asClob("EXPRDESTINATARIOS");
   }

   public void setExprDestinatarios(char[] exprDestinatarios) {
        markAsChanged("EXPRDESTINATARIOS", exprDestinatarios);
   }

   public String getNotificaPadrao() {
        return this.getVo().asString("NOTIFICAPADRAO");
   }

   public void setNotificaPadrao(String notificaPadrao) {
        markAsChanged("NOTIFICAPADRAO", notificaPadrao);
   }

   public BigDecimal getRegra() {
        return this.getVo().asBigDecimal("REGRA");
   }

   public void setRegra(BigDecimal regra) {
        markAsChanged("REGRA", regra);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public BigDecimal getTempoLimite() {
        return this.getVo().asBigDecimal("TEMPOLIMITE");
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        markAsChanged("TEMPOLIMITE", tempoLimite);
   }

   public String getTipoNotificacao() {
        return this.getVo().asString("TIPONOTIFICACAO");
   }

   public void setTipoNotificacao(String tipoNotificacao) {
        markAsChanged("TIPONOTIFICACAO", tipoNotificacao);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   @Override
   public String getTableName() {
        return "TWFASLA";
   }

   @Override
   public String getEntityName() {
        return "LogSLAProcessoNegocio";
   }

   @Override
   public LogSLAProcessoNegocio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
