package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MascaraAnonimizacao extends AbstractSankhyaEntity<MascaraAnonimizacao> {
   private BigDecimal codMasAno;
   private BigDecimal codUsuAlter;
   private BigDecimal codUsuCriac;
   private String descMasc;
   private Timestamp dtAlter;
   private Timestamp dtCriac;
   private String tipoCampo;

   public BigDecimal getCodMasAno() {
        return codMasAno;
   }

   public void setCodMasAno(BigDecimal codMasAno) {
        markAsChanged("CODMASANO", codMasAno);
        this.codMasAno = codMasAno;
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

   public String getDescMasc() {
        return descMasc;
   }

   public void setDescMasc(String descMasc) {
        markAsChanged("DESCMASC", descMasc);
        this.descMasc = descMasc;
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

   public String getTipoCampo() {
        return tipoCampo;
   }

   public void setTipoCampo(String tipoCampo) {
        markAsChanged("TIPOCAMPO", tipoCampo);
        this.tipoCampo = tipoCampo;
   }

   @Override
   public String getTableName() {
        return "TSIMASANO";
   }

   @Override
   public String getEntityName() {
        return "MascaraAnonimizacao";
   }

   @Override
   public MascaraAnonimizacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codMasAno = vo.asBigDecimal("CODMASANO");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuCriac = vo.asBigDecimal("CODUSUCRIAC");
        this.descMasc = vo.asString("DESCMASC");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCriac = vo.asTimestamp("DTCRIAC");
        this.tipoCampo = vo.asString("TIPOCAMPO");
        return this;
   }
}
