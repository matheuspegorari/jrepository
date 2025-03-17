package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasAgendamento extends AbstractSankhyaEntity<PrevisaoVendasAgendamento> {
   private BigDecimal codExec;

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        this.codExec = codExec;
   }

   @Override
   public String getTableName() {
        return "TSLISC";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasAgendamento";
   }

   @Override
   public PrevisaoVendasAgendamento fromVO(DynamicVO vo) {
        this.codExec = vo.asBigDecimal("CODEXEC");
        return this;
   }
}
