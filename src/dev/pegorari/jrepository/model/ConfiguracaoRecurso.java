package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoRecurso extends AbstractSankhyaEntity<ConfiguracaoRecurso> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public String getChavePai() {
        return this.getVo().asString("CHAVEPAI");
   }

   public void setChavePai(String chavePai) {
        markAsChanged("CHAVEPAI", chavePai);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSICFG";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoRecurso";
   }

   @Override
   public ConfiguracaoRecurso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
