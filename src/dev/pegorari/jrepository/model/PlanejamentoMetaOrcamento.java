package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class PlanejamentoMetaOrcamento extends AbstractSankhyaEntity<PlanejamentoMetaOrcamento> {
   private String chave;
   private char[] config;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   @Override
   public String getTableName() {
        return "TGFPMO";
   }

   @Override
   public String getEntityName() {
        return "PlanejamentoMetaOrcamento";
   }

   @Override
   public PlanejamentoMetaOrcamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.chave = vo.asString("CHAVE");
        this.config = vo.asClob("CONFIG");
        return this;
   }
}
