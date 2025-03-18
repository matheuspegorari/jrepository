package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LocalFinanceiro extends AbstractSankhyaEntity<LocalFinanceiro> {
   private String aceitaNovaprod;
   private String analitico;
   private String ativo;
   private BigDecimal capacidadeProducao;
   private BigDecimal codLocal;
   private BigDecimal codLocalPai;
   private BigDecimal codParc;
   private BigDecimal codTab;
   private String descrLocal;
   private BigDecimal diasProducao;
   private String domingo;
   private BigDecimal grau;
   private String incSobreIrf;
   private String quarta;
   private String quinta;
   private String sabado;
   private String segunda;
   private String sexta;
   private String terca;
   private String utilizaWms;
   private String valEstIndep;
   private BigDecimal vlrCus;
   private BigDecimal vlrVenda;

   public String getAceitaNovaprod() {
        return aceitaNovaprod;
   }

   public void setAceitaNovaprod(String aceitaNovaprod) {
        markAsChanged("ACEITANOVAPROD", aceitaNovaprod);
        this.aceitaNovaprod = aceitaNovaprod;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCapacidadeProducao() {
        return capacidadeProducao;
   }

   public void setCapacidadeProducao(BigDecimal capacidadeProducao) {
        markAsChanged("CAPACIDADEPRODUCAO", capacidadeProducao);
        this.capacidadeProducao = capacidadeProducao;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodLocalPai() {
        return codLocalPai;
   }

   public void setCodLocalPai(BigDecimal codLocalPai) {
        markAsChanged("CODLOCALPAI", codLocalPai);
        this.codLocalPai = codLocalPai;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public String getDescrLocal() {
        return descrLocal;
   }

   public void setDescrLocal(String descrLocal) {
        markAsChanged("DESCRLOCAL", descrLocal);
        this.descrLocal = descrLocal;
   }

   public BigDecimal getDiasProducao() {
        return diasProducao;
   }

   public void setDiasProducao(BigDecimal diasProducao) {
        markAsChanged("DIASPRODUCAO", diasProducao);
        this.diasProducao = diasProducao;
   }

   public String getDomingo() {
        return domingo;
   }

   public void setDomingo(String domingo) {
        markAsChanged("DOMINGO", domingo);
        this.domingo = domingo;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getIncSobreIrf() {
        return incSobreIrf;
   }

   public void setIncSobreIrf(String incSobreIrf) {
        markAsChanged("INCSOBREIRF", incSobreIrf);
        this.incSobreIrf = incSobreIrf;
   }

   public String getQuarta() {
        return quarta;
   }

   public void setQuarta(String quarta) {
        markAsChanged("QUARTA", quarta);
        this.quarta = quarta;
   }

   public String getQuinta() {
        return quinta;
   }

   public void setQuinta(String quinta) {
        markAsChanged("QUINTA", quinta);
        this.quinta = quinta;
   }

   public String getSabado() {
        return sabado;
   }

   public void setSabado(String sabado) {
        markAsChanged("SABADO", sabado);
        this.sabado = sabado;
   }

   public String getSegunda() {
        return segunda;
   }

   public void setSegunda(String segunda) {
        markAsChanged("SEGUNDA", segunda);
        this.segunda = segunda;
   }

   public String getSexta() {
        return sexta;
   }

   public void setSexta(String sexta) {
        markAsChanged("SEXTA", sexta);
        this.sexta = sexta;
   }

   public String getTerca() {
        return terca;
   }

   public void setTerca(String terca) {
        markAsChanged("TERCA", terca);
        this.terca = terca;
   }

   public String getUtilizaWms() {
        return utilizaWms;
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
        this.utilizaWms = utilizaWms;
   }

   public String getValEstIndep() {
        return valEstIndep;
   }

   public void setValEstIndep(String valEstIndep) {
        markAsChanged("VALESTINDEP", valEstIndep);
        this.valEstIndep = valEstIndep;
   }

   public BigDecimal getVlrCus() {
        return vlrCus;
   }

   public void setVlrCus(BigDecimal vlrCus) {
        markAsChanged("VLRCUS", vlrCus);
        this.vlrCus = vlrCus;
   }

   public BigDecimal getVlrVenda() {
        return vlrVenda;
   }

   public void setVlrVenda(BigDecimal vlrVenda) {
        markAsChanged("VLRVENDA", vlrVenda);
        this.vlrVenda = vlrVenda;
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
        this.setOriginalVO(vo);
        this.aceitaNovaprod = vo.asString("ACEITANOVAPROD");
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.capacidadeProducao = vo.asBigDecimal("CAPACIDADEPRODUCAO");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codLocalPai = vo.asBigDecimal("CODLOCALPAI");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.descrLocal = vo.asString("DESCRLOCAL");
        this.diasProducao = vo.asBigDecimal("DIASPRODUCAO");
        this.domingo = vo.asString("DOMINGO");
        this.grau = vo.asBigDecimal("GRAU");
        this.incSobreIrf = vo.asString("INCSOBREIRF");
        this.quarta = vo.asString("QUARTA");
        this.quinta = vo.asString("QUINTA");
        this.sabado = vo.asString("SABADO");
        this.segunda = vo.asString("SEGUNDA");
        this.sexta = vo.asString("SEXTA");
        this.terca = vo.asString("TERCA");
        this.utilizaWms = vo.asString("UTILIZAWMS");
        this.valEstIndep = vo.asString("VALESTINDEP");
        this.vlrCus = vo.asBigDecimal("VLRCUS");
        this.vlrVenda = vo.asBigDecimal("VLRVENDA");
        return this;
   }
}
