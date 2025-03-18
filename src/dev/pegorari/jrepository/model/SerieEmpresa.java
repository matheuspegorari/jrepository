package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieEmpresa extends AbstractSankhyaEntity<SerieEmpresa> {
   private BigDecimal codEmp;
   private BigDecimal codTipOper;
   private BigDecimal sequencia;
   private String serie;

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

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   @Override
   public String getTableName() {
        return "TGFSPE";
   }

   @Override
   public String getEntityName() {
        return "SerieEmpresa";
   }

   @Override
   public SerieEmpresa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serie = vo.asString("SERIE");
        return this;
   }
}
