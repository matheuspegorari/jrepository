package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Agente extends AbstractSankhyaEntity<Agente> {
   public String getSchedule() {
        return this.getVo().asString("SCHEDULE");
   }

   public void setSchedule(String schedule) {
        markAsChanged("SCHEDULE", schedule);
   }

   public String getVersao() {
        return this.getVo().asString("VERSAO");
   }

   public void setVersao(String versao) {
        markAsChanged("VERSAO", versao);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public byte[] getConteudo() {
        return this.getVo().asBlob("CONTEUDO");
   }

   public void setConteudo(byte[] conteudo) {
        markAsChanged("CONTEUDO", conteudo);
   }

   public char[] getDescritor() {
        return this.getVo().asClob("DESCRITOR");
   }

   public void setDescritor(char[] descritor) {
        markAsChanged("DESCRITOR", descritor);
   }

   public String getId() {
        return this.getVo().asString("ID");
   }

   public void setId(String id) {
        markAsChanged("ID", id);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getNotificado() {
        return this.getVo().asString("NOTIFICADO");
   }

   public void setNotificado(String notificado) {
        markAsChanged("NOTIFICADO", notificado);
   }

   public String getDescragente() {
        return this.getVo().asString("DESCRAGENTE");
   }

   public void setDescragente(String descragente) {
        markAsChanged("DESCRAGENTE", descragente);
   }

   public BigDecimal getQtdexec() {
        return this.getVo().asBigDecimal("QTDEXEC");
   }

   public void setQtdexec(BigDecimal qtdexec) {
        markAsChanged("QTDEXEC", qtdexec);
   }

   public String getHash() {
        return this.getVo().asString("HASH");
   }

   public void setHash(String hash) {
        markAsChanged("HASH", hash);
   }

   public char[] getUltlog() {
        return this.getVo().asClob("ULTLOG");
   }

   public void setUltlog(char[] ultlog) {
        markAsChanged("ULTLOG", ultlog);
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
        this.setVo(vo);
        return this;
   }
}
