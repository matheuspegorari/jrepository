package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class SituacaoSubOs implements SankhyaEntity<SituacaoSubOs> {

   private BigDecimal codSit;
   private String descricao;

   public BigDecimal getCodSit() {
        return codSit;
   }

   public void setCodSit(BigDecimal codSit) {
        this.codSit = codSit;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   @Override
   public String getEntityName() {
        return "SituacaoSubOs";
   }

   @Override
   public SituacaoSubOs fromVO(DynamicVO vo) {
        this.codSit = vo.asBigDecimal("CODSIT");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
