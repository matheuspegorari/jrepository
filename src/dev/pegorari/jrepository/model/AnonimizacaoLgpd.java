package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnonimizacaoLgpd implements SankhyaEntity<AnonimizacaoLgpd> {

   private BigDecimal codAnon;
   private BigDecimal codUsuAlter;
   private BigDecimal codUsuCriac;
   private String descAnon;
   private Timestamp dtAlter;
   private Timestamp dtCriac;

   public BigDecimal getCodAnon() {
        return codAnon;
   }

   public void setCodAnon(BigDecimal codAnon) {
        this.codAnon = codAnon;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getCodUsuCriac() {
        return codUsuCriac;
   }

   public void setCodUsuCriac(BigDecimal codUsuCriac) {
        this.codUsuCriac = codUsuCriac;
   }

   public String getDescAnon() {
        return descAnon;
   }

   public void setDescAnon(String descAnon) {
        this.descAnon = descAnon;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtCriac() {
        return dtCriac;
   }

   public void setDtCriac(Timestamp dtCriac) {
        this.dtCriac = dtCriac;
   }

   @Override
   public String getEntityName() {
        return "AnonimizacaoLgpd";
   }

   @Override
   public AnonimizacaoLgpd fromVO(DynamicVO vo) {
        this.codAnon = vo.asBigDecimal("CODANON");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuCriac = vo.asBigDecimal("CODUSUCRIAC");
        this.descAnon = vo.asString("DESCANON");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCriac = vo.asTimestamp("DTCRIAC");
        return this;
   }
}
