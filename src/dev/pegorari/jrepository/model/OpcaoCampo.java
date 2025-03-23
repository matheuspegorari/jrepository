package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OpcaoCampo extends AbstractSankhyaEntity<OpcaoCampo> {
   private BigDecimal nuCampo;
   private String opcao;
   private BigDecimal ordem;
   private String padrao;
   private String valor;

   public BigDecimal getNuCampo() {
        return nuCampo;
   }

   public void setNuCampo(BigDecimal nuCampo) {
        markAsChanged("NUCAMPO", nuCampo);
        this.nuCampo = nuCampo;
   }

   public String getOpcao() {
        return opcao;
   }

   public void setOpcao(String opcao) {
        markAsChanged("OPCAO", opcao);
        this.opcao = opcao;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
        this.padrao = padrao;
   }

   public String getValor() {
        return valor;
   }

   public void setValor(String valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   @Override
   public String getTableName() {
        return "TDDOPC";
   }

   @Override
   public String getEntityName() {
        return "OpcaoCampo";
   }

   @Override
   public OpcaoCampo fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuCampo = vo.asBigDecimal("NUCAMPO");
        this.opcao = vo.asString("OPCAO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.padrao = vo.asString("PADRAO");
        this.valor = vo.asString("VALOR");
        return this;
   }
}
