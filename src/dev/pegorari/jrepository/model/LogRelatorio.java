package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogRelatorio extends AbstractSankhyaEntity<LogRelatorio> {
   private String className;
   private BigDecimal codUsu;
   private String consulta;
   private Timestamp dtAlter;
   private String impressora;
   private BigDecimal nuRel;
   private String tipo;

   public String getClassName() {
        return className;
   }

   public void setClassName(String className) {
        this.className = className;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getConsulta() {
        return consulta;
   }

   public void setConsulta(String consulta) {
        this.consulta = consulta;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getImpressora() {
        return impressora;
   }

   public void setImpressora(String impressora) {
        this.impressora = impressora;
   }

   public BigDecimal getNuRel() {
        return nuRel;
   }

   public void setNuRel(BigDecimal nuRel) {
        this.nuRel = nuRel;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
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
        this.className = vo.asString("CLASSNAME");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.consulta = vo.asString("CONSULTA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.impressora = vo.asString("IMPRESSORA");
        this.nuRel = vo.asBigDecimal("NUREL");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
