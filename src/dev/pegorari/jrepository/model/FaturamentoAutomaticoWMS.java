package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FaturamentoAutomaticoWMS extends AbstractSankhyaEntity<FaturamentoAutomaticoWMS> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtUltFatConfSep() {
        return this.getVo().asTimestamp("DTULTFATCONFSEP");
   }

   public void setDtUltFatConfSep(Timestamp dtUltFatConfSep) {
        markAsChanged("DTULTFATCONFSEP", dtUltFatConfSep);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getEnvNotaFat() {
        return this.getVo().asString("ENVNOTAFAT");
   }

   public void setEnvNotaFat(String envNotaFat) {
        markAsChanged("ENVNOTAFAT", envNotaFat);
   }

   public String getEnvPedNaoFat() {
        return this.getVo().asString("ENVPEDNAOFAT");
   }

   public void setEnvPedNaoFat(String envPedNaoFat) {
        markAsChanged("ENVPEDNAOFAT", envPedNaoFat);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public char[] getFiltroFatAuto() {
        return this.getVo().asClob("FILTROFATAUTO");
   }

   public void setFiltroFatAuto(char[] filtroFatAuto) {
        markAsChanged("FILTROFATAUTO", filtroFatAuto);
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
        this.setVo(vo);
        return this;
   }
}
