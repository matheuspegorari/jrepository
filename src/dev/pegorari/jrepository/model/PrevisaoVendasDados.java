package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasDados extends AbstractSankhyaEntity<PrevisaoVendasDados> {
   private BigDecimal codExec;
   private BigDecimal margem;
   private BigDecimal vendas;

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
        this.codExec = codExec;
   }

   public BigDecimal getMargem() {
        return margem;
   }

   public void setMargem(BigDecimal margem) {
        markAsChanged("MARGEM", margem);
        this.margem = margem;
   }

   public BigDecimal getVendas() {
        return vendas;
   }

   public void setVendas(BigDecimal vendas) {
        markAsChanged("VENDAS", vendas);
        this.vendas = vendas;
   }

   @Override
   public String getTableName() {
        return "TSLIPV";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasDados";
   }

   @Override
   public PrevisaoVendasDados fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.margem = vo.asBigDecimal("MARGEM");
        this.vendas = vo.asBigDecimal("VENDAS");
        return this;
   }
}
