package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class TabelaI18n extends AbstractSankhyaEntity<TabelaI18n> {
   public String getLocale() {
        return this.getVo().asString("LOCALE");
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
   }

   public String getNomeTab() {
        return this.getVo().asString("NOMETAB");
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
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
        this.setVo(vo);
        return this;
   }
}
