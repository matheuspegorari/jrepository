package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class IncidenciaPensao extends AbstractSankhyaEntity<IncidenciaPensao> {
   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getOrigPens() {
        return this.getVo().asString("ORIGPENS");
   }

   public void setOrigPens(String origPens) {
        markAsChanged("ORIGPENS", origPens);
   }

   @Override
   public String getTableName() {
        return "TFPINC";
   }

   @Override
   public String getEntityName() {
        return "IncidenciaPensao";
   }

   @Override
   public IncidenciaPensao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
