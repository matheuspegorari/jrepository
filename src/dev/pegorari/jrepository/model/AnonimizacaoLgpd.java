package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnonimizacaoLgpd extends AbstractSankhyaEntity<AnonimizacaoLgpd> {
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
        markAsChanged("CODANON", codAnon);
        this.codAnon = codAnon;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getCodUsuCriac() {
        return codUsuCriac;
   }

   public void setCodUsuCriac(BigDecimal codUsuCriac) {
        markAsChanged("CODUSUCRIAC", codUsuCriac);
        this.codUsuCriac = codUsuCriac;
   }

   public String getDescAnon() {
        return descAnon;
   }

   public void setDescAnon(String descAnon) {
        markAsChanged("DESCANON", descAnon);
        this.descAnon = descAnon;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtCriac() {
        return dtCriac;
   }

   public void setDtCriac(Timestamp dtCriac) {
        markAsChanged("DTCRIAC", dtCriac);
        this.dtCriac = dtCriac;
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
        this.setOriginalVO(vo);
        this.codAnon = vo.asBigDecimal("CODANON");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuCriac = vo.asBigDecimal("CODUSUCRIAC");
        this.descAnon = vo.asString("DESCANON");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCriac = vo.asTimestamp("DTCRIAC");
        return this;
   }
}
