package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ElementoProcesso implements SankhyaEntity<ElementoProcesso> {

   private BigDecimal codPrn;
   private char[] documentacao;
   private String expressCanditade;
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
        this.codPrn = codPrn;
   }

   public char[] getDocumentacao() {
        return documentacao;
   }

   public void setDocumentacao(char[] documentacao) {
        this.documentacao = documentacao;
   }

   public String getExpressCanditade() {
        return expressCanditade;
   }

   public void setExpressCanditade(String expressCanditade) {
        this.expressCanditade = expressCanditade;
   }

   public String getExpressLanguage() {
        return expressLanguage;
   }

   public void setExpressLanguage(String expressLanguage) {
        this.expressLanguage = expressLanguage;
   }

   public String getIdElemento() {
        return idElemento;
   }

   public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        this.nuEle = nuEle;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   public char[] getHistoryTemplate() {
        return historyTemplate;
   }

   public void setHistoryTemplate(char[] historyTemplate) {
        this.historyTemplate = historyTemplate;
   }

   public String getBackground() {
        return background;
   }

   public void setBackground(String background) {
        this.background = background;
   }

   public String getNotificationCandidate() {
        return notificationCandidate;
   }

   public void setNotificationCandidate(String notificationCandidate) {
        this.notificationCandidate = notificationCandidate;
   }

   public String getNotificationOwner() {
        return notificationOwner;
   }

   public void setNotificationOwner(String notificationOwner) {
        this.notificationOwner = notificationOwner;
   }

   @Override
   public String getEntityName() {
        return "ElementoProcesso";
   }

   @Override
   public ElementoProcesso fromVO(DynamicVO vo) {
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.documentacao = vo.asClob("DOCUMENTACAO");
        this.expressCanditade = vo.asString("EXPRESSCANDITADE");
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
