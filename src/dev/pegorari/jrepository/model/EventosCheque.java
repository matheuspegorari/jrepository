package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventosCheque extends AbstractSankhyaEntity<EventosCheque> {
   private BigDecimal codUsu;
   private char[] detalhe;
   private Timestamp dhEvento;
   private BigDecimal nuChq;
   private BigDecimal nuEvento;
   private String tipo;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public char[] getDetalhe() {
        return detalhe;
   }

   public void setDetalhe(char[] detalhe) {
        markAsChanged("DETALHE", detalhe);
        this.detalhe = detalhe;
   }

   public Timestamp getDhEvento() {
        return dhEvento;
   }

   public void setDhEvento(Timestamp dhEvento) {
        markAsChanged("DHEVENTO", dhEvento);
        this.dhEvento = dhEvento;
   }

   public BigDecimal getNuChq() {
        return nuChq;
   }

   public void setNuChq(BigDecimal nuChq) {
        markAsChanged("NUCHQ", nuChq);
        this.nuChq = nuChq;
   }

   public BigDecimal getNuEvento() {
        return nuEvento;
   }

   public void setNuEvento(BigDecimal nuEvento) {
        markAsChanged("NUEVENTO", nuEvento);
        this.nuEvento = nuEvento;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.detalhe = vo.asClob("DETALHE");
        this.dhEvento = vo.asTimestamp("DHEVENTO");
        this.nuChq = vo.asBigDecimal("NUCHQ");
        this.nuEvento = vo.asBigDecimal("NUEVENTO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
