package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PerfilProspect extends AbstractSankhyaEntity<PerfilProspect> {
   public BigDecimal getCodPap() {
        return this.getVo().asBigDecimal("CODPAP");
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   @Override
   public String getTableName() {
        return "TCSPPP";
   }

   @Override
   public String getEntityName() {
        return "PerfilProspect";
   }

   @Override
   public PerfilProspect fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
