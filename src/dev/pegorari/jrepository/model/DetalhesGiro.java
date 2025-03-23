package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetalhesGiro extends AbstractSankhyaEntity<DetalhesGiro> {
   private BigDecimal seqImps;
   private BigDecimal numPs;
   private BigDecimal qtdGiro;
   private Timestamp perIni;
   private Timestamp perFin;

   public BigDecimal getSeqImps() {
        return seqImps;
   }

   public void setSeqImps(BigDecimal seqImps) {
        markAsChanged("SEQIMPS", seqImps);
        this.seqImps = seqImps;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
        this.numPs = numPs;
   }

   public BigDecimal getQtdGiro() {
        return qtdGiro;
   }

   public void setQtdGiro(BigDecimal qtdGiro) {
        markAsChanged("QTDGIRO", qtdGiro);
        this.qtdGiro = qtdGiro;
   }

   public Timestamp getPerIni() {
        return perIni;
   }

   public void setPerIni(Timestamp perIni) {
        markAsChanged("PERINI", perIni);
        this.perIni = perIni;
   }

   public Timestamp getPerFin() {
        return perFin;
   }

   public void setPerFin(Timestamp perFin) {
        markAsChanged("PERFIN", perFin);
        this.perFin = perFin;
   }

   @Override
   public String getTableName() {
        return "TPRDGIR";
   }

   @Override
   public String getEntityName() {
        return "DetalhesGiro";
   }

   @Override
   public DetalhesGiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.seqImps = vo.asBigDecimal("SEQIMPS");
        this.numPs = vo.asBigDecimal("NUMPS");
        this.qtdGiro = vo.asBigDecimal("QTDGIRO");
        this.perIni = vo.asTimestamp("PERINI");
        this.perFin = vo.asTimestamp("PERFIN");
        return this;
   }
}
