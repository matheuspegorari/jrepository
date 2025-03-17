package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItensApontamentoRecursosWC implements SankhyaEntity<ItensApontamentoRecursosWC> {

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
        this.codCre = codCre;
   }

   public BigDecimal getCodMqp() {
        return codMqp;
   }

   public void setCodMqp(BigDecimal codMqp) {
        this.codMqp = codMqp;
   }

   public BigDecimal getCodRhp() {
        return codRhp;
   }

   public void setCodRhp(BigDecimal codRhp) {
        this.codRhp = codRhp;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public BigDecimal getNuEqp() {
        return nuEqp;
   }

   public void setNuEqp(BigDecimal nuEqp) {
        this.nuEqp = nuEqp;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        this.seqApa = seqApa;
   }

   @Override
   public String getEntityName() {
        return "ItensApontamentoRecursosWC";
   }

   @Override
   public ItensApontamentoRecursosWC fromVO(DynamicVO vo) {
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
