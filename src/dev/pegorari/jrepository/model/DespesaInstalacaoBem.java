package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DespesaInstalacaoBem implements SankhyaEntity<DespesaInstalacaoBem> {

   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuNotaDesp;
   private BigDecimal nuRateio;
   private String statusRateio;
   private BigDecimal vlrPendNota;
   private BigDecimal vlrTotRateio;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuNotaDesp() {
        return nuNotaDesp;
   }

   public void setNuNotaDesp(BigDecimal nuNotaDesp) {
        this.nuNotaDesp = nuNotaDesp;
   }

   public BigDecimal getNuRateio() {
        return nuRateio;
   }

   public void setNuRateio(BigDecimal nuRateio) {
        this.nuRateio = nuRateio;
   }

   public String getStatusRateio() {
        return statusRateio;
   }

   public void setStatusRateio(String statusRateio) {
        this.statusRateio = statusRateio;
   }

   public BigDecimal getVlrPendNota() {
        return vlrPendNota;
   }

   public void setVlrPendNota(BigDecimal vlrPendNota) {
        this.vlrPendNota = vlrPendNota;
   }

   public BigDecimal getVlrTotRateio() {
        return vlrTotRateio;
   }

   public void setVlrTotRateio(BigDecimal vlrTotRateio) {
        this.vlrTotRateio = vlrTotRateio;
   }

   @Override
   public String getEntityName() {
        return "DespesaInstalacaoBem";
   }

   @Override
   public DespesaInstalacaoBem fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuNotaDesp = vo.asBigDecimal("NUNOTADESP");
        this.nuRateio = vo.asBigDecimal("NURATEIO");
        this.statusRateio = vo.asString("STATUSRATEIO");
        this.vlrPendNota = vo.asBigDecimal("VLRPENDNOTA");
        this.vlrTotRateio = vo.asBigDecimal("VLRTOTRATEIO");
        return this;
   }
}
