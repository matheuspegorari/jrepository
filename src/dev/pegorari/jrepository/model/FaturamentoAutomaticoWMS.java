package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FaturamentoAutomaticoWMS implements SankhyaEntity<FaturamentoAutomaticoWMS> {

   private String ativo;
   private BigDecimal codEmp;
   private Timestamp dtUltFatConfSep;
   private String email;
   private String envNotaFat;
   private String envPedNaoFat;
   private String serieNota;
   private String situacao;
   private char[] filtroFatAuto;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public Timestamp getDtUltFatConfSep() {
        return dtUltFatConfSep;
   }

   public void setDtUltFatConfSep(Timestamp dtUltFatConfSep) {
        this.dtUltFatConfSep = dtUltFatConfSep;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getEnvNotaFat() {
        return envNotaFat;
   }

   public void setEnvNotaFat(String envNotaFat) {
        this.envNotaFat = envNotaFat;
   }

   public String getEnvPedNaoFat() {
        return envPedNaoFat;
   }

   public void setEnvPedNaoFat(String envPedNaoFat) {
        this.envPedNaoFat = envPedNaoFat;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public char[] getFiltroFatAuto() {
        return filtroFatAuto;
   }

   public void setFiltroFatAuto(char[] filtroFatAuto) {
        this.filtroFatAuto = filtroFatAuto;
   }

   @Override
   public String getEntityName() {
        return "FaturamentoAutomaticoWMS";
   }

   @Override
   public FaturamentoAutomaticoWMS fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtUltFatConfSep = vo.asTimestamp("DTULTFATCONFSEP");
        this.email = vo.asString("EMAIL");
        this.envNotaFat = vo.asString("ENVNOTAFAT");
        this.envPedNaoFat = vo.asString("ENVPEDNAOFAT");
        this.serieNota = vo.asString("SERIENOTA");
        this.situacao = vo.asString("SITUACAO");
        this.filtroFatAuto = vo.asClob("FILTROFATAUTO");
        return this;
   }
}
