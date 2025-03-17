package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Imposto implements SankhyaEntity<Imposto> {

   private String acumBaseIcms;
   private String acumBaseIpi;
   private String ativo;
   private String calcBaseMensal;
   private BigDecimal codCtaCtb1;
   private BigDecimal codCtaCtb2;
   private BigDecimal codImp;
   private BigDecimal codTab;
   private String descricao;
   private String impBaixaParcial;
   private String nomeImp;
   private String regra;
   private BigDecimal tipoImposto;
   private String usarPrecoCusto;
   private BigDecimal vlrMin;
   private String grupoVlrMin;
   private String considerarImp;
   private String baseImpFin;
   private String codRec;
   private String impFrete;
   private String f600Efd;
   private BigDecimal vlrMaxInss;
   private String regCalcImpRet;
   private String calcBaseDia;

   public String getAcumBaseIcms() {
        return acumBaseIcms;
   }

   public void setAcumBaseIcms(String acumBaseIcms) {
        this.acumBaseIcms = acumBaseIcms;
   }

   public String getAcumBaseIpi() {
        return acumBaseIpi;
   }

   public void setAcumBaseIpi(String acumBaseIpi) {
        this.acumBaseIpi = acumBaseIpi;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getCalcBaseMensal() {
        return calcBaseMensal;
   }

   public void setCalcBaseMensal(String calcBaseMensal) {
        this.calcBaseMensal = calcBaseMensal;
   }

   public BigDecimal getCodCtaCtb1() {
        return codCtaCtb1;
   }

   public void setCodCtaCtb1(BigDecimal codCtaCtb1) {
        this.codCtaCtb1 = codCtaCtb1;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodImp() {
        return codImp;
   }

   public void setCodImp(BigDecimal codImp) {
        this.codImp = codImp;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        this.codTab = codTab;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getImpBaixaParcial() {
        return impBaixaParcial;
   }

   public void setImpBaixaParcial(String impBaixaParcial) {
        this.impBaixaParcial = impBaixaParcial;
   }

   public String getNomeImp() {
        return nomeImp;
   }

   public void setNomeImp(String nomeImp) {
        this.nomeImp = nomeImp;
   }

   public String getRegra() {
        return regra;
   }

   public void setRegra(String regra) {
        this.regra = regra;
   }

   public BigDecimal getTipoImposto() {
        return tipoImposto;
   }

   public void setTipoImposto(BigDecimal tipoImposto) {
        this.tipoImposto = tipoImposto;
   }

   public String getUsarPrecoCusto() {
        return usarPrecoCusto;
   }

   public void setUsarPrecoCusto(String usarPrecoCusto) {
        this.usarPrecoCusto = usarPrecoCusto;
   }

   public BigDecimal getVlrMin() {
        return vlrMin;
   }

   public void setVlrMin(BigDecimal vlrMin) {
        this.vlrMin = vlrMin;
   }

   public String getGrupoVlrMin() {
        return grupoVlrMin;
   }

   public void setGrupoVlrMin(String grupoVlrMin) {
        this.grupoVlrMin = grupoVlrMin;
   }

   public String getConsiderarImp() {
        return considerarImp;
   }

   public void setConsiderarImp(String considerarImp) {
        this.considerarImp = considerarImp;
   }

   public String getBaseImpFin() {
        return baseImpFin;
   }

   public void setBaseImpFin(String baseImpFin) {
        this.baseImpFin = baseImpFin;
   }

   public String getCodRec() {
        return codRec;
   }

   public void setCodRec(String codRec) {
        this.codRec = codRec;
   }

   public String getImpFrete() {
        return impFrete;
   }

   public void setImpFrete(String impFrete) {
        this.impFrete = impFrete;
   }

   public String getF600Efd() {
        return f600Efd;
   }

   public void setF600Efd(String f600Efd) {
        this.f600Efd = f600Efd;
   }

   public BigDecimal getVlrMaxInss() {
        return vlrMaxInss;
   }

   public void setVlrMaxInss(BigDecimal vlrMaxInss) {
        this.vlrMaxInss = vlrMaxInss;
   }

   public String getRegCalcImpRet() {
        return regCalcImpRet;
   }

   public void setRegCalcImpRet(String regCalcImpRet) {
        this.regCalcImpRet = regCalcImpRet;
   }

   public String getCalcBaseDia() {
        return calcBaseDia;
   }

   public void setCalcBaseDia(String calcBaseDia) {
        this.calcBaseDia = calcBaseDia;
   }

   @Override
   public String getEntityName() {
        return "Imposto";
   }

   @Override
   public Imposto fromVO(DynamicVO vo) {
        this.acumBaseIcms = vo.asString("ACUMBASEICMS");
        this.acumBaseIpi = vo.asString("ACUMBASEIPI");
        this.ativo = vo.asString("ATIVO");
        this.calcBaseMensal = vo.asString("CALCBASEMENSAL");
        this.codCtaCtb1 = vo.asBigDecimal("CODCTACTB1");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB2");
        this.codImp = vo.asBigDecimal("CODIMP");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.descricao = vo.asString("DESCRICAO");
        this.impBaixaParcial = vo.asString("IMPBAIXAPARCIAL");
        this.nomeImp = vo.asString("NOMEIMP");
        this.regra = vo.asString("REGRA");
        this.tipoImposto = vo.asBigDecimal("TIPOIMPOSTO");
        this.usarPrecoCusto = vo.asString("USARPRECOCUSTO");
        this.vlrMin = vo.asBigDecimal("VLRMIN");
        this.grupoVlrMin = vo.asString("GRUPOVLRMIN");
        this.considerarImp = vo.asString("CONSIDERARIMP");
        this.baseImpFin = vo.asString("BASEIMPFIN");
        this.codRec = vo.asString("CODREC");
        this.impFrete = vo.asString("IMPFRETE");
        this.f600Efd = vo.asString("F600EFD");
        this.vlrMaxInss = vo.asBigDecimal("VLRMAXINSS");
        this.regCalcImpRet = vo.asString("REGCALCIMPRET");
        this.calcBaseDia = vo.asString("CALCBASEDIA");
        return this;
   }
}
