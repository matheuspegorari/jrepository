package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoRecurso implements SankhyaEntity<ConfiguracaoRecurso> {

   private String chave;
   private String chavePai;
   private BigDecimal codUsu;
   private char[] config;
   private String tipo;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public String getChavePai() {
        return chavePai;
   }

   public void setChavePai(String chavePai) {
        this.chavePai = chavePai;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        this.config = config;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoRecurso";
   }

   @Override
   public ConfiguracaoRecurso fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.chavePai = vo.asString("CHAVEPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.config = vo.asClob("CONFIG");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
