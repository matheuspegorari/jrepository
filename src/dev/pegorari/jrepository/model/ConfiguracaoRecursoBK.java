package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoRecursoBK extends AbstractSankhyaEntity<ConfiguracaoRecursoBK> {
   private String chave;
   private String chavePai;
   private BigDecimal codUsu;
   private char[] config;
   private BigDecimal nuNico;
   private BigDecimal sequencia;
   private String tipo;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public String getChavePai() {
        return chavePai;
   }

   public void setChavePai(String chavePai) {
        markAsChanged("CHAVEPAI", chavePai);
        this.chavePai = chavePai;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
        this.nuNico = nuNico;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TSICFGBK";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoRecursoBK";
   }

   @Override
   public ConfiguracaoRecursoBK fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.chave = vo.asString("CHAVE");
        this.chavePai = vo.asString("CHAVEPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.config = vo.asClob("CONFIG");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
