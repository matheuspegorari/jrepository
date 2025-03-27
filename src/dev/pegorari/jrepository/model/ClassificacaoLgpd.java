package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ClassificacaoLgpd extends AbstractSankhyaEntity<ClassificacaoLgpd> {
   public BigDecimal getCodCla() {
        return this.getVo().asBigDecimal("CODCLA");
   }

   public void setCodCla(BigDecimal codCla) {
        markAsChanged("CODCLA", codCla);
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

   public String getDescCla() {
        return this.getVo().asString("DESCCLA");
   }

   public void setDescCla(String descCla) {
        markAsChanged("DESCCLA", descCla);
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
        return "TSICLA";
   }

   @Override
   public String getEntityName() {
        return "ClassificacaoLgpd";
   }

   @Override
   public ClassificacaoLgpd fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
