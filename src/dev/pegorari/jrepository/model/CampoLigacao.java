package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CampoLigacao extends AbstractSankhyaEntity<CampoLigacao> {
   private BigDecimal nuCampoDest;
   private BigDecimal nuCampoOrig;
   private BigDecimal nuInstDest;
   private BigDecimal nuInstOrig;
   private BigDecimal ordem;
   private String origObrigatoria;

   public BigDecimal getNuCampoDest() {
        return nuCampoDest;
   }

   public void setNuCampoDest(BigDecimal nuCampoDest) {
        this.nuCampoDest = nuCampoDest;
   }

   public BigDecimal getNuCampoOrig() {
        return nuCampoOrig;
   }

   public void setNuCampoOrig(BigDecimal nuCampoOrig) {
        this.nuCampoOrig = nuCampoOrig;
   }

   public BigDecimal getNuInstDest() {
        return nuInstDest;
   }

   public void setNuInstDest(BigDecimal nuInstDest) {
        this.nuInstDest = nuInstDest;
   }

   public BigDecimal getNuInstOrig() {
        return nuInstOrig;
   }

   public void setNuInstOrig(BigDecimal nuInstOrig) {
        this.nuInstOrig = nuInstOrig;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getOrigObrigatoria() {
        return origObrigatoria;
   }

   public void setOrigObrigatoria(String origObrigatoria) {
        this.origObrigatoria = origObrigatoria;
   }

   @Override
   public String getTableName() {
        return "TDDLGC";
   }

   @Override
   public String getEntityName() {
        return "CampoLigacao";
   }

   @Override
   public CampoLigacao fromVO(DynamicVO vo) {
        this.nuCampoDest = vo.asBigDecimal("NUCAMPODEST");
        this.nuCampoOrig = vo.asBigDecimal("NUCAMPOORIG");
        this.nuInstDest = vo.asBigDecimal("NUINSTDEST");
        this.nuInstOrig = vo.asBigDecimal("NUINSTORIG");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.origObrigatoria = vo.asString("ORIG_OBRIGATORIA");
        return this;
   }
}
