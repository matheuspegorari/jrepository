package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Lane extends AbstractSankhyaEntity<Lane> {
   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdeFxPool() {
        return this.getVo().asBigDecimal("IDEFXPOOL");
   }

   public void setIdeFxPool(BigDecimal ideFxPool) {
        markAsChanged("IDEFXPOOL", ideFxPool);
   }

   public BigDecimal getIdRpaPadrao() {
        return this.getVo().asBigDecimal("IDRPAPADRAO");
   }

   public void setIdRpaPadrao(BigDecimal idRpaPadrao) {
        markAsChanged("IDRPAPADRAO", idRpaPadrao);
   }

   @Override
   public String getTableName() {
        return "TPRLND";
   }

   @Override
   public String getEntityName() {
        return "Lane";
   }

   @Override
   public Lane fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
