package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EquipamentoWMS extends AbstractSankhyaEntity<EquipamentoWMS> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEquip() {
        return this.getVo().asBigDecimal("CODEQUIP");
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
   }

   public BigDecimal getCodTipEquip() {
        return this.getVo().asBigDecimal("CODTIPEQUIP");
   }

   public void setCodTipEquip(BigDecimal codTipEquip) {
        markAsChanged("CODTIPEQUIP", codTipEquip);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   @Override
   public String getTableName() {
        return "TGWEQP";
   }

   @Override
   public String getEntityName() {
        return "EquipamentoWMS";
   }

   @Override
   public EquipamentoWMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
