package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EnderecoAreaConf extends AbstractSankhyaEntity<EnderecoAreaConf> {
   private BigDecimal codEndFim;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal codEndIni;
   private BigDecimal codAreaConf;

   public BigDecimal getCodEndFim() {
        return codEndFim;
   }

   public void setCodEndFim(BigDecimal codEndFim) {
        markAsChanged("CODENDFIM", codEndFim);
        this.codEndFim = codEndFim;
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

   public BigDecimal getCodEndIni() {
        return codEndIni;
   }

   public void setCodEndIni(BigDecimal codEndIni) {
        markAsChanged("CODENDINI", codEndIni);
        this.codEndIni = codEndIni;
   }

   public BigDecimal getCodAreaConf() {
        return codAreaConf;
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
        this.codAreaConf = codAreaConf;
   }

   @Override
   public String getTableName() {
        return "TGWEAC";
   }

   @Override
   public String getEntityName() {
        return "EnderecoAreaConf";
   }

   @Override
   public EnderecoAreaConf fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEndFim = vo.asBigDecimal("CODENDFIM");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codEndIni = vo.asBigDecimal("CODENDINI");
        this.codAreaConf = vo.asBigDecimal("CODAREACONF");
        return this;
   }
}
