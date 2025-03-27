package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DimensaoGrade extends AbstractSankhyaEntity<DimensaoGrade> {
   public String getAbVatb() {
        return this.getVo().asString("ABVATB");
   }

   public void setAbVatb(String abVatb) {
        markAsChanged("ABVATB", abVatb);
   }

   public BigDecimal getIdAtb() {
        return this.getVo().asBigDecimal("IDATB");
   }

   public void setIdAtb(BigDecimal idAtb) {
        markAsChanged("IDATB", idAtb);
   }

   public BigDecimal getIdGrade() {
        return this.getVo().asBigDecimal("IDGRADE");
   }

   public void setIdGrade(BigDecimal idGrade) {
        markAsChanged("IDGRADE", idGrade);
   }

   public String getNomeAtb() {
        return this.getVo().asString("NOMEATB");
   }

   public void setNomeAtb(String nomeAtb) {
        markAsChanged("NOMEATB", nomeAtb);
   }

   public BigDecimal getOrdCamp() {
        return this.getVo().asBigDecimal("ORDCAMP");
   }

   public void setOrdCamp(BigDecimal ordCamp) {
        markAsChanged("ORDCAMP", ordCamp);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getAtUnuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtUnuVersao(String atUnuVersao) {
        markAsChanged("ATUNUVERSAO", atUnuVersao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
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
        this.setVo(vo);
        return this;
   }
}
