package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotificacaoGapsGestao extends AbstractSankhyaEntity<NotificacaoGapsGestao> {
   public BigDecimal getNuAviso() {
        return this.getVo().asBigDecimal("NUAVISO");
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
   }

   public String getRotina() {
        return this.getVo().asString("ROTINA");
   }

   public void setRotina(String rotina) {
        markAsChanged("ROTINA", rotina);
   }

   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   public String getIgnorarProximas() {
        return this.getVo().asString("IGNORARPROXIMAS");
   }

   public void setIgnorarProximas(String ignorarProximas) {
        markAsChanged("IGNORARPROXIMAS", ignorarProximas);
   }

   @Override
   public String getTableName() {
        return "TSINGG";
   }

   @Override
   public String getEntityName() {
        return "NotificacaoGapsGestao";
   }

   @Override
   public NotificacaoGapsGestao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
