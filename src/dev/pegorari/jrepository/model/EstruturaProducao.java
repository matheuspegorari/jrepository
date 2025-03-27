package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstruturaProducao extends AbstractSankhyaEntity<EstruturaProducao> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getCodEst() {
        return this.getVo().asBigDecimal("CODEST");
   }

   public void setCodEst(BigDecimal codEst) {
        markAsChanged("CODEST", codEst);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   @Override
   public String getTableName() {
        return "TGFESP";
   }

   @Override
   public String getEntityName() {
        return "EstruturaProducao";
   }

   @Override
   public EstruturaProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
