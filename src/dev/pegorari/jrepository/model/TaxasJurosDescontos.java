package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TaxasJurosDescontos extends AbstractSankhyaEntity<TaxasJurosDescontos> {
   private BigDecimal codGrupoProd;
   private BigDecimal codTipVenda;
   private BigDecimal taxa;

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getTaxa() {
        return taxa;
   }

   public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
   }

   @Override
   public String getTableName() {
        return "TGFTAXG";
   }

   @Override
   public String getEntityName() {
        return "TaxasJurosDescontos";
   }

   @Override
   public TaxasJurosDescontos fromVO(DynamicVO vo) {
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.taxa = vo.asBigDecimal("TAXA");
        return this;
   }
}
