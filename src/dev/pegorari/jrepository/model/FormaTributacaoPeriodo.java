package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FormaTributacaoPeriodo extends AbstractSankhyaEntity<FormaTributacaoPeriodo> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getMes3BalRed() {
        return this.getVo().asString("MES3BALRED");
   }

   public void setMes3BalRed(String mes3BalRed) {
        markAsChanged("MES3BALRED", mes3BalRed);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getMes2BalRed() {
        return this.getVo().asString("MES2BALRED");
   }

   public void setMes2BalRed(String mes2BalRed) {
        markAsChanged("MES2BALRED", mes2BalRed);
   }

   public BigDecimal getTrimestre() {
        return this.getVo().asBigDecimal("TRIMESTRE");
   }

   public void setTrimestre(BigDecimal trimestre) {
        markAsChanged("TRIMESTRE", trimestre);
   }

   public BigDecimal getExercicio() {
        return this.getVo().asBigDecimal("EXERCICIO");
   }

   public void setExercicio(BigDecimal exercicio) {
        markAsChanged("EXERCICIO", exercicio);
   }

   public String getFormaTribPer() {
        return this.getVo().asString("FORMATRIBPER");
   }

   public void setFormaTribPer(String formaTribPer) {
        markAsChanged("FORMATRIBPER", formaTribPer);
   }

   public String getMes1BalRed() {
        return this.getVo().asString("MES1BALRED");
   }

   public void setMes1BalRed(String mes1BalRed) {
        markAsChanged("MES1BALRED", mes1BalRed);
   }

   @Override
   public String getTableName() {
        return "TCBFTR";
   }

   @Override
   public String getEntityName() {
        return "FormaTributacaoPeriodo";
   }

   @Override
   public FormaTributacaoPeriodo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
