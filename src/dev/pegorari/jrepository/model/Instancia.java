package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Instancia extends AbstractSankhyaEntity<Instancia> {
   public BigDecimal getNuInstanciaExt() {
        return this.getVo().asBigDecimal("NUINSTANCIAEXT");
   }

   public void setNuInstanciaExt(BigDecimal nuInstanciaExt) {
        markAsChanged("NUINSTANCIAEXT", nuInstanciaExt);
   }

   public BigDecimal getNuInstanciaPai() {
        return this.getVo().asBigDecimal("NUINSTANCIAPAI");
   }

   public void setNuInstanciaPai(BigDecimal nuInstanciaPai) {
        markAsChanged("NUINSTANCIAPAI", nuInstanciaPai);
   }

   public String getRaiz() {
        return this.getVo().asString("RAIZ");
   }

   public void setRaiz(String raiz) {
        markAsChanged("RAIZ", raiz);
   }

   public String getDefinicaoInst() {
        return this.getVo().asString("DEFINICAOINST");
   }

   public void setDefinicaoInst(String definicaoInst) {
        markAsChanged("DEFINICAOINST", definicaoInst);
   }

   public String getIsLib() {
        return this.getVo().asString("ISLIB");
   }

   public void setIsLib(String isLib) {
        markAsChanged("ISLIB", isLib);
   }

   public String getResourceId() {
        return this.getVo().asString("RESOURCEID");
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getDescrInstancia() {
        return this.getVo().asString("DESCRINSTANCIA");
   }

   public void setDescrInstancia(String descrInstancia) {
        markAsChanged("DESCRINSTANCIA", descrInstancia);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public String getFiltro() {
        return this.getVo().asString("FILTRO");
   }

   public void setFiltro(String filtro) {
        markAsChanged("FILTRO", filtro);
   }

   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public String getNomeScriptChave() {
        return this.getVo().asString("NOMESCRIPTCHAVE");
   }

   public void setNomeScriptChave(String nomeScriptChave) {
        markAsChanged("NOMESCRIPTCHAVE", nomeScriptChave);
   }

   public String getNomeTab() {
        return this.getVo().asString("NOMETAB");
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
   }

   public BigDecimal getNuInstancia() {
        return this.getVo().asBigDecimal("NUINSTANCIA");
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
   }

   public String getTipoForm() {
        return this.getVo().asString("TIPOFORM");
   }

   public void setTipoForm(String tipoForm) {
        markAsChanged("TIPOFORM", tipoForm);
   }

   public String getCategoria() {
        return this.getVo().asString("CATEGORIA");
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
   }

   public String getDescrTela() {
        return this.getVo().asString("DESCRTELA");
   }

   public void setDescrTela(String descrTela) {
        markAsChanged("DESCRTELA", descrTela);
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
        return this;
   }
}
