package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CreditoPisCofins extends AbstractSankhyaEntity<CreditoPisCofins> {
   private String cnpj;
   private String cnpjSuc;
   private BigDecimal codemp;
   private BigDecimal codCred;
   private String origCred;
   private Timestamp perApuCred;
   private BigDecimal saldo;
   private String tipo;
   private BigDecimal vlCredApu;
   private BigDecimal vlCredExtApu;

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

   public BigDecimal getSaldo() {
        return saldo;
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
        this.saldo = saldo;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getVlCredApu() {
        return vlCredApu;
   }

   public void setVlCredApu(BigDecimal vlCredApu) {
        markAsChanged("VL_CRED_APU", vlCredApu);
        this.vlCredApu = vlCredApu;
   }

   public BigDecimal getVlCredExtApu() {
        return vlCredExtApu;
   }

   public void setVlCredExtApu(BigDecimal vlCredExtApu) {
        markAsChanged("VL_CRED_EXT_APU", vlCredExtApu);
        this.vlCredExtApu = vlCredExtApu;
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
        this.cnpj = vo.asString("CNPJ");
        this.cnpjSuc = vo.asString("CNPJ_SUC");
        this.codemp = vo.asBigDecimal("CODEMP");
        this.codCred = vo.asBigDecimal("COD_CRED");
        this.origCred = vo.asString("ORIG_CRED");
        this.perApuCred = vo.asTimestamp("PER_APU_CRED");
        this.saldo = vo.asBigDecimal("SALDO");
        this.tipo = vo.asString("TIPO");
        this.vlCredApu = vo.asBigDecimal("VL_CRED_APU");
        this.vlCredExtApu = vo.asBigDecimal("VL_CRED_EXT_APU");
        return this;
   }
}
