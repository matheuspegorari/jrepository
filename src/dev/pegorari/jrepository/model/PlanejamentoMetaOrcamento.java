package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class PlanejamentoMetaOrcamento extends AbstractSankhyaEntity<PlanejamentoMetaOrcamento> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
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
        return this;
   }
}
