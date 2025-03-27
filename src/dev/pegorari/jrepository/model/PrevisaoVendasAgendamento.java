package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasAgendamento extends AbstractSankhyaEntity<PrevisaoVendasAgendamento> {
   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
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
        this.setVo(vo);
        return this;
   }
}
