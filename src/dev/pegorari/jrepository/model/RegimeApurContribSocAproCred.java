package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegimeApurContribSocAproCred extends AbstractSankhyaEntity<RegimeApurContribSocAproCred> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getIndRegCum() {
        return this.getVo().asBigDecimal("INDREGCUM");
   }

   public void setIndRegCum(BigDecimal indRegCum) {
        markAsChanged("INDREGCUM", indRegCum);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDtFimRegime() {
        return this.getVo().asTimestamp("DTFIMREGIME");
   }

   public void setDtFimRegime(Timestamp dtFimRegime) {
        markAsChanged("DTFIMREGIME", dtFimRegime);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodIncTrib() {
        return this.getVo().asBigDecimal("CODINCTRIB");
   }

   public void setCodIncTrib(BigDecimal codIncTrib) {
        markAsChanged("CODINCTRIB", codIncTrib);
   }

   public Timestamp getDtIniRegime() {
        return this.getVo().asTimestamp("DTINIREGIME");
   }

   public void setDtIniRegime(Timestamp dtIniRegime) {
        markAsChanged("DTINIREGIME", dtIniRegime);
   }

   public BigDecimal getCodTipoCont() {
        return this.getVo().asBigDecimal("CODTIPOCONT");
   }

   public void setCodTipoCont(BigDecimal codTipoCont) {
        markAsChanged("CODTIPOCONT", codTipoCont);
   }

   public BigDecimal getIndApropCred() {
        return this.getVo().asBigDecimal("INDAPROPCRED");
   }

   public void setIndApropCred(BigDecimal indApropCred) {
        markAsChanged("INDAPROPCRED", indApropCred);
   }

   public String getExcluiPisCofinsBaseDep() {
        return this.getVo().asString("EXCLUIPISCOFINSBASEDEP");
   }

   public void setExcluiPisCofinsBaseDep(String excluiPisCofinsBaseDep) {
        markAsChanged("EXCLUIPISCOFINSBASEDEP", excluiPisCofinsBaseDep);
   }

   public String getConsMovDevVendF550() {
        return this.getVo().asString("CONSMOVDEVVENDF550");
   }

   public void setConsMovDevVendF550(String consMovDevVendF550) {
        markAsChanged("CONSMOVDEVVENDF550", consMovDevVendF550);
   }

   public String getConsValJurMulF525() {
        return this.getVo().asString("CONSVALJURMULF525");
   }

   public void setConsValJurMulF525(String consValJurMulF525) {
        markAsChanged("CONSVALJURMULF525", consValJurMulF525);
   }

   public String getDescIteTercF525() {
        return this.getVo().asString("DESCITETERCF525");
   }

   public void setDescIteTercF525(String descIteTercF525) {
        markAsChanged("DESCITETERCF525", descIteTercF525);
   }

   @Override
   public String getTableName() {
        return "TGFRGM";
   }

   @Override
   public String getEntityName() {
        return "RegimeApurContribSocAproCred";
   }

   @Override
   public RegimeApurContribSocAproCred fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
