package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioBem extends AbstractSankhyaEntity<InventarioBem> {
   public String getAjustado() {
        return this.getVo().asString("AJUSTADO");
   }

   public void setAjustado(String ajustado) {
        markAsChanged("AJUSTADO", ajustado);
   }

   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public BigDecimal getCodDepCp() {
        return this.getVo().asBigDecimal("CODDEPCP");
   }

   public void setCodDepCp(BigDecimal codDepCp) {
        markAsChanged("CODDEPCP", codDepCp);
   }

   public BigDecimal getCodDepCt() {
        return this.getVo().asBigDecimal("CODDEPCT");
   }

   public void setCodDepCt(BigDecimal codDepCt) {
        markAsChanged("CODDEPCT", codDepCt);
   }

   public BigDecimal getCodDepSis() {
        return this.getVo().asBigDecimal("CODDEPSIS");
   }

   public void setCodDepSis(BigDecimal codDepSis) {
        markAsChanged("CODDEPSIS", codDepSis);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpSis() {
        return this.getVo().asBigDecimal("CODEMPSIS");
   }

   public void setCodEmpSis(BigDecimal codEmpSis) {
        markAsChanged("CODEMPSIS", codEmpSis);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDtInvent() {
        return this.getVo().asTimestamp("DTINVENT");
   }

   public void setDtInvent(Timestamp dtInvent) {
        markAsChanged("DTINVENT", dtInvent);
   }

   public String getExistenacp() {
        return this.getVo().asString("EXISTENACP");
   }

   public void setExistenacp(String existenacp) {
        markAsChanged("EXISTENACP", existenacp);
   }

   public String getExistenact() {
        return this.getVo().asString("EXISTENACT");
   }

   public void setExistenact(String existenact) {
        markAsChanged("EXISTENACT", existenact);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   @Override
   public String getTableName() {
        return "TCICTE";
   }

   @Override
   public String getEntityName() {
        return "InventarioBem";
   }

   @Override
   public InventarioBem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
