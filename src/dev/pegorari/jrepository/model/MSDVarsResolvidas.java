package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDVarsResolvidas extends AbstractSankhyaEntity<MSDVarsResolvidas> {
   public BigDecimal getCodVar() {
        return this.getVo().asBigDecimal("CODVAR");
   }

   public void setCodVar(BigDecimal codVar) {
        markAsChanged("CODVAR", codVar);
   }

   public BigDecimal getCodVarRes() {
        return this.getVo().asBigDecimal("CODVARRES");
   }

   public void setCodVarRes(BigDecimal codVarRes) {
        markAsChanged("CODVARRES", codVarRes);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getValor() {
        return this.getVo().asString("VALOR");
   }

   public void setValor(String valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getValorNumerico() {
        return this.getVo().asBigDecimal("VALORNUMERICO");
   }

   public void setValorNumerico(BigDecimal valorNumerico) {
        markAsChanged("VALORNUMERICO", valorNumerico);
   }

   @Override
   public String getTableName() {
        return "TMDVRE";
   }

   @Override
   public String getEntityName() {
        return "MSDVarsResolvidas";
   }

   @Override
   public MSDVarsResolvidas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
