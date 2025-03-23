package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogFaturamentoAutomaticoWMS extends AbstractSankhyaEntity<LogFaturamentoAutomaticoWMS> {
   private char[] log;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private Timestamp dhAlter;

   public char[] getLog() {
        return log;
   }

   public void setLog(char[] log) {
        markAsChanged("LOG", log);
        this.log = log;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   @Override
   public String getTableName() {
        return "TGWLOGFATAUTO";
   }

   @Override
   public String getEntityName() {
        return "LogFaturamentoAutomaticoWMS";
   }

   @Override
   public LogFaturamentoAutomaticoWMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.log = vo.asClob("LOG");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}
