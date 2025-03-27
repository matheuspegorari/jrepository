package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetalhesGiro extends AbstractSankhyaEntity<DetalhesGiro> {
   public BigDecimal getSeqImps() {
        return this.getVo().asBigDecimal("SEQIMPS");
   }

   public void setSeqImps(BigDecimal seqImps) {
        markAsChanged("SEQIMPS", seqImps);
   }

   public BigDecimal getNumPs() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
   }

   public BigDecimal getQtdGiro() {
        return this.getVo().asBigDecimal("QTDGIRO");
   }

   public void setQtdGiro(BigDecimal qtdGiro) {
        markAsChanged("QTDGIRO", qtdGiro);
   }

   public Timestamp getPerIni() {
        return this.getVo().asTimestamp("PERINI");
   }

   public void setPerIni(Timestamp perIni) {
        markAsChanged("PERINI", perIni);
   }

   public Timestamp getPerFin() {
        return this.getVo().asTimestamp("PERFIN");
   }

   public void setPerFin(Timestamp perFin) {
        markAsChanged("PERFIN", perFin);
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
        return this;
   }
}
