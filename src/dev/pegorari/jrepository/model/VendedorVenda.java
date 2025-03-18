package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VendedorVenda extends AbstractSankhyaEntity<VendedorVenda> {
   private BigDecimal codTab;
   private BigDecimal codTipVenda;
   private BigDecimal codVend;

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   @Override
   public String getTableName() {
        return "TGFNPV";
   }

   @Override
   public String getEntityName() {
        return "VendedorVenda";
   }

   @Override
   public VendedorVenda fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codVend = vo.asBigDecimal("CODVEND");
        return this;
   }
}
