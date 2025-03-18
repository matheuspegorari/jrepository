package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComissaoNegociacao extends AbstractSankhyaEntity<ComissaoNegociacao> {
   private BigDecimal codVend;
   private BigDecimal nuComissao;
   private BigDecimal codNat;
   private BigDecimal comissao;
   private Timestamp dhAlter;
   private BigDecimal codUsuAlter;
   private BigDecimal numOs;
   private BigDecimal vlrBase;
   private BigDecimal vlrTotComissao;
   private BigDecimal gridMult;

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getNuComissao() {
        return nuComissao;
   }

   public void setNuComissao(BigDecimal nuComissao) {
        markAsChanged("NUCOMISSAO", nuComissao);
        this.nuComissao = nuComissao;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getComissao() {
        return comissao;
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
        this.comissao = comissao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   public BigDecimal getVlrBase() {
        return vlrBase;
   }

   public void setVlrBase(BigDecimal vlrBase) {
        markAsChanged("VLRBASE", vlrBase);
        this.vlrBase = vlrBase;
   }

   public BigDecimal getVlrTotComissao() {
        return vlrTotComissao;
   }

   public void setVlrTotComissao(BigDecimal vlrTotComissao) {
        markAsChanged("VLRTOTCOMISSAO", vlrTotComissao);
        this.vlrTotComissao = vlrTotComissao;
   }

   public BigDecimal getGridMult() {
        return gridMult;
   }

   public void setGridMult(BigDecimal gridMult) {
        markAsChanged("GRIDMULT", gridMult);
        this.gridMult = gridMult;
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
        this.setOriginalVO(vo);
        this.codVend = vo.asBigDecimal("CODVEND");
        this.nuComissao = vo.asBigDecimal("NUCOMISSAO");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.comissao = vo.asBigDecimal("COMISSAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.vlrBase = vo.asBigDecimal("VLRBASE");
        this.vlrTotComissao = vo.asBigDecimal("VLRTOTCOMISSAO");
        this.gridMult = vo.asBigDecimal("GRIDMULT");
        return this;
   }
}
