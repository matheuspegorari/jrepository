package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SolicitacaoLiberacaoOrcamento extends AbstractSankhyaEntity<SolicitacaoLiberacaoOrcamento> {
   public BigDecimal getCodAprovador() {
        return this.getVo().asBigDecimal("CODAPROVADOR");
   }

   public void setCodAprovador(BigDecimal codAprovador) {
        markAsChanged("CODAPROVADOR", codAprovador);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodSolicitante() {
        return this.getVo().asBigDecimal("CODSOLICITANTE");
   }

   public void setCodSolicitante(BigDecimal codSolicitante) {
        markAsChanged("CODSOLICITANTE", codSolicitante);
   }

   public Timestamp getDhAprovacao() {
        return this.getVo().asTimestamp("DHAPROVACAO");
   }

   public void setDhAprovacao(Timestamp dhAprovacao) {
        markAsChanged("DHAPROVACAO", dhAprovacao);
   }

   public Timestamp getDhSolicitacao() {
        return this.getVo().asTimestamp("DHSOLICITACAO");
   }

   public void setDhSolicitacao(Timestamp dhSolicitacao) {
        markAsChanged("DHSOLICITACAO", dhSolicitacao);
   }

   public BigDecimal getNuSolicitacao() {
        return this.getVo().asBigDecimal("NUSOLICITACAO");
   }

   public void setNuSolicitacao(BigDecimal nuSolicitacao) {
        markAsChanged("NUSOLICITACAO", nuSolicitacao);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
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
        return this;
   }
}
