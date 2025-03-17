package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FormaTributacaoPeriodo implements SankhyaEntity<FormaTributacaoPeriodo> {

   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private String mes3BalRed;
   private BigDecimal codEmp;
   private String mes2BalRed;
   private BigDecimal trimestre;
   private BigDecimal exercicio;
   private String formaTribPer;
   private String mes1BalRed;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getMes3BalRed() {
        return mes3BalRed;
   }

   public void setMes3BalRed(String mes3BalRed) {
        this.mes3BalRed = mes3BalRed;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getMes2BalRed() {
        return mes2BalRed;
   }

   public void setMes2BalRed(String mes2BalRed) {
        this.mes2BalRed = mes2BalRed;
   }

   public BigDecimal getTrimestre() {
        return trimestre;
   }

   public void setTrimestre(BigDecimal trimestre) {
        this.trimestre = trimestre;
   }

   public BigDecimal getExercicio() {
        return exercicio;
   }

   public void setExercicio(BigDecimal exercicio) {
        this.exercicio = exercicio;
   }

   public String getFormaTribPer() {
        return formaTribPer;
   }

   public void setFormaTribPer(String formaTribPer) {
        this.formaTribPer = formaTribPer;
   }

   public String getMes1BalRed() {
        return mes1BalRed;
   }

   public void setMes1BalRed(String mes1BalRed) {
        this.mes1BalRed = mes1BalRed;
   }

   @Override
   public String getEntityName() {
        return "FormaTributacaoPeriodo";
   }

   @Override
   public FormaTributacaoPeriodo fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.mes3BalRed = vo.asString("MES3BALRED");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.mes2BalRed = vo.asString("MES2BALRED");
        this.trimestre = vo.asBigDecimal("TRIMESTRE");
        this.exercicio = vo.asBigDecimal("EXERCICIO");
        this.formaTribPer = vo.asString("FORMATRIBPER");
        this.mes1BalRed = vo.asString("MES1BALRED");
        return this;
   }
}
