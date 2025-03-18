package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotaSeparacao extends AbstractSankhyaEntity<NotaSeparacao> {
   private BigDecimal nuNota;
   private BigDecimal nuSeparacao;
   private BigDecimal nuTarefacan;
   private String statusNota;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getNuTarefacan() {
        return nuTarefacan;
   }

   public void setNuTarefacan(BigDecimal nuTarefacan) {
        markAsChanged("NUTAREFACAN", nuTarefacan);
        this.nuTarefacan = nuTarefacan;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
        this.statusNota = statusNota;
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
        this.setOriginalVO(vo);
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.nuTarefacan = vo.asBigDecimal("NUTAREFACAN");
        this.statusNota = vo.asString("STATUSNOTA");
        return this;
   }
}
