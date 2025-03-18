package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AreaConferencia extends AbstractSankhyaEntity<AreaConferencia> {
   private String impSep;
   private BigDecimal codAreaConf;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String nomeAreaConf;

   public String getImpSep() {
        return impSep;
   }

   public void setImpSep(String impSep) {
        markAsChanged("IMPSEP", impSep);
        this.impSep = impSep;
   }

   public BigDecimal getCodAreaConf() {
        return codAreaConf;
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
        this.codAreaConf = codAreaConf;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getNomeAreaConf() {
        return nomeAreaConf;
   }

   public void setNomeAreaConf(String nomeAreaConf) {
        markAsChanged("NOMEAREACONF", nomeAreaConf);
        this.nomeAreaConf = nomeAreaConf;
   }

   @Override
   public String getTableName() {
        return "TGWARC";
   }

   @Override
   public String getEntityName() {
        return "AreaConferencia";
   }

   @Override
   public AreaConferencia fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.impSep = vo.asString("IMPSEP");
        this.codAreaConf = vo.asBigDecimal("CODAREACONF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nomeAreaConf = vo.asString("NOMEAREACONF");
        return this;
   }
}
