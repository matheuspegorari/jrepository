package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaProcesso extends AbstractSankhyaEntity<InstanciaProcesso> {
   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public BigDecimal getCodUsuInc() {
        return this.getVo().asBigDecimal("CODUSUINC");
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
   }

   public Timestamp getDhConclusao() {
        return this.getVo().asTimestamp("DHCONCLUSAO");
   }

   public void setDhConclusao(Timestamp dhConclusao) {
        markAsChanged("DHCONCLUSAO", dhConclusao);
   }

   public Timestamp getDhInclusao() {
        return this.getVo().asTimestamp("DHINCLUSAO");
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
   }

   public BigDecimal getIdInstPrn() {
        return this.getVo().asBigDecimal("IDINSTPRN");
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public String getSituacaoExec() {
        return this.getVo().asString("SITUACAOEXEC");
   }

   public void setSituacaoExec(String situacaoExec) {
        markAsChanged("SITUACAOEXEC", situacaoExec);
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

   public BigDecimal getSlaAtual() {
        return this.getVo().asBigDecimal("SLAATUAL");
   }

   public void setSlaAtual(BigDecimal slaAtual) {
        markAsChanged("SLAATUAL", slaAtual);
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

   public BigDecimal getIdPrnMestre() {
        return this.getVo().asBigDecimal("IDPRNMESTRE");
   }

   public void setIdPrnMestre(BigDecimal idPrnMestre) {
        markAsChanged("IDPRNMESTRE", idPrnMestre);
   }

   public BigDecimal getCodUsuCancel() {
        return this.getVo().asBigDecimal("CODUSUCANCEL");
   }

   public void setCodUsuCancel(BigDecimal codUsuCancel) {
        markAsChanged("CODUSUCANCEL", codUsuCancel);
   }

   public String getObsCancel() {
        return this.getVo().asString("OBSCANCEL");
   }

   public void setObsCancel(String obsCancel) {
        markAsChanged("OBSCANCEL", obsCancel);
   }

   @Override
   public String getTableName() {
        return "TWFIPRN";
   }

   @Override
   public String getEntityName() {
        return "InstanciaProcesso";
   }

   @Override
   public InstanciaProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
