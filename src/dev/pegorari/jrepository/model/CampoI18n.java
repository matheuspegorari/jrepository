package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class CampoI18n extends AbstractSankhyaEntity<CampoI18n> {
   private String locale;
   private String nomeCampo;
   private String nomeTab;
   private String texto;

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
        this.locale = locale;
   }

   public String getNomeCampo() {
        return nomeCampo;
   }

   public void setNomeCampo(String nomeCampo) {
        markAsChanged("NOMECAMPO", nomeCampo);
        this.nomeCampo = nomeCampo;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
        this.nomeTab = nomeTab;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
        this.texto = texto;
   }

   @Override
   public String getTableName() {
        return "TDDCAMI18N";
   }

   @Override
   public String getEntityName() {
        return "CampoI18n";
   }

   @Override
   public CampoI18n fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.locale = vo.asString("LOCALE");
        this.nomeCampo = vo.asString("NOMECAMPO");
        this.nomeTab = vo.asString("NOMETAB");
        this.texto = vo.asString("TEXTO");
        return this;
   }
}
