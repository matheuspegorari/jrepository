package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

public class OpcaoCampoI18n implements SankhyaEntity<OpcaoCampoI18n> {

   private String locale;
   private String nomeCampo;
   private String nomeTab;
   private String texto;
   private String valor;

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        this.locale = locale;
   }

   public String getNomeCampo() {
        return nomeCampo;
   }

   public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
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

   public String getValor() {
        return valor;
   }

   public void setValor(String valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "OpcaoCampoI18n";
   }

   @Override
   public OpcaoCampoI18n fromVO(DynamicVO vo) {
        this.locale = vo.asString("LOCALE");
        this.nomeCampo = vo.asString("NOMECAMPO");
        this.nomeTab = vo.asString("NOMETAB");
        this.texto = vo.asString("TEXTO");
        this.valor = vo.asString("VALOR");
        return this;
   }
}
