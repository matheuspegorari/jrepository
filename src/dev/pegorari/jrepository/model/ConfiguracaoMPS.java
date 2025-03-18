package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoMPS extends AbstractSankhyaEntity<ConfiguracaoMPS> {
   private String descricao;
   private BigDecimal codCmps;
   private Timestamp dhInc;
   private char[] config;
   private BigDecimal codUsu;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getCodCmps() {
        return codCmps;
   }

   public void setCodCmps(BigDecimal codCmps) {
        markAsChanged("CODCMPS", codCmps);
        this.codCmps = codCmps;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
        this.dhInc = dhInc;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   @Override
   public String getTableName() {
        return "TPRCMPS";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoMPS";
   }

   @Override
   public ConfiguracaoMPS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.descricao = vo.asString("DESCRICAO");
        this.codCmps = vo.asBigDecimal("CODCMPS");
        this.dhInc = vo.asTimestamp("DHINC");
        this.config = vo.asClob("CONFIG");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
