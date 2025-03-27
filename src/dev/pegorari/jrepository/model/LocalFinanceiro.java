package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LocalFinanceiro extends AbstractSankhyaEntity<LocalFinanceiro> {
   public String getAceitaNovaprod() {
        return this.getVo().asString("ACEITANOVAPROD");
   }

   public void setAceitaNovaprod(String aceitaNovaprod) {
        markAsChanged("ACEITANOVAPROD", aceitaNovaprod);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCapacidadeProducao() {
        return this.getVo().asBigDecimal("CAPACIDADEPRODUCAO");
   }

   public void setCapacidadeProducao(BigDecimal capacidadeProducao) {
        markAsChanged("CAPACIDADEPRODUCAO", capacidadeProducao);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodLocalPai() {
        return this.getVo().asBigDecimal("CODLOCALPAI");
   }

   public void setCodLocalPai(BigDecimal codLocalPai) {
        markAsChanged("CODLOCALPAI", codLocalPai);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public String getDescrLocal() {
        return this.getVo().asString("DESCRLOCAL");
   }

   public void setDescrLocal(String descrLocal) {
        markAsChanged("DESCRLOCAL", descrLocal);
   }

   public BigDecimal getDiasProducao() {
        return this.getVo().asBigDecimal("DIASPRODUCAO");
   }

   public void setDiasProducao(BigDecimal diasProducao) {
        markAsChanged("DIASPRODUCAO", diasProducao);
   }

   public String getDomingo() {
        return this.getVo().asString("DOMINGO");
   }

   public void setDomingo(String domingo) {
        markAsChanged("DOMINGO", domingo);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getIncSobreIrf() {
        return this.getVo().asString("INCSOBREIRF");
   }

   public void setIncSobreIrf(String incSobreIrf) {
        markAsChanged("INCSOBREIRF", incSobreIrf);
   }

   public String getQuarta() {
        return this.getVo().asString("QUARTA");
   }

   public void setQuarta(String quarta) {
        markAsChanged("QUARTA", quarta);
   }

   public String getQuinta() {
        return this.getVo().asString("QUINTA");
   }

   public void setQuinta(String quinta) {
        markAsChanged("QUINTA", quinta);
   }

   public String getSabado() {
        return this.getVo().asString("SABADO");
   }

   public void setSabado(String sabado) {
        markAsChanged("SABADO", sabado);
   }

   public String getSegunda() {
        return this.getVo().asString("SEGUNDA");
   }

   public void setSegunda(String segunda) {
        markAsChanged("SEGUNDA", segunda);
   }

   public String getSexta() {
        return this.getVo().asString("SEXTA");
   }

   public void setSexta(String sexta) {
        markAsChanged("SEXTA", sexta);
   }

   public String getTerca() {
        return this.getVo().asString("TERCA");
   }

   public void setTerca(String terca) {
        markAsChanged("TERCA", terca);
   }

   public String getUtilizaWms() {
        return this.getVo().asString("UTILIZAWMS");
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
   }

   public String getValEstIndep() {
        return this.getVo().asString("VALESTINDEP");
   }

   public void setValEstIndep(String valEstIndep) {
        markAsChanged("VALESTINDEP", valEstIndep);
   }

   public BigDecimal getVlrCus() {
        return this.getVo().asBigDecimal("VLRCUS");
   }

   public void setVlrCus(BigDecimal vlrCus) {
        markAsChanged("VLRCUS", vlrCus);
   }

   public BigDecimal getVlrVenda() {
        return this.getVo().asBigDecimal("VLRVENDA");
   }

   public void setVlrVenda(BigDecimal vlrVenda) {
        markAsChanged("VLRVENDA", vlrVenda);
   }

   @Override
   public String getTableName() {
        return "TGFLOC";
   }

   @Override
   public String getEntityName() {
        return "LocalFinanceiro";
   }

   @Override
   public LocalFinanceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
