package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AlocacaoDeWorkCenterLctoOP extends AbstractSankhyaEntity<AlocacaoDeWorkCenterLctoOP> {
   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public BigDecimal getIdAwc() {
        return this.getVo().asBigDecimal("IDAWC");
   }

   public void setIdAwc(BigDecimal idAwc) {
        markAsChanged("IDAWC", idAwc);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public BigDecimal getCodCwc() {
        return this.getVo().asBigDecimal("CODCWC");
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
   }

   public String getDescrCwc() {
        return this.getVo().asString("DESCRCWC");
   }

   public void setDescrCwc(String descrCwc) {
        markAsChanged("DESCRCWC", descrCwc);
   }

   public String getDescrAtv() {
        return this.getVo().asString("DESCRATV");
   }

   public void setDescrAtv(String descrAtv) {
        markAsChanged("DESCRATV", descrAtv);
   }

   @Override
   public String getTableName() {
        return "TPRWLOP";
   }

   @Override
   public String getEntityName() {
        return "AlocacaoDeWorkCenterLctoOP";
   }

   @Override
   public AlocacaoDeWorkCenterLctoOP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
