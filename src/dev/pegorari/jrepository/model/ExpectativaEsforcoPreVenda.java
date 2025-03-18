package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExpectativaEsforcoPreVenda extends AbstractSankhyaEntity<ExpectativaEsforcoPreVenda> {
   private BigDecimal codEpv;
   private String descricao;
   private BigDecimal percPro;

   public BigDecimal getCodEpv() {
        return codEpv;
   }

   public void setCodEpv(BigDecimal codEpv) {
        markAsChanged("CODEPV", codEpv);
        this.codEpv = codEpv;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getPercPro() {
        return percPro;
   }

   public void setPercPro(BigDecimal percPro) {
        markAsChanged("PERCPRO", percPro);
        this.percPro = percPro;
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
        this.setOriginalVO(vo);
        this.codEpv = vo.asBigDecimal("CODEPV");
        this.descricao = vo.asString("DESCRICAO");
        this.percPro = vo.asBigDecimal("PERCPRO");
        return this;
   }
}
