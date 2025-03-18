package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RejeicaoNfe extends AbstractSankhyaEntity<RejeicaoNfe> {
   private BigDecimal codRejeicao;
   private String hashUtlRejeicao;
   private BigDecimal nuNota;
   private BigDecimal qtdRejeicoes;

   public BigDecimal getCodRejeicao() {
        return codRejeicao;
   }

   public void setCodRejeicao(BigDecimal codRejeicao) {
        markAsChanged("CODREJEICAO", codRejeicao);
        this.codRejeicao = codRejeicao;
   }

   public String getHashUtlRejeicao() {
        return hashUtlRejeicao;
   }

   public void setHashUtlRejeicao(String hashUtlRejeicao) {
        markAsChanged("HASHUTLREJEICAO", hashUtlRejeicao);
        this.hashUtlRejeicao = hashUtlRejeicao;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getQtdRejeicoes() {
        return qtdRejeicoes;
   }

   public void setQtdRejeicoes(BigDecimal qtdRejeicoes) {
        markAsChanged("QTDREJEICOES", qtdRejeicoes);
        this.qtdRejeicoes = qtdRejeicoes;
   }

   @Override
   public String getTableName() {
        return "TGFREJNFE";
   }

   @Override
   public String getEntityName() {
        return "RejeicaoNfe";
   }

   @Override
   public RejeicaoNfe fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codRejeicao = vo.asBigDecimal("CODREJEICAO");
        this.hashUtlRejeicao = vo.asString("HASHUTLREJEICAO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtdRejeicoes = vo.asBigDecimal("QTDREJEICOES");
        return this;
   }
}
