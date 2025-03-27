package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMovimentacaoArmazenagem extends AbstractSankhyaEntity<UnidadeMovimentacaoArmazenagem> {
   public BigDecimal getCodUma() {
        return this.getVo().asBigDecimal("CODUMA");
   }

   public void setCodUma(BigDecimal codUma) {
        markAsChanged("CODUMA", codUma);
   }

   public String getDescrUma() {
        return this.getVo().asString("DESCRUMA");
   }

   public void setDescrUma(String descrUma) {
        markAsChanged("DESCRUMA", descrUma);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
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
        return this;
   }
}
