package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GrupoPergunta extends AbstractSankhyaEntity<GrupoPergunta> {
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

   public BigDecimal getCodGrupoPerg() {
        return this.getVo().asBigDecimal("CODGRUPOPERG");
   }

   public void setCodGrupoPerg(BigDecimal codGrupoPerg) {
        markAsChanged("CODGRUPOPERG", codGrupoPerg);
   }

   public BigDecimal getCodGrupoPergPai() {
        return this.getVo().asBigDecimal("CODGRUPOPERGPAI");
   }

   public void setCodGrupoPergPai(BigDecimal codGrupoPergPai) {
        markAsChanged("CODGRUPOPERGPAI", codGrupoPergPai);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrGrupoPerg() {
        return this.getVo().asString("DESCRGRUPOPERG");
   }

   public void setDescrGrupoPerg(String descrGrupoPerg) {
        markAsChanged("DESCRGRUPOPERG", descrGrupoPerg);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   @Override
   public String getTableName() {
        return "TPQGRP";
   }

   @Override
   public String getEntityName() {
        return "GrupoPergunta";
   }

   @Override
   public GrupoPergunta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
