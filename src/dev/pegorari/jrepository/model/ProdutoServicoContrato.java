package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoServicoContrato extends AbstractSankhyaEntity<ProdutoServicoContrato> {
   public BigDecimal getCodParcPref() {
        return this.getVo().asBigDecimal("CODPARCPREF");
   }

   public void setCodParcPref(BigDecimal codParcPref) {
        markAsChanged("CODPARCPREF", codParcPref);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDtVersao() {
        return this.getVo().asTimestamp("DTVERSAO");
   }

   public void setDtVersao(Timestamp dtVersao) {
        markAsChanged("DTVERSAO", dtVersao);
   }

   public BigDecimal getFrequencia() {
        return this.getVo().asBigDecimal("FREQUENCIA");
   }

   public void setFrequencia(BigDecimal frequencia) {
        markAsChanged("FREQUENCIA", frequencia);
   }

   public BigDecimal getGrupImpressao() {
        return this.getVo().asBigDecimal("GRUPIMPRESSAO");
   }

   public void setGrupImpressao(BigDecimal grupImpressao) {
        markAsChanged("GRUPIMPRESSAO", grupImpressao);
   }

   public String getImprNota() {
        return this.getVo().asString("IMPRNOTA");
   }

   public void setImprNota(String imprNota) {
        markAsChanged("IMPRNOTA", imprNota);
   }

   public String getImprOs() {
        return this.getVo().asString("IMPROS");
   }

   public void setImprOs(String imprOs) {
        markAsChanged("IMPROS", imprOs);
   }

   public String getLimitante() {
        return this.getVo().asString("LIMITANTE");
   }

   public void setLimitante(String limitante) {
        markAsChanged("LIMITANTE", limitante);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public String getNumSerie() {
        return this.getVo().asString("NUMSERIE");
   }

   public void setNumSerie(String numSerie) {
        markAsChanged("NUMSERIE", numSerie);
   }

   public BigDecimal getNumUsuarios() {
        return this.getVo().asBigDecimal("NUMUSUARIOS");
   }

   public void setNumUsuarios(BigDecimal numUsuarios) {
        markAsChanged("NUMUSUARIOS", numUsuarios);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getProdPrinc() {
        return this.getVo().asString("PRODPRINC");
   }

   public void setProdPrinc(String prodPrinc) {
        markAsChanged("PRODPRINC", prodPrinc);
   }

   public BigDecimal getQtdePrevista() {
        return this.getVo().asBigDecimal("QTDEPREVISTA");
   }

   public void setQtdePrevista(BigDecimal qtdePrevista) {
        markAsChanged("QTDEPREVISTA", qtdePrevista);
   }

   public BigDecimal getQtdMeses() {
        return this.getVo().asBigDecimal("QTDMESES");
   }

   public void setQtdMeses(BigDecimal qtdMeses) {
        markAsChanged("QTDMESES", qtdMeses);
   }

   public String getSitProd() {
        return this.getVo().asString("SITPROD");
   }

   public void setSitProd(String sitProd) {
        markAsChanged("SITPROD", sitProd);
   }

   public String getVersao() {
        return this.getVo().asString("VERSAO");
   }

   public void setVersao(String versao) {
        markAsChanged("VERSAO", versao);
   }

   public BigDecimal getVlrUnit() {
        return this.getVo().asBigDecimal("VLRUNIT");
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
   }

   public String getSerFaturCon() {
        return this.getVo().asString("SERFATURCON");
   }

   public void setSerFaturCon(String serFaturCon) {
        markAsChanged("SERFATURCON", serFaturCon);
   }

   public BigDecimal getTopFaturCon() {
        return this.getVo().asBigDecimal("TOPFATURCON");
   }

   public void setTopFaturCon(BigDecimal topFaturCon) {
        markAsChanged("TOPFATURCON", topFaturCon);
   }

   public BigDecimal getQtdUsu() {
        return this.getVo().asBigDecimal("QTDUSU");
   }

   public void setQtdUsu(BigDecimal qtdUsu) {
        markAsChanged("QTDUSU", qtdUsu);
   }

   @Override
   public String getTableName() {
        return "TCSPSC";
   }

   @Override
   public String getEntityName() {
        return "ProdutoServicoContrato";
   }

   @Override
   public ProdutoServicoContrato fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
