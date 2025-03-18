package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaFaixas extends AbstractSankhyaEntity<TabelaFaixas> {
   private BigDecimal codTab;
   private String descrTab;
   private Timestamp dtAlter;
   private BigDecimal limFaixa;
   private Timestamp referencia;
   private String tipoTab;
   private BigDecimal valor1;
   private BigDecimal valor2;
   private BigDecimal valor3;
   private BigDecimal valor4;
   private BigDecimal valor5;
   private BigDecimal valor6;
   private BigDecimal valor10;
   private BigDecimal valor11;
   private BigDecimal valor7;
   private BigDecimal valor8;
   private BigDecimal valor9;

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public String getDescrTab() {
        return descrTab;
   }

   public void setDescrTab(String descrTab) {
        markAsChanged("DESCRTAB", descrTab);
        this.descrTab = descrTab;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getLimFaixa() {
        return limFaixa;
   }

   public void setLimFaixa(BigDecimal limFaixa) {
        markAsChanged("LIMFAIXA", limFaixa);
        this.limFaixa = limFaixa;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getTipoTab() {
        return tipoTab;
   }

   public void setTipoTab(String tipoTab) {
        markAsChanged("TIPOTAB", tipoTab);
        this.tipoTab = tipoTab;
   }

   public BigDecimal getValor1() {
        return valor1;
   }

   public void setValor1(BigDecimal valor1) {
        markAsChanged("VALOR1", valor1);
        this.valor1 = valor1;
   }

   public BigDecimal getValor2() {
        return valor2;
   }

   public void setValor2(BigDecimal valor2) {
        markAsChanged("VALOR2", valor2);
        this.valor2 = valor2;
   }

   public BigDecimal getValor3() {
        return valor3;
   }

   public void setValor3(BigDecimal valor3) {
        markAsChanged("VALOR3", valor3);
        this.valor3 = valor3;
   }

   public BigDecimal getValor4() {
        return valor4;
   }

   public void setValor4(BigDecimal valor4) {
        markAsChanged("VALOR4", valor4);
        this.valor4 = valor4;
   }

   public BigDecimal getValor5() {
        return valor5;
   }

   public void setValor5(BigDecimal valor5) {
        markAsChanged("VALOR5", valor5);
        this.valor5 = valor5;
   }

   public BigDecimal getValor6() {
        return valor6;
   }

   public void setValor6(BigDecimal valor6) {
        markAsChanged("VALOR6", valor6);
        this.valor6 = valor6;
   }

   public BigDecimal getValor10() {
        return valor10;
   }

   public void setValor10(BigDecimal valor10) {
        markAsChanged("VALOR10", valor10);
        this.valor10 = valor10;
   }

   public BigDecimal getValor11() {
        return valor11;
   }

   public void setValor11(BigDecimal valor11) {
        markAsChanged("VALOR11", valor11);
        this.valor11 = valor11;
   }

   public BigDecimal getValor7() {
        return valor7;
   }

   public void setValor7(BigDecimal valor7) {
        markAsChanged("VALOR7", valor7);
        this.valor7 = valor7;
   }

   public BigDecimal getValor8() {
        return valor8;
   }

   public void setValor8(BigDecimal valor8) {
        markAsChanged("VALOR8", valor8);
        this.valor8 = valor8;
   }

   public BigDecimal getValor9() {
        return valor9;
   }

   public void setValor9(BigDecimal valor9) {
        markAsChanged("VALOR9", valor9);
        this.valor9 = valor9;
   }

   @Override
   public String getTableName() {
        return "TFPFAI";
   }

   @Override
   public String getEntityName() {
        return "TabelaFaixas";
   }

   @Override
   public TabelaFaixas fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codTab = vo.asBigDecimal("CODTAB");
        this.descrTab = vo.asString("DESCRTAB");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.limFaixa = vo.asBigDecimal("LIMFAIXA");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.tipoTab = vo.asString("TIPOTAB");
        this.valor1 = vo.asBigDecimal("VALOR1");
        this.valor2 = vo.asBigDecimal("VALOR2");
        this.valor3 = vo.asBigDecimal("VALOR3");
        this.valor4 = vo.asBigDecimal("VALOR4");
        this.valor5 = vo.asBigDecimal("VALOR5");
        this.valor6 = vo.asBigDecimal("VALOR6");
        this.valor10 = vo.asBigDecimal("VALOR10");
        this.valor11 = vo.asBigDecimal("VALOR11");
        this.valor7 = vo.asBigDecimal("VALOR7");
        this.valor8 = vo.asBigDecimal("VALOR8");
        this.valor9 = vo.asBigDecimal("VALOR9");
        return this;
   }
}
