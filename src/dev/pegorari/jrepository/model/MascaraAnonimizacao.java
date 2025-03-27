package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MascaraAnonimizacao extends AbstractSankhyaEntity<MascaraAnonimizacao> {
   public BigDecimal getCodMasAno() {
        return this.getVo().asBigDecimal("CODMASANO");
   }

   public void setCodMasAno(BigDecimal codMasAno) {
        markAsChanged("CODMASANO", codMasAno);
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

   public String getDescMasc() {
        return this.getVo().asString("DESCMASC");
   }

   public void setDescMasc(String descMasc) {
        markAsChanged("DESCMASC", descMasc);
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

   public String getTipoCampo() {
        return this.getVo().asString("TIPOCAMPO");
   }

   public void setTipoCampo(String tipoCampo) {
        markAsChanged("TIPOCAMPO", tipoCampo);
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
        return this;
   }
}
