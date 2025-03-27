package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoEquipamento extends AbstractSankhyaEntity<TipoEquipamento> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
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

   public BigDecimal getM3Max() {
        return this.getVo().asBigDecimal("M3MAX");
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
   }

   public BigDecimal getNivelMax() {
        return this.getVo().asBigDecimal("NIVELMAX");
   }

   public void setNivelMax(BigDecimal nivelMax) {
        markAsChanged("NIVELMAX", nivelMax);
   }

   public BigDecimal getNivelMin() {
        return this.getVo().asBigDecimal("NIVELMIN");
   }

   public void setNivelMin(BigDecimal nivelMin) {
        markAsChanged("NIVELMIN", nivelMin);
   }

   public BigDecimal getPesoMax() {
        return this.getVo().asBigDecimal("PESOMAX");
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
   }

   public BigDecimal getPesoMin() {
        return this.getVo().asBigDecimal("PESOMIN");
   }

   public void setPesoMin(BigDecimal pesoMin) {
        markAsChanged("PESOMIN", pesoMin);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGWTEQ";
   }

   @Override
   public String getEntityName() {
        return "TipoEquipamento";
   }

   @Override
   public TipoEquipamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
