package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RequisicaoSelecaoCurriculo implements SankhyaEntity<RequisicaoSelecaoCurriculo> {

   private BigDecimal nuSelecao;
   private BigDecimal nuRequisicao;

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        this.nuSelecao = nuSelecao;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        this.nuRequisicao = nuRequisicao;
   }

   @Override
   public String getEntityName() {
        return "RequisicaoSelecaoCurriculo";
   }

   @Override
   public RequisicaoSelecaoCurriculo fromVO(DynamicVO vo) {
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        return this;
   }
}
