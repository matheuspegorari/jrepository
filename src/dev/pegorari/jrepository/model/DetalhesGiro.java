package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetalhesGiro implements SankhyaEntity<DetalhesGiro> {

   private BigDecimal seqImps;
   private BigDecimal numPs;
   private BigDecimal qtdGiro;
   private Timestamp perIni;
   private Timestamp perFin;

   public BigDecimal getSeqImps() {
        return seqImps;
   }

   public void setSeqImps(BigDecimal seqImps) {
        this.seqImps = seqImps;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        this.numPs = numPs;
   }

   public BigDecimal getQtdGiro() {
        return qtdGiro;
   }

   public void setQtdGiro(BigDecimal qtdGiro) {
        this.qtdGiro = qtdGiro;
   }

   public Timestamp getPerIni() {
        return perIni;
   }

   public void setPerIni(Timestamp perIni) {
        this.perIni = perIni;
   }

   public Timestamp getPerFin() {
        return perFin;
   }

   public void setPerFin(Timestamp perFin) {
        this.perFin = perFin;
   }

   @Override
   public String getEntityName() {
        return "DetalhesGiro";
   }

   @Override
   public DetalhesGiro fromVO(DynamicVO vo) {
        this.seqImps = vo.asBigDecimal("SEQIMPS");
        this.numPs = vo.asBigDecimal("NUMPS");
        this.qtdGiro = vo.asBigDecimal("QTDGIRO");
        this.perIni = vo.asTimestamp("PERINI");
        this.perFin = vo.asTimestamp("PERFIN");
        return this;
   }
}
