package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotasRecebimento extends AbstractSankhyaEntity<NotasRecebimento> {
   private BigDecimal nuNota;
   private BigDecimal nuRecebimento;
   private BigDecimal nuTarefacan;
   private String statusNota;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getNuTarefacan() {
        return nuTarefacan;
   }

   public void setNuTarefacan(BigDecimal nuTarefacan) {
        this.nuTarefacan = nuTarefacan;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        this.statusNota = statusNota;
   }

   @Override
   public String getTableName() {
        return "TGWRXN";
   }

   @Override
   public String getEntityName() {
        return "NotasRecebimento";
   }

   @Override
   public NotasRecebimento fromVO(DynamicVO vo) {
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.nuTarefacan = vo.asBigDecimal("NUTAREFACAN");
        this.statusNota = vo.asString("STATUSNOTA");
        return this;
   }
}
