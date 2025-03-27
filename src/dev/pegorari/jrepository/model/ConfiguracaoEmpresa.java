package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoEmpresa extends AbstractSankhyaEntity<ConfiguracaoEmpresa> {
   public BigDecimal getCnae() {
        return this.getVo().asBigDecimal("CNAE");
   }

   public void setCnae(BigDecimal cnae) {
        markAsChanged("CNAE", cnae);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodTribMunIss() {
        return this.getVo().asString("CODTRIBMUNISS");
   }

   public void setCodTribMunIss(String codTribMunIss) {
        markAsChanged("CODTRIBMUNISS", codTribMunIss);
   }

   public BigDecimal getCodNbs() {
        return this.getVo().asBigDecimal("CODNBS");
   }

   public void setCodNbs(BigDecimal codNbs) {
        markAsChanged("CODNBS", codNbs);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   public BigDecimal getTipoSn() {
        return this.getVo().asBigDecimal("TIPOSN");
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
   }

   public BigDecimal getEnqReIntegra() {
        return this.getVo().asBigDecimal("ENQREINTEGRA");
   }

   public void setEnqReIntegra(BigDecimal enqReIntegra) {
        markAsChanged("ENQREINTEGRA", enqReIntegra);
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
        this.setVo(vo);
        return this;
   }
}
