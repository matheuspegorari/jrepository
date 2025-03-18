package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FiltroCalculoCusto extends AbstractSankhyaEntity<FiltroCalculoCusto> {
   private BigDecimal codChave;
   private BigDecimal codForm;
   private String tabela;
   private String tipForm;
   private BigDecimal codEmpPla;
   private String tipLancPla;

   public BigDecimal getCodChave() {
        return codChave;
   }

   public void setCodChave(BigDecimal codChave) {
        markAsChanged("CODCHAVE", codChave);
        this.codChave = codChave;
   }

   public BigDecimal getCodForm() {
        return codForm;
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
        this.codForm = codForm;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public String getTipForm() {
        return tipForm;
   }

   public void setTipForm(String tipForm) {
        markAsChanged("TIPFORM", tipForm);
        this.tipForm = tipForm;
   }

   public BigDecimal getCodEmpPla() {
        return codEmpPla;
   }

   public void setCodEmpPla(BigDecimal codEmpPla) {
        markAsChanged("CODEMPPLA", codEmpPla);
        this.codEmpPla = codEmpPla;
   }

   public String getTipLancPla() {
        return tipLancPla;
   }

   public void setTipLancPla(String tipLancPla) {
        markAsChanged("TIPLANCPLA", tipLancPla);
        this.tipLancPla = tipLancPla;
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
        this.setOriginalVO(vo);
        this.codChave = vo.asBigDecimal("CODCHAVE");
        this.codForm = vo.asBigDecimal("CODFORM");
        this.tabela = vo.asString("TABELA");
        this.tipForm = vo.asString("TIPFORM");
        this.codEmpPla = vo.asBigDecimal("CODEMPPLA");
        this.tipLancPla = vo.asString("TIPLANCPLA");
        return this;
   }
}
