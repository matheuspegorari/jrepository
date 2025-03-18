package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotificacaoGapsGestao extends AbstractSankhyaEntity<NotificacaoGapsGestao> {
   private BigDecimal nuAviso;
   private String rotina;
   private BigDecimal codFila;
   private String ignorarProximas;

   public BigDecimal getNuAviso() {
        return nuAviso;
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
        this.nuAviso = nuAviso;
   }

   public String getRotina() {
        return rotina;
   }

   public void setRotina(String rotina) {
        markAsChanged("ROTINA", rotina);
        this.rotina = rotina;
   }

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
        this.codFila = codFila;
   }

   public String getIgnorarProximas() {
        return ignorarProximas;
   }

   public void setIgnorarProximas(String ignorarProximas) {
        markAsChanged("IGNORARPROXIMAS", ignorarProximas);
        this.ignorarProximas = ignorarProximas;
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
        this.setOriginalVO(vo);
        this.nuAviso = vo.asBigDecimal("NUAVISO");
        this.rotina = vo.asString("ROTINA");
        this.codFila = vo.asBigDecimal("CODFILA");
        this.ignorarProximas = vo.asString("IGNORARPROXIMAS");
        return this;
   }
}
