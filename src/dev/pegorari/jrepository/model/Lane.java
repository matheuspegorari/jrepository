package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Lane implements SankhyaEntity<Lane> {

   private BigDecimal ideFx;
   private BigDecimal ideFxPool;
   private BigDecimal idRpPadrao;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxPool() {
        return ideFxPool;
   }

   public void setIdeFxPool(BigDecimal ideFxPool) {
        this.ideFxPool = ideFxPool;
   }

   public BigDecimal getIdRpPadrao() {
        return idRpPadrao;
   }

   public void setIdRpPadrao(BigDecimal idRpPadrao) {
        this.idRpPadrao = idRpPadrao;
   }

   @Override
   public String getEntityName() {
        return "Lane";
   }

   @Override
   public Lane fromVO(DynamicVO vo) {
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxPool = vo.asBigDecimal("IDEFXPOOL");
        this.idRpPadrao = vo.asBigDecimal("IDRPPADRAO");
        return this;
   }
}
