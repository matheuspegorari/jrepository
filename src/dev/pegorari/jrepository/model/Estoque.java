package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Estoque extends AbstractSankhyaEntity<Estoque> {
   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getEstDocAwms() {
        return this.getVo().asBigDecimal("ESTDOCAWMS");
   }

   public void setEstDocAwms(BigDecimal estDocAwms) {
        markAsChanged("ESTDOCAWMS", estDocAwms);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtFabricacao() {
        return this.getVo().asTimestamp("DTFABRICACAO");
   }

   public void setDtFabricacao(Timestamp dtFabricacao) {
        markAsChanged("DTFABRICACAO", dtFabricacao);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getEstMax() {
        return this.getVo().asBigDecimal("ESTMAX");
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
   }

   public BigDecimal getEstMin() {
        return this.getVo().asBigDecimal("ESTMIN");
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public BigDecimal getPercGermin() {
        return this.getVo().asBigDecimal("PERCGERMIN");
   }

   public void setPercGermin(BigDecimal percGermin) {
        markAsChanged("PERCGERMIN", percGermin);
   }

   public BigDecimal getPercPureza() {
        return this.getVo().asBigDecimal("PERCPUREZA");
   }

   public void setPercPureza(BigDecimal percPureza) {
        markAsChanged("PERCPUREZA", percPureza);
   }

   public BigDecimal getReservado() {
        return this.getVo().asBigDecimal("RESERVADO");
   }

   public void setReservado(BigDecimal reservado) {
        markAsChanged("RESERVADO", reservado);
   }

   public String getStatusLote() {
        return this.getVo().asString("STATUSLOTE");
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getWmsBloqueado() {
        return this.getVo().asBigDecimal("WMSBLOQUEADO");
   }

   public void setWmsBloqueado(BigDecimal wmsBloqueado) {
        markAsChanged("WMSBLOQUEADO", wmsBloqueado);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getCodAgregacao() {
        return this.getVo().asString("CODAGREGACAO");
   }

   public void setCodAgregacao(String codAgregacao) {
        markAsChanged("CODAGREGACAO", codAgregacao);
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
        this.setVo(vo);
        return this;
   }
}
