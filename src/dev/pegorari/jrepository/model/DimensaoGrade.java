package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DimensaoGrade extends AbstractSankhyaEntity<DimensaoGrade> {
   private String abVatb;
   private BigDecimal idAtb;
   private BigDecimal idGrade;
   private String nomeAtb;
   private BigDecimal ordCamp;
   private String tipo;
   private String atUnuVersao;
   private BigDecimal nuVersao;

   public String getAbVatb() {
        return abVatb;
   }

   public void setAbVatb(String abVatb) {
        markAsChanged("ABVATB", abVatb);
        this.abVatb = abVatb;
   }

   public BigDecimal getIdAtb() {
        return idAtb;
   }

   public void setIdAtb(BigDecimal idAtb) {
        markAsChanged("IDATB", idAtb);
        this.idAtb = idAtb;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        markAsChanged("IDGRADE", idGrade);
        this.idGrade = idGrade;
   }

   public String getNomeAtb() {
        return nomeAtb;
   }

   public void setNomeAtb(String nomeAtb) {
        markAsChanged("NOMEATB", nomeAtb);
        this.nomeAtb = nomeAtb;
   }

   public BigDecimal getOrdCamp() {
        return ordCamp;
   }

   public void setOrdCamp(BigDecimal ordCamp) {
        markAsChanged("ORDCAMP", ordCamp);
        this.ordCamp = ordCamp;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getAtUnuVersao() {
        return atUnuVersao;
   }

   public void setAtUnuVersao(String atUnuVersao) {
        markAsChanged("ATUNUVERSAO", atUnuVersao);
        this.atUnuVersao = atUnuVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
        this.nuVersao = nuVersao;
   }

   @Override
   public String getTableName() {
        return "TGFATB";
   }

   @Override
   public String getEntityName() {
        return "DimensaoGrade";
   }

   @Override
   public DimensaoGrade fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.abVatb = vo.asString("ABVATB");
        this.idAtb = vo.asBigDecimal("IDATB");
        this.idGrade = vo.asBigDecimal("IDGRADE");
        this.nomeAtb = vo.asString("NOMEATB");
        this.ordCamp = vo.asBigDecimal("ORDCAMP");
        this.tipo = vo.asString("TIPO");
        this.atUnuVersao = vo.asString("ATUNUVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        return this;
   }
}
