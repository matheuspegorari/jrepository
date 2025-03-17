package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Formula extends AbstractSankhyaEntity<Formula> {
   private String formulaWeb;
   private String tipDist;
   private String tipForm;
   private BigDecimal codForm;
   private String descrForm;
   private String formula;
   private BigDecimal indCusto;
   private String considerarRateio;

   public String getFormulaWeb() {
        return formulaWeb;
   }

   public void setFormulaWeb(String formulaWeb) {
        this.formulaWeb = formulaWeb;
   }

   public String getTipDist() {
        return tipDist;
   }

   public void setTipDist(String tipDist) {
        this.tipDist = tipDist;
   }

   public String getTipForm() {
        return tipForm;
   }

   public void setTipForm(String tipForm) {
        this.tipForm = tipForm;
   }

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

   public BigDecimal getIndCusto() {
        return indCusto;
   }

   public void setIndCusto(BigDecimal indCusto) {
        this.indCusto = indCusto;
   }

   public String getConsiderarRateio() {
        return considerarRateio;
   }

   public void setConsiderarRateio(String considerarRateio) {
        this.considerarRateio = considerarRateio;
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
        this.formulaWeb = vo.asString("FORMULAWEB");
        this.tipDist = vo.asString("TIPDIST");
        this.tipForm = vo.asString("TIPFORM");
        this.codForm = vo.asBigDecimal("CODFORM");
        this.descrForm = vo.asString("DESCRFORM");
        this.formula = vo.asString("FORMULA");
        this.indCusto = vo.asBigDecimal("INDCUSTO");
        this.considerarRateio = vo.asString("CONSIDERARRATEIO");
        return this;
   }
}
