package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FaturamentoAutomaticoWMS extends AbstractSankhyaEntity<FaturamentoAutomaticoWMS> {
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
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtUltFatConfSep() {
        return dtUltFatConfSep;
   }

   public void setDtUltFatConfSep(Timestamp dtUltFatConfSep) {
        markAsChanged("DTULTFATCONFSEP", dtUltFatConfSep);
        this.dtUltFatConfSep = dtUltFatConfSep;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getEnvNotaFat() {
        return envNotaFat;
   }

   public void setEnvNotaFat(String envNotaFat) {
        markAsChanged("ENVNOTAFAT", envNotaFat);
        this.envNotaFat = envNotaFat;
   }

   public String getEnvPedNaoFat() {
        return envPedNaoFat;
   }

   public void setEnvPedNaoFat(String envPedNaoFat) {
        markAsChanged("ENVPEDNAOFAT", envPedNaoFat);
        this.envPedNaoFat = envPedNaoFat;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public char[] getFiltroFatAuto() {
        return filtroFatAuto;
   }

   public void setFiltroFatAuto(char[] filtroFatAuto) {
        markAsChanged("FILTROFATAUTO", filtroFatAuto);
        this.filtroFatAuto = filtroFatAuto;
   }

   @Override
   public String getTableName() {
        return "TGWFATAUTO";
   }

   @Override
   public String getEntityName() {
        return "FaturamentoAutomaticoWMS";
   }

   @Override
   public FaturamentoAutomaticoWMS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
