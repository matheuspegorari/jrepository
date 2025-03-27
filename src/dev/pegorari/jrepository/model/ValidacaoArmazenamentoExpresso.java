package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ValidacaoArmazenamentoExpresso extends AbstractSankhyaEntity<ValidacaoArmazenamentoExpresso> {
   public String getCodConcatenado() {
        return this.getVo().asString("CODCONCATENADO");
   }

   public void setCodConcatenado(String codConcatenado) {
        markAsChanged("CODCONCATENADO", codConcatenado);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGWVAE";
   }

   @Override
   public String getEntityName() {
        return "ValidacaoArmazenamentoExpresso";
   }

   @Override
   public ValidacaoArmazenamentoExpresso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
