package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelacaoItemCTe extends AbstractSankhyaEntity<RelacaoItemCTe> {
   public BigDecimal getSeqNota() {
        return this.getVo().asBigDecimal("SEQNOTA");
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getValUnit() {
        return this.getVo().asBigDecimal("VALUNIT");
   }

   public void setValUnit(BigDecimal valUnit) {
        markAsChanged("VALUNIT", valUnit);
   }

   public BigDecimal getValTotal() {
        return this.getVo().asBigDecimal("VALTOTAL");
   }

   public void setValTotal(BigDecimal valTotal) {
        markAsChanged("VALTOTAL", valTotal);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getDescProd() {
        return this.getVo().asString("DESCPROD");
   }

   public void setDescProd(String descProd) {
        markAsChanged("DESCPROD", descProd);
   }

   public String getUnidade() {
        return this.getVo().asString("UNIDADE");
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
   }

   public BigDecimal getQuantidade() {
        return this.getVo().asBigDecimal("QUANTIDADE");
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
   }

   @Override
   public String getTableName() {
        return "TGFINCT";
   }

   @Override
   public String getEntityName() {
        return "RelacaoItemCTe";
   }

   @Override
   public RelacaoItemCTe fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
