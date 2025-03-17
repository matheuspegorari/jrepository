package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class NotificacaoGapsGestao implements SankhyaEntity<NotificacaoGapsGestao> {

   private BigDecimal nuAviso;
   private String rotina;
   private BigDecimal codFila;
   private String ignorarProximas;

   public BigDecimal getNuAviso() {
        return nuAviso;
   }

   public void setNuAviso(BigDecimal nuAviso) {
        this.nuAviso = nuAviso;
   }

   public String getRotina() {
        return rotina;
   }

   public void setRotina(String rotina) {
        this.rotina = rotina;
   }

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        this.codFila = codFila;
   }

   public String getIgnorarProximas() {
        return ignorarProximas;
   }

   public void setIgnorarProximas(String ignorarProximas) {
        this.ignorarProximas = ignorarProximas;
   }

   @Override
   public String getEntityName() {
        return "NotificacaoGapsGestao";
   }

   @Override
   public NotificacaoGapsGestao fromVO(DynamicVO vo) {
        this.nuAviso = vo.asBigDecimal("NUAVISO");
        this.rotina = vo.asString("ROTINA");
        this.codFila = vo.asBigDecimal("CODFILA");
        this.ignorarProximas = vo.asString("IGNORARPROXIMAS");
        return this;
   }
}
