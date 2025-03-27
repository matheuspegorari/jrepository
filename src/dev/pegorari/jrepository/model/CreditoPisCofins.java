package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CreditoPisCofins extends AbstractSankhyaEntity<CreditoPisCofins> {
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

   public BigDecimal getSaldo() {
        return this.getVo().asBigDecimal("SALDO");
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVlCredApu() {
        return this.getVo().asBigDecimal("VL_CRED_APU");
   }

   public void setVlCredApu(BigDecimal vlCredApu) {
        markAsChanged("VL_CRED_APU", vlCredApu);
   }

   public BigDecimal getVlCredExtApu() {
        return this.getVo().asBigDecimal("VL_CRED_EXT_APU");
   }

   public void setVlCredExtApu(BigDecimal vlCredExtApu) {
        markAsChanged("VL_CRED_EXT_APU", vlCredExtApu);
   }

   @Override
   public String getTableName() {
        return "TGFCRPC";
   }

   @Override
   public String getEntityName() {
        return "CreditoPisCofins";
   }

   @Override
   public CreditoPisCofins fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
