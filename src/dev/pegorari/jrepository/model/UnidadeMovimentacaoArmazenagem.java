package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMovimentacaoArmazenagem implements SankhyaEntity<UnidadeMovimentacaoArmazenagem> {

   private BigDecimal codUma;
   private String descUma;
   private BigDecimal peso;

   public BigDecimal getCodUma() {
        return codUma;
   }

   public void setCodUma(BigDecimal codUma) {
        this.codUma = codUma;
   }

   public String getDescUma() {
        return descUma;
   }

   public void setDescUma(String descUma) {
        this.descUma = descUma;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        this.peso = peso;
   }

   @Override
   public String getEntityName() {
        return "UnidadeMovimentacaoArmazenagem";
   }

   @Override
   public UnidadeMovimentacaoArmazenagem fromVO(DynamicVO vo) {
        this.codUma = vo.asBigDecimal("CODUMA");
        this.descUma = vo.asString("DESCUMA");
        this.peso = vo.asBigDecimal("PESO");
        return this;
   }
}
