package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotasRecebimento extends AbstractSankhyaEntity<NotasRecebimento> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public BigDecimal getNuTarefacan() {
        return this.getVo().asBigDecimal("NUTAREFACAN");
   }

   public void setNuTarefacan(BigDecimal nuTarefacan) {
        markAsChanged("NUTAREFACAN", nuTarefacan);
   }

   public String getStatusNota() {
        return this.getVo().asString("STATUSNOTA");
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
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
        this.setVo(vo);
        return this;
   }
}
