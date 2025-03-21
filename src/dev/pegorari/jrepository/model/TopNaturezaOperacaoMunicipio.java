package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TopNaturezaOperacaoMunicipio extends AbstractSankhyaEntity<TopNaturezaOperacaoMunicipio> {
   private BigDecimal codEmp;
   private BigDecimal codTipOper;
   private String codNatOper;
   private BigDecimal sequencia;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public String getCodNatOper() {
        return codNatOper;
   }

   public void setCodNatOper(String codNatOper) {
        markAsChanged("CODNATOPER", codNatOper);
        this.codNatOper = codNatOper;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codNatOper = vo.asString("CODNATOPER");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
