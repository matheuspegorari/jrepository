package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ElementoProcesso extends AbstractSankhyaEntity<ElementoProcesso> {
   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public char[] getDocumentacao() {
        return this.getVo().asClob("DOCUMENTACAO");
   }

   public void setDocumentacao(char[] documentacao) {
        markAsChanged("DOCUMENTACAO", documentacao);
   }

   public String getExpressCandidade() {
        return this.getVo().asString("EXPRESSCANDITADE");
   }

   public void setExpressCandidade(String expressCandidade) {
        markAsChanged("EXPRESSCANDITADE", expressCandidade);
   }

   public String getExpressLanguage() {
        return this.getVo().asString("EXPRESSLANGUAGE");
   }

   public void setExpressLanguage(String expressLanguage) {
        markAsChanged("EXPRESSLANGUAGE", expressLanguage);
   }

   public String getIdElemento() {
        return this.getVo().asString("IDELEMENTO");
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuEle() {
        return this.getVo().asBigDecimal("NUELE");
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public char[] getHistoryTemplate() {
        return this.getVo().asClob("HISTORYTEMPLATE");
   }

   public void setHistoryTemplate(char[] historyTemplate) {
        markAsChanged("HISTORYTEMPLATE", historyTemplate);
   }

   public String getBackground() {
        return this.getVo().asString("BACKGROUND");
   }

   public void setBackground(String background) {
        markAsChanged("BACKGROUND", background);
   }

   public String getNotificationCandidate() {
        return this.getVo().asString("NOTIFICATIONCANDIDATE");
   }

   public void setNotificationCandidate(String notificationCandidate) {
        markAsChanged("NOTIFICATIONCANDIDATE", notificationCandidate);
   }

   public String getNotificationOwner() {
        return this.getVo().asString("NOTIFICATIONOWNER");
   }

   public void setNotificationOwner(String notificationOwner) {
        markAsChanged("NOTIFICATIONOWNER", notificationOwner);
   }

   @Override
   public String getTableName() {
        return "TWFELE";
   }

   @Override
   public String getEntityName() {
        return "ElementoProcesso";
   }

   @Override
   public ElementoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
