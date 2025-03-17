package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FormulaDiferencialAliquota implements SankhyaEntity<FormulaDiferencialAliquota> {

   private BigDecimal codForm;
   private String descrForm;
   private String formula;

   public BigDecimal getCodForm() {
        return codForm;
   }

   public void setCodForm(BigDecimal codForm) {
        this.codForm = codForm;
   }

   public String getDescrForm() {
        return descrForm;
   }

   public void setDescrForm(String descrForm) {
        this.descrForm = descrForm;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        this.formula = formula;
   }

   @Override
   public String getEntityName() {
        return "FormulaDiferencialAliquota";
   }

   @Override
   public FormulaDiferencialAliquota fromVO(DynamicVO vo) {
        this.codForm = vo.asBigDecimal("CODFORM");
        this.descrForm = vo.asString("DESCRFORM");
        this.formula = vo.asString("FORMULA");
        return this;
   }
}
