package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Instancia extends AbstractSankhyaEntity<Instancia> {
   private BigDecimal nuInstanciaExt;
   private BigDecimal nuInstanciaPai;
   private String raiz;
   private String definicaoInst;
   private String isLib;
   private String resourceId;
   private String ativo;
   private String descrInstancia;
   private String expressao;
   private String filtro;
   private String nomeInstancia;
   private String nomeScriptChave;
   private String nomeTab;
   private BigDecimal nuInstancia;
   private String tipoForm;
   private String categoria;
   private String descrTela;

   public BigDecimal getNuInstanciaExt() {
        return nuInstanciaExt;
   }

   public void setNuInstanciaExt(BigDecimal nuInstanciaExt) {
        markAsChanged("NUINSTANCIAEXT", nuInstanciaExt);
        this.nuInstanciaExt = nuInstanciaExt;
   }

   public BigDecimal getNuInstanciaPai() {
        return nuInstanciaPai;
   }

   public void setNuInstanciaPai(BigDecimal nuInstanciaPai) {
        markAsChanged("NUINSTANCIAPAI", nuInstanciaPai);
        this.nuInstanciaPai = nuInstanciaPai;
   }

   public String getRaiz() {
        return raiz;
   }

   public void setRaiz(String raiz) {
        markAsChanged("RAIZ", raiz);
        this.raiz = raiz;
   }

   public String getDefinicaoInst() {
        return definicaoInst;
   }

   public void setDefinicaoInst(String definicaoInst) {
        markAsChanged("DEFINICAOINST", definicaoInst);
        this.definicaoInst = definicaoInst;
   }

   public String getIsLib() {
        return isLib;
   }

   public void setIsLib(String isLib) {
        markAsChanged("ISLIB", isLib);
        this.isLib = isLib;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
        this.resourceId = resourceId;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getDescrInstancia() {
        return descrInstancia;
   }

   public void setDescrInstancia(String descrInstancia) {
        markAsChanged("DESCRINSTANCIA", descrInstancia);
        this.descrInstancia = descrInstancia;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
        this.expressao = expressao;
   }

   public String getFiltro() {
        return filtro;
   }

   public void setFiltro(String filtro) {
        markAsChanged("FILTRO", filtro);
        this.filtro = filtro;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
        this.nomeInstancia = nomeInstancia;
   }

   public String getNomeScriptChave() {
        return nomeScriptChave;
   }

   public void setNomeScriptChave(String nomeScriptChave) {
        markAsChanged("NOMESCRIPTCHAVE", nomeScriptChave);
        this.nomeScriptChave = nomeScriptChave;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
        this.nomeTab = nomeTab;
   }

   public BigDecimal getNuInstancia() {
        return nuInstancia;
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
        this.nuInstancia = nuInstancia;
   }

   public String getTipoForm() {
        return tipoForm;
   }

   public void setTipoForm(String tipoForm) {
        markAsChanged("TIPOFORM", tipoForm);
        this.tipoForm = tipoForm;
   }

   public String getCategoria() {
        return categoria;
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
        this.categoria = categoria;
   }

   public String getDescrTela() {
        return descrTela;
   }

   public void setDescrTela(String descrTela) {
        markAsChanged("DESCRTELA", descrTela);
        this.descrTela = descrTela;
   }

   @Override
   public String getTableName() {
        return "TDDINS";
   }

   @Override
   public String getEntityName() {
        return "Instancia";
   }

   @Override
   public Instancia fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuInstanciaExt = vo.asBigDecimal("NUINSTANCIAEXT");
        this.nuInstanciaPai = vo.asBigDecimal("NUINSTANCIAPAI");
        this.raiz = vo.asString("RAIZ");
        this.definicaoInst = vo.asString("DEFINICAOINST");
        this.isLib = vo.asString("ISLIB");
        this.resourceId = vo.asString("RESOURCEID");
        this.ativo = vo.asString("ATIVO");
        this.descrInstancia = vo.asString("DESCRINSTANCIA");
        this.expressao = vo.asString("EXPRESSAO");
        this.filtro = vo.asString("FILTRO");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.nomeScriptChave = vo.asString("NOMESCRIPTCHAVE");
        this.nomeTab = vo.asString("NOMETAB");
        this.nuInstancia = vo.asBigDecimal("NUINSTANCIA");
        this.tipoForm = vo.asString("TIPOFORM");
        this.categoria = vo.asString("CATEGORIA");
        this.descrTela = vo.asString("DESCRTELA");
        return this;
   }
}
