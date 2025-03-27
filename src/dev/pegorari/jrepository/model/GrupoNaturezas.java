package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoNaturezas extends AbstractSankhyaEntity<GrupoNaturezas> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodGrupoNat() {
        return this.getVo().asBigDecimal("CODGRUPONAT");
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
   }

   public BigDecimal getCodGrupoNatPai() {
        return this.getVo().asBigDecimal("CODGRUPONATPAI");
   }

   public void setCodGrupoNatPai(BigDecimal codGrupoNatPai) {
        markAsChanged("CODGRUPONATPAI", codGrupoNatPai);
   }

   public String getDescrGrupoNat() {
        return this.getVo().asString("DESCRGRUPONAT");
   }

   public void setDescrGrupoNat(String descrGrupoNat) {
        markAsChanged("DESCRGRUPONAT", descrGrupoNat);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getTipNat() {
        return this.getVo().asString("TIPNAT");
   }

   public void setTipNat(String tipNat) {
        markAsChanged("TIPNAT", tipNat);
   }

   @Override
   public String getTableName() {
        return "TGFGNT";
   }

   @Override
   public String getEntityName() {
        return "GrupoNaturezas";
   }

   @Override
   public GrupoNaturezas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
