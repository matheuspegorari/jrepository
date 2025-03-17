package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContasDemonstrativo extends AbstractSankhyaEntity<ContasDemonstrativo> {
   private String codDmt;
   private BigDecimal codTdm;
   private BigDecimal codCtaCtb;
   private BigDecimal codEmp;

   public String getCodDmt() {
        return codDmt;
   }

   public void setCodDmt(String codDmt) {
        this.codDmt = codDmt;
   }

   public BigDecimal getCodTdm() {
        return codTdm;
   }

   public void setCodTdm(BigDecimal codTdm) {
        this.codTdm = codTdm;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   @Override
   public String getTableName() {
        return "TCBCDM";
   }

   @Override
   public String getEntityName() {
        return "ContasDemonstrativo";
   }

   @Override
   public ContasDemonstrativo fromVO(DynamicVO vo) {
        this.codDmt = vo.asString("CODDMT");
        this.codTdm = vo.asBigDecimal("CODTDM");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        return this;
   }
}
