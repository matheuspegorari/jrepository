package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Campo implements SankhyaEntity<Campo> {

   private String apresentacao;
   private String calculado;
   private String descricaoCampo;
   private String expressao;
   private String mascara;
   private String nomeCampo;
   private String nomeTab;
   private BigDecimal nuCampo;
   private BigDecimal ordem;
   private String permitePadrao;
   private String permitePesquisa;
   private String sistema;
   private BigDecimal tamanho;
   private String tipoCampo;
   private String tipoApresentacao;
   private String visivelGridPesquisa;
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

   public String getDescricaoCampo() {
        return descricaoCampo;
   }

   public void setDescricaoCampo(String descricaoCampo) {
        this.descricaoCampo = descricaoCampo;
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

   public String getNomeCampo() {
        return nomeCampo;
   }

   public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        this.nomeTab = nomeTab;
   }

   public BigDecimal getNuCampo() {
        return nuCampo;
   }

   public void setNuCampo(BigDecimal nuCampo) {
        this.nuCampo = nuCampo;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getPermitePadrao() {
        return permitePadrao;
   }

   public void setPermitePadrao(String permitePadrao) {
        this.permitePadrao = permitePadrao;
   }

   public String getPermitePesquisa() {
        return permitePesquisa;
   }

   public void setPermitePesquisa(String permitePesquisa) {
        this.permitePesquisa = permitePesquisa;
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

   public String getTipoCampo() {
        return tipoCampo;
   }

   public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
   }

   public String getTipoApresentacao() {
        return tipoApresentacao;
   }

   public void setTipoApresentacao(String tipoApresentacao) {
        this.tipoApresentacao = tipoApresentacao;
   }

   public String getVisivelGridPesquisa() {
        return visivelGridPesquisa;
   }

   public void setVisivelGridPesquisa(String visivelGridPesquisa) {
        this.visivelGridPesquisa = visivelGridPesquisa;
   }

   public String getRequerido() {
        return requerido;
   }

   public void setRequerido(String requerido) {
        this.requerido = requerido;
   }

   @Override
   public String getEntityName() {
        return "Campo";
   }

   @Override
   public Campo fromVO(DynamicVO vo) {
        this.apresentacao = vo.asString("APRESENTACAO");
        this.calculado = vo.asString("CALCULADO");
        this.descricaoCampo = vo.asString("DESCRICAOCAMPO");
        this.expressao = vo.asString("EXPRESSAO");
        this.mascara = vo.asString("MASCARA");
        this.nomeCampo = vo.asString("NOMECAMPO");
        this.nomeTab = vo.asString("NOMETAB");
        this.nuCampo = vo.asBigDecimal("NUCAMPO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.permitePadrao = vo.asString("PERMITEPADRAO");
        this.permitePesquisa = vo.asString("PERMITEPESQUISA");
        this.sistema = vo.asString("SISTEMA");
        this.tamanho = vo.asBigDecimal("TAMANHO");
        this.tipoCampo = vo.asString("TIPOCAMPO");
        this.tipoApresentacao = vo.asString("TIPOAPRESENTACAO");
        this.visivelGridPesquisa = vo.asString("VISIVELGRIDPESQUISA");
        this.requerido = vo.asString("REQUERIDO");
        return this;
   }
}
