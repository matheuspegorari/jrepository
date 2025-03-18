package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FreteNotaFinanceiro extends AbstractSankhyaEntity<FreteNotaFinanceiro> {
   private BigDecimal nuFin;
   private BigDecimal nuNota;
   private BigDecimal vlrFrete;
   private String tipFrete;

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getVlrFrete() {
        return vlrFrete;
   }

   public void setVlrFrete(BigDecimal vlrFrete) {
        markAsChanged("VLRFRETE", vlrFrete);
        this.vlrFrete = vlrFrete;
   }

   public String getTipFrete() {
        return tipFrete;
   }

   public void setTipFrete(String tipFrete) {
        markAsChanged("TIPFRETE", tipFrete);
        this.tipFrete = tipFrete;
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
        this.setOriginalVO(vo);
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.vlrFrete = vo.asBigDecimal("VLRFRETE");
        this.tipFrete = vo.asString("TIPFRETE");
        return this;
   }
}
