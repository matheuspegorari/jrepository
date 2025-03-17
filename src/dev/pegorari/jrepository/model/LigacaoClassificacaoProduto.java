package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LigacaoClassificacaoProduto implements SankhyaEntity<LigacaoClassificacaoProduto> {

   private BigDecimal codClassif;
   private BigDecimal codProd;

   public BigDecimal getCodClassif() {
        return codClassif;
   }

   public void setCodClassif(BigDecimal codClassif) {
        this.codClassif = codClassif;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   @Override
   public String getEntityName() {
        return "LigacaoClassificacaoProduto";
   }

   @Override
   public LigacaoClassificacaoProduto fromVO(DynamicVO vo) {
        this.codClassif = vo.asBigDecimal("CODCLASSIF");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
