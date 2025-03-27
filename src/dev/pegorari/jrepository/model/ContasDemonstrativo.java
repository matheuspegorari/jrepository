package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContasDemonstrativo extends AbstractSankhyaEntity<ContasDemonstrativo> {
   public String getCodDmt() {
        return this.getVo().asString("CODDMT");
   }

   public void setCodDmt(String codDmt) {
        markAsChanged("CODDMT", codDmt);
   }

   public BigDecimal getCodTdm() {
        return this.getVo().asBigDecimal("CODTDM");
   }

   public void setCodTdm(BigDecimal codTdm) {
        markAsChanged("CODTDM", codTdm);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
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
        this.setVo(vo);
        return this;
   }
}
