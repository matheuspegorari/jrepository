package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class EtapaEstruturaProducao implements SankhyaEntity<EtapaEstruturaProducao> {

   private BigDecimal leadTimeCql;
   private String abreviacao;
   private BigDecimal codEst;
   private BigDecimal codEtp;
   private String cql;
   private String descricao;
   private String geraProducao;
   private BigDecimal leadTime;
   private BigDecimal topProd;
   private String compart;

   public BigDecimal getLeadTimeCql() {
        return leadTimeCql;
   }

   public void setLeadTimeCql(BigDecimal leadTimeCql) {
        this.leadTimeCql = leadTimeCql;
   }

   public String getAbreviacao() {
        return abreviacao;
   }

   public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
   }

   public BigDecimal getCodEst() {
        return codEst;
   }

   public void setCodEst(BigDecimal codEst) {
        this.codEst = codEst;
   }

   public BigDecimal getCodEtp() {
        return codEtp;
   }

   public void setCodEtp(BigDecimal codEtp) {
        this.codEtp = codEtp;
   }

   public String getCql() {
        return cql;
   }

   public void setCql(String cql) {
        this.cql = cql;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getGeraProducao() {
        return geraProducao;
   }

   public void setGeraProducao(String geraProducao) {
        this.geraProducao = geraProducao;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
   }

   public BigDecimal getTopProd() {
        return topProd;
   }

   public void setTopProd(BigDecimal topProd) {
        this.topProd = topProd;
   }

   public String getCompart() {
        return compart;
   }

   public void setCompart(String compart) {
        this.compart = compart;
   }

   @Override
   public String getEntityName() {
        return "EtapaEstruturaProducao";
   }

   @Override
   public EtapaEstruturaProducao fromVO(DynamicVO vo) {
        this.leadTimeCql = vo.asBigDecimal("LEADTIMECQL");
        this.abreviacao = vo.asString("ABREVIACAO");
        this.codEst = vo.asBigDecimal("CODEST");
        this.codEtp = vo.asBigDecimal("CODETP");
        this.cql = vo.asString("CQL");
        this.descricao = vo.asString("DESCRICAO");
        this.geraProducao = vo.asString("GERAPRODUCAO");
        this.leadTime = vo.asBigDecimal("LEADTIME");
        this.topProd = vo.asBigDecimal("TOPPROD");
        this.compart = vo.asString("COMPART");
        return this;
   }
}
