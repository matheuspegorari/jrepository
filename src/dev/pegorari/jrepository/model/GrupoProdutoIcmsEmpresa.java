package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GrupoProdutoIcmsEmpresa implements SankhyaEntity<GrupoProdutoIcmsEmpresa> {

   private BigDecimal codEmp;
   private BigDecimal codGrupoProd;
   private BigDecimal grupoIcms;
   private BigDecimal percCmtNac;
   private BigDecimal percCmtMun;
   private BigDecimal percCmtEst;
   private BigDecimal percCmtFed;
   private BigDecimal percCmtImp;
   private BigDecimal codCtaCtbEfd;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getGrupoIcms() {
        return grupoIcms;
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        this.grupoIcms = grupoIcms;
   }

   public BigDecimal getPercCmtNac() {
        return percCmtNac;
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        this.percCmtNac = percCmtNac;
   }

   public BigDecimal getPercCmtMun() {
        return percCmtMun;
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        this.percCmtMun = percCmtMun;
   }

   public BigDecimal getPercCmtEst() {
        return percCmtEst;
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        this.percCmtEst = percCmtEst;
   }

   public BigDecimal getPercCmtFed() {
        return percCmtFed;
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        this.percCmtFed = percCmtFed;
   }

   public BigDecimal getPercCmtImp() {
        return percCmtImp;
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        this.percCmtImp = percCmtImp;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   @Override
   public String getEntityName() {
        return "GrupoProdutoIcmsEmpresa";
   }

   @Override
   public GrupoProdutoIcmsEmpresa fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.grupoIcms = vo.asBigDecimal("GRUPOICMS");
        this.percCmtNac = vo.asBigDecimal("PERCCMTNAC");
        this.percCmtMun = vo.asBigDecimal("PERCCMTMUN");
        this.percCmtEst = vo.asBigDecimal("PERCCMTEST");
        this.percCmtFed = vo.asBigDecimal("PERCCMTFED");
        this.percCmtImp = vo.asBigDecimal("PERCCMTIMP");
        this.codCtaCtbEfd = vo.asBigDecimal("CODCTACTBEFD");
        return this;
   }
}
