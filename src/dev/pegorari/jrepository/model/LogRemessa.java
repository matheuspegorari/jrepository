package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogRemessa extends AbstractSankhyaEntity<LogRemessa> {
   private String arquivo;
   private BigDecimal codCtabCoint;
   private BigDecimal codLayout;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuRem;
   private BigDecimal nuRemessa;

   public String getArquivo() {
        return arquivo;
   }

   public void setArquivo(String arquivo) {
        markAsChanged("ARQUIVO", arquivo);
        this.arquivo = arquivo;
   }

   public BigDecimal getCodCtabCoint() {
        return codCtabCoint;
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
        this.codCtabCoint = codCtabCoint;
   }

   public BigDecimal getCodLayout() {
        return codLayout;
   }

   public void setCodLayout(BigDecimal codLayout) {
        markAsChanged("CODLAYOUT", codLayout);
        this.codLayout = codLayout;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuRem() {
        return nuRem;
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
        this.nuRem = nuRem;
   }

   public BigDecimal getNuRemessa() {
        return nuRemessa;
   }

   public void setNuRemessa(BigDecimal nuRemessa) {
        markAsChanged("NUREMESSA", nuRemessa);
        this.nuRemessa = nuRemessa;
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
        this.setOriginalVO(vo);
        this.arquivo = vo.asString("ARQUIVO");
        this.codCtabCoint = vo.asBigDecimal("CODCTABCOINT");
        this.codLayout = vo.asBigDecimal("CODLAYOUT");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuRem = vo.asBigDecimal("NUREM");
        this.nuRemessa = vo.asBigDecimal("NUREMESSA");
        return this;
   }
}
