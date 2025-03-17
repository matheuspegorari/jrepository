package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoServicoContrato implements SankhyaEntity<ProdutoServicoContrato> {

   private BigDecimal codParcPref;
   private BigDecimal codProd;
   private Timestamp dtVersao;
   private BigDecimal frequencia;
   private BigDecimal grupImpressao;
   private String imprNota;
   private String imprOs;
   private String limitante;
   private BigDecimal numContrato;
   private String numSerie;
   private BigDecimal numUsuarios;
   private String observacao;
   private String prodPrinc;
   private BigDecimal qtdePrevista;
   private BigDecimal qtdMeses;
   private String sitProd;
   private String versao;
   private BigDecimal vlrUnit;
   private String serFaturCon;
   private BigDecimal topFaturCon;
   private BigDecimal qtdUsu;

   public BigDecimal getCodParcPref() {
        return codParcPref;
   }

   public void setCodParcPref(BigDecimal codParcPref) {
        this.codParcPref = codParcPref;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public Timestamp getDtVersao() {
        return dtVersao;
   }

   public void setDtVersao(Timestamp dtVersao) {
        this.dtVersao = dtVersao;
   }

   public BigDecimal getFrequencia() {
        return frequencia;
   }

   public void setFrequencia(BigDecimal frequencia) {
        this.frequencia = frequencia;
   }

   public BigDecimal getGrupImpressao() {
        return grupImpressao;
   }

   public void setGrupImpressao(BigDecimal grupImpressao) {
        this.grupImpressao = grupImpressao;
   }

   public String getImprNota() {
        return imprNota;
   }

   public void setImprNota(String imprNota) {
        this.imprNota = imprNota;
   }

   public String getImprOs() {
        return imprOs;
   }

   public void setImprOs(String imprOs) {
        this.imprOs = imprOs;
   }

   public String getLimitante() {
        return limitante;
   }

   public void setLimitante(String limitante) {
        this.limitante = limitante;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public String getNumSerie() {
        return numSerie;
   }

   public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
   }

   public BigDecimal getNumUsuarios() {
        return numUsuarios;
   }

   public void setNumUsuarios(BigDecimal numUsuarios) {
        this.numUsuarios = numUsuarios;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getProdPrinc() {
        return prodPrinc;
   }

   public void setProdPrinc(String prodPrinc) {
        this.prodPrinc = prodPrinc;
   }

   public BigDecimal getQtdePrevista() {
        return qtdePrevista;
   }

   public void setQtdePrevista(BigDecimal qtdePrevista) {
        this.qtdePrevista = qtdePrevista;
   }

   public BigDecimal getQtdMeses() {
        return qtdMeses;
   }

   public void setQtdMeses(BigDecimal qtdMeses) {
        this.qtdMeses = qtdMeses;
   }

   public String getSitProd() {
        return sitProd;
   }

   public void setSitProd(String sitProd) {
        this.sitProd = sitProd;
   }

   public String getVersao() {
        return versao;
   }

   public void setVersao(String versao) {
        this.versao = versao;
   }

   public BigDecimal getVlrUnit() {
        return vlrUnit;
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        this.vlrUnit = vlrUnit;
   }

   public String getSerFaturCon() {
        return serFaturCon;
   }

   public void setSerFaturCon(String serFaturCon) {
        this.serFaturCon = serFaturCon;
   }

   public BigDecimal getTopFaturCon() {
        return topFaturCon;
   }

   public void setTopFaturCon(BigDecimal topFaturCon) {
        this.topFaturCon = topFaturCon;
   }

   public BigDecimal getQtdUsu() {
        return qtdUsu;
   }

   public void setQtdUsu(BigDecimal qtdUsu) {
        this.qtdUsu = qtdUsu;
   }

   @Override
   public String getEntityName() {
        return "ProdutoServicoContrato";
   }

   @Override
   public ProdutoServicoContrato fromVO(DynamicVO vo) {
        this.codParcPref = vo.asBigDecimal("CODPARCPREF");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dtVersao = vo.asTimestamp("DTVERSAO");
        this.frequencia = vo.asBigDecimal("FREQUENCIA");
        this.grupImpressao = vo.asBigDecimal("GRUPIMPRESSAO");
        this.imprNota = vo.asString("IMPRNOTA");
        this.imprOs = vo.asString("IMPROS");
        this.limitante = vo.asString("LIMITANTE");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numSerie = vo.asString("NUMSERIE");
        this.numUsuarios = vo.asBigDecimal("NUMUSUARIOS");
        this.observacao = vo.asString("OBSERVACAO");
        this.prodPrinc = vo.asString("PRODPRINC");
        this.qtdePrevista = vo.asBigDecimal("QTDEPREVISTA");
        this.qtdMeses = vo.asBigDecimal("QTDMESES");
        this.sitProd = vo.asString("SITPROD");
        this.versao = vo.asString("VERSAO");
        this.vlrUnit = vo.asBigDecimal("VLRUNIT");
        this.serFaturCon = vo.asString("SERFATURCON");
        this.topFaturCon = vo.asBigDecimal("TOPFATURCON");
        this.qtdUsu = vo.asBigDecimal("QTDUSU");
        return this;
   }
}
