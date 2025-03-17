package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RejeicaoNfe implements SankhyaEntity<RejeicaoNfe> {

   private BigDecimal codRejeicao;
   private String hashUtlRejeicao;
   private BigDecimal nuNota;
   private BigDecimal qtdRejeicoes;

   public BigDecimal getCodRejeicao() {
        return codRejeicao;
   }

   public void setCodRejeicao(BigDecimal codRejeicao) {
        this.codRejeicao = codRejeicao;
   }

   public String getHashUtlRejeicao() {
        return hashUtlRejeicao;
   }

   public void setHashUtlRejeicao(String hashUtlRejeicao) {
        this.hashUtlRejeicao = hashUtlRejeicao;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getQtdRejeicoes() {
        return qtdRejeicoes;
   }

   public void setQtdRejeicoes(BigDecimal qtdRejeicoes) {
        this.qtdRejeicoes = qtdRejeicoes;
   }

   @Override
   public String getEntityName() {
        return "RejeicaoNfe";
   }

   @Override
   public RejeicaoNfe fromVO(DynamicVO vo) {
        this.codRejeicao = vo.asBigDecimal("CODREJEICAO");
        this.hashUtlRejeicao = vo.asString("HASHUTLREJEICAO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtdRejeicoes = vo.asBigDecimal("QTDREJEICOES");
        return this;
   }
}
