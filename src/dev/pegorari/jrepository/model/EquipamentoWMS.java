package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EquipamentoWMS extends AbstractSankhyaEntity<EquipamentoWMS> {
   private String ativo;
   private BigDecimal codEquip;
   private BigDecimal codTipEquip;
   private String descricao;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEquip() {
        return codEquip;
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
        this.codEquip = codEquip;
   }

   public BigDecimal getCodTipEquip() {
        return codTipEquip;
   }

   public void setCodTipEquip(BigDecimal codTipEquip) {
        markAsChanged("CODTIPEQUIP", codTipEquip);
        this.codTipEquip = codTipEquip;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
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
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codEquip = vo.asBigDecimal("CODEQUIP");
        this.codTipEquip = vo.asBigDecimal("CODTIPEQUIP");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
