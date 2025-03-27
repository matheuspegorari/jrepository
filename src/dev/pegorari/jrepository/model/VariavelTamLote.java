package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VariavelTamLote extends AbstractSankhyaEntity<VariavelTamLote> {
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

   public String getNomeVar() {
        return this.getVo().asString("NOMEVAR");
   }

   public void setNomeVar(String nomeVar) {
        markAsChanged("NOMEVAR", nomeVar);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   @Override
   public String getTableName() {
        return "TPRVFTL";
   }

   @Override
   public String getEntityName() {
        return "VariavelTamLote";
   }

   @Override
   public VariavelTamLote fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
