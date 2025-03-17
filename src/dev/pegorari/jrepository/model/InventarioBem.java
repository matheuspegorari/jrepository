package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioBem extends AbstractSankhyaEntity<InventarioBem> {
   private String ajustado;
   private String codBem;
   private BigDecimal codDepCp;
   private BigDecimal codDepCt;
   private BigDecimal codDepSis;
   private BigDecimal codEmp;
   private BigDecimal codEmpSis;
   private BigDecimal codProd;
   private Timestamp dtInvent;
   private String existenacp;
   private String existenact;
   private BigDecimal nuNota;

   public String getAjustado() {
        return ajustado;
   }

   public void setAjustado(String ajustado) {
        this.ajustado = ajustado;
   }

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        this.codBem = codBem;
   }

   public BigDecimal getCodDepCp() {
        return codDepCp;
   }

   public void setCodDepCp(BigDecimal codDepCp) {
        this.codDepCp = codDepCp;
   }

   public BigDecimal getCodDepCt() {
        return codDepCt;
   }

   public void setCodDepCt(BigDecimal codDepCt) {
        this.codDepCt = codDepCt;
   }

   public BigDecimal getCodDepSis() {
        return codDepSis;
   }

   public void setCodDepSis(BigDecimal codDepSis) {
        this.codDepSis = codDepSis;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpSis() {
        return codEmpSis;
   }

   public void setCodEmpSis(BigDecimal codEmpSis) {
        this.codEmpSis = codEmpSis;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public Timestamp getDtInvent() {
        return dtInvent;
   }

   public void setDtInvent(Timestamp dtInvent) {
        this.dtInvent = dtInvent;
   }

   public String getExistenacp() {
        return existenacp;
   }

   public void setExistenacp(String existenacp) {
        this.existenacp = existenacp;
   }

   public String getExistenact() {
        return existenact;
   }

   public void setExistenact(String existenact) {
        this.existenact = existenact;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
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
        this.ajustado = vo.asString("AJUSTADO");
        this.codBem = vo.asString("CODBEM");
        this.codDepCp = vo.asBigDecimal("CODDEPCP");
        this.codDepCt = vo.asBigDecimal("CODDEPCT");
        this.codDepSis = vo.asBigDecimal("CODDEPSIS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpSis = vo.asBigDecimal("CODEMPSIS");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dtInvent = vo.asTimestamp("DTINVENT");
        this.existenacp = vo.asString("EXISTENACP");
        this.existenact = vo.asString("EXISTENACT");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
