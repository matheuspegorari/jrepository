package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class InstanciaI18n extends AbstractSankhyaEntity<InstanciaI18n> {
   public String getLocale() {
        return this.getVo().asString("LOCALE");
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
   }

   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
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
        this.setVo(vo);
        return this;
   }
}
