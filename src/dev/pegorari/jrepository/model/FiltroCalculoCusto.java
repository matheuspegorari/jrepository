package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FiltroCalculoCusto extends AbstractSankhyaEntity<FiltroCalculoCusto> {
   public BigDecimal getCodChave() {
        return this.getVo().asBigDecimal("CODCHAVE");
   }

   public void setCodChave(BigDecimal codChave) {
        markAsChanged("CODCHAVE", codChave);
   }

   public BigDecimal getCodForm() {
        return this.getVo().asBigDecimal("CODFORM");
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public String getTipForm() {
        return this.getVo().asString("TIPFORM");
   }

   public void setTipForm(String tipForm) {
        markAsChanged("TIPFORM", tipForm);
   }

   public BigDecimal getCodEmpPla() {
        return this.getVo().asBigDecimal("CODEMPPLA");
   }

   public void setCodEmpPla(BigDecimal codEmpPla) {
        markAsChanged("CODEMPPLA", codEmpPla);
   }

   public String getTipLancPla() {
        return this.getVo().asString("TIPLANCPLA");
   }

   public void setTipLancPla(String tipLancPla) {
        markAsChanged("TIPLANCPLA", tipLancPla);
   }

   @Override
   public String getTableName() {
        return "TSIFOP";
   }

   @Override
   public String getEntityName() {
        return "FiltroCalculoCusto";
   }

   @Override
   public FiltroCalculoCusto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
