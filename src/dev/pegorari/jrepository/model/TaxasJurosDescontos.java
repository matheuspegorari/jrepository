package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TaxasJurosDescontos extends AbstractSankhyaEntity<TaxasJurosDescontos> {
   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getTaxa() {
        return this.getVo().asBigDecimal("TAXA");
   }

   public void setTaxa(BigDecimal taxa) {
        markAsChanged("TAXA", taxa);
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
        this.setVo(vo);
        return this;
   }
}
