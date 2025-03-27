package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogRelatorio extends AbstractSankhyaEntity<LogRelatorio> {
   public String getClassName() {
        return this.getVo().asString("CLASSNAME");
   }

   public void setClassName(String className) {
        markAsChanged("CLASSNAME", className);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConsulta() {
        return this.getVo().asString("CONSULTA");
   }

   public void setConsulta(String consulta) {
        markAsChanged("CONSULTA", consulta);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getImpressora() {
        return this.getVo().asString("IMPRESSORA");
   }

   public void setImpressora(String impressora) {
        markAsChanged("IMPRESSORA", impressora);
   }

   public BigDecimal getNuRel() {
        return this.getVo().asBigDecimal("NUREL");
   }

   public void setNuRel(BigDecimal nuRel) {
        markAsChanged("NUREL", nuRel);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSILRE";
   }

   @Override
   public String getEntityName() {
        return "LogRelatorio";
   }

   @Override
   public LogRelatorio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
