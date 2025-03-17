package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FormularioProcessoNegocio implements SankhyaEntity<FormularioProcessoNegocio> {

   private String cardinalidade;
   private char[] configCampos;
   private String descricao;
   private String escopo;
   private String nomeInstancia;
   private BigDecimal nuEle;
   private BigDecimal nuForm;
   private BigDecimal ordem;
   private String politicaReetrancia;
   private BigDecimal nuFormPai;
   private String ordemAbas;
   private String salvarDestino;
   private String tipo;
   private String utilizaTarefa;
   private String salvarFinalProcesso;

   public String getCardinalidade() {
        return cardinalidade;
   }

   public void setCardinalidade(String cardinalidade) {
        this.cardinalidade = cardinalidade;
   }

   public char[] getConfigCampos() {
        return configCampos;
   }

   public void setConfigCampos(char[] configCampos) {
        this.configCampos = configCampos;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getEscopo() {
        return escopo;
   }

   public void setEscopo(String escopo) {
        this.escopo = escopo;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        this.nomeInstancia = nomeInstancia;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        this.nuEle = nuEle;
   }

   public BigDecimal getNuForm() {
        return nuForm;
   }

   public void setNuForm(BigDecimal nuForm) {
        this.nuForm = nuForm;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getPoliticaReetrancia() {
        return politicaReetrancia;
   }

   public void setPoliticaReetrancia(String politicaReetrancia) {
        this.politicaReetrancia = politicaReetrancia;
   }

   public BigDecimal getNuFormPai() {
        return nuFormPai;
   }

   public void setNuFormPai(BigDecimal nuFormPai) {
        this.nuFormPai = nuFormPai;
   }

   public String getOrdemAbas() {
        return ordemAbas;
   }

   public void setOrdemAbas(String ordemAbas) {
        this.ordemAbas = ordemAbas;
   }

   public String getSalvarDestino() {
        return salvarDestino;
   }

   public void setSalvarDestino(String salvarDestino) {
        this.salvarDestino = salvarDestino;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getUtilizaTarefa() {
        return utilizaTarefa;
   }

   public void setUtilizaTarefa(String utilizaTarefa) {
        this.utilizaTarefa = utilizaTarefa;
   }

   public String getSalvarFinalProcesso() {
        return salvarFinalProcesso;
   }

   public void setSalvarFinalProcesso(String salvarFinalProcesso) {
        this.salvarFinalProcesso = salvarFinalProcesso;
   }

   @Override
   public String getEntityName() {
        return "FormularioProcessoNegocio";
   }

   @Override
   public FormularioProcessoNegocio fromVO(DynamicVO vo) {
        this.cardinalidade = vo.asString("CARDINALIDADE");
        this.configCampos = vo.asClob("CONFIGCAMPOS");
        this.descricao = vo.asString("DESCRICAO");
        this.escopo = vo.asString("ESCOPO");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.nuEle = vo.asBigDecimal("NUELE");
        this.nuForm = vo.asBigDecimal("NUFORM");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.politicaReetrancia = vo.asString("POLITICAREETRANCIA");
        this.nuFormPai = vo.asBigDecimal("NUFORMPAI");
        this.ordemAbas = vo.asString("ORDEMABAS");
        this.salvarDestino = vo.asString("SALVARDESTINO");
        this.tipo = vo.asString("TIPO");
        this.utilizaTarefa = vo.asString("UTILIZATAREFA");
        this.salvarFinalProcesso = vo.asString("SALVARFINALPROCESSO");
        return this;
   }
}
