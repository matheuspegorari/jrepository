package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotaSeparacao extends AbstractSankhyaEntity<NotaSeparacao> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
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
        return "TGWSXN";
   }

   @Override
   public String getEntityName() {
        return "NotaSeparacao";
   }

   @Override
   public NotaSeparacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
