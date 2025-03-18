package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Lane extends AbstractSankhyaEntity<Lane> {
   private BigDecimal ideFx;
   private BigDecimal ideFxPool;
   private BigDecimal idRpaPadrao;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxPool() {
        return ideFxPool;
   }

   public void setIdeFxPool(BigDecimal ideFxPool) {
        markAsChanged("IDEFXPOOL", ideFxPool);
        this.ideFxPool = ideFxPool;
   }

   public BigDecimal getIdRpaPadrao() {
        return idRpaPadrao;
   }

   public void setIdRpaPadrao(BigDecimal idRpaPadrao) {
        markAsChanged("IDRPAPADRAO", idRpaPadrao);
        this.idRpaPadrao = idRpaPadrao;
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
        this.setOriginalVO(vo);
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxPool = vo.asBigDecimal("IDEFXPOOL");
        this.idRpaPadrao = vo.asBigDecimal("IDRPAPADRAO");
        return this;
   }
}
