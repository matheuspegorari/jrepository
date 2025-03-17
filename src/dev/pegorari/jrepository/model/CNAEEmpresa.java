package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CNAEEmpresa implements SankhyaEntity<CNAEEmpresa> {

   private String cnae;
   private BigDecimal codEmp;
   private String locTribNormal;
   private String locTribRetido;

   public String getCnae() {
        return cnae;
   }

   public void setCnae(String cnae) {
        this.cnae = cnae;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getLocTribNormal() {
        return locTribNormal;
   }

   public void setLocTribNormal(String locTribNormal) {
        this.locTribNormal = locTribNormal;
   }

   public String getLocTribRetido() {
        return locTribRetido;
   }

   public void setLocTribRetido(String locTribRetido) {
        this.locTribRetido = locTribRetido;
   }

   @Override
   public String getEntityName() {
        return "CNAEEmpresa";
   }

   @Override
   public CNAEEmpresa fromVO(DynamicVO vo) {
        this.cnae = vo.asString("CNAE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.locTribNormal = vo.asString("LOCTRIBNORMAL");
        this.locTribRetido = vo.asString("LOCTRIBRETIDO");
        return this;
   }
}
