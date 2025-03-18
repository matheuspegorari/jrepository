package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormulaIcms extends AbstractSankhyaEntity<FormulaIcms> {
   private BigDecimal codForm;
   private String descrForm;
   private String formula;

   public BigDecimal getCodForm() {
        return codForm;
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
        this.codForm = codForm;
   }

   public String getDescrForm() {
        return descrForm;
   }

   public void setDescrForm(String descrForm) {
        markAsChanged("DESCRFORM", descrForm);
        this.descrForm = descrForm;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
        this.formula = formula;
   }

   @Override
   public String getTableName() {
        return "TGFFIC";
   }

   @Override
   public String getEntityName() {
        return "FormulaIcms";
   }

   @Override
   public FormulaIcms fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codForm = vo.asBigDecimal("CODFORM");
        this.descrForm = vo.asString("DESCRFORM");
        this.formula = vo.asString("FORMULA");
        return this;
   }
}
