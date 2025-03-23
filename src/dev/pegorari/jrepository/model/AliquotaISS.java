package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaISS extends AbstractSankhyaEntity<AliquotaISS> {
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
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
        this.codLst = codLst;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodTribIss() {
        return codTribIss;
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        markAsChanged("CODTRIBISS", codTribIss);
        this.codTribIss = codTribIss;
   }

   public String getCodTribMunIss() {
        return codTribMunIss;
   }

   public void setCodTribMunIss(String codTribMunIss) {
        markAsChanged("CODTRIBMUNISS", codTribMunIss);
        this.codTribMunIss = codTribMunIss;
   }

   public BigDecimal getPercDeducao() {
        return percDeducao;
   }

   public void setPercDeducao(BigDecimal percDeducao) {
        markAsChanged("PERCDEDUCAO", percDeducao);
        this.percDeducao = percDeducao;
   }

   public BigDecimal getPercInss() {
        return percInss;
   }

   public void setPercInss(BigDecimal percInss) {
        markAsChanged("PERCINSS", percInss);
        this.percInss = percInss;
   }

   public String getTipoDeducao() {
        return tipoDeducao;
   }

   public void setTipoDeducao(String tipoDeducao) {
        markAsChanged("TIPODEDUCAO", tipoDeducao);
        this.tipoDeducao = tipoDeducao;
   }

   public String getNaoCalcula() {
        return naoCalcula;
   }

   public void setNaoCalcula(String naoCalcula) {
        markAsChanged("NAOCALCULA", naoCalcula);
        this.naoCalcula = naoCalcula;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
        this.idAliq = idAliq;
   }

   @Override
   public String getTableName() {
        return "TGFISS";
   }

   @Override
   public String getEntityName() {
        return "AliquotaISS";
   }

   @Override
   public AliquotaISS fromVO(DynamicVO vo) {
        this.setVo(vo);
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
