package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class OpcaoCampo implements SankhyaEntity<OpcaoCampo> {

   private BigDecimal nuCampo;
   private String opcao;
   private BigDecimal ordem;
   private String padrao;
   private String valor;

   public BigDecimal getNuCampo() {
        return nuCampo;
   }

   public void setNuCampo(BigDecimal nuCampo) {
        this.nuCampo = nuCampo;
   }

   public String getOpcao() {
        return opcao;
   }

   public void setOpcao(String opcao) {
        this.opcao = opcao;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   public String getValor() {
        return valor;
   }

   public void setValor(String valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "OpcaoCampo";
   }

   @Override
   public OpcaoCampo fromVO(DynamicVO vo) {
        this.nuCampo = vo.asBigDecimal("NUCAMPO");
        this.opcao = vo.asString("OPCAO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.padrao = vo.asString("PADRAO");
        this.valor = vo.asString("VALOR");
        return this;
   }
}
