package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroParadaEquipamento extends AbstractSankhyaEntity<RegistroParadaEquipamento> {
   private BigDecimal codEquip;
   private BigDecimal codMotPar;
   private Timestamp dhFim;
   private Timestamp dhInicio;
   private String observacao;

   public BigDecimal getCodEquip() {
        return codEquip;
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
        this.codEquip = codEquip;
   }

   public BigDecimal getCodMotPar() {
        return codMotPar;
   }

   public void setCodMotPar(BigDecimal codMotPar) {
        markAsChanged("CODMOTPAR", codMotPar);
        this.codMotPar = codMotPar;
   }

   public Timestamp getDhFim() {
        return dhFim;
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
        this.dhFim = dhFim;
   }

   public Timestamp getDhInicio() {
        return dhInicio;
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
        this.dhInicio = dhInicio;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
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
        this.setOriginalVO(vo);
        this.codEquip = vo.asBigDecimal("CODEQUIP");
        this.codMotPar = vo.asBigDecimal("CODMOTPAR");
        this.dhFim = vo.asTimestamp("DHFIM");
        this.dhInicio = vo.asTimestamp("DHINICIO");
        this.observacao = vo.asString("OBSERVACAO");
        return this;
   }
}
