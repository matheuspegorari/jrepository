package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoEquipamento extends AbstractSankhyaEntity<TipoEquipamento> {
   private String ativo;
   private BigDecimal codTipEquip;
   private String descricao;
   private BigDecimal m3Max;
   private BigDecimal nivelMax;
   private BigDecimal nivelMin;
   private BigDecimal pesoMax;
   private BigDecimal pesoMin;
   private String tipo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
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

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
        this.m3Max = m3Max;
   }

   public BigDecimal getNivelMax() {
        return nivelMax;
   }

   public void setNivelMax(BigDecimal nivelMax) {
        markAsChanged("NIVELMAX", nivelMax);
        this.nivelMax = nivelMax;
   }

   public BigDecimal getNivelMin() {
        return nivelMin;
   }

   public void setNivelMin(BigDecimal nivelMin) {
        markAsChanged("NIVELMIN", nivelMin);
        this.nivelMin = nivelMin;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
        this.pesoMax = pesoMax;
   }

   public BigDecimal getPesoMin() {
        return pesoMin;
   }

   public void setPesoMin(BigDecimal pesoMin) {
        markAsChanged("PESOMIN", pesoMin);
        this.pesoMin = pesoMin;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codTipEquip = vo.asBigDecimal("CODTIPEQUIP");
        this.descricao = vo.asString("DESCRICAO");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.nivelMax = vo.asBigDecimal("NIVELMAX");
        this.nivelMin = vo.asBigDecimal("NIVELMIN");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.pesoMin = vo.asBigDecimal("PESOMIN");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
