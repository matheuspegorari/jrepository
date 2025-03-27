package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Formula extends AbstractSankhyaEntity<Formula> {
   public String getFormulaWeb() {
        return this.getVo().asString("FORMULAWEB");
   }

   public void setFormulaWeb(String formulaWeb) {
        markAsChanged("FORMULAWEB", formulaWeb);
   }

   public String getTipDist() {
        return this.getVo().asString("TIPDIST");
   }

   public void setTipDist(String tipDist) {
        markAsChanged("TIPDIST", tipDist);
   }

   public String getTipForm() {
        return this.getVo().asString("TIPFORM");
   }

   public void setTipForm(String tipForm) {
        markAsChanged("TIPFORM", tipForm);
   }

   public BigDecimal getCodForm() {
        return this.getVo().asBigDecimal("CODFORM");
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
   }

   public String getDescrForm() {
        return this.getVo().asString("DESCRFORM");
   }

   public void setDescrForm(String descrForm) {
        markAsChanged("DESCRFORM", descrForm);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public BigDecimal getIndCusto() {
        return this.getVo().asBigDecimal("INDCUSTO");
   }

   public void setIndCusto(BigDecimal indCusto) {
        markAsChanged("INDCUSTO", indCusto);
   }

   public String getConsiderarRateio() {
        return this.getVo().asString("CONSIDERARRATEIO");
   }

   public void setConsiderarRateio(String considerarRateio) {
        markAsChanged("CONSIDERARRATEIO", considerarRateio);
   }

   @Override
   public String getTableName() {
        return "TSIFOR";
   }

   @Override
   public String getEntityName() {
        return "Formula";
   }

   @Override
   public Formula fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
