package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaTarefa extends AbstractSankhyaEntity<InstanciaTarefa> {
   private BigDecimal codUsuDono;
   private Timestamp dhAceite;
   private Timestamp dhConclusao;
   private Timestamp dhCriacao;
   private String idElemento;
   private BigDecimal idInstPrn;
   private BigDecimal idInstTar;
   private String nomeElemento;
   private BigDecimal codUsuSolicitante;
   private Timestamp dhVencimento;
   private BigDecimal percDecorrido;
   private String situacao;
   private BigDecimal tempoDecorrido;
   private BigDecimal tempoLimite;
   private String situacaoExec;
   private BigDecimal codUsuAlter;
   private Timestamp dhAlter;

   public BigDecimal getCodUsuDono() {
        return codUsuDono;
   }

   public void setCodUsuDono(BigDecimal codUsuDono) {
        this.codUsuDono = codUsuDono;
   }

   public Timestamp getDhAceite() {
        return dhAceite;
   }

   public void setDhAceite(Timestamp dhAceite) {
        this.dhAceite = dhAceite;
   }

   public Timestamp getDhConclusao() {
        return dhConclusao;
   }

   public void setDhConclusao(Timestamp dhConclusao) {
        this.dhConclusao = dhConclusao;
   }

   public Timestamp getDhCriacao() {
        return dhCriacao;
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        this.dhCriacao = dhCriacao;
   }

   public String getIdElemento() {
        return idElemento;
   }

   public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
   }

   public BigDecimal getIdInstPrn() {
        return idInstPrn;
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        this.idInstPrn = idInstPrn;
   }

   public BigDecimal getIdInstTar() {
        return idInstTar;
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        this.idInstTar = idInstTar;
   }

   public String getNomeElemento() {
        return nomeElemento;
   }

   public void setNomeElemento(String nomeElemento) {
        this.nomeElemento = nomeElemento;
   }

   public BigDecimal getCodUsuSolicitante() {
        return codUsuSolicitante;
   }

   public void setCodUsuSolicitante(BigDecimal codUsuSolicitante) {
        this.codUsuSolicitante = codUsuSolicitante;
   }

   public Timestamp getDhVencimento() {
        return dhVencimento;
   }

   public void setDhVencimento(Timestamp dhVencimento) {
        this.dhVencimento = dhVencimento;
   }

   public BigDecimal getPercDecorrido() {
        return percDecorrido;
   }

   public void setPercDecorrido(BigDecimal percDecorrido) {
        this.percDecorrido = percDecorrido;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public BigDecimal getTempoDecorrido() {
        return tempoDecorrido;
   }

   public void setTempoDecorrido(BigDecimal tempoDecorrido) {
        this.tempoDecorrido = tempoDecorrido;
   }

   public BigDecimal getTempoLimite() {
        return tempoLimite;
   }

   public void setTempoLimite(BigDecimal tempoLimite) {
        this.tempoLimite = tempoLimite;
   }

   public String getSituacaoExec() {
        return situacaoExec;
   }

   public void setSituacaoExec(String situacaoExec) {
        this.situacaoExec = situacaoExec;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        this.codUsuAlter = codUsuAlter;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
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
        this.codUsuDono = vo.asBigDecimal("CODUSUDONO");
        this.dhAceite = vo.asTimestamp("DHACEITE");
        this.dhConclusao = vo.asTimestamp("DHCONCLUSAO");
        this.dhCriacao = vo.asTimestamp("DHCRIACAO");
        this.idElemento = vo.asString("IDELEMENTO");
        this.idInstPrn = vo.asBigDecimal("IDINSTPRN");
        this.idInstTar = vo.asBigDecimal("IDINSTTAR");
        this.nomeElemento = vo.asString("NOMEELEMENTO");
        this.codUsuSolicitante = vo.asBigDecimal("CODUSUSOLICITANTE");
        this.dhVencimento = vo.asTimestamp("DHVENCIMENTO");
        this.percDecorrido = vo.asBigDecimal("PERCDECORRIDO");
        this.situacao = vo.asString("SITUACAO");
        this.tempoDecorrido = vo.asBigDecimal("TEMPODECORRIDO");
        this.tempoLimite = vo.asBigDecimal("TEMPOLIMITE");
        this.situacaoExec = vo.asString("SITUACAOEXEC");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}
