package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class I18n extends AbstractSankhyaEntity<I18n> {
   public String getLocale() {
        return this.getVo().asString("LOCALE");
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   @Override
   public String getTableName() {
        return "TDDI18N";
   }

   @Override
   public String getEntityName() {
        return "I18n";
   }

   @Override
   public I18n fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
