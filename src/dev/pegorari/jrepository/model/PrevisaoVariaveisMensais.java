package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoVariaveisMensais implements SankhyaEntity<PrevisaoVariaveisMensais> {

   private String chave;
   private Timestamp mes;
   private BigDecimal valor;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public Timestamp getMes() {
        return mes;
   }

   public void setMes(Timestamp mes) {
        this.mes = mes;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVariaveisMensais";
   }

   @Override
   public PrevisaoVariaveisMensais fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.mes = vo.asTimestamp("MES");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
