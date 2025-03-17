package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class WorkCenterPorInstanciaProcesso extends AbstractSankhyaEntity<WorkCenterPorInstanciaProcesso> {
   private BigDecimal codWcp;
   private BigDecimal idaWc;
   private BigDecimal idIproc;
   private BigDecimal ideFx;
   private BigDecimal prioridade;

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public BigDecimal getIdaWc() {
        return idaWc;
   }

   public void setIdaWc(BigDecimal idaWc) {
        this.idaWc = idaWc;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   @Override
   public String getTableName() {
        return "TPRWXIP";
   }

   @Override
   public String getEntityName() {
        return "WorkCenterPorInstanciaProcesso";
   }

   @Override
   public WorkCenterPorInstanciaProcesso fromVO(DynamicVO vo) {
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.idaWc = vo.asBigDecimal("IDAWC");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        return this;
   }
}
