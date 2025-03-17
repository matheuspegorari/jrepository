package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegimeApurContribSocAproCred implements SankhyaEntity<RegimeApurContribSocAproCred> {

   private BigDecimal codUsu;
   private BigDecimal indRegCum;
   private Timestamp dhAlter;
   private Timestamp dtFimRegime;
   private BigDecimal codEmp;
   private BigDecimal codIncTrib;
   private Timestamp dtIniRegime;
   private BigDecimal codTipoCont;
   private BigDecimal indApropCred;
   private String excluiPisCofinsBaseDep;
   private String consMovDevVendF550;
   private String consValJurMulF525;
   private String descIteTercF525;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getIndRegCum() {
        return indRegCum;
   }

   public void setIndRegCum(BigDecimal indRegCum) {
        this.indRegCum = indRegCum;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtFimRegime() {
        return dtFimRegime;
   }

   public void setDtFimRegime(Timestamp dtFimRegime) {
        this.dtFimRegime = dtFimRegime;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodIncTrib() {
        return codIncTrib;
   }

   public void setCodIncTrib(BigDecimal codIncTrib) {
        this.codIncTrib = codIncTrib;
   }

   public Timestamp getDtIniRegime() {
        return dtIniRegime;
   }

   public void setDtIniRegime(Timestamp dtIniRegime) {
        this.dtIniRegime = dtIniRegime;
   }

   public BigDecimal getCodTipoCont() {
        return codTipoCont;
   }

   public void setCodTipoCont(BigDecimal codTipoCont) {
        this.codTipoCont = codTipoCont;
   }

   public BigDecimal getIndApropCred() {
        return indApropCred;
   }

   public void setIndApropCred(BigDecimal indApropCred) {
        this.indApropCred = indApropCred;
   }

   public String getExcluiPisCofinsBaseDep() {
        return excluiPisCofinsBaseDep;
   }

   public void setExcluiPisCofinsBaseDep(String excluiPisCofinsBaseDep) {
        this.excluiPisCofinsBaseDep = excluiPisCofinsBaseDep;
   }

   public String getConsMovDevVendF550() {
        return consMovDevVendF550;
   }

   public void setConsMovDevVendF550(String consMovDevVendF550) {
        this.consMovDevVendF550 = consMovDevVendF550;
   }

   public String getConsValJurMulF525() {
        return consValJurMulF525;
   }

   public void setConsValJurMulF525(String consValJurMulF525) {
        this.consValJurMulF525 = consValJurMulF525;
   }

   public String getDescIteTercF525() {
        return descIteTercF525;
   }

   public void setDescIteTercF525(String descIteTercF525) {
        this.descIteTercF525 = descIteTercF525;
   }

   @Override
   public String getEntityName() {
        return "RegimeApurContribSocAproCred";
   }

   @Override
   public RegimeApurContribSocAproCred fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.indRegCum = vo.asBigDecimal("INDREGCUM");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtFimRegime = vo.asTimestamp("DTFIMREGIME");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codIncTrib = vo.asBigDecimal("CODINCTRIB");
        this.dtIniRegime = vo.asTimestamp("DTINIREGIME");
        this.codTipoCont = vo.asBigDecimal("CODTIPOCONT");
        this.indApropCred = vo.asBigDecimal("INDAPROPCRED");
        this.excluiPisCofinsBaseDep = vo.asString("EXCLUIPISCOFINSBASEDEP");
        this.consMovDevVendF550 = vo.asString("CONSMOVDEVVENDF550");
        this.consValJurMulF525 = vo.asString("CONSVALJURMULF525");
        this.descIteTercF525 = vo.asString("DESCITETERCF525");
        return this;
   }
}
