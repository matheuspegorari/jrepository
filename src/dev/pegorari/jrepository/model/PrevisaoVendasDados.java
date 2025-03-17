package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasDados implements SankhyaEntity<PrevisaoVendasDados> {

   private BigDecimal codExec;
   private BigDecimal margem;
   private BigDecimal vendas;

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        this.codExec = codExec;
   }

   public BigDecimal getMargem() {
        return margem;
   }

   public void setMargem(BigDecimal margem) {
        this.margem = margem;
   }

   public BigDecimal getVendas() {
        return vendas;
   }

   public void setVendas(BigDecimal vendas) {
        this.vendas = vendas;
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasDados";
   }

   @Override
   public PrevisaoVendasDados fromVO(DynamicVO vo) {
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.margem = vo.asBigDecimal("MARGEM");
        this.vendas = vo.asBigDecimal("VENDAS");
        return this;
   }
}
