package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PropriedadeElementoProcesso extends AbstractSankhyaEntity<PropriedadeElementoProcesso> {
   private String nome;
   private BigDecimal nuEle;
   private String valor;

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        this.nuEle = nuEle;
   }

   public String getValor() {
        return valor;
   }

   public void setValor(String valor) {
        this.valor = valor;
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
        this.nome = vo.asString("NOME");
        this.nuEle = vo.asBigDecimal("NUELE");
        this.valor = vo.asString("VALOR");
        return this;
   }
}
