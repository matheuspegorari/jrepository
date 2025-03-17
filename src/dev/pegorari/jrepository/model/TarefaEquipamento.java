package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TarefaEquipamento extends AbstractSankhyaEntity<TarefaEquipamento> {
   private BigDecimal codTarefa;
   private BigDecimal codTipEquip;

   public BigDecimal getCodTarefa() {
        return codTarefa;
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        this.codTarefa = codTarefa;
   }

   public BigDecimal getCodTipEquip() {
        return codTipEquip;
   }

   public void setCodTipEquip(BigDecimal codTipEquip) {
        this.codTipEquip = codTipEquip;
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
        this.codTarefa = vo.asBigDecimal("CODTAREFA");
        this.codTipEquip = vo.asBigDecimal("CODTIPEQUIP");
        return this;
   }
}
