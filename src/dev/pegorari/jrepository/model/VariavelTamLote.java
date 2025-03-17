package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class VariavelTamLote implements SankhyaEntity<VariavelTamLote> {

   private String expressao;
   private BigDecimal idFormula;
   private String nomeVar;
   private BigDecimal ordem;

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   public BigDecimal getIdFormula() {
        return idFormula;
   }

   public void setIdFormula(BigDecimal idFormula) {
        this.idFormula = idFormula;
   }

   public String getNomeVar() {
        return nomeVar;
   }

   public void setNomeVar(String nomeVar) {
        this.nomeVar = nomeVar;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   @Override
   public String getEntityName() {
        return "VariavelTamLote";
   }

   @Override
   public VariavelTamLote fromVO(DynamicVO vo) {
        this.expressao = vo.asString("EXPRESSAO");
        this.idFormula = vo.asBigDecimal("IDFORMULA");
        this.nomeVar = vo.asString("NOMEVAR");
        this.ordem = vo.asBigDecimal("ORDEM");
        return this;
   }
}
