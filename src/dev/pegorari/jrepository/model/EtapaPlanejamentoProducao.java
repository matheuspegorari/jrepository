package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaPlanejamentoProducao implements SankhyaEntity<EtapaPlanejamentoProducao> {

   private BigDecimal numPlan;
   private String abrvEtapa;
   private String cql;
   private Timestamp dtFim;
   private Timestamp dtIni;
   private BigDecimal etapa;
   private String geraProd;
   private BigDecimal leadTime;
   private BigDecimal leadTimeFim;
   private BigDecimal leadTimeTot;
   private BigDecimal nuNota;
   private BigDecimal topProd;
   private String observacao;

   public BigDecimal getNumPlan() {
        return numPlan;
   }

   public void setNumPlan(BigDecimal numPlan) {
        this.numPlan = numPlan;
   }

   public String getAbrvEtapa() {
        return abrvEtapa;
   }

   public void setAbrvEtapa(String abrvEtapa) {
        this.abrvEtapa = abrvEtapa;
   }

   public String getCql() {
        return cql;
   }

   public void setCql(String cql) {
        this.cql = cql;
   }

   public Timestamp getDtFim() {
        return dtFim;
   }

   public void setDtFim(Timestamp dtFim) {
        this.dtFim = dtFim;
   }

   public Timestamp getDtIni() {
        return dtIni;
   }

   public void setDtIni(Timestamp dtIni) {
        this.dtIni = dtIni;
   }

   public BigDecimal getEtapa() {
        return etapa;
   }

   public void setEtapa(BigDecimal etapa) {
        this.etapa = etapa;
   }

   public String getGeraProd() {
        return geraProd;
   }

   public void setGeraProd(String geraProd) {
        this.geraProd = geraProd;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
   }

   public BigDecimal getLeadTimeFim() {
        return leadTimeFim;
   }

   public void setLeadTimeFim(BigDecimal leadTimeFim) {
        this.leadTimeFim = leadTimeFim;
   }

   public BigDecimal getLeadTimeTot() {
        return leadTimeTot;
   }

   public void setLeadTimeTot(BigDecimal leadTimeTot) {
        this.leadTimeTot = leadTimeTot;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getTopProd() {
        return topProd;
   }

   public void setTopProd(BigDecimal topProd) {
        this.topProd = topProd;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   @Override
   public String getEntityName() {
        return "EtapaPlanejamentoProducao";
   }

   @Override
   public EtapaPlanejamentoProducao fromVO(DynamicVO vo) {
        this.numPlan = vo.asBigDecimal("NUMPLAN");
        this.abrvEtapa = vo.asString("ABRVETAPA");
        this.cql = vo.asString("CQL");
        this.dtFim = vo.asTimestamp("DTFIM");
        this.dtIni = vo.asTimestamp("DTINI");
        this.etapa = vo.asBigDecimal("ETAPA");
        this.geraProd = vo.asString("GERAPROD");
        this.leadTime = vo.asBigDecimal("LEADTIME");
        this.leadTimeFim = vo.asBigDecimal("LEADTIMEFIM");
        this.leadTimeTot = vo.asBigDecimal("LEADTIMETOT");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.topProd = vo.asBigDecimal("TOPPROD");
        this.observacao = vo.asString("OBSERVACAO");
        return this;
   }
}
