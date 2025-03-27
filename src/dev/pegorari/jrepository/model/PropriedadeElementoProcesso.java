package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PropriedadeElementoProcesso extends AbstractSankhyaEntity<PropriedadeElementoProcesso> {
   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuEle() {
        return this.getVo().asBigDecimal("NUELE");
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
   }

   public String getValor() {
        return this.getVo().asString("VALOR");
   }

   public void setValor(String valor) {
        markAsChanged("VALOR", valor);
   }

   @Override
   public String getTableName() {
        return "TWFPRE";
   }

   @Override
   public String getEntityName() {
        return "PropriedadeElementoProcesso";
   }

   @Override
   public PropriedadeElementoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
