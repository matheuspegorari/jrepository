package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaPlanejamentoProducao extends AbstractSankhyaEntity<EtapaPlanejamentoProducao> {
   public BigDecimal getNumPlan() {
        return this.getVo().asBigDecimal("NUMPLAN");
   }

   public void setNumPlan(BigDecimal numPlan) {
        markAsChanged("NUMPLAN", numPlan);
   }

   public String getAbrvEtapa() {
        return this.getVo().asString("ABRVETAPA");
   }

   public void setAbrvEtapa(String abrvEtapa) {
        markAsChanged("ABRVETAPA", abrvEtapa);
   }

   public String getCql() {
        return this.getVo().asString("CQL");
   }

   public void setCql(String cql) {
        markAsChanged("CQL", cql);
   }

   public Timestamp getDtFim() {
        return this.getVo().asTimestamp("DTFIM");
   }

   public void setDtFim(Timestamp dtFim) {
        markAsChanged("DTFIM", dtFim);
   }

   public Timestamp getDtIni() {
        return this.getVo().asTimestamp("DTINI");
   }

   public void setDtIni(Timestamp dtIni) {
        markAsChanged("DTINI", dtIni);
   }

   public BigDecimal getEtapa() {
        return this.getVo().asBigDecimal("ETAPA");
   }

   public void setEtapa(BigDecimal etapa) {
        markAsChanged("ETAPA", etapa);
   }

   public String getGeraProd() {
        return this.getVo().asString("GERAPROD");
   }

   public void setGeraProd(String geraProd) {
        markAsChanged("GERAPROD", geraProd);
   }

   public BigDecimal getLeadTime() {
        return this.getVo().asBigDecimal("LEADTIME");
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
   }

   public BigDecimal getLeadTimeFim() {
        return this.getVo().asBigDecimal("LEADTIMEFIM");
   }

   public void setLeadTimeFim(BigDecimal leadTimeFim) {
        markAsChanged("LEADTIMEFIM", leadTimeFim);
   }

   public BigDecimal getLeadTimeTot() {
        return this.getVo().asBigDecimal("LEADTIMETOT");
   }

   public void setLeadTimeTot(BigDecimal leadTimeTot) {
        markAsChanged("LEADTIMETOT", leadTimeTot);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getTopProd() {
        return this.getVo().asBigDecimal("TOPPROD");
   }

   public void setTopProd(BigDecimal topProd) {
        markAsChanged("TOPPROD", topProd);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   @Override
   public String getTableName() {
        return "TGFEPL";
   }

   @Override
   public String getEntityName() {
        return "EtapaPlanejamentoProducao";
   }

   @Override
   public EtapaPlanejamentoProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
