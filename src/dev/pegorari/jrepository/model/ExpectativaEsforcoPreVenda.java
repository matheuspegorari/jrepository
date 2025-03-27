package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExpectativaEsforcoPreVenda extends AbstractSankhyaEntity<ExpectativaEsforcoPreVenda> {
   public BigDecimal getCodEpv() {
        return this.getVo().asBigDecimal("CODEPV");
   }

   public void setCodEpv(BigDecimal codEpv) {
        markAsChanged("CODEPV", codEpv);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getPercPro() {
        return this.getVo().asBigDecimal("PERCPRO");
   }

   public void setPercPro(BigDecimal percPro) {
        markAsChanged("PERCPRO", percPro);
   }

   @Override
   public String getTableName() {
        return "TCSEPV";
   }

   @Override
   public String getEntityName() {
        return "ExpectativaEsforcoPreVenda";
   }

   @Override
   public ExpectativaEsforcoPreVenda fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
