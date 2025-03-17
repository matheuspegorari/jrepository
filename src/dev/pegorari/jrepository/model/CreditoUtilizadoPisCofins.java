package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CreditoUtilizadoPisCofins implements SankhyaEntity<CreditoUtilizadoPisCofins> {

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
        this.cnpj = cnpj;
   }

   public String getCnpjSuc() {
        return cnpjSuc;
   }

   public void setCnpjSuc(String cnpjSuc) {
        this.cnpjSuc = cnpjSuc;
   }

   public BigDecimal getCodemp() {
        return codemp;
   }

   public void setCodemp(BigDecimal codemp) {
        this.codemp = codemp;
   }

   public BigDecimal getCodCred() {
        return codCred;
   }

   public void setCodCred(BigDecimal codCred) {
        this.codCred = codCred;
   }

   public String getOrigCred() {
        return origCred;
   }

   public void setOrigCred(String origCred) {
        this.origCred = origCred;
   }

   public Timestamp getPerApuCred() {
        return perApuCred;
   }

   public void setPerApuCred(Timestamp perApuCred) {
        this.perApuCred = perApuCred;
   }

   public Timestamp getPerUtiCred() {
        return perUtiCred;
   }

   public void setPerUtiCred(Timestamp perUtiCred) {
        this.perUtiCred = perUtiCred;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getVlCredDcompPa() {
        return vlCredDcompPa;
   }

   public void setVlCredDcompPa(BigDecimal vlCredDcompPa) {
        this.vlCredDcompPa = vlCredDcompPa;
   }

   public BigDecimal getVlCredDescPa() {
        return vlCredDescPa;
   }

   public void setVlCredDescPa(BigDecimal vlCredDescPa) {
        this.vlCredDescPa = vlCredDescPa;
   }

   public BigDecimal getVrCredPerPa() {
        return vrCredPerPa;
   }

   public void setVrCredPerPa(BigDecimal vrCredPerPa) {
        this.vrCredPerPa = vrCredPerPa;
   }

   @Override
   public String getEntityName() {
        return "CreditoUtilizadoPisCofins";
   }

   @Override
   public CreditoUtilizadoPisCofins fromVO(DynamicVO vo) {
        this.cnpj = vo.asString("CNPJ");
        this.cnpjSuc = vo.asString("CNPJSUC");
        this.codemp = vo.asBigDecimal("CODEMP");
        this.codCred = vo.asBigDecimal("CODCRED");
        this.origCred = vo.asString("ORIGCRED");
        this.perApuCred = vo.asTimestamp("PERAPUCRED");
        this.perUtiCred = vo.asTimestamp("PERUTICRED");
        this.tipo = vo.asString("TIPO");
        this.vlCredDcompPa = vo.asBigDecimal("VLCREDDCOMPPA");
        this.vlCredDescPa = vo.asBigDecimal("VLCREDDESCPA");
        this.vrCredPerPa = vo.asBigDecimal("VRCREDPERPA");
        return this;
   }
}
