package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class AliquotaISS implements SankhyaEntity<AliquotaISS> {

   private BigDecimal codCid;
   private BigDecimal codEmp;
   private BigDecimal codLst;
   private BigDecimal codProd;
   private BigDecimal codTribIss;
   private String codTribMunIss;
   private BigDecimal percDeducao;
   private BigDecimal percInss;
   private String tipoDeducao;
   private String naoCalcula;
   private BigDecimal idAliq;

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        this.codLst = codLst;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodTribIss() {
        return codTribIss;
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        this.codTribIss = codTribIss;
   }

   public String getCodTribMunIss() {
        return codTribMunIss;
   }

   public void setCodTribMunIss(String codTribMunIss) {
        this.codTribMunIss = codTribMunIss;
   }

   public BigDecimal getPercDeducao() {
        return percDeducao;
   }

   public void setPercDeducao(BigDecimal percDeducao) {
        this.percDeducao = percDeducao;
   }

   public BigDecimal getPercInss() {
        return percInss;
   }

   public void setPercInss(BigDecimal percInss) {
        this.percInss = percInss;
   }

   public String getTipoDeducao() {
        return tipoDeducao;
   }

   public void setTipoDeducao(String tipoDeducao) {
        this.tipoDeducao = tipoDeducao;
   }

   public String getNaoCalcula() {
        return naoCalcula;
   }

   public void setNaoCalcula(String naoCalcula) {
        this.naoCalcula = naoCalcula;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        this.idAliq = idAliq;
   }

   @Override
   public String getEntityName() {
        return "AliquotaISS";
   }

   @Override
   public AliquotaISS fromVO(DynamicVO vo) {
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLst = vo.asBigDecimal("CODLST");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTribIss = vo.asBigDecimal("CODTRIBISS");
        this.codTribMunIss = vo.asString("CODTRIBMUNISS");
        this.percDeducao = vo.asBigDecimal("PERCDEDUCAO");
        this.percInss = vo.asBigDecimal("PERCINSS");
        this.tipoDeducao = vo.asString("TIPODEDUCAO");
        this.naoCalcula = vo.asString("NAOCALCULA");
        this.idAliq = vo.asBigDecimal("IDALIQ");
        return this;
   }
}
