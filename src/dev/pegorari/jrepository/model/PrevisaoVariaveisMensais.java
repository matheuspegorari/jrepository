package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoVariaveisMensais extends AbstractSankhyaEntity<PrevisaoVariaveisMensais> {
   private String chave;
   private Timestamp mes;
   private BigDecimal valor;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public Timestamp getMes() {
        return mes;
   }

   public void setMes(Timestamp mes) {
        markAsChanged("MES", mes);
        this.mes = mes;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   @Override
   public String getTableName() {
        return "TSLIVM";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVariaveisMensais";
   }

   @Override
   public PrevisaoVariaveisMensais fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.chave = vo.asString("CHAVE");
        this.mes = vo.asTimestamp("MES");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
