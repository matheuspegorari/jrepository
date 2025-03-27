package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SituacaoSubOs extends AbstractSankhyaEntity<SituacaoSubOs> {
   public BigDecimal getCodSit() {
        return this.getVo().asBigDecimal("CODSIT");
   }

   public void setCodSit(BigDecimal codSit) {
        markAsChanged("CODSIT", codSit);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
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
        return this;
   }
}
