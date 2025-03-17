package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RegraSLAPadrao implements SankhyaEntity<RegraSLAPadrao> {

   private BigDecimal codCargaHor;
   private String baseCalcTempo;
   private BigDecimal codGrupoProd;
   private BigDecimal codOcoros;
   private BigDecimal codProd;
   private BigDecimal codServ;
   private BigDecimal numReg;
   private BigDecimal nuSla;
   private BigDecimal ordem;
   private String padrao;
   private BigDecimal prioridade;
   private BigDecimal tempoTotal;
   private String tipoTempo;
   private String usaRegraPadrao;
   private BigDecimal valorTempo;

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        this.codCargaHor = codCargaHor;
   }

   public String getBaseCalcTempo() {
        return baseCalcTempo;
   }

   public void setBaseCalcTempo(String baseCalcTempo) {
        this.baseCalcTempo = baseCalcTempo;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodOcoros() {
        return codOcoros;
   }

   public void setCodOcoros(BigDecimal codOcoros) {
        this.codOcoros = codOcoros;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        this.codServ = codServ;
   }

   public BigDecimal getNumReg() {
        return numReg;
   }

   public void setNumReg(BigDecimal numReg) {
        this.numReg = numReg;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        this.nuSla = nuSla;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   public BigDecimal getTempoTotal() {
        return tempoTotal;
   }

   public void setTempoTotal(BigDecimal tempoTotal) {
        this.tempoTotal = tempoTotal;
   }

   public String getTipoTempo() {
        return tipoTempo;
   }

   public void setTipoTempo(String tipoTempo) {
        this.tipoTempo = tipoTempo;
   }

   public String getUsaRegraPadrao() {
        return usaRegraPadrao;
   }

   public void setUsaRegraPadrao(String usaRegraPadrao) {
        this.usaRegraPadrao = usaRegraPadrao;
   }

   public BigDecimal getValorTempo() {
        return valorTempo;
   }

   public void setValorTempo(BigDecimal valorTempo) {
        this.valorTempo = valorTempo;
   }

   @Override
   public String getEntityName() {
        return "RegraSLAPadrao";
   }

   @Override
   public RegraSLAPadrao fromVO(DynamicVO vo) {
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.baseCalcTempo = vo.asString("BASECALCTEMPO");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codOcoros = vo.asBigDecimal("CODOCOROS");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codServ = vo.asBigDecimal("CODSERV");
        this.numReg = vo.asBigDecimal("NUMREG");
        this.nuSla = vo.asBigDecimal("NUSLA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.padrao = vo.asString("PADRAO");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.tempoTotal = vo.asBigDecimal("TEMPOTOTAL");
        this.tipoTempo = vo.asString("TIPOTEMPO");
        this.usaRegraPadrao = vo.asString("USAREGRAPADRAO");
        this.valorTempo = vo.asBigDecimal("VALORTEMPO");
        return this;
   }
}
