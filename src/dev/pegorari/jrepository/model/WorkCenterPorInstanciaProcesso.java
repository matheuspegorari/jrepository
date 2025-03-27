package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class WorkCenterPorInstanciaProcesso extends AbstractSankhyaEntity<WorkCenterPorInstanciaProcesso> {
   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public BigDecimal getIdaWc() {
        return this.getVo().asBigDecimal("IDAWC");
   }

   public void setIdaWc(BigDecimal idaWc) {
        markAsChanged("IDAWC", idaWc);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
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
        this.setVo(vo);
        return this;
   }
}
