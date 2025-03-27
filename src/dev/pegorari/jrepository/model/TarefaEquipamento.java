package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TarefaEquipamento extends AbstractSankhyaEntity<TarefaEquipamento> {
   public BigDecimal getCodTarefa() {
        return this.getVo().asBigDecimal("CODTAREFA");
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        markAsChanged("CODTAREFA", codTarefa);
   }

   public BigDecimal getCodTipEquip() {
        return this.getVo().asBigDecimal("CODTIPEQUIP");
   }

   public void setCodTipEquip(BigDecimal codTipEquip) {
        markAsChanged("CODTIPEQUIP", codTipEquip);
   }

   @Override
   public String getTableName() {
        return "TGWTTE";
   }

   @Override
   public String getEntityName() {
        return "TarefaEquipamento";
   }

   @Override
   public TarefaEquipamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
