package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoVariaveisDiarias extends AbstractSankhyaEntity<PrevisaoVariaveisDiarias> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public Timestamp getDia() {
        return this.getVo().asTimestamp("DIA");
   }

   public void setDia(Timestamp dia) {
        markAsChanged("DIA", dia);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   @Override
   public String getTableName() {
        return "TSLIVD";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVariaveisDiarias";
   }

   @Override
   public PrevisaoVariaveisDiarias fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
