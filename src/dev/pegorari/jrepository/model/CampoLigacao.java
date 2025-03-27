package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CampoLigacao extends AbstractSankhyaEntity<CampoLigacao> {
   public BigDecimal getNuCampoDest() {
        return this.getVo().asBigDecimal("NUCAMPODEST");
   }

   public void setNuCampoDest(BigDecimal nuCampoDest) {
        markAsChanged("NUCAMPODEST", nuCampoDest);
   }

   public BigDecimal getNuCampoOrig() {
        return this.getVo().asBigDecimal("NUCAMPOORIG");
   }

   public void setNuCampoOrig(BigDecimal nuCampoOrig) {
        markAsChanged("NUCAMPOORIG", nuCampoOrig);
   }

   public BigDecimal getNuInstDest() {
        return this.getVo().asBigDecimal("NUINSTDEST");
   }

   public void setNuInstDest(BigDecimal nuInstDest) {
        markAsChanged("NUINSTDEST", nuInstDest);
   }

   public BigDecimal getNuInstOrig() {
        return this.getVo().asBigDecimal("NUINSTORIG");
   }

   public void setNuInstOrig(BigDecimal nuInstOrig) {
        markAsChanged("NUINSTORIG", nuInstOrig);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getOrigObrigatoria() {
        return this.getVo().asString("ORIG_OBRIGATORIA");
   }

   public void setOrigObrigatoria(String origObrigatoria) {
        markAsChanged("ORIG_OBRIGATORIA", origObrigatoria);
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
        this.setVo(vo);
        return this;
   }
}
