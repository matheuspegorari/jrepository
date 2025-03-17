package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class IncidenciaPensao implements SankhyaEntity<IncidenciaPensao> {

   private Timestamp dtAlter;
   private BigDecimal codEmp;
   private BigDecimal codEvento;
   private BigDecimal codFunc;
   private BigDecimal sequencia;
   private String origPens;

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        this.codEvento = codEvento;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getOrigPens() {
        return origPens;
   }

   public void setOrigPens(String origPens) {
        this.origPens = origPens;
   }

   @Override
   public String getEntityName() {
        return "IncidenciaPensao";
   }

   @Override
   public IncidenciaPensao fromVO(DynamicVO vo) {
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.origPens = vo.asString("ORIGPENS");
        return this;
   }
}
