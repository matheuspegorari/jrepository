package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoReinf extends AbstractSankhyaEntity<CabecalhoReinf> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getEvtAguarCorrecao() {
        return this.getVo().asBigDecimal("EVTAGUARCORRECAO");
   }

   public void setEvtAguarCorrecao(BigDecimal evtAguarCorrecao) {
        markAsChanged("EVTAGUARCORRECAO", evtAguarCorrecao);
   }

   public BigDecimal getEvtEnviado() {
        return this.getVo().asBigDecimal("EVTENVIADO");
   }

   public void setEvtEnviado(BigDecimal evtEnviado) {
        markAsChanged("EVTENVIADO", evtEnviado);
   }

   public BigDecimal getEvtErroEvtPrior() {
        return this.getVo().asBigDecimal("EVTERROEVTPRIOR");
   }

   public void setEvtErroEvtPrior(BigDecimal evtErroEvtPrior) {
        markAsChanged("EVTERROEVTPRIOR", evtErroEvtPrior);
   }

   public BigDecimal getEvtFinalizado() {
        return this.getVo().asBigDecimal("EVTFINALIZADO");
   }

   public void setEvtFinalizado(BigDecimal evtFinalizado) {
        markAsChanged("EVTFINALIZADO", evtFinalizado);
   }

   public BigDecimal getEvtPendente() {
        return this.getVo().asBigDecimal("EVTPENDENTE");
   }

   public void setEvtPendente(BigDecimal evtPendente) {
        markAsChanged("EVTPENDENTE", evtPendente);
   }

   public BigDecimal getEvtTotais() {
        return this.getVo().asBigDecimal("EVTTOTAIS");
   }

   public void setEvtTotais(BigDecimal evtTotais) {
        markAsChanged("EVTTOTAIS", evtTotais);
   }

   public BigDecimal getSequenciaAtual() {
        return this.getVo().asBigDecimal("SEQUENCIAATUAL");
   }

   public void setSequenciaAtual(BigDecimal sequenciaAtual) {
        markAsChanged("SEQUENCIAATUAL", sequenciaAtual);
   }

   public String getTpAmb() {
        return this.getVo().asString("TPAMB");
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   public BigDecimal getStatus() {
        return this.getVo().asBigDecimal("STATUS");
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getVersaoLayout() {
        return this.getVo().asBigDecimal("VERSAOLAYOUT");
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
   }

   public BigDecimal getSequenciaAtual4000() {
        return this.getVo().asBigDecimal("SEQUENCIAATUAL4000");
   }

   public void setSequenciaAtual4000(BigDecimal sequenciaAtual4000) {
        markAsChanged("SEQUENCIAATUAL4000", sequenciaAtual4000);
   }

   public BigDecimal getStatusGrupo4000() {
        return this.getVo().asBigDecimal("STATUS_GRUPO4000");
   }

   public void setStatusGrupo4000(BigDecimal statusGrupo4000) {
        markAsChanged("STATUS_GRUPO4000", statusGrupo4000);
   }

   @Override
   public String getTableName() {
        return "TRICAB";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoReinf";
   }

   @Override
   public CabecalhoReinf fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
