package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ClassificacaoProduto extends AbstractSankhyaEntity<ClassificacaoProduto> {
   public BigDecimal getCodClassif() {
        return this.getVo().asBigDecimal("CODCLASSIF");
   }

   public void setCodClassif(BigDecimal codClassif) {
        markAsChanged("CODCLASSIF", codClassif);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   @Override
   public String getTableName() {
        return "TGFCLA";
   }

   @Override
   public String getEntityName() {
        return "ClassificacaoProduto";
   }

   @Override
   public ClassificacaoProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
