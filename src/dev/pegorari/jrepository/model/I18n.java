package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class I18n extends AbstractSankhyaEntity<I18n> {
   private String locale;
   private String texto;
   private String chave;

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
        this.locale = locale;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
        this.texto = texto;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
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
        this.setOriginalVO(vo);
        this.locale = vo.asString("LOCALE");
        this.texto = vo.asString("TEXTO");
        this.chave = vo.asString("CHAVE");
        return this;
   }
}
