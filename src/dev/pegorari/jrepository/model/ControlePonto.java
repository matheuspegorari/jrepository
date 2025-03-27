package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControlePonto extends AbstractSankhyaEntity<ControlePonto> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodHistocor() {
        return this.getVo().asBigDecimal("CODHISTOCOR");
   }

   public void setCodHistocor(BigDecimal codHistocor) {
        markAsChanged("CODHISTOCOR", codHistocor);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public BigDecimal getEntrada() {
        return this.getVo().asBigDecimal("ENTRADA");
   }

   public void setEntrada(BigDecimal entrada) {
        markAsChanged("ENTRADA", entrada);
   }

   public String getFalta() {
        return this.getVo().asString("FALTA");
   }

   public void setFalta(String falta) {
        markAsChanged("FALTA", falta);
   }

   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNuOcor() {
        return this.getVo().asBigDecimal("NUOCOR");
   }

   public void setNuOcor(BigDecimal nuOcor) {
        markAsChanged("NUOCOR", nuOcor);
   }

   public BigDecimal getSaida() {
        return this.getVo().asBigDecimal("SAIDA");
   }

   public void setSaida(BigDecimal saida) {
        markAsChanged("SAIDA", saida);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTurno() {
        return this.getVo().asBigDecimal("TURNO");
   }

   public void setTurno(BigDecimal turno) {
        markAsChanged("TURNO", turno);
   }

   @Override
   public String getTableName() {
        return "TFPPON";
   }

   @Override
   public String getEntityName() {
        return "ControlePonto";
   }

   @Override
   public ControlePonto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
