package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMovimentacaoArmazenagem extends AbstractSankhyaEntity<UnidadeMovimentacaoArmazenagem> {
   private BigDecimal codUma;
   private String descrUma;
   private BigDecimal peso;

   public BigDecimal getCodUma() {
        return codUma;
   }

   public void setCodUma(BigDecimal codUma) {
        markAsChanged("CODUMA", codUma);
        this.codUma = codUma;
   }

   public String getDescrUma() {
        return descrUma;
   }

   public void setDescrUma(String descrUma) {
        markAsChanged("DESCRUMA", descrUma);
        this.descrUma = descrUma;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
        this.peso = peso;
   }

   @Override
   public String getTableName() {
        return "TGFUMA";
   }

   @Override
   public String getEntityName() {
        return "UnidadeMovimentacaoArmazenagem";
   }

   @Override
   public UnidadeMovimentacaoArmazenagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUma = vo.asBigDecimal("CODUMA");
        this.descrUma = vo.asString("DESCRUMA");
        this.peso = vo.asBigDecimal("PESO");
        return this;
   }
}
