package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PropriedadeVariavelProcesso implements SankhyaEntity<PropriedadeVariavelProcesso> {

   private String nome;
   private BigDecimal nuVar;
   private String valor;

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuVar() {
        return nuVar;
   }

   public void setNuVar(BigDecimal nuVar) {
        this.nuVar = nuVar;
   }

   public String getValor() {
        return valor;
   }

   public void setValor(String valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "PropriedadeVariavelProcesso";
   }

   @Override
   public PropriedadeVariavelProcesso fromVO(DynamicVO vo) {
        this.nome = vo.asString("NOME");
        this.nuVar = vo.asBigDecimal("NUVAR");
        this.valor = vo.asString("VALOR");
        return this;
   }
}
