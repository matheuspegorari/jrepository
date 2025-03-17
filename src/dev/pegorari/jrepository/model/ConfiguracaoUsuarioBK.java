package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoUsuarioBK implements SankhyaEntity<ConfiguracaoUsuarioBK> {

   private BigDecimal codUsu;
   private String conf;
   private String form;
   private BigDecimal nuNico;
   private BigDecimal sequencia;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getConf() {
        return conf;
   }

   public void setConf(String conf) {
        this.conf = conf;
   }

   public String getForm() {
        return form;
   }

   public void setForm(String form) {
        this.form = form;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        this.nuNico = nuNico;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoUsuarioBK";
   }

   @Override
   public ConfiguracaoUsuarioBK fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conf = vo.asString("CONF");
        this.form = vo.asString("FORM");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
