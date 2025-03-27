package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class OpcaoCampoI18n extends AbstractSankhyaEntity<OpcaoCampoI18n> {
   public String getLocale() {
        return this.getVo().asString("LOCALE");
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
   }

   public String getNomeCampo() {
        return this.getVo().asString("NOMECAMPO");
   }

   public void setNomeCampo(String nomeCampo) {
        markAsChanged("NOMECAMPO", nomeCampo);
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

   public String getValor() {
        return this.getVo().asString("VALOR");
   }

   public void setValor(String valor) {
        markAsChanged("VALOR", valor);
   }

   @Override
   public String getTableName() {
        return "TDDOPCI18N";
   }

   @Override
   public String getEntityName() {
        return "OpcaoCampoI18n";
   }

   @Override
   public OpcaoCampoI18n fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
