package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoUsuario extends AbstractSankhyaEntity<ConfiguracaoUsuario> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConf() {
        return this.getVo().asString("CONF");
   }

   public void setConf(String conf) {
        markAsChanged("CONF", conf);
   }

   public String getForm() {
        return this.getVo().asString("FORM");
   }

   public void setForm(String form) {
        markAsChanged("FORM", form);
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
        return this;
   }
}
