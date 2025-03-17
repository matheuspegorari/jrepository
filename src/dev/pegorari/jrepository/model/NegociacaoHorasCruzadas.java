package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NegociacaoHorasCruzadas implements SankhyaEntity<NegociacaoHorasCruzadas> {

   private BigDecimal codParc;
   private Timestamp dtAlter;
   private BigDecimal nuNegociacao;
   private BigDecimal multHoraExtra;
   private BigDecimal nuFap;
   private Timestamp dtIni;
   private BigDecimal codUnnCompradora;
   private BigDecimal codUnnVendedora;
   private Timestamp dtFin;
   private BigDecimal nuNota;
   private BigDecimal vlrHora;
   private BigDecimal codUsu;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuNegociacao() {
        return nuNegociacao;
   }

   public void setNuNegociacao(BigDecimal nuNegociacao) {
        this.nuNegociacao = nuNegociacao;
   }

   public BigDecimal getMultHoraExtra() {
        return multHoraExtra;
   }

   public void setMultHoraExtra(BigDecimal multHoraExtra) {
        this.multHoraExtra = multHoraExtra;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public Timestamp getDtIni() {
        return dtIni;
   }

   public void setDtIni(Timestamp dtIni) {
        this.dtIni = dtIni;
   }

   public BigDecimal getCodUnnCompradora() {
        return codUnnCompradora;
   }

   public void setCodUnnCompradora(BigDecimal codUnnCompradora) {
        this.codUnnCompradora = codUnnCompradora;
   }

   public BigDecimal getCodUnnVendedora() {
        return codUnnVendedora;
   }

   public void setCodUnnVendedora(BigDecimal codUnnVendedora) {
        this.codUnnVendedora = codUnnVendedora;
   }

   public Timestamp getDtFin() {
        return dtFin;
   }

   public void setDtFin(Timestamp dtFin) {
        this.dtFin = dtFin;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getVlrHora() {
        return vlrHora;
   }

   public void setVlrHora(BigDecimal vlrHora) {
        this.vlrHora = vlrHora;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   @Override
   public String getEntityName() {
        return "NegociacaoHorasCruzadas";
   }

   @Override
   public NegociacaoHorasCruzadas fromVO(DynamicVO vo) {
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuNegociacao = vo.asBigDecimal("NUNEGOCIACAO");
        this.multHoraExtra = vo.asBigDecimal("MULTHORAEXTRA");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.dtIni = vo.asTimestamp("DTINI");
        this.codUnnCompradora = vo.asBigDecimal("CODUNNCOMPRADORA");
        this.codUnnVendedora = vo.asBigDecimal("CODUNNVENDEDORA");
        this.dtFin = vo.asTimestamp("DTFIN");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.vlrHora = vo.asBigDecimal("VLRHORA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
