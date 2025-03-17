package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoEmpresa extends AbstractSankhyaEntity<ConfiguracaoEmpresa> {
   private BigDecimal cnae;
   private BigDecimal codEmp;
   private BigDecimal codLst;
   private BigDecimal codProd;
   private String codTribMunIss;
   private BigDecimal codNbs;
   private BigDecimal codCtaCtbEfd;
   private BigDecimal tipoSn;
   private BigDecimal enqReIntegra;

   public BigDecimal getCnae() {
        return cnae;
   }

   public void setCnae(BigDecimal cnae) {
        this.cnae = cnae;
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

   public String getCodTribMunIss() {
        return codTribMunIss;
   }

   public void setCodTribMunIss(String codTribMunIss) {
        this.codTribMunIss = codTribMunIss;
   }

   public BigDecimal getCodNbs() {
        return codNbs;
   }

   public void setCodNbs(BigDecimal codNbs) {
        this.codNbs = codNbs;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   public BigDecimal getTipoSn() {
        return tipoSn;
   }

   public void setTipoSn(BigDecimal tipoSn) {
        this.tipoSn = tipoSn;
   }

   public BigDecimal getEnqReIntegra() {
        return enqReIntegra;
   }

   public void setEnqReIntegra(BigDecimal enqReIntegra) {
        this.enqReIntegra = enqReIntegra;
   }

   @Override
   public String getTableName() {
        return "TGFSEM";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoEmpresa";
   }

   @Override
   public ConfiguracaoEmpresa fromVO(DynamicVO vo) {
        this.cnae = vo.asBigDecimal("CNAE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLst = vo.asBigDecimal("CODLST");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTribMunIss = vo.asString("CODTRIBMUNISS");
        this.codNbs = vo.asBigDecimal("CODNBS");
        this.codCtaCtbEfd = vo.asBigDecimal("CODCTACTBEFD");
        this.tipoSn = vo.asBigDecimal("TIPOSN");
        this.enqReIntegra = vo.asBigDecimal("ENQREINTEGRA");
        return this;
   }
}
