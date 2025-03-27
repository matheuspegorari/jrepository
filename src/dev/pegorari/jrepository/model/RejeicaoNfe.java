package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RejeicaoNfe extends AbstractSankhyaEntity<RejeicaoNfe> {
   public BigDecimal getCodRejeicao() {
        return this.getVo().asBigDecimal("CODREJEICAO");
   }

   public void setCodRejeicao(BigDecimal codRejeicao) {
        markAsChanged("CODREJEICAO", codRejeicao);
   }

   public String getHashUtlRejeicao() {
        return this.getVo().asString("HASHUTLREJEICAO");
   }

   public void setHashUtlRejeicao(String hashUtlRejeicao) {
        markAsChanged("HASHUTLREJEICAO", hashUtlRejeicao);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtdRejeicoes() {
        return this.getVo().asBigDecimal("QTDREJEICOES");
   }

   public void setQtdRejeicoes(BigDecimal qtdRejeicoes) {
        markAsChanged("QTDREJEICOES", qtdRejeicoes);
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
        this.setVo(vo);
        return this;
   }
}
