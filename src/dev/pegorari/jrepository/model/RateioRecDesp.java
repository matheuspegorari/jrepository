package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RateioRecDesp extends AbstractSankhyaEntity<RateioRecDesp> {
   private BigDecimal percRateio;
   private String digitado;
   private Timestamp dtAlter;
   private BigDecimal nuFin;
   private BigDecimal numContrato;
   private String origem;
   private BigDecimal codCencus;
   private BigDecimal codCtaCtb;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal codProj;
   private BigDecimal codSite;
   private BigDecimal codUsu;

   public BigDecimal getPercRateio() {
        return percRateio;
   }

   public void setPercRateio(BigDecimal percRateio) {
        this.percRateio = percRateio;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodSite() {
        return codSite;
   }

   public void setCodSite(BigDecimal codSite) {
        this.codSite = codSite;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   @Override
   public String getTableName() {
        return "TGFRAT";
   }

   @Override
   public String getEntityName() {
        return "RateioRecDesp";
   }

   @Override
   public RateioRecDesp fromVO(DynamicVO vo) {
        this.percRateio = vo.asBigDecimal("PERCRATEIO");
        this.digitado = vo.asString("DIGITADO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.origem = vo.asString("ORIGEM");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codSite = vo.asBigDecimal("CODSITE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
