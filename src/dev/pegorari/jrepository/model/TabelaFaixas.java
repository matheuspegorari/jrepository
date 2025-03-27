package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaFaixas extends AbstractSankhyaEntity<TabelaFaixas> {
   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public String getDescrTab() {
        return this.getVo().asString("DESCRTAB");
   }

   public void setDescrTab(String descrTab) {
        markAsChanged("DESCRTAB", descrTab);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getLimFaixa() {
        return this.getVo().asBigDecimal("LIMFAIXA");
   }

   public void setLimFaixa(BigDecimal limFaixa) {
        markAsChanged("LIMFAIXA", limFaixa);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getTipoTab() {
        return this.getVo().asString("TIPOTAB");
   }

   public void setTipoTab(String tipoTab) {
        markAsChanged("TIPOTAB", tipoTab);
   }

   public BigDecimal getValor1() {
        return this.getVo().asBigDecimal("VALOR1");
   }

   public void setValor1(BigDecimal valor1) {
        markAsChanged("VALOR1", valor1);
   }

   public BigDecimal getValor2() {
        return this.getVo().asBigDecimal("VALOR2");
   }

   public void setValor2(BigDecimal valor2) {
        markAsChanged("VALOR2", valor2);
   }

   public BigDecimal getValor3() {
        return this.getVo().asBigDecimal("VALOR3");
   }

   public void setValor3(BigDecimal valor3) {
        markAsChanged("VALOR3", valor3);
   }

   public BigDecimal getValor4() {
        return this.getVo().asBigDecimal("VALOR4");
   }

   public void setValor4(BigDecimal valor4) {
        markAsChanged("VALOR4", valor4);
   }

   public BigDecimal getValor5() {
        return this.getVo().asBigDecimal("VALOR5");
   }

   public void setValor5(BigDecimal valor5) {
        markAsChanged("VALOR5", valor5);
   }

   public BigDecimal getValor6() {
        return this.getVo().asBigDecimal("VALOR6");
   }

   public void setValor6(BigDecimal valor6) {
        markAsChanged("VALOR6", valor6);
   }

   public BigDecimal getValor10() {
        return this.getVo().asBigDecimal("VALOR10");
   }

   public void setValor10(BigDecimal valor10) {
        markAsChanged("VALOR10", valor10);
   }

   public BigDecimal getValor11() {
        return this.getVo().asBigDecimal("VALOR11");
   }

   public void setValor11(BigDecimal valor11) {
        markAsChanged("VALOR11", valor11);
   }

   public BigDecimal getValor7() {
        return this.getVo().asBigDecimal("VALOR7");
   }

   public void setValor7(BigDecimal valor7) {
        markAsChanged("VALOR7", valor7);
   }

   public BigDecimal getValor8() {
        return this.getVo().asBigDecimal("VALOR8");
   }

   public void setValor8(BigDecimal valor8) {
        markAsChanged("VALOR8", valor8);
   }

   public BigDecimal getValor9() {
        return this.getVo().asBigDecimal("VALOR9");
   }

   public void setValor9(BigDecimal valor9) {
        markAsChanged("VALOR9", valor9);
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
        this.setVo(vo);
        return this;
   }
}
