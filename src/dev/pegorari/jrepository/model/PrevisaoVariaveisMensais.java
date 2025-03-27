package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoVariaveisMensais extends AbstractSankhyaEntity<PrevisaoVariaveisMensais> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public Timestamp getMes() {
        return this.getVo().asTimestamp("MES");
   }

   public void setMes(Timestamp mes) {
        markAsChanged("MES", mes);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
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
        return this;
   }
}
