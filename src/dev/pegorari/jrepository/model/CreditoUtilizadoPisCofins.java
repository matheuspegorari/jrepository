package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CreditoUtilizadoPisCofins extends AbstractSankhyaEntity<CreditoUtilizadoPisCofins> {
   public String getCnpj() {
        return this.getVo().asString("CNPJ");
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
   }

   public String getCnpjSuc() {
        return this.getVo().asString("CNPJ_SUC");
   }

   public void setCnpjSuc(String cnpjSuc) {
        markAsChanged("CNPJ_SUC", cnpjSuc);
   }

   public BigDecimal getCodemp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodemp(BigDecimal codemp) {
        markAsChanged("CODEMP", codemp);
   }

   public BigDecimal getCodCred() {
        return this.getVo().asBigDecimal("COD_CRED");
   }

   public void setCodCred(BigDecimal codCred) {
        markAsChanged("COD_CRED", codCred);
   }

   public String getOrigCred() {
        return this.getVo().asString("ORIG_CRED");
   }

   public void setOrigCred(String origCred) {
        markAsChanged("ORIG_CRED", origCred);
   }

   public Timestamp getPerApuCred() {
        return this.getVo().asTimestamp("PER_APU_CRED");
   }

   public void setPerApuCred(Timestamp perApuCred) {
        markAsChanged("PER_APU_CRED", perApuCred);
   }

   public Timestamp getPerUtiCred() {
        return this.getVo().asTimestamp("PER_UTI_CRED");
   }

   public void setPerUtiCred(Timestamp perUtiCred) {
        markAsChanged("PER_UTI_CRED", perUtiCred);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVlCredDcompPa() {
        return this.getVo().asBigDecimal("VL_CRED_DCOMP_PA");
   }

   public void setVlCredDcompPa(BigDecimal vlCredDcompPa) {
        markAsChanged("VL_CRED_DCOMP_PA", vlCredDcompPa);
   }

   public BigDecimal getVlCredDescPa() {
        return this.getVo().asBigDecimal("VL_CRED_DESC_PA");
   }

   public void setVlCredDescPa(BigDecimal vlCredDescPa) {
        markAsChanged("VL_CRED_DESC_PA", vlCredDescPa);
   }

   public BigDecimal getVrCredPerPa() {
        return this.getVo().asBigDecimal("VR_CRED_PER_PA");
   }

   public void setVrCredPerPa(BigDecimal vrCredPerPa) {
        markAsChanged("VR_CRED_PER_PA", vrCredPerPa);
   }

   @Override
   public String getTableName() {
        return "TGFDBPC";
   }

   @Override
   public String getEntityName() {
        return "CreditoUtilizadoPisCofins";
   }

   @Override
   public CreditoUtilizadoPisCofins fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
