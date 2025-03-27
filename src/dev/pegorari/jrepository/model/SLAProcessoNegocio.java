package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SLAProcessoNegocio extends AbstractSankhyaEntity<SLAProcessoNegocio> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCargaHoraria() {
        return this.getVo().asBigDecimal("CARGAHORARIA");
   }

   public void setCargaHoraria(BigDecimal cargaHoraria) {
        markAsChanged("CARGAHORARIA", cargaHoraria);
   }

   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public char[] getCondicoesEscolha() {
        return this.getVo().asClob("CONDICOESESCOLHA");
   }

   public void setCondicoesEscolha(char[] condicoesEscolha) {
        markAsChanged("CONDICOESESCOLHA", condicoesEscolha);
   }

   public char[] getCondicoesSuspensao() {
        return this.getVo().asClob("CONDICOESSUSPENSAO");
   }

   public void setCondicoesSuspensao(char[] condicoesSuspensao) {
        markAsChanged("CONDICOESSUSPENSAO", condicoesSuspensao);
   }

   public String getNomeRegra() {
        return this.getVo().asString("NOMEREGRA");
   }

   public void setNomeRegra(String nomeRegra) {
        markAsChanged("NOMEREGRA", nomeRegra);
   }

   public BigDecimal getRegra() {
        return this.getVo().asBigDecimal("REGRA");
   }

   public void setRegra(BigDecimal regra) {
        markAsChanged("REGRA", regra);
   }

   public BigDecimal getTempoLimite() {
        return this.getVo().asBigDecimal("TEMPOLIMITE");
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        markAsChanged("TEMPOLIMITE", tempoLimite);
   }

   public String getTipoTempo() {
        return this.getVo().asString("TIPOTEMPO");
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
   }

   public String getTipoTempoAviso() {
        return this.getVo().asString("TIPOTEMPOAVISO");
   }

   public void setTipoTempoAviso(String tipoTempoAviso) {
        markAsChanged("TIPOTEMPOAVISO", tipoTempoAviso);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
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
        this.setVo(vo);
        return this;
   }
}
