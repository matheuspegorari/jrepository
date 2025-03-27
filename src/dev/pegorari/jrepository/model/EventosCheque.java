package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventosCheque extends AbstractSankhyaEntity<EventosCheque> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public char[] getDetalhe() {
        return this.getVo().asClob("DETALHE");
   }

   public void setDetalhe(char[] detalhe) {
        markAsChanged("DETALHE", detalhe);
   }

   public Timestamp getDhEvento() {
        return this.getVo().asTimestamp("DHEVENTO");
   }

   public void setDhEvento(Timestamp dhEvento) {
        markAsChanged("DHEVENTO", dhEvento);
   }

   public BigDecimal getNuChq() {
        return this.getVo().asBigDecimal("NUCHQ");
   }

   public void setNuChq(BigDecimal nuChq) {
        markAsChanged("NUCHQ", nuChq);
   }

   public BigDecimal getNuEvento() {
        return this.getVo().asBigDecimal("NUEVENTO");
   }

   public void setNuEvento(BigDecimal nuEvento) {
        markAsChanged("NUEVENTO", nuEvento);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGFECQ";
   }

   @Override
   public String getEntityName() {
        return "EventosCheque";
   }

   @Override
   public EventosCheque fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
