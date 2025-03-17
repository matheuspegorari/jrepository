package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

public class PlanejamentoMetaOrcamento implements SankhyaEntity<PlanejamentoMetaOrcamento> {

   private String chave;
   private char[] config;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        this.config = config;
   }

   @Override
   public String getEntityName() {
        return "PlanejamentoMetaOrcamento";
   }

   @Override
   public PlanejamentoMetaOrcamento fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.config = vo.asClob("CONFIG");
        return this;
   }
}
