package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoRecursoBK implements SankhyaEntity<ConfiguracaoRecursoBK> {

   private String chave;
   private String chavePai;
   private BigDecimal codUsu;
   private char[] config;
   private BigDecimal nuUnico;
   private BigDecimal sequencia;
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

   public BigDecimal getNuUnico() {
        return nuUnico;
   }

   public void setNuUnico(BigDecimal nuUnico) {
        this.nuUnico = nuUnico;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoRecursoBK";
   }

   @Override
   public ConfiguracaoRecursoBK fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.chavePai = vo.asString("CHAVEPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.config = vo.asClob("CONFIG");
        this.nuUnico = vo.asBigDecimal("NUUNICO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
