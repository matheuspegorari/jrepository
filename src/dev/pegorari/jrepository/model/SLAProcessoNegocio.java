package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class SLAProcessoNegocio implements SankhyaEntity<SLAProcessoNegocio> {

   private String ativo;
   private BigDecimal cargaHoraria;
   private BigDecimal codPrn;
   private char[] condicoesEscolha;
   private char[] condicoesSuspensao;
   private String nomeRegra;
   private BigDecimal regra;
   private BigDecimal tempoLimite;
   private String tipoTempo;
   private String tipoTempoAviso;
   private BigDecimal versao;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCargaHoraria() {
        return cargaHoraria;
   }

   public void setCargaHoraria(BigDecimal cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
   }

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        this.codPrn = codPrn;
   }

   public char[] getCondicoesEscolha() {
        return condicoesEscolha;
   }

   public void setCondicoesEscolha(char[] condicoesEscolha) {
        this.condicoesEscolha = condicoesEscolha;
   }

   public char[] getCondicoesSuspensao() {
        return condicoesSuspensao;
   }

   public void setCondicoesSuspensao(char[] condicoesSuspensao) {
        this.condicoesSuspensao = condicoesSuspensao;
   }

   public String getNomeRegra() {
        return nomeRegra;
   }

   public void setNomeRegra(String nomeRegra) {
        this.nomeRegra = nomeRegra;
   }

   public BigDecimal getRegra() {
        return regra;
   }

   public void setRegra(BigDecimal regra) {
        this.regra = regra;
   }

   public BigDecimal getTempoLimite() {
        return tempoLimite;
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        this.tempoLimite = tempoLimite;
   }

   public String getTipoTempo() {
        return tipoTempo;
   }

   public void setTipoTempo(String tipoTempo) {
        this.tipoTempo = tipoTempo;
   }

   public String getTipoTempoAviso() {
        return tipoTempoAviso;
   }

   public void setTipoTempoAviso(String tipoTempoAviso) {
        this.tipoTempoAviso = tipoTempoAviso;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   @Override
   public String getEntityName() {
        return "SLAProcessoNegocio";
   }

   @Override
   public SLAProcessoNegocio fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.cargaHoraria = vo.asBigDecimal("CARGAHORARIA");
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.condicoesEscolha = vo.asClob("CONDICOESESCOLHA");
        this.condicoesSuspensao = vo.asClob("CONDICOESSUSPENSAO");
        this.nomeRegra = vo.asString("NOMEREGRA");
        this.regra = vo.asBigDecimal("REGRA");
        this.tempoLimite = vo.asBigDecimal("TEMPOLIMITE");
        this.tipoTempo = vo.asString("TIPOTEMPO");
        this.tipoTempoAviso = vo.asString("TIPOTEMPOAVISO");
        this.versao = vo.asBigDecimal("VERSAO");
        return this;
   }
}
