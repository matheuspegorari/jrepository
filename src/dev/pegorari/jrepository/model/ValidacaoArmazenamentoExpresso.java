package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ValidacaoArmazenamentoExpresso implements SankhyaEntity<ValidacaoArmazenamentoExpresso> {

   private String codConcatenado;
   private BigDecimal nuTarefa;
   private BigDecimal sequencia;

   public String getCodConcatenado() {
        return codConcatenado;
   }

   public void setCodConcatenado(String codConcatenado) {
        this.codConcatenado = codConcatenado;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "ValidacaoArmazenamentoExpresso";
   }

   @Override
   public ValidacaoArmazenamentoExpresso fromVO(DynamicVO vo) {
        this.codConcatenado = vo.asString("CODCONCATENADO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
