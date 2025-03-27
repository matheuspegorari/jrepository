package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PaleteNota extends AbstractSankhyaEntity<PaleteNota> {
   public BigDecimal getIdPalete() {
        return this.getVo().asBigDecimal("IDPALETE");
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGWPXN";
   }

   @Override
   public String getEntityName() {
        return "PaleteNota";
   }

   @Override
   public PaleteNota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
