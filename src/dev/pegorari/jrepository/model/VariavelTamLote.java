package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VariavelTamLote extends AbstractSankhyaEntity<VariavelTamLote> {
   private String expressao;
   private BigDecimal idFormula;
   private String nomeVar;
   private BigDecimal ordem;

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

   public String getNomeVar() {
        return nomeVar;
   }

   public void setNomeVar(String nomeVar) {
        markAsChanged("NOMEVAR", nomeVar);
        this.nomeVar = nomeVar;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
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
        this.expressao = vo.asString("EXPRESSAO");
        this.idFormula = vo.asBigDecimal("IDFORMULA");
        this.nomeVar = vo.asString("NOMEVAR");
        this.ordem = vo.asBigDecimal("ORDEM");
        return this;
   }
}
