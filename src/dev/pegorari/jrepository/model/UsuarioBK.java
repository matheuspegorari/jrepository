package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioBK extends AbstractSankhyaEntity<UsuarioBK> {
   private String acessoVisualCab;
   private String altCtaFat;
   private String altCtaImpBol;
   private String altOrdCfech;
   private String aprovCot;
   private String baixaDesp;
   private String baixaRec;
   private BigDecimal codUsu;
   private String contAcesso;
   private String contGol;
   private String exibirValAnalRent;
   private String impNfCentral;
   private BigDecimal minutosFin;
   private BigDecimal nuNico;
   private String restringeCart;
   private String senhaNuncaExpira;
   private String verCabPropria;

   public String getAcessoVisualCab() {
        return acessoVisualCab;
   }

   public void setAcessoVisualCab(String acessoVisualCab) {
        this.acessoVisualCab = acessoVisualCab;
   }

   public String getAltCtaFat() {
        return altCtaFat;
   }

   public void setAltCtaFat(String altCtaFat) {
        this.altCtaFat = altCtaFat;
   }

   public String getAltCtaImpBol() {
        return altCtaImpBol;
   }

   public void setAltCtaImpBol(String altCtaImpBol) {
        this.altCtaImpBol = altCtaImpBol;
   }

   public String getAltOrdCfech() {
        return altOrdCfech;
   }

   public void setAltOrdCfech(String altOrdCfech) {
        this.altOrdCfech = altOrdCfech;
   }

   public String getAprovCot() {
        return aprovCot;
   }

   public void setAprovCot(String aprovCot) {
        this.aprovCot = aprovCot;
   }

   public String getBaixaDesp() {
        return baixaDesp;
   }

   public void setBaixaDesp(String baixaDesp) {
        this.baixaDesp = baixaDesp;
   }

   public String getBaixaRec() {
        return baixaRec;
   }

   public void setBaixaRec(String baixaRec) {
        this.baixaRec = baixaRec;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getContAcesso() {
        return contAcesso;
   }

   public void setContAcesso(String contAcesso) {
        this.contAcesso = contAcesso;
   }

   public String getContGol() {
        return contGol;
   }

   public void setContGol(String contGol) {
        this.contGol = contGol;
   }

   public String getExibirValAnalRent() {
        return exibirValAnalRent;
   }

   public void setExibirValAnalRent(String exibirValAnalRent) {
        this.exibirValAnalRent = exibirValAnalRent;
   }

   public String getImpNfCentral() {
        return impNfCentral;
   }

   public void setImpNfCentral(String impNfCentral) {
        this.impNfCentral = impNfCentral;
   }

   public BigDecimal getMinutosFin() {
        return minutosFin;
   }

   public void setMinutosFin(BigDecimal minutosFin) {
        this.minutosFin = minutosFin;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        this.nuNico = nuNico;
   }

   public String getRestringeCart() {
        return restringeCart;
   }

   public void setRestringeCart(String restringeCart) {
        this.restringeCart = restringeCart;
   }

   public String getSenhaNuncaExpira() {
        return senhaNuncaExpira;
   }

   public void setSenhaNuncaExpira(String senhaNuncaExpira) {
        this.senhaNuncaExpira = senhaNuncaExpira;
   }

   public String getVerCabPropria() {
        return verCabPropria;
   }

   public void setVerCabPropria(String verCabPropria) {
        this.verCabPropria = verCabPropria;
   }

   @Override
   public String getTableName() {
        return "TSIUSUBK";
   }

   @Override
   public String getEntityName() {
        return "UsuarioBK";
   }

   @Override
   public UsuarioBK fromVO(DynamicVO vo) {
        this.acessoVisualCab = vo.asString("ACESSOVISUALCAB");
        this.altCtaFat = vo.asString("ALTCTAFAT");
        this.altCtaImpBol = vo.asString("ALTCTAIMPBOL");
        this.altOrdCfech = vo.asString("ALTORDCFECH");
        this.aprovCot = vo.asString("APROVCOT");
        this.baixaDesp = vo.asString("BAIXADESP");
        this.baixaRec = vo.asString("BAIXAREC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.contAcesso = vo.asString("CONTACESSO");
        this.contGol = vo.asString("CONTAGOL");
        this.exibirValAnalRent = vo.asString("EXIBIRVALANALRENT");
        this.impNfCentral = vo.asString("IMPNFCENTRAL");
        this.minutosFin = vo.asBigDecimal("MINUTOSFIN");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.restringeCart = vo.asString("RESTRINGECART");
        this.senhaNuncaExpira = vo.asString("SENHANUNCAEXPIRA");
        this.verCabPropria = vo.asString("VERCABPROPRIA");
        return this;
   }
}
