package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogRemessa extends AbstractSankhyaEntity<LogRemessa> {
   public String getArquivo() {
        return this.getVo().asString("ARQUIVO");
   }

   public void setArquivo(String arquivo) {
        markAsChanged("ARQUIVO", arquivo);
   }

   public BigDecimal getCodCtabCoint() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
   }

   public BigDecimal getCodLayout() {
        return this.getVo().asBigDecimal("CODLAYOUT");
   }

   public void setCodLayout(BigDecimal codLayout) {
        markAsChanged("CODLAYOUT", codLayout);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuRem() {
        return this.getVo().asBigDecimal("NUREM");
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
   }

   public BigDecimal getNuRemessa() {
        return this.getVo().asBigDecimal("NUREMESSA");
   }

   public void setNuRemessa(BigDecimal nuRemessa) {
        markAsChanged("NUREMESSA", nuRemessa);
   }

   @Override
   public String getTableName() {
        return "TGFRC";
   }

   @Override
   public String getEntityName() {
        return "LogRemessa";
   }

   @Override
   public LogRemessa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
