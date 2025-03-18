package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MetaContabil extends AbstractSankhyaEntity<MetaContabil> {
   private BigDecimal codCco;
   private BigDecimal codCencus;
   private BigDecimal codCtactb;
   private BigDecimal codEmp;
   private BigDecimal codProj;
   private Timestamp dhAlter;
   private Timestamp dtRef;
   private BigDecimal nuPeriodoctb;
   private BigDecimal previsto;
   private BigDecimal realizado;
   private String recDesp;

   public BigDecimal getCodCco() {
        return codCco;
   }

   public void setCodCco(BigDecimal codCco) {
        markAsChanged("CODCCO", codCco);
        this.codCco = codCco;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCtactb() {
        return codCtactb;
   }

   public void setCodCtactb(BigDecimal codCtactb) {
        markAsChanged("CODCTACTB", codCtactb);
        this.codCtactb = codCtactb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public BigDecimal getNuPeriodoctb() {
        return nuPeriodoctb;
   }

   public void setNuPeriodoctb(BigDecimal nuPeriodoctb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoctb);
        this.nuPeriodoctb = nuPeriodoctb;
   }

   public BigDecimal getPrevisto() {
        return previsto;
   }

   public void setPrevisto(BigDecimal previsto) {
        markAsChanged("PREVISTO", previsto);
        this.previsto = previsto;
   }

   public BigDecimal getRealizado() {
        return realizado;
   }

   public void setRealizado(BigDecimal realizado) {
        markAsChanged("REALIZADO", realizado);
        this.realizado = realizado;
   }

   public String getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
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
        this.setOriginalVO(vo);
        this.codCco = vo.asBigDecimal("CODCCO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCtactb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtRef = vo.asTimestamp("DTREF");
        this.nuPeriodoctb = vo.asBigDecimal("NUPERIODOCTB");
        this.previsto = vo.asBigDecimal("PREVISTO");
        this.realizado = vo.asBigDecimal("REALIZADO");
        this.recDesp = vo.asString("RECDESP");
        return this;
   }
}
