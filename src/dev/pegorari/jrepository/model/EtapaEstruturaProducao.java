package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaEstruturaProducao extends AbstractSankhyaEntity<EtapaEstruturaProducao> {
   public BigDecimal getLeadTimeCql() {
        return this.getVo().asBigDecimal("LEADTIMECQL");
   }

   public void setLeadTimeCql(BigDecimal leadTimeCql) {
        markAsChanged("LEADTIMECQL", leadTimeCql);
   }

   public String getAbreviacao() {
        return this.getVo().asString("ABREVIACAO");
   }

   public void setAbreviacao(String abreviacao) {
        markAsChanged("ABREVIACAO", abreviacao);
   }

   public BigDecimal getCodEst() {
        return this.getVo().asBigDecimal("CODEST");
   }

   public void setCodEst(BigDecimal codEst) {
        markAsChanged("CODEST", codEst);
   }

   public BigDecimal getCodEtp() {
        return this.getVo().asBigDecimal("CODETP");
   }

   public void setCodEtp(BigDecimal codEtp) {
        markAsChanged("CODETP", codEtp);
   }

   public String getCql() {
        return this.getVo().asString("CQL");
   }

   public void setCql(String cql) {
        markAsChanged("CQL", cql);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getGeraProducao() {
        return this.getVo().asString("GERAPRODUCAO");
   }

   public void setGeraProducao(String geraProducao) {
        markAsChanged("GERAPRODUCAO", geraProducao);
   }

   public BigDecimal getLeadTime() {
        return this.getVo().asBigDecimal("LEADTIME");
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
   }

   public BigDecimal getTopProd() {
        return this.getVo().asBigDecimal("TOPPROD");
   }

   public void setTopProd(BigDecimal topProd) {
        markAsChanged("TOPPROD", topProd);
   }

   public String getCompart() {
        return this.getVo().asString("COMPART");
   }

   public void setCompart(String compart) {
        markAsChanged("COMPART", compart);
   }

   @Override
   public String getTableName() {
        return "TGFEEP";
   }

   @Override
   public String getEntityName() {
        return "EtapaEstruturaProducao";
   }

   @Override
   public EtapaEstruturaProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
