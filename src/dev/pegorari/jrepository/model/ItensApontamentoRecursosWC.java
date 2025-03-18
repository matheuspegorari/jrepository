package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensApontamentoRecursosWC extends AbstractSankhyaEntity<ItensApontamentoRecursosWC> {
   private BigDecimal codCre;
   private BigDecimal codMqp;
   private BigDecimal codRhp;
   private BigDecimal codWcp;
   private BigDecimal nuApo;
   private BigDecimal nuEqp;
   private BigDecimal seqApa;

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
        this.codCre = codCre;
   }

   public BigDecimal getCodMqp() {
        return codMqp;
   }

   public void setCodMqp(BigDecimal codMqp) {
        markAsChanged("CODMQP", codMqp);
        this.codMqp = codMqp;
   }

   public BigDecimal getCodRhp() {
        return codRhp;
   }

   public void setCodRhp(BigDecimal codRhp) {
        markAsChanged("CODRHP", codRhp);
        this.codRhp = codRhp;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   public BigDecimal getNuEqp() {
        return nuEqp;
   }

   public void setNuEqp(BigDecimal nuEqp) {
        markAsChanged("NUEQP", nuEqp);
        this.nuEqp = nuEqp;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
        this.seqApa = seqApa;
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
        this.setOriginalVO(vo);
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codMqp = vo.asBigDecimal("CODMQP");
        this.codRhp = vo.asBigDecimal("CODRHP");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.nuEqp = vo.asBigDecimal("NUEQP");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        return this;
   }
}
