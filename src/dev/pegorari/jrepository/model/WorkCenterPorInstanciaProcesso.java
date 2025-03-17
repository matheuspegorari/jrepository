package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class WorkCenterPorInstanciaProcesso implements SankhyaEntity<WorkCenterPorInstanciaProcesso> {

   private BigDecimal codWcp;
   private BigDecimal idAwc;
   private BigDecimal idIproc;
   private BigDecimal idEfx;
   private BigDecimal prioridade;

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public BigDecimal getIdAwc() {
        return idAwc;
   }

   public void setIdAwc(BigDecimal idAwc) {
        this.idAwc = idAwc;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public BigDecimal getIdEfx() {
        return idEfx;
   }

   public void setIdEfx(BigDecimal idEfx) {
        this.idEfx = idEfx;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   @Override
   public String getEntityName() {
        return "WorkCenterPorInstanciaProcesso";
   }

   @Override
   public WorkCenterPorInstanciaProcesso fromVO(DynamicVO vo) {
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.idAwc = vo.asBigDecimal("IDAWC");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.idEfx = vo.asBigDecimal("IDEFX");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        return this;
   }
}
