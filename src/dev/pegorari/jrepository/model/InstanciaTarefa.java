package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaTarefa extends AbstractSankhyaEntity<InstanciaTarefa> {
   public BigDecimal getCodUsuDono() {
        return this.getVo().asBigDecimal("CODUSUDONO");
   }

   public void setCodUsuDono(BigDecimal codUsuDono) {
        markAsChanged("CODUSUDONO", codUsuDono);
   }

   public Timestamp getDhAceite() {
        return this.getVo().asTimestamp("DHACEITE");
   }

   public void setDhAceite(Timestamp dhAceite) {
        markAsChanged("DHACEITE", dhAceite);
   }

   public Timestamp getDhConclusao() {
        return this.getVo().asTimestamp("DHCONCLUSAO");
   }

   public void setDhConclusao(Timestamp dhConclusao) {
        markAsChanged("DHCONCLUSAO", dhConclusao);
   }

   public Timestamp getDhCriacao() {
        return this.getVo().asTimestamp("DHCRIACAO");
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        markAsChanged("DHCRIACAO", dhCriacao);
   }

   public String getIdElemento() {
        return this.getVo().asString("IDELEMENTO");
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
   }

   public BigDecimal getIdInstPrn() {
        return this.getVo().asBigDecimal("IDINSTPRN");
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
   }

   public BigDecimal getIdInstTar() {
        return this.getVo().asBigDecimal("IDINSTTAR");
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        markAsChanged("IDINSTTAR", idInstTar);
   }

   public String getNomeElemento() {
        return this.getVo().asString("NOMEELEMENTO");
   }

   public void setNomeElemento(String nomeElemento) {
        markAsChanged("NOMEELEMENTO", nomeElemento);
   }

   public BigDecimal getCodUsuSolicitante() {
        return this.getVo().asBigDecimal("CODUSUSOLICITANTE");
   }

   public void setCodUsuSolicitante(BigDecimal codUsuSolicitante) {
        markAsChanged("CODUSUSOLICITANTE", codUsuSolicitante);
   }

   public Timestamp getDhVencimento() {
        return this.getVo().asTimestamp("DHVENCIMENTO");
   }

   public void setDhVencimento(Timestamp dhVencimento) {
        markAsChanged("DHVENCIMENTO", dhVencimento);
   }

   public BigDecimal getPercDecorrido() {
        return this.getVo().asBigDecimal("PERCDECORRIDO");
   }

   public void setPercDecorrido(BigDecimal percDecorrido) {
        markAsChanged("PERCDECORRIDO", percDecorrido);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public BigDecimal getTempoDecorrido() {
        return this.getVo().asBigDecimal("TEMPODECORRIDO");
   }

   public void setTempoDecorrido(BigDecimal tempoDecorrido) {
        markAsChanged("TEMPODECORRIDO", tempoDecorrido);
   }

   public BigDecimal getTempoLimite() {
        return this.getVo().asBigDecimal("TEMPOLIMITE");
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        markAsChanged("TEMPOLIMITE", tempoLimite);
   }

   public String getSituacaoExec() {
        return this.getVo().asString("SITUACAOEXEC");
   }

   public void setSituacaoExec(String situacaoExec) {
        markAsChanged("SITUACAOEXEC", situacaoExec);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   @Override
   public String getTableName() {
        return "TWFITAR";
   }

   @Override
   public String getEntityName() {
        return "InstanciaTarefa";
   }

   @Override
   public InstanciaTarefa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
