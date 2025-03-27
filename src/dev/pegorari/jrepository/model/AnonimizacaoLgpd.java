package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnonimizacaoLgpd extends AbstractSankhyaEntity<AnonimizacaoLgpd> {
   public BigDecimal getCodAnon() {
        return this.getVo().asBigDecimal("CODANON");
   }

   public void setCodAnon(BigDecimal codAnon) {
        markAsChanged("CODANON", codAnon);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public BigDecimal getCodUsuCriac() {
        return this.getVo().asBigDecimal("CODUSUCRIAC");
   }

   public void setCodUsuCriac(BigDecimal codUsuCriac) {
        markAsChanged("CODUSUCRIAC", codUsuCriac);
   }

   public String getDescAnon() {
        return this.getVo().asString("DESCANON");
   }

   public void setDescAnon(String descAnon) {
        markAsChanged("DESCANON", descAnon);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtCriac() {
        return this.getVo().asTimestamp("DTCRIAC");
   }

   public void setDtCriac(Timestamp dtCriac) {
        markAsChanged("DTCRIAC", dtCriac);
   }

   @Override
   public String getTableName() {
        return "TSIANON";
   }

   @Override
   public String getEntityName() {
        return "AnonimizacaoLgpd";
   }

   @Override
   public AnonimizacaoLgpd fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
