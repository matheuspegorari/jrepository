package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroParadaEquipamento extends AbstractSankhyaEntity<RegistroParadaEquipamento> {
   public BigDecimal getCodEquip() {
        return this.getVo().asBigDecimal("CODEQUIP");
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
   }

   public BigDecimal getCodMotPar() {
        return this.getVo().asBigDecimal("CODMOTPAR");
   }

   public void setCodMotPar(BigDecimal codMotPar) {
        markAsChanged("CODMOTPAR", codMotPar);
   }

   public Timestamp getDhFim() {
        return this.getVo().asTimestamp("DHFIM");
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
   }

   public Timestamp getDhInicio() {
        return this.getVo().asTimestamp("DHINICIO");
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   @Override
   public String getTableName() {
        return "TGWRPR";
   }

   @Override
   public String getEntityName() {
        return "RegistroParadaEquipamento";
   }

   @Override
   public RegistroParadaEquipamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
