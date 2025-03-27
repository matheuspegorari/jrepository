package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoProdutoIcmsEmpresa extends AbstractSankhyaEntity<GrupoProdutoIcmsEmpresa> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getGrupoIcms() {
        return this.getVo().asBigDecimal("GRUPOICMS");
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        markAsChanged("GRUPOICMS", grupoIcms);
   }

   public BigDecimal getPercCmtNac() {
        return this.getVo().asBigDecimal("PERCCMTNAC");
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        markAsChanged("PERCCMTNAC", percCmtNac);
   }

   public BigDecimal getPercCmtMun() {
        return this.getVo().asBigDecimal("PERCCMTMUN");
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        markAsChanged("PERCCMTMUN", percCmtMun);
   }

   public BigDecimal getPercCmtEst() {
        return this.getVo().asBigDecimal("PERCCMTEST");
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        markAsChanged("PERCCMTEST", percCmtEst);
   }

   public BigDecimal getPercCmtFed() {
        return this.getVo().asBigDecimal("PERCCMTFED");
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        markAsChanged("PERCCMTFED", percCmtFed);
   }

   public BigDecimal getPercCmtImp() {
        return this.getVo().asBigDecimal("PERCCMTIMP");
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        markAsChanged("PERCCMTIMP", percCmtImp);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   @Override
   public String getTableName() {
        return "TGFGEM";
   }

   @Override
   public String getEntityName() {
        return "GrupoProdutoIcmsEmpresa";
   }

   @Override
   public GrupoProdutoIcmsEmpresa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
