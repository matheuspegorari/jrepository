package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoEconomicoContrato extends AbstractSankhyaEntity<GrupoEconomicoContrato> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getPercCusto() {
        return this.getVo().asBigDecimal("PERCCUSTO");
   }

   public void setPercCusto(BigDecimal percCusto) {
        markAsChanged("PERCCUSTO", percCusto);
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
        this.setVo(vo);
        return this;
   }
}
