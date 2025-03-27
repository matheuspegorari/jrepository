package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FreteNotaFinanceiro extends AbstractSankhyaEntity<FreteNotaFinanceiro> {
   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getVlrFrete() {
        return this.getVo().asBigDecimal("VLRFRETE");
   }

   public void setVlrFrete(BigDecimal vlrFrete) {
        markAsChanged("VLRFRETE", vlrFrete);
   }

   public String getTipFrete() {
        return this.getVo().asString("TIPFRETE");
   }

   public void setTipFrete(String tipFrete) {
        markAsChanged("TIPFRETE", tipFrete);
   }

   @Override
   public String getTableName() {
        return "TGFFNF";
   }

   @Override
   public String getEntityName() {
        return "FreteNotaFinanceiro";
   }

   @Override
   public FreteNotaFinanceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
