package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ElementoProcesso extends AbstractSankhyaEntity<ElementoProcesso> {
   private BigDecimal codPrn;
   private char[] documentacao;
   private String expressCandidade;
   private String expressLanguage;
   private String idElemento;
   private String nome;
   private BigDecimal nuEle;
   private String tipo;
   private BigDecimal versao;
   private char[] historyTemplate;
   private String background;
   private String notificationCandidate;
   private String notificationOwner;

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
        this.codPrn = codPrn;
   }

   public char[] getDocumentacao() {
        return documentacao;
   }

   public void setDocumentacao(char[] documentacao) {
        markAsChanged("DOCUMENTACAO", documentacao);
        this.documentacao = documentacao;
   }

   public String getExpressCandidade() {
        return expressCandidade;
   }

   public void setExpressCandidade(String expressCandidade) {
        markAsChanged("EXPRESSCANDITADE", expressCandidade);
        this.expressCandidade = expressCandidade;
   }

   public String getExpressLanguage() {
        return expressLanguage;
   }

   public void setExpressLanguage(String expressLanguage) {
        markAsChanged("EXPRESSLANGUAGE", expressLanguage);
        this.expressLanguage = expressLanguage;
   }

   public String getIdElemento() {
        return idElemento;
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
        this.idElemento = idElemento;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
        this.nuEle = nuEle;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   public char[] getHistoryTemplate() {
        return historyTemplate;
   }

   public void setHistoryTemplate(char[] historyTemplate) {
        markAsChanged("HISTORYTEMPLATE", historyTemplate);
        this.historyTemplate = historyTemplate;
   }

   public String getBackground() {
        return background;
   }

   public void setBackground(String background) {
        markAsChanged("BACKGROUND", background);
        this.background = background;
   }

   public String getNotificationCandidate() {
        return notificationCandidate;
   }

   public void setNotificationCandidate(String notificationCandidate) {
        markAsChanged("NOTIFICATIONCANDIDATE", notificationCandidate);
        this.notificationCandidate = notificationCandidate;
   }

   public String getNotificationOwner() {
        return notificationOwner;
   }

   public void setNotificationOwner(String notificationOwner) {
        markAsChanged("NOTIFICATIONOWNER", notificationOwner);
        this.notificationOwner = notificationOwner;
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
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.documentacao = vo.asClob("DOCUMENTACAO");
        this.expressCandidade = vo.asString("EXPRESSCANDITADE");
        this.expressLanguage = vo.asString("EXPRESSLANGUAGE");
        this.idElemento = vo.asString("IDELEMENTO");
        this.nome = vo.asString("NOME");
        this.nuEle = vo.asBigDecimal("NUELE");
        this.tipo = vo.asString("TIPO");
        this.versao = vo.asBigDecimal("VERSAO");
        this.historyTemplate = vo.asClob("HISTORYTEMPLATE");
        this.background = vo.asString("BACKGROUND");
        this.notificationCandidate = vo.asString("NOTIFICATIONCANDIDATE");
        this.notificationOwner = vo.asString("NOTIFICATIONOWNER");
        return this;
   }
}
