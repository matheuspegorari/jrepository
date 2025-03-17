package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ExpectativaEsforcoPreVenda implements SankhyaEntity<ExpectativaEsforcoPreVenda> {

   private BigDecimal codEpv;
   private String descricao;
   private BigDecimal percPro;

   public BigDecimal getCodEpv() {
        return codEpv;
   }

   public void setCodEpv(BigDecimal codEpv) {
        this.codEpv = codEpv;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getPercPro() {
        return percPro;
   }

   public void setPercPro(BigDecimal percPro) {
        this.percPro = percPro;
   }

   @Override
   public String getEntityName() {
        return "ExpectativaEsforcoPreVenda";
   }

   @Override
   public ExpectativaEsforcoPreVenda fromVO(DynamicVO vo) {
        this.codEpv = vo.asBigDecimal("CODEPV");
        this.descricao = vo.asString("DESCRICAO");
        this.percPro = vo.asBigDecimal("PERCPRO");
        return this;
   }
}
