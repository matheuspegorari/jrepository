package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Campo extends AbstractSankhyaEntity<Campo> {
   private String apresentacao;
   private String calculado;
   private String descrcampo;
   private String expressao;
   private String mascara;
   private String nomecampo;
   private String nometab;
   private BigDecimal nucampo;
   private BigDecimal ordem;
   private String permitepadrao;
   private String permitepesquisa;
   private String sistema;
   private BigDecimal tamanho;
   private String tipcampo;
   private String tipoapresentacao;
   private String visivelgridpesquisa;
   private String requerido;

   public String getApresentacao() {
        return apresentacao;
   }

   public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
   }

   public String getCalculado() {
        return calculado;
   }

   public void setCalculado(String calculado) {
        this.calculado = calculado;
   }

   public String getDescrcampo() {
        return descrcampo;
   }

   public void setDescrcampo(String descrcampo) {
        this.descrcampo = descrcampo;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   public String getMascara() {
        return mascara;
   }

   public void setMascara(String mascara) {
        this.mascara = mascara;
   }

   public String getNomecampo() {
        return nomecampo;
   }

   public void setNomecampo(String nomecampo) {
        this.nomecampo = nomecampo;
   }

   public String getNometab() {
        return nometab;
   }

   public void setNometab(String nometab) {
        this.nometab = nometab;
   }

   public BigDecimal getNucampo() {
        return nucampo;
   }

   public void setNucampo(BigDecimal nucampo) {
        this.nucampo = nucampo;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getPermitepadrao() {
        return permitepadrao;
   }

   public void setPermitepadrao(String permitepadrao) {
        this.permitepadrao = permitepadrao;
   }

   public String getPermitepesquisa() {
        return permitepesquisa;
   }

   public void setPermitepesquisa(String permitepesquisa) {
        this.permitepesquisa = permitepesquisa;
   }

   public String getSistema() {
        return sistema;
   }

   public void setSistema(String sistema) {
        this.sistema = sistema;
   }

   public BigDecimal getTamanho() {
        return tamanho;
   }

   public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
   }

   public String getTipcampo() {
        return tipcampo;
   }

   public void setTipcampo(String tipcampo) {
        this.tipcampo = tipcampo;
   }

   public String getTipoapresentacao() {
        return tipoapresentacao;
   }

   public void setTipoapresentacao(String tipoapresentacao) {
        this.tipoapresentacao = tipoapresentacao;
   }

   public String getVisivelgridpesquisa() {
        return visivelgridpesquisa;
   }

   public void setVisivelgridpesquisa(String visivelgridpesquisa) {
        this.visivelgridpesquisa = visivelgridpesquisa;
   }

   public String getRequerido() {
        return requerido;
   }

   public void setRequerido(String requerido) {
        this.requerido = requerido;
   }

   @Override
   public String getTableName() {
        return "TDDCAM";
   }

   @Override
   public String getEntityName() {
        return "Campo";
   }

   @Override
   public Campo fromVO(DynamicVO vo) {
        this.apresentacao = vo.asString("APRESENTACAO");
        this.calculado = vo.asString("CALCULADO");
        this.descrcampo = vo.asString("DESCRCAMPO");
        this.expressao = vo.asString("EXPRESSAO");
        this.mascara = vo.asString("MASCARA");
        this.nomecampo = vo.asString("NOMECAMPO");
        this.nometab = vo.asString("NOMETAB");
        this.nucampo = vo.asBigDecimal("NUCAMPO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.permitepadrao = vo.asString("PERMITEPADRAO");
        this.permitepesquisa = vo.asString("PERMITEPESQUISA");
        this.sistema = vo.asString("SISTEMA");
        this.tamanho = vo.asBigDecimal("TAMANHO");
        this.tipcampo = vo.asString("TIPCAMPO");
        this.tipoapresentacao = vo.asString("TIPOAPRESENTACAO");
        this.visivelgridpesquisa = vo.asString("VISIVELGRIDPESQUISA");
        this.requerido = vo.asString("REQUERIDO");
        return this;
   }
}
