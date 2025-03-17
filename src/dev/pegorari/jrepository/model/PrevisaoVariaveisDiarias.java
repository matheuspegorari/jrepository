package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoVariaveisDiarias implements SankhyaEntity<PrevisaoVariaveisDiarias> {

   private String chave;
   private Timestamp dia;
   private BigDecimal valor;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public Timestamp getDia() {
        return dia;
   }

   public void setDia(Timestamp dia) {
        this.dia = dia;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVariaveisDiarias";
   }

   @Override
   public PrevisaoVariaveisDiarias fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.dia = vo.asTimestamp("DIA");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
