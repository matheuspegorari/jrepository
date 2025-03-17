package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoUsuario implements SankhyaEntity<ConfiguracaoUsuario> {

   private BigDecimal codUsu;
   private String conf;
   private String form;

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

   @Override
   public String getEntityName() {
        return "ConfiguracaoUsuario";
   }

   @Override
   public ConfiguracaoUsuario fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conf = vo.asString("CONF");
        this.form = vo.asString("FORM");
        return this;
   }
}
