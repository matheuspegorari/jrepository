package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoUsuarioBK extends AbstractSankhyaEntity<ConfiguracaoUsuarioBK> {
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

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TSICONFBK";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoUsuarioBK";
   }

   @Override
   public ConfiguracaoUsuarioBK fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
