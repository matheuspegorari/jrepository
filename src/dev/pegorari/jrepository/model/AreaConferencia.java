package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AreaConferencia implements SankhyaEntity<AreaConferencia> {

   private String impSep;
   private BigDecimal codAreaConf;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String nomeAreaConf;

   public String getImpSep() {
        return impSep;
   }

   public void setImpSep(String impSep) {
        this.impSep = impSep;
   }

   public BigDecimal getCodAreaConf() {
        return codAreaConf;
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        this.codAreaConf = codAreaConf;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getNomeAreaConf() {
        return nomeAreaConf;
   }

   public void setNomeAreaConf(String nomeAreaConf) {
        this.nomeAreaConf = nomeAreaConf;
   }

   @Override
   public String getEntityName() {
        return "AreaConferencia";
   }

   @Override
   public AreaConferencia fromVO(DynamicVO vo) {
        this.impSep = vo.asString("IMPSEP");
        this.codAreaConf = vo.asBigDecimal("CODAREACONF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nomeAreaConf = vo.asString("NOMEAREACONF");
        return this;
   }
}
