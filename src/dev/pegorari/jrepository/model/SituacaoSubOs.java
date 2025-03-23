package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SituacaoSubOs extends AbstractSankhyaEntity<SituacaoSubOs> {
   private BigDecimal codSit;
   private String descricao;

   public BigDecimal getCodSit() {
        return codSit;
   }

   public void setCodSit(BigDecimal codSit) {
        markAsChanged("CODSIT", codSit);
        this.codSit = codSit;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   @Override
   public String getTableName() {
        return "TCSITS";
   }

   @Override
   public String getEntityName() {
        return "SituacaoSubOs";
   }

   @Override
   public SituacaoSubOs fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codSit = vo.asBigDecimal("CODSIT");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
