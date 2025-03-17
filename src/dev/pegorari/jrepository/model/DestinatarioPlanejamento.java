package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class DestinatarioPlanejamento implements SankhyaEntity<DestinatarioPlanejamento> {

   private BigDecimal nuPla;
   private String apresentacao;
   private BigDecimal chave;
   private BigDecimal chave2;
   private String evento;
   private BigDecimal nuInstancia;

   public BigDecimal getNuPla() {
        return nuPla;
   }

   public void setNuPla(BigDecimal nuPla) {
        this.nuPla = nuPla;
   }

   public String getApresentacao() {
        return apresentacao;
   }

   public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
   }

   public BigDecimal getChave() {
        return chave;
   }

   public void setChave(BigDecimal chave) {
        this.chave = chave;
   }

   public BigDecimal getChave2() {
        return chave2;
   }

   public void setChave2(BigDecimal chave2) {
        this.chave2 = chave2;
   }

   public String getEvento() {
        return evento;
   }

   public void setEvento(String evento) {
        this.evento = evento;
   }

   public BigDecimal getNuInstancia() {
        return nuInstancia;
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        this.nuInstancia = nuInstancia;
   }

   @Override
   public String getEntityName() {
        return "DestinatarioPlanejamento";
   }

   @Override
   public DestinatarioPlanejamento fromVO(DynamicVO vo) {
        this.nuPla = vo.asBigDecimal("NUPLA");
        this.apresentacao = vo.asString("APRESENTACAO");
        this.chave = vo.asBigDecimal("CHAVE");
        this.chave2 = vo.asBigDecimal("CHAVE2");
        this.evento = vo.asString("EVENTO");
        this.nuInstancia = vo.asBigDecimal("NUINSTANCIA");
        return this;
   }
}
