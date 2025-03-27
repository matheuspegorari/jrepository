package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DestinatarioPlanejamento extends AbstractSankhyaEntity<DestinatarioPlanejamento> {
   public BigDecimal getNuPla() {
        return this.getVo().asBigDecimal("NUPLA");
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
   }

   public String getApresentacao() {
        return this.getVo().asString("APRESENTACAO");
   }

   public void setApresentacao(String apresentacao) {
        markAsChanged("APRESENTACAO", apresentacao);
   }

   public BigDecimal getChave() {
        return this.getVo().asBigDecimal("CHAVE");
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getChave2() {
        return this.getVo().asBigDecimal("CHAVE2");
   }

   public void setChave2(BigDecimal chave2) {
        markAsChanged("CHAVE2", chave2);
   }

   public String getEvento() {
        return this.getVo().asString("EVENTO");
   }

   public void setEvento(String evento) {
        markAsChanged("EVENTO", evento);
   }

   public BigDecimal getNuInstancia() {
        return this.getVo().asBigDecimal("NUINSTANCIA");
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
   }

   @Override
   public String getTableName() {
        return "TPQDPL";
   }

   @Override
   public String getEntityName() {
        return "DestinatarioPlanejamento";
   }

   @Override
   public DestinatarioPlanejamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
