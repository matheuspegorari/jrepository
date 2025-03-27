package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MetaContabil extends AbstractSankhyaEntity<MetaContabil> {
   public BigDecimal getCodCco() {
        return this.getVo().asBigDecimal("CODCCO");
   }

   public void setCodCco(BigDecimal codCco) {
        markAsChanged("CODCCO", codCco);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCtactb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtactb(BigDecimal codCtactb) {
        markAsChanged("CODCTACTB", codCtactb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getNuPeriodoctb() {
        return this.getVo().asBigDecimal("NUPERIODOCTB");
   }

   public void setNuPeriodoctb(BigDecimal nuPeriodoctb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoctb);
   }

   public BigDecimal getPrevisto() {
        return this.getVo().asBigDecimal("PREVISTO");
   }

   public void setPrevisto(BigDecimal previsto) {
        markAsChanged("PREVISTO", previsto);
   }

   public BigDecimal getRealizado() {
        return this.getVo().asBigDecimal("REALIZADO");
   }

   public void setRealizado(BigDecimal realizado) {
        markAsChanged("REALIZADO", realizado);
   }

   public String getRecDesp() {
        return this.getVo().asString("RECDESP");
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   @Override
   public String getTableName() {
        return "TCBMET";
   }

   @Override
   public String getEntityName() {
        return "MetaContabil";
   }

   @Override
   public MetaContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
