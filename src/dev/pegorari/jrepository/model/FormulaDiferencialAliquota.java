package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormulaDiferencialAliquota extends AbstractSankhyaEntity<FormulaDiferencialAliquota> {
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

   @Override
   public String getTableName() {
        return "TGFFDA";
   }

   @Override
   public String getEntityName() {
        return "FormulaDiferencialAliquota";
   }

   @Override
   public FormulaDiferencialAliquota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
