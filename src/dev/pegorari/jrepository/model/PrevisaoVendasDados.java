package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasDados extends AbstractSankhyaEntity<PrevisaoVendasDados> {
   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public BigDecimal getMargem() {
        return this.getVo().asBigDecimal("MARGEM");
   }

   public void setMargem(BigDecimal margem) {
        markAsChanged("MARGEM", margem);
   }

   public BigDecimal getVendas() {
        return this.getVo().asBigDecimal("VENDAS");
   }

   public void setVendas(BigDecimal vendas) {
        markAsChanged("VENDAS", vendas);
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
        this.setVo(vo);
        return this;
   }
}
