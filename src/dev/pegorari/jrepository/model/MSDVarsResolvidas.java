package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDVarsResolvidas implements SankhyaEntity<MSDVarsResolvidas> {

   private BigDecimal codVar;
   private BigDecimal codVarRes;
   private Timestamp dtAlter;
   private Timestamp dtRef;
   private String valor;
   private BigDecimal valorNumerico;

   public BigDecimal getCodVar() {
        return codVar;
   }

   public void setCodVar(BigDecimal codVar) {
        this.codVar = codVar;
   }

   public BigDecimal getCodVarRes() {
        return codVarRes;
   }

   public void setCodVarRes(BigDecimal codVarRes) {
        this.codVarRes = codVarRes;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public String getValor() {
        return valor;
   }

   public void setValor(String valor) {
        this.valor = valor;
   }

   public BigDecimal getValorNumerico() {
        return valorNumerico;
   }

   public void setValorNumerico(BigDecimal valorNumerico) {
        this.valorNumerico = valorNumerico;
   }

   @Override
   public String getEntityName() {
        return "MSDVarsResolvidas";
   }

   @Override
   public MSDVarsResolvidas fromVO(DynamicVO vo) {
        this.codVar = vo.asBigDecimal("CODVAR");
        this.codVarRes = vo.asBigDecimal("CODVARRES");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtRef = vo.asTimestamp("DTREF");
        this.valor = vo.asString("VALOR");
        this.valorNumerico = vo.asBigDecimal("VALORNUMERICO");
        return this;
   }
}
