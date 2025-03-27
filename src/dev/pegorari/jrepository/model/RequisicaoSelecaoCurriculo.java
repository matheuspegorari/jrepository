package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RequisicaoSelecaoCurriculo extends AbstractSankhyaEntity<RequisicaoSelecaoCurriculo> {
   public BigDecimal getNuSelecao() {
        return this.getVo().asBigDecimal("NUSELECAO");
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   @Override
   public String getTableName() {
        return "TRSRQS";
   }

   @Override
   public String getEntityName() {
        return "RequisicaoSelecaoCurriculo";
   }

   @Override
   public RequisicaoSelecaoCurriculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
