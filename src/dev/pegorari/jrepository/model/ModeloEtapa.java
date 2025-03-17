package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ModeloEtapa implements SankhyaEntity<ModeloEtapa> {

   private BigDecimal codMetod;
   private BigDecimal codProd;
   private String descricao;
   private String exigeProdutos;
   private BigDecimal numModelo;
   private BigDecimal numModeloPai;
   private BigDecimal numSeq;
   private String obrigatoria;
   private String observacao;
   private String tipValor;
   private BigDecimal valor;
   private BigDecimal vlrSuplementa;
   private BigDecimal vlrSuplementado;
   private String suplementa;
   private String suplementado;

   public BigDecimal getCodMetod() {
        return codMetod;
   }

   public void setCodMetod(BigDecimal codMetod) {
        this.codMetod = codMetod;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getExigeProdutos() {
        return exigeProdutos;
   }

   public void setExigeProdutos(String exigeProdutos) {
        this.exigeProdutos = exigeProdutos;
   }

   public BigDecimal getNumModelo() {
        return numModelo;
   }

   public void setNumModelo(BigDecimal numModelo) {
        this.numModelo = numModelo;
   }

   public BigDecimal getNumModeloPai() {
        return numModeloPai;
   }

   public void setNumModeloPai(BigDecimal numModeloPai) {
        this.numModeloPai = numModeloPai;
   }

   public BigDecimal getNumSeq() {
        return numSeq;
   }

   public void setNumSeq(BigDecimal numSeq) {
        this.numSeq = numSeq;
   }

   public String getObrigatoria() {
        return obrigatoria;
   }

   public void setObrigatoria(String obrigatoria) {
        this.obrigatoria = obrigatoria;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getTipValor() {
        return tipValor;
   }

   public void setTipValor(String tipValor) {
        this.tipValor = tipValor;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public BigDecimal getVlrSuplementa() {
        return vlrSuplementa;
   }

   public void setVlrSuplementa(BigDecimal vlrSuplementa) {
        this.vlrSuplementa = vlrSuplementa;
   }

   public BigDecimal getVlrSuplementado() {
        return vlrSuplementado;
   }

   public void setVlrSuplementado(BigDecimal vlrSuplementado) {
        this.vlrSuplementado = vlrSuplementado;
   }

   public String getSuplementa() {
        return suplementa;
   }

   public void setSuplementa(String suplementa) {
        this.suplementa = suplementa;
   }

   public String getSuplementado() {
        return suplementado;
   }

   public void setSuplementado(String suplementado) {
        this.suplementado = suplementado;
   }

   @Override
   public String getEntityName() {
        return "ModeloEtapa";
   }

   @Override
   public ModeloEtapa fromVO(DynamicVO vo) {
        this.codMetod = vo.asBigDecimal("CODMETOD");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descricao = vo.asString("DESCRICAO");
        this.exigeProdutos = vo.asString("EXIGEPRODUTOS");
        this.numModelo = vo.asBigDecimal("NUMMODELO");
        this.numModeloPai = vo.asBigDecimal("NUMMODELOPAI");
        this.numSeq = vo.asBigDecimal("NUMSEQ");
        this.obrigatoria = vo.asString("OBRIGATORIA");
        this.observacao = vo.asString("OBSERVACAO");
        this.tipValor = vo.asString("TIPVALOR");
        this.valor = vo.asBigDecimal("VALOR");
        this.vlrSuplementa = vo.asBigDecimal("VLRSUPLEMENTA");
        this.vlrSuplementado = vo.asBigDecimal("VLRSUPLEMENTADO");
        this.suplementa = vo.asString("SUPLEMENTA");
        this.suplementado = vo.asString("SUPLEMENTADO");
        return this;
   }
}
