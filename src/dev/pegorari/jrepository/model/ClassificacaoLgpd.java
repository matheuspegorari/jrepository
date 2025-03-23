package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ClassificacaoLgpd extends AbstractSankhyaEntity<ClassificacaoLgpd> {
   private BigDecimal codCla;
   private BigDecimal codUsuAlter;
   private BigDecimal codUsuCriac;
   private String descCla;
   private Timestamp dtAlter;
   private Timestamp dtCriac;

   public BigDecimal getCodCla() {
        return codCla;
   }

   public void setCodCla(BigDecimal codCla) {
        markAsChanged("CODCLA", codCla);
        this.codCla = codCla;
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

   public String getDescCla() {
        return descCla;
   }

   public void setDescCla(String descCla) {
        markAsChanged("DESCCLA", descCla);
        this.descCla = descCla;
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
        return "TSICLA";
   }

   @Override
   public String getEntityName() {
        return "ClassificacaoLgpd";
   }

   @Override
   public ClassificacaoLgpd fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codCla = vo.asBigDecimal("CODCLA");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuCriac = vo.asBigDecimal("CODUSUCRIAC");
        this.descCla = vo.asString("DESCCLA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCriac = vo.asTimestamp("DTCRIAC");
        return this;
   }
}
