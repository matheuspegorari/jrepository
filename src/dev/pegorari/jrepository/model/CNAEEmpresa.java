package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CNAEEmpresa extends AbstractSankhyaEntity<CNAEEmpresa> {
   public String getCnae() {
        return this.getVo().asString("CNAE");
   }

   public void setCnae(String cnae) {
        markAsChanged("CNAE", cnae);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getLocTribNormal() {
        return this.getVo().asString("LOCTRIBNORMAL");
   }

   public void setLocTribNormal(String locTribNormal) {
        markAsChanged("LOCTRIBNORMAL", locTribNormal);
   }

   public String getLocTribRetido() {
        return this.getVo().asString("LOCTRIBRETIDO");
   }

   public void setLocTribRetido(String locTribRetido) {
        markAsChanged("LOCTRIBRETIDO", locTribRetido);
   }

   @Override
   public String getTableName() {
        return "TGFCNAE";
   }

   @Override
   public String getEntityName() {
        return "CNAEEmpresa";
   }

   @Override
   public CNAEEmpresa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
