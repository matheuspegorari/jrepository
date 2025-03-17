package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class TabelaI18n extends AbstractSankhyaEntity<TabelaI18n> {
   private String locale;
   private String nomeTab;
   private String texto;

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        this.locale = locale;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        this.nomeTab = nomeTab;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        this.texto = texto;
   }

   @Override
   public String getTableName() {
        return "TDDTABI18N";
   }

   @Override
   public String getEntityName() {
        return "TabelaI18n";
   }

   @Override
   public TabelaI18n fromVO(DynamicVO vo) {
        this.locale = vo.asString("LOCALE");
        this.nomeTab = vo.asString("NOMETAB");
        this.texto = vo.asString("TEXTO");
        return this;
   }
}
