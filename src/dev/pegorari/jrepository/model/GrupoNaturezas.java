package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoNaturezas extends AbstractSankhyaEntity<GrupoNaturezas> {
   private String analitico;
   private String ativo;
   private BigDecimal codGrupoNat;
   private BigDecimal codGrupoNatPai;
   private String descrGrupoNat;
   private BigDecimal grau;
   private String tipNat;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodGrupoNat() {
        return codGrupoNat;
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
        this.codGrupoNat = codGrupoNat;
   }

   public BigDecimal getCodGrupoNatPai() {
        return codGrupoNatPai;
   }

   public void setCodGrupoNatPai(BigDecimal codGrupoNatPai) {
        markAsChanged("CODGRUPONATPAI", codGrupoNatPai);
        this.codGrupoNatPai = codGrupoNatPai;
   }

   public String getDescrGrupoNat() {
        return descrGrupoNat;
   }

   public void setDescrGrupoNat(String descrGrupoNat) {
        markAsChanged("DESCRGRUPONAT", descrGrupoNat);
        this.descrGrupoNat = descrGrupoNat;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getTipNat() {
        return tipNat;
   }

   public void setTipNat(String tipNat) {
        markAsChanged("TIPNAT", tipNat);
        this.tipNat = tipNat;
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
        this.setOriginalVO(vo);
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codGrupoNat = vo.asBigDecimal("CODGRUPONAT");
        this.codGrupoNatPai = vo.asBigDecimal("CODGRUPONATPAI");
        this.descrGrupoNat = vo.asString("DESCRGRUPONAT");
        this.grau = vo.asBigDecimal("GRAU");
        this.tipNat = vo.asString("TIPNAT");
        return this;
   }
}
