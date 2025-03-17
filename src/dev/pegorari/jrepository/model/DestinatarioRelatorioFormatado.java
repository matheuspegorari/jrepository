package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DestinatarioRelatorioFormatado extends AbstractSankhyaEntity<DestinatarioRelatorioFormatado> {
   private BigDecimal codCon;
   private BigDecimal nuRfe;
   private BigDecimal sequencia;

   public BigDecimal getCodCon() {
        return codCon;
   }

   public void setCodCon(BigDecimal codCon) {
        this.codCon = codCon;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        this.nuRfe = nuRfe;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TSIDRF";
   }

   @Override
   public String getEntityName() {
        return "DestinatarioRelatorioFormatado";
   }

   @Override
   public DestinatarioRelatorioFormatado fromVO(DynamicVO vo) {
        this.codCon = vo.asBigDecimal("CODCON");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
