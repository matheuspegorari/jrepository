package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComissaoNegociacao extends AbstractSankhyaEntity<ComissaoNegociacao> {
   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getNuComissao() {
        return this.getVo().asBigDecimal("NUCOMISSAO");
   }

   public void setNuComissao(BigDecimal nuComissao) {
        markAsChanged("NUCOMISSAO", nuComissao);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getComissao() {
        return this.getVo().asBigDecimal("COMISSAO");
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getVlrBase() {
        return this.getVo().asBigDecimal("VLRBASE");
   }

   public void setVlrBase(BigDecimal vlrBase) {
        markAsChanged("VLRBASE", vlrBase);
   }

   public BigDecimal getVlrTotComissao() {
        return this.getVo().asBigDecimal("VLRTOTCOMISSAO");
   }

   public void setVlrTotComissao(BigDecimal vlrTotComissao) {
        markAsChanged("VLRTOTCOMISSAO", vlrTotComissao);
   }

   public BigDecimal getGridMult() {
        return this.getVo().asBigDecimal("GRIDMULT");
   }

   public void setGridMult(BigDecimal gridMult) {
        markAsChanged("GRIDMULT", gridMult);
   }

   @Override
   public String getTableName() {
        return "TCSCNV";
   }

   @Override
   public String getEntityName() {
        return "ComissaoNegociacao";
   }

   @Override
   public ComissaoNegociacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
