package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CreditoUtilizadoPisCofins extends AbstractSankhyaEntity<CreditoUtilizadoPisCofins> {
   private String cnpj;
   private String cnpjSuc;
   private BigDecimal codemp;
   private BigDecimal codCred;
   private String origCred;
   private Timestamp perApuCred;
   private Timestamp perUtiCred;
   private String tipo;
   private BigDecimal vlCredDcompPa;
   private BigDecimal vlCredDescPa;
   private BigDecimal vrCredPerPa;

   public String getCnpj() {
        return cnpj;
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
        this.cnpj = cnpj;
   }

   public String getCnpjSuc() {
        return cnpjSuc;
   }

   public void setCnpjSuc(String cnpjSuc) {
        markAsChanged("CNPJ_SUC", cnpjSuc);
        this.cnpjSuc = cnpjSuc;
   }

   public BigDecimal getCodemp() {
        return codemp;
   }

   public void setCodemp(BigDecimal codemp) {
        markAsChanged("CODEMP", codemp);
        this.codemp = codemp;
   }

   public BigDecimal getCodCred() {
        return codCred;
   }

   public void setCodCred(BigDecimal codCred) {
        markAsChanged("COD_CRED", codCred);
        this.codCred = codCred;
   }

   public String getOrigCred() {
        return origCred;
   }

   public void setOrigCred(String origCred) {
        markAsChanged("ORIG_CRED", origCred);
        this.origCred = origCred;
   }

   public Timestamp getPerApuCred() {
        return perApuCred;
   }

   public void setPerApuCred(Timestamp perApuCred) {
        markAsChanged("PER_APU_CRED", perApuCred);
        this.perApuCred = perApuCred;
   }

   public Timestamp getPerUtiCred() {
        return perUtiCred;
   }

   public void setPerUtiCred(Timestamp perUtiCred) {
        markAsChanged("PER_UTI_CRED", perUtiCred);
        this.perUtiCred = perUtiCred;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getVlCredDcompPa() {
        return vlCredDcompPa;
   }

   public void setVlCredDcompPa(BigDecimal vlCredDcompPa) {
        markAsChanged("VL_CRED_DCOMP_PA", vlCredDcompPa);
        this.vlCredDcompPa = vlCredDcompPa;
   }

   public BigDecimal getVlCredDescPa() {
        return vlCredDescPa;
   }

   public void setVlCredDescPa(BigDecimal vlCredDescPa) {
        markAsChanged("VL_CRED_DESC_PA", vlCredDescPa);
        this.vlCredDescPa = vlCredDescPa;
   }

   public BigDecimal getVrCredPerPa() {
        return vrCredPerPa;
   }

   public void setVrCredPerPa(BigDecimal vrCredPerPa) {
        markAsChanged("VR_CRED_PER_PA", vrCredPerPa);
        this.vrCredPerPa = vrCredPerPa;
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
        this.cnpj = vo.asString("CNPJ");
        this.cnpjSuc = vo.asString("CNPJ_SUC");
        this.codemp = vo.asBigDecimal("CODEMP");
        this.codCred = vo.asBigDecimal("COD_CRED");
        this.origCred = vo.asString("ORIG_CRED");
        this.perApuCred = vo.asTimestamp("PER_APU_CRED");
        this.perUtiCred = vo.asTimestamp("PER_UTI_CRED");
        this.tipo = vo.asString("TIPO");
        this.vlCredDcompPa = vo.asBigDecimal("VL_CRED_DCOMP_PA");
        this.vlCredDescPa = vo.asBigDecimal("VL_CRED_DESC_PA");
        this.vrCredPerPa = vo.asBigDecimal("VR_CRED_PER_PA");
        return this;
   }
}
