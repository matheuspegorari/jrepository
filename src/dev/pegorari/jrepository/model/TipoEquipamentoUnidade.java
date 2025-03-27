package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoEquipamentoUnidade extends AbstractSankhyaEntity<TipoEquipamentoUnidade> {
   public BigDecimal getCodTipEquip() {
        return this.getVo().asBigDecimal("CODTIPEQUIP");
   }

   public void setCodTipEquip(BigDecimal codTipEquip) {
        markAsChanged("CODTIPEQUIP", codTipEquip);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   @Override
   public String getTableName() {
        return "TGWUTE";
   }

   @Override
   public String getEntityName() {
        return "TipoEquipamentoUnidade";
   }

   @Override
   public TipoEquipamentoUnidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
