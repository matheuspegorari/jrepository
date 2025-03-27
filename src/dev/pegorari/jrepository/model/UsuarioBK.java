package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioBK extends AbstractSankhyaEntity<UsuarioBK> {
   public String getAcessoVisualCab() {
        return this.getVo().asString("ACESSOVISUALCAB");
   }

   public void setAcessoVisualCab(String acessoVisualCab) {
        markAsChanged("ACESSOVISUALCAB", acessoVisualCab);
   }

   public String getAltCtaFat() {
        return this.getVo().asString("ALTCTAFAT");
   }

   public void setAltCtaFat(String altCtaFat) {
        markAsChanged("ALTCTAFAT", altCtaFat);
   }

   public String getAltCtaImpBol() {
        return this.getVo().asString("ALTCTAIMPBOL");
   }

   public void setAltCtaImpBol(String altCtaImpBol) {
        markAsChanged("ALTCTAIMPBOL", altCtaImpBol);
   }

   public String getAltOrdCfech() {
        return this.getVo().asString("ALTORDCFECH");
   }

   public void setAltOrdCfech(String altOrdCfech) {
        markAsChanged("ALTORDCFECH", altOrdCfech);
   }

   public String getAprovCot() {
        return this.getVo().asString("APROVCOT");
   }

   public void setAprovCot(String aprovCot) {
        markAsChanged("APROVCOT", aprovCot);
   }

   public String getBaixaDesp() {
        return this.getVo().asString("BAIXADESP");
   }

   public void setBaixaDesp(String baixaDesp) {
        markAsChanged("BAIXADESP", baixaDesp);
   }

   public String getBaixaRec() {
        return this.getVo().asString("BAIXAREC");
   }

   public void setBaixaRec(String baixaRec) {
        markAsChanged("BAIXAREC", baixaRec);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getContAcesso() {
        return this.getVo().asString("CONTACESSO");
   }

   public void setContAcesso(String contAcesso) {
        markAsChanged("CONTACESSO", contAcesso);
   }

   public String getContGol() {
        return this.getVo().asString("CONTAGOL");
   }

   public void setContGol(String contGol) {
        markAsChanged("CONTAGOL", contGol);
   }

   public String getExibirValAnalRent() {
        return this.getVo().asString("EXIBIRVALANALRENT");
   }

   public void setExibirValAnalRent(String exibirValAnalRent) {
        markAsChanged("EXIBIRVALANALRENT", exibirValAnalRent);
   }

   public String getImpNfCentral() {
        return this.getVo().asString("IMPNFCENTRAL");
   }

   public void setImpNfCentral(String impNfCentral) {
        markAsChanged("IMPNFCENTRAL", impNfCentral);
   }

   public BigDecimal getMinutosFin() {
        return this.getVo().asBigDecimal("MINUTOSFIN");
   }

   public void setMinutosFin(BigDecimal minutosFin) {
        markAsChanged("MINUTOSFIN", minutosFin);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public String getRestringeCart() {
        return this.getVo().asString("RESTRINGECART");
   }

   public void setRestringeCart(String restringeCart) {
        markAsChanged("RESTRINGECART", restringeCart);
   }

   public String getSenhaNuncaExpira() {
        return this.getVo().asString("SENHANUNCAEXPIRA");
   }

   public void setSenhaNuncaExpira(String senhaNuncaExpira) {
        markAsChanged("SENHANUNCAEXPIRA", senhaNuncaExpira);
   }

   public String getVerCabPropria() {
        return this.getVo().asString("VERCABPROPRIA");
   }

   public void setVerCabPropria(String verCabPropria) {
        markAsChanged("VERCABPROPRIA", verCabPropria);
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
        this.setVo(vo);
        return this;
   }
}
