package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoUsuario extends AbstractSankhyaEntity<ConfiguracaoUsuario> {
   private BigDecimal codUsu;
   private String conf;
   private String form;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getConf() {
        return conf;
   }

   public void setConf(String conf) {
        markAsChanged("CONF", conf);
        this.conf = conf;
   }

   public String getForm() {
        return form;
   }

   public void setForm(String form) {
        markAsChanged("FORM", form);
        this.form = form;
   }

   @Override
   public String getTableName() {
        return "TSICONF";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoUsuario";
   }

   @Override
   public ConfiguracaoUsuario fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conf = vo.asString("CONF");
        this.form = vo.asString("FORM");
        return this;
   }
}
