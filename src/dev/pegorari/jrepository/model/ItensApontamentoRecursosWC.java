package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensApontamentoRecursosWC extends AbstractSankhyaEntity<ItensApontamentoRecursosWC> {
   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public BigDecimal getCodMqp() {
        return this.getVo().asBigDecimal("CODMQP");
   }

   public void setCodMqp(BigDecimal codMqp) {
        markAsChanged("CODMQP", codMqp);
   }

   public BigDecimal getCodRhp() {
        return this.getVo().asBigDecimal("CODRHP");
   }

   public void setCodRhp(BigDecimal codRhp) {
        markAsChanged("CODRHP", codRhp);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public BigDecimal getNuEqp() {
        return this.getVo().asBigDecimal("NUEQP");
   }

   public void setNuEqp(BigDecimal nuEqp) {
        markAsChanged("NUEQP", nuEqp);
   }

   public BigDecimal getSeqApa() {
        return this.getVo().asBigDecimal("SEQAPA");
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
   }

   @Override
   public String getTableName() {
        return "TPRIARW";
   }

   @Override
   public String getEntityName() {
        return "ItensApontamentoRecursosWC";
   }

   @Override
   public ItensApontamentoRecursosWC fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
