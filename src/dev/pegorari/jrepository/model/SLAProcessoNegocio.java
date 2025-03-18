package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SLAProcessoNegocio extends AbstractSankhyaEntity<SLAProcessoNegocio> {
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
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCargaHoraria() {
        return cargaHoraria;
   }

   public void setCargaHoraria(BigDecimal cargaHoraria) {
        markAsChanged("CARGAHORARIA", cargaHoraria);
        this.cargaHoraria = cargaHoraria;
   }

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
        this.codPrn = codPrn;
   }

   public char[] getCondicoesEscolha() {
        return condicoesEscolha;
   }

   public void setCondicoesEscolha(char[] condicoesEscolha) {
        markAsChanged("CONDICOESESCOLHA", condicoesEscolha);
        this.condicoesEscolha = condicoesEscolha;
   }

   public char[] getCondicoesSuspensao() {
        return condicoesSuspensao;
   }

   public void setCondicoesSuspensao(char[] condicoesSuspensao) {
        markAsChanged("CONDICOESSUSPENSAO", condicoesSuspensao);
        this.condicoesSuspensao = condicoesSuspensao;
   }

   public String getNomeRegra() {
        return nomeRegra;
   }

   public void setNomeRegra(String nomeRegra) {
        markAsChanged("NOMEREGRA", nomeRegra);
        this.nomeRegra = nomeRegra;
   }

   public BigDecimal getRegra() {
        return regra;
   }

   public void setRegra(BigDecimal regra) {
        markAsChanged("REGRA", regra);
        this.regra = regra;
   }

   public BigDecimal getTempoLimite() {
        return tempoLimite;
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        markAsChanged("TEMPOLIMITE", tempoLimite);
        this.tempoLimite = tempoLimite;
   }

   public String getTipoTempo() {
        return tipoTempo;
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
        this.tipoTempo = tipoTempo;
   }

   public String getTipoTempoAviso() {
        return tipoTempoAviso;
   }

   public void setTipoTempoAviso(String tipoTempoAviso) {
        markAsChanged("TIPOTEMPOAVISO", tipoTempoAviso);
        this.tipoTempoAviso = tipoTempoAviso;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   @Override
   public String getTableName() {
        return "TWFRSLA";
   }

   @Override
   public String getEntityName() {
        return "SLAProcessoNegocio";
   }

   @Override
   public SLAProcessoNegocio fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
