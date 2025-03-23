package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoClassificacaoProduto extends AbstractSankhyaEntity<LigacaoClassificacaoProduto> {
   private BigDecimal codClassif;
   private BigDecimal codProd;

   public BigDecimal getCodClassif() {
        return codClassif;
   }

   public void setCodClassif(BigDecimal codClassif) {
        markAsChanged("CODCLASSIF", codClassif);
        this.codClassif = codClassif;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   @Override
   public String getTableName() {
        return "TGFCLP";
   }

   @Override
   public String getEntityName() {
        return "LigacaoClassificacaoProduto";
   }

   @Override
   public LigacaoClassificacaoProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codClassif = vo.asBigDecimal("CODCLASSIF");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
