package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogFaturamentoAutomaticoWMS extends AbstractSankhyaEntity<LogFaturamentoAutomaticoWMS> {
   public char[] getLog() {
        return this.getVo().asClob("LOG");
   }

   public void setLog(char[] log) {
        markAsChanged("LOG", log);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
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
        return this;
   }
}
