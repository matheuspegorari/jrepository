package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class NotaSeparacao implements SankhyaEntity<NotaSeparacao> {

   private BigDecimal nuNota;
   private BigDecimal nuSeparacao;
   private BigDecimal nuTarefaCan;
   private String statusNota;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getNuTarefaCan() {
        return nuTarefaCan;
   }

   public void setNuTarefaCan(BigDecimal nuTarefaCan) {
        this.nuTarefaCan = nuTarefaCan;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        this.statusNota = statusNota;
   }

   @Override
   public String getEntityName() {
        return "NotaSeparacao";
   }

   @Override
   public NotaSeparacao fromVO(DynamicVO vo) {
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.nuTarefaCan = vo.asBigDecimal("NUTAREFACAN");
        this.statusNota = vo.asString("STATUSNOTA");
        return this;
   }
}
