package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoReinf extends AbstractSankhyaEntity<CabecalhoReinf> {
   private BigDecimal codEmp;
   private String controle;
   private Timestamp dtRef;
   private BigDecimal evtAguarCorrecao;
   private BigDecimal evtEnviado;
   private BigDecimal evtErroEvtPrior;
   private BigDecimal evtFinalizado;
   private BigDecimal evtPendente;
   private BigDecimal evtTotais;
   private BigDecimal sequenciaAtual;
   private String tpAmb;
   private BigDecimal status;
   private BigDecimal versaoLayout;
   private BigDecimal sequenciaAtual4000;
   private BigDecimal statusGrupo4000;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public BigDecimal getEvtAguarCorrecao() {
        return evtAguarCorrecao;
   }

   public void setEvtAguarCorrecao(BigDecimal evtAguarCorrecao) {
        this.evtAguarCorrecao = evtAguarCorrecao;
   }

   public BigDecimal getEvtEnviado() {
        return evtEnviado;
   }

   public void setEvtEnviado(BigDecimal evtEnviado) {
        this.evtEnviado = evtEnviado;
   }

   public BigDecimal getEvtErroEvtPrior() {
        return evtErroEvtPrior;
   }

   public void setEvtErroEvtPrior(BigDecimal evtErroEvtPrior) {
        this.evtErroEvtPrior = evtErroEvtPrior;
   }

   public BigDecimal getEvtFinalizado() {
        return evtFinalizado;
   }

   public void setEvtFinalizado(BigDecimal evtFinalizado) {
        this.evtFinalizado = evtFinalizado;
   }

   public BigDecimal getEvtPendente() {
        return evtPendente;
   }

   public void setEvtPendente(BigDecimal evtPendente) {
        this.evtPendente = evtPendente;
   }

   public BigDecimal getEvtTotais() {
        return evtTotais;
   }

   public void setEvtTotais(BigDecimal evtTotais) {
        this.evtTotais = evtTotais;
   }

   public BigDecimal getSequenciaAtual() {
        return sequenciaAtual;
   }

   public void setSequenciaAtual(BigDecimal sequenciaAtual) {
        this.sequenciaAtual = sequenciaAtual;
   }

   public String getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
   }

   public BigDecimal getStatus() {
        return status;
   }

   public void setStatus(BigDecimal status) {
        this.status = status;
   }

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        this.versaoLayout = versaoLayout;
   }

   public BigDecimal getSequenciaAtual4000() {
        return sequenciaAtual4000;
   }

   public void setSequenciaAtual4000(BigDecimal sequenciaAtual4000) {
        this.sequenciaAtual4000 = sequenciaAtual4000;
   }

   public BigDecimal getStatusGrupo4000() {
        return statusGrupo4000;
   }

   public void setStatusGrupo4000(BigDecimal statusGrupo4000) {
        this.statusGrupo4000 = statusGrupo4000;
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
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.evtAguarCorrecao = vo.asBigDecimal("EVTAGUARCORRECAO");
        this.evtEnviado = vo.asBigDecimal("EVTENVIADO");
        this.evtErroEvtPrior = vo.asBigDecimal("EVTERROEVTPRIOR");
        this.evtFinalizado = vo.asBigDecimal("EVTFINALIZADO");
        this.evtPendente = vo.asBigDecimal("EVTPENDENTE");
        this.evtTotais = vo.asBigDecimal("EVTTOTAIS");
        this.sequenciaAtual = vo.asBigDecimal("SEQUENCIAATUAL");
        this.tpAmb = vo.asString("TPAMB");
        this.status = vo.asBigDecimal("STATUS");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        this.sequenciaAtual4000 = vo.asBigDecimal("SEQUENCIAATUAL4000");
        this.statusGrupo4000 = vo.asBigDecimal("STATUS_GRUPO4000");
        return this;
   }
}
