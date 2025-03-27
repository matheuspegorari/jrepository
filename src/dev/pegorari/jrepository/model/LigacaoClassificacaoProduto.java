package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoClassificacaoProduto extends AbstractSankhyaEntity<LigacaoClassificacaoProduto> {
   public BigDecimal getCodClassif() {
        return this.getVo().asBigDecimal("CODCLASSIF");
   }

   public void setCodClassif(BigDecimal codClassif) {
        markAsChanged("CODCLASSIF", codClassif);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
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
        return this;
   }
}
