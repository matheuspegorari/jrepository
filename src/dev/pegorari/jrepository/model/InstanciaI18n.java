package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class InstanciaI18n extends AbstractSankhyaEntity<InstanciaI18n> {
   private String locale;
   private String nomeInstancia;
   private String texto;

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        this.locale = locale;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        this.nomeInstancia = nomeInstancia;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        this.texto = texto;
   }

   @Override
   public String getTableName() {
        return "TDDINSI18N";
   }

   @Override
   public String getEntityName() {
        return "InstanciaI18n";
   }

   @Override
   public InstanciaI18n fromVO(DynamicVO vo) {
        this.locale = vo.asString("LOCALE");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.texto = vo.asString("TEXTO");
        return this;
   }
}
