package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class TipoEquipamentoUnidade implements SankhyaEntity<TipoEquipamentoUnidade> {

   private BigDecimal codTipEquip;
   private String codVol;

   public BigDecimal getCodTipEquip() {
        return codTipEquip;
   }

   public void setCodTipEquip(BigDecimal codTipEquip) {
        this.codTipEquip = codTipEquip;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   @Override
   public String getEntityName() {
        return "TipoEquipamentoUnidade";
   }

   @Override
   public TipoEquipamentoUnidade fromVO(DynamicVO vo) {
        this.codTipEquip = vo.asBigDecimal("CODTIPEQUIP");
        this.codVol = vo.asString("CODVOL");
        return this;
   }
}
