package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PropriedadeVariavelProcesso extends AbstractSankhyaEntity<PropriedadeVariavelProcesso> {
   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuVar() {
        return this.getVo().asBigDecimal("NUVAR");
   }

   public void setNuVar(BigDecimal nuVar) {
        markAsChanged("NUVAR", nuVar);
   }

   public String getValor() {
        return this.getVo().asString("VALOR");
   }

   public void setValor(String valor) {
        markAsChanged("VALOR", valor);
   }

   @Override
   public String getTableName() {
        return "TWFPRV";
   }

   @Override
   public String getEntityName() {
        return "PropriedadeVariavelProcesso";
   }

   @Override
   public PropriedadeVariavelProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
