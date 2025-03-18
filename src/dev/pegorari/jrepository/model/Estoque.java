package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Estoque extends AbstractSankhyaEntity<Estoque> {
   private BigDecimal codLocal;
   private BigDecimal codParc;
   private BigDecimal estDocAwms;
   private BigDecimal codEmp;
   private Timestamp dtFabricacao;
   private Timestamp dtVal;
   private BigDecimal estMax;
   private BigDecimal estMin;
   private BigDecimal estoque;
   private BigDecimal percGermin;
   private BigDecimal percPureza;
   private BigDecimal reservado;
   private String statusLote;
   private String tipo;
   private BigDecimal wmsBloqueado;
   private String ativo;
   private String codBarra;
   private BigDecimal codProd;
   private String controle;
   private String codAgregacao;

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getEstDocAwms() {
        return estDocAwms;
   }

   public void setEstDocAwms(BigDecimal estDocAwms) {
        markAsChanged("ESTDOCAWMS", estDocAwms);
        this.estDocAwms = estDocAwms;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtFabricacao() {
        return dtFabricacao;
   }

   public void setDtFabricacao(Timestamp dtFabricacao) {
        markAsChanged("DTFABRICACAO", dtFabricacao);
        this.dtFabricacao = dtFabricacao;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
        this.estMax = estMax;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
        this.estMin = estMin;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public BigDecimal getPercGermin() {
        return percGermin;
   }

   public void setPercGermin(BigDecimal percGermin) {
        markAsChanged("PERCGERMIN", percGermin);
        this.percGermin = percGermin;
   }

   public BigDecimal getPercPureza() {
        return percPureza;
   }

   public void setPercPureza(BigDecimal percPureza) {
        markAsChanged("PERCPUREZA", percPureza);
        this.percPureza = percPureza;
   }

   public BigDecimal getReservado() {
        return reservado;
   }

   public void setReservado(BigDecimal reservado) {
        markAsChanged("RESERVADO", reservado);
        this.reservado = reservado;
   }

   public String getStatusLote() {
        return statusLote;
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
        this.statusLote = statusLote;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getWmsBloqueado() {
        return wmsBloqueado;
   }

   public void setWmsBloqueado(BigDecimal wmsBloqueado) {
        markAsChanged("WMSBLOQUEADO", wmsBloqueado);
        this.wmsBloqueado = wmsBloqueado;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getCodAgregacao() {
        return codAgregacao;
   }

   public void setCodAgregacao(String codAgregacao) {
        markAsChanged("CODAGREGACAO", codAgregacao);
        this.codAgregacao = codAgregacao;
   }

   @Override
   public String getTableName() {
        return "TGFEST";
   }

   @Override
   public String getEntityName() {
        return "Estoque";
   }

   @Override
   public Estoque fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.estDocAwms = vo.asBigDecimal("ESTDOCAWMS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtFabricacao = vo.asTimestamp("DTFABRICACAO");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.estMin = vo.asBigDecimal("ESTMIN");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.percGermin = vo.asBigDecimal("PERCGERMIN");
        this.percPureza = vo.asBigDecimal("PERCPUREZA");
        this.reservado = vo.asBigDecimal("RESERVADO");
        this.statusLote = vo.asString("STATUSLOTE");
        this.tipo = vo.asString("TIPO");
        this.wmsBloqueado = vo.asBigDecimal("WMSBLOQUEADO");
        this.ativo = vo.asString("ATIVO");
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.codAgregacao = vo.asString("CODAGREGACAO");
        return this;
   }
}
