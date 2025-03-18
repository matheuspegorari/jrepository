package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ValidacaoArmazenamentoExpresso extends AbstractSankhyaEntity<ValidacaoArmazenamentoExpresso> {
   private String codConcatenado;
   private BigDecimal nuTarefa;
   private BigDecimal sequencia;

   public String getCodConcatenado() {
        return codConcatenado;
   }

   public void setCodConcatenado(String codConcatenado) {
        markAsChanged("CODCONCATENADO", codConcatenado);
        this.codConcatenado = codConcatenado;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.setOriginalVO(vo);
        this.codConcatenado = vo.asString("CODCONCATENADO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
