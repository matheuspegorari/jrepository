package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormulaTamLote extends AbstractSankhyaEntity<FormulaTamLote> {
   public String getDescFormula() {
        return this.getVo().asString("DESCFORMULA");
   }

   public void setDescFormula(String descFormula) {
        markAsChanged("DESCFORMULA", descFormula);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public BigDecimal getIdFormula() {
        return this.getVo().asBigDecimal("IDFORMULA");
   }

   public void setIdFormula(BigDecimal idFormula) {
        markAsChanged("IDFORMULA", idFormula);
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
        this.setVo(vo);
        return this;
   }
}
