package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TopNaturezaOperacaoMunicipio extends AbstractSankhyaEntity<TopNaturezaOperacaoMunicipio> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getCodNatOper() {
        return this.getVo().asString("CODNATOPER");
   }

   public void setCodNatOper(String codNatOper) {
        markAsChanged("CODNATOPER", codNatOper);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFTNA";
   }

   @Override
   public String getEntityName() {
        return "TopNaturezaOperacaoMunicipio";
   }

   @Override
   public TopNaturezaOperacaoMunicipio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
