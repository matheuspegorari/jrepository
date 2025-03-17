package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoAssinaturaDigital implements SankhyaEntity<HistoricoAssinaturaDigital> {

   private String chaveDoc;
   private BigDecimal codEvento;
   private BigDecimal codUsu;
   private String detalhesStatus;
   private Timestamp dhEvento;
   private char[] erro;
   private String hashArquivo;
   private BigDecimal id;
   private String msg;
   private BigDecimal nuDoc;
   private BigDecimal solicitacaoManual;
   private String statusAssinatura;
   private String tipoDoc;
   private String transactionId;

   public String getChaveDoc() {
        return chaveDoc;
   }

   public void setChaveDoc(String chaveDoc) {
        this.chaveDoc = chaveDoc;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        this.codEvento = codEvento;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDetalhesStatus() {
        return detalhesStatus;
   }

   public void setDetalhesStatus(String detalhesStatus) {
        this.detalhesStatus = detalhesStatus;
   }

   public Timestamp getDhEvento() {
        return dhEvento;
   }

   public void setDhEvento(Timestamp dhEvento) {
        this.dhEvento = dhEvento;
   }

   public char[] getErro() {
        return erro;
   }

   public void setErro(char[] erro) {
        this.erro = erro;
   }

   public String getHashArquivo() {
        return hashArquivo;
   }

   public void setHashArquivo(String hashArquivo) {
        this.hashArquivo = hashArquivo;
   }

   public BigDecimal getId() {
        return id;
   }

   public void setId(BigDecimal id) {
        this.id = id;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        this.msg = msg;
   }

   public BigDecimal getNuDoc() {
        return nuDoc;
   }

   public void setNuDoc(BigDecimal nuDoc) {
        this.nuDoc = nuDoc;
   }

   public BigDecimal getSolicitacaoManual() {
        return solicitacaoManual;
   }

   public void setSolicitacaoManual(BigDecimal solicitacaoManual) {
        this.solicitacaoManual = solicitacaoManual;
   }

   public String getStatusAssinatura() {
        return statusAssinatura;
   }

   public void setStatusAssinatura(String statusAssinatura) {
        this.statusAssinatura = statusAssinatura;
   }

   public String getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
   }

   public String getTransactionId() {
        return transactionId;
   }

   public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
   }

   @Override
   public String getEntityName() {
        return "HistoricoAssinaturaDigital";
   }

   @Override
   public HistoricoAssinaturaDigital fromVO(DynamicVO vo) {
        this.chaveDoc = vo.asString("CHAVEDOC");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.detalhesStatus = vo.asString("DETALHESSTATUS");
        this.dhEvento = vo.asTimestamp("DHEVENTO");
        this.erro = vo.asClob("ERRO");
        this.hashArquivo = vo.asString("HASHARQUIVO");
        this.id = vo.asBigDecimal("ID");
        this.msg = vo.asString("MSG");
        this.nuDoc = vo.asBigDecimal("NUDOC");
        this.solicitacaoManual = vo.asBigDecimal("SOLICITACAOMANUAL");
        this.statusAssinatura = vo.asString("STATUSASSINATURA");
        this.tipoDoc = vo.asString("TIPODOC");
        this.transactionId = vo.asString("TRANSACTIONID");
        return this;
   }
}
