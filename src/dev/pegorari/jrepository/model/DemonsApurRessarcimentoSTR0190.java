package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0190 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0190> {
   private BigDecimal codEmp;
   private String descr;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String reg;
   private String unid;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getDescr() {
        return descr;
   }

   public void setDescr(String descr) {
        this.descr = descr;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   public String getUnid() {
        return unid;
   }

   public void setUnid(String unid) {
        this.unid = unid;
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0190";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0190";
   }

   @Override
   public DemonsApurRessarcimentoSTR0190 fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.descr = vo.asString("DESCR");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.reg = vo.asString("REG");
        this.unid = vo.asString("UNID");
        return this;
   }
}
