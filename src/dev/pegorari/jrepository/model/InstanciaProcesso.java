package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaProcesso implements SankhyaEntity<InstanciaProcesso> {

   private BigDecimal codPrn;
   private BigDecimal codUsuInc;
   private Timestamp dhConclusao;
   private Timestamp dhInclusao;
   private BigDecimal idInstPrn;
   private BigDecimal versao;
   private String situacaoExec;
   private Timestamp dhVencimento;
   private BigDecimal percDecorrido;
   private String situacao;
   private BigDecimal slaAtual;
   private BigDecimal tempoDecorrido;
   private BigDecimal tempoLimite;
   private BigDecimal idPrnMestre;
   private BigDecimal codUsuCancel;
   private String obsCancel;

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        this.codPrn = codPrn;
   }

   public BigDecimal getCodUsuInc() {
        return codUsuInc;
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        this.codUsuInc = codUsuInc;
   }

   public Timestamp getDhConclusao() {
        return dhConclusao;
   }

   public void setDhConclusao(Timestamp dhConclusao) {
        this.dhConclusao = dhConclusao;
   }

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        this.dhInclusao = dhInclusao;
   }

   public BigDecimal getIdInstPrn() {
        return idInstPrn;
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        this.idInstPrn = idInstPrn;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   public String getSituacaoExec() {
        return situacaoExec;
   }

   public void setSituacaoExec(String situacaoExec) {
        this.situacaoExec = situacaoExec;
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

   public BigDecimal getSlaAtual() {
        return slaAtual;
   }

   public void setSlaAtual(BigDecimal slaAtual) {
        this.slaAtual = slaAtual;
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

   public BigDecimal getIdPrnMestre() {
        return idPrnMestre;
   }

   public void setIdPrnMestre(BigDecimal idPrnMestre) {
        this.idPrnMestre = idPrnMestre;
   }

   public BigDecimal getCodUsuCancel() {
        return codUsuCancel;
   }

   public void setCodUsuCancel(BigDecimal codUsuCancel) {
        this.codUsuCancel = codUsuCancel;
   }

   public String getObsCancel() {
        return obsCancel;
   }

   public void setObsCancel(String obsCancel) {
        this.obsCancel = obsCancel;
   }

   @Override
   public String getEntityName() {
        return "InstanciaProcesso";
   }

   @Override
   public InstanciaProcesso fromVO(DynamicVO vo) {
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.codUsuInc = vo.asBigDecimal("CODUSUINC");
        this.dhConclusao = vo.asTimestamp("DHCONCLUSAO");
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.idInstPrn = vo.asBigDecimal("IDINSTPRN");
        this.versao = vo.asBigDecimal("VERSAO");
        this.situacaoExec = vo.asString("SITUACAOEXEC");
        this.dhVencimento = vo.asTimestamp("DHVENCIMENTO");
        this.percDecorrido = vo.asBigDecimal("PERCDECORRIDO");
        this.situacao = vo.asString("SITUACAO");
        this.slaAtual = vo.asBigDecimal("SLAATUAL");
        this.tempoDecorrido = vo.asBigDecimal("TEMPODECORRIDO");
        this.tempoLimite = vo.asBigDecimal("TEMPOLIMITE");
        this.idPrnMestre = vo.asBigDecimal("IDPRNMESTRE");
        this.codUsuCancel = vo.asBigDecimal("CODUSUCANCEL");
        this.obsCancel = vo.asString("OBSCANCEL");
        return this;
   }
}
