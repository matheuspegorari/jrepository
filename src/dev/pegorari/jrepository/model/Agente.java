package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Agente extends AbstractSankhyaEntity<Agente> {
   private String schedule;
   private String versao;
   private Timestamp dhInc;
   private byte[] conteudo;
   private char[] descritor;
   private String id;
   private String status;
   private String notificado;
   private String descragente;
   private BigDecimal qtdexec;
   private String hash;
   private char[] ultlog;

   public String getSchedule() {
        return schedule;
   }

   public void setSchedule(String schedule) {
        markAsChanged("SCHEDULE", schedule);
        this.schedule = schedule;
   }

   public String getVersao() {
        return versao;
   }

   public void setVersao(String versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
        this.dhInc = dhInc;
   }

   public byte[] getConteudo() {
        return conteudo;
   }

   public void setConteudo(byte[] conteudo) {
        markAsChanged("CONTEUDO", conteudo);
        this.conteudo = conteudo;
   }

   public char[] getDescritor() {
        return descritor;
   }

   public void setDescritor(char[] descritor) {
        markAsChanged("DESCRITOR", descritor);
        this.descritor = descritor;
   }

   public String getId() {
        return id;
   }

   public void setId(String id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getNotificado() {
        return notificado;
   }

   public void setNotificado(String notificado) {
        markAsChanged("NOTIFICADO", notificado);
        this.notificado = notificado;
   }

   public String getDescragente() {
        return descragente;
   }

   public void setDescragente(String descragente) {
        markAsChanged("DESCRAGENTE", descragente);
        this.descragente = descragente;
   }

   public BigDecimal getQtdexec() {
        return qtdexec;
   }

   public void setQtdexec(BigDecimal qtdexec) {
        markAsChanged("QTDEXEC", qtdexec);
        this.qtdexec = qtdexec;
   }

   public String getHash() {
        return hash;
   }

   public void setHash(String hash) {
        markAsChanged("HASH", hash);
        this.hash = hash;
   }

   public char[] getUltlog() {
        return ultlog;
   }

   public void setUltlog(char[] ultlog) {
        markAsChanged("ULTLOG", ultlog);
        this.ultlog = ultlog;
   }

   @Override
   public String getTableName() {
        return "TASAGE";
   }

   @Override
   public String getEntityName() {
        return "Agente";
   }

   @Override
   public Agente fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.schedule = vo.asString("SCHEDULE");
        this.versao = vo.asString("VERSAO");
        this.dhInc = vo.asTimestamp("DHINC");
        this.conteudo = vo.asBlob("CONTEUDO");
        this.descritor = vo.asClob("DESCRITOR");
        this.id = vo.asString("ID");
        this.status = vo.asString("STATUS");
        this.notificado = vo.asString("NOTIFICADO");
        this.descragente = vo.asString("DESCRAGENTE");
        this.qtdexec = vo.asBigDecimal("QTDEXEC");
        this.hash = vo.asString("HASH");
        this.ultlog = vo.asClob("ULTLOG");
        return this;
   }
}
