package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

public class I18n implements SankhyaEntity<I18n> {

   private String locale;
   private String texto;
   private String chave;

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        this.locale = locale;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        this.texto = texto;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   @Override
   public String getEntityName() {
        return "I18n";
   }

   @Override
   public I18n fromVO(DynamicVO vo) {
        this.locale = vo.asString("LOCALE");
        this.texto = vo.asString("TEXTO");
        this.chave = vo.asString("CHAVE");
        return this;
   }
}
