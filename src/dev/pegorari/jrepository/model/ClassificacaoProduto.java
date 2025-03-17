package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ClassificacaoProduto extends AbstractSankhyaEntity<ClassificacaoProduto> {
   private BigDecimal codClassif;
   private String descricao;

   public BigDecimal getCodClassif() {
        return codClassif;
   }

   public void setCodClassif(BigDecimal codClassif) {
        this.codClassif = codClassif;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        this.codClassif = vo.asBigDecimal("CODCLASSIF");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
