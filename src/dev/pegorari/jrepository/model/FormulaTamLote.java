package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormulaTamLote extends AbstractSankhyaEntity<FormulaTamLote> {
   private String descFormula;
   private String expressao;
   private BigDecimal idFormula;

   public String getDescFormula() {
        return descFormula;
   }

   public void setDescFormula(String descFormula) {
        markAsChanged("DESCFORMULA", descFormula);
        this.descFormula = descFormula;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
        this.expressao = expressao;
   }

   public BigDecimal getIdFormula() {
        return idFormula;
   }

   public void setIdFormula(BigDecimal idFormula) {
        markAsChanged("IDFORMULA", idFormula);
        this.idFormula = idFormula;
   }

   @Override
   public String getTableName() {
        return "TPRFTL";
   }

   @Override
   public String getEntityName() {
        return "FormulaTamLote";
   }

   @Override
   public FormulaTamLote fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.descFormula = vo.asString("DESCFORMULA");
        this.expressao = vo.asString("EXPRESSAO");
        this.idFormula = vo.asBigDecimal("IDFORMULA");
        return this;
   }
}
