package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SolicitacaoLiberacaoOrcamento extends AbstractSankhyaEntity<SolicitacaoLiberacaoOrcamento> {
   private BigDecimal codAprovador;
   private BigDecimal codMeta;
   private BigDecimal codSolicitante;
   private Timestamp dhAprovacao;
   private Timestamp dhSolicitacao;
   private BigDecimal nuSolicitacao;
   private String observacao;
   private String status;

   public BigDecimal getCodAprovador() {
        return codAprovador;
   }

   public void setCodAprovador(BigDecimal codAprovador) {
        markAsChanged("CODAPROVADOR", codAprovador);
        this.codAprovador = codAprovador;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodSolicitante() {
        return codSolicitante;
   }

   public void setCodSolicitante(BigDecimal codSolicitante) {
        markAsChanged("CODSOLICITANTE", codSolicitante);
        this.codSolicitante = codSolicitante;
   }

   public Timestamp getDhAprovacao() {
        return dhAprovacao;
   }

   public void setDhAprovacao(Timestamp dhAprovacao) {
        markAsChanged("DHAPROVACAO", dhAprovacao);
        this.dhAprovacao = dhAprovacao;
   }

   public Timestamp getDhSolicitacao() {
        return dhSolicitacao;
   }

   public void setDhSolicitacao(Timestamp dhSolicitacao) {
        markAsChanged("DHSOLICITACAO", dhSolicitacao);
        this.dhSolicitacao = dhSolicitacao;
   }

   public BigDecimal getNuSolicitacao() {
        return nuSolicitacao;
   }

   public void setNuSolicitacao(BigDecimal nuSolicitacao) {
        markAsChanged("NUSOLICITACAO", nuSolicitacao);
        this.nuSolicitacao = nuSolicitacao;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   @Override
   public String getTableName() {
        return "TGMSLO";
   }

   @Override
   public String getEntityName() {
        return "SolicitacaoLiberacaoOrcamento";
   }

   @Override
   public SolicitacaoLiberacaoOrcamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codAprovador = vo.asBigDecimal("CODAPROVADOR");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codSolicitante = vo.asBigDecimal("CODSOLICITANTE");
        this.dhAprovacao = vo.asTimestamp("DHAPROVACAO");
        this.dhSolicitacao = vo.asTimestamp("DHSOLICITACAO");
        this.nuSolicitacao = vo.asBigDecimal("NUSOLICITACAO");
        this.observacao = vo.asString("OBSERVACAO");
        this.status = vo.asString("STATUS");
        return this;
   }
}
