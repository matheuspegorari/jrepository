package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoEconomicoContrato extends AbstractSankhyaEntity<GrupoEconomicoContrato> {
   private BigDecimal codParc;
   private BigDecimal numContrato;
   private BigDecimal percCusto;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getPercCusto() {
        return percCusto;
   }

   public void setPercCusto(BigDecimal percCusto) {
        this.percCusto = percCusto;
   }

   @Override
   public String getTableName() {
        return "TCSGEC";
   }

   @Override
   public String getEntityName() {
        return "GrupoEconomicoContrato";
   }

   @Override
   public GrupoEconomicoContrato fromVO(DynamicVO vo) {
        this.codParc = vo.asBigDecimal("CODPARC");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.percCusto = vo.asBigDecimal("PERCCUSTO");
        return this;
   }
}
