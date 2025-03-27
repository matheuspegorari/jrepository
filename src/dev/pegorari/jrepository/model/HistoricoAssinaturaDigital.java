package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoAssinaturaDigital extends AbstractSankhyaEntity<HistoricoAssinaturaDigital> {
   public String getChaveDoc() {
        return this.getVo().asString("CHAVEDOC");
   }

   public void setChaveDoc(String chaveDoc) {
        markAsChanged("CHAVEDOC", chaveDoc);
   }

   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDetalhesStatus() {
        return this.getVo().asString("DETALHES_STATUS");
   }

   public void setDetalhesStatus(String detalhesStatus) {
        markAsChanged("DETALHES_STATUS", detalhesStatus);
   }

   public Timestamp getDhEvento() {
        return this.getVo().asTimestamp("DHEVENTO");
   }

   public void setDhEvento(Timestamp dhEvento) {
        markAsChanged("DHEVENTO", dhEvento);
   }

   public char[] getErro() {
        return this.getVo().asClob("ERRO");
   }

   public void setErro(char[] erro) {
        markAsChanged("ERRO", erro);
   }

   public String getHashArquivo() {
        return this.getVo().asString("HASHARQUIVO");
   }

   public void setHashArquivo(String hashArquivo) {
        markAsChanged("HASHARQUIVO", hashArquivo);
   }

   public BigDecimal getId() {
        return this.getVo().asBigDecimal("ID");
   }

   public void setId(BigDecimal id) {
        markAsChanged("ID", id);
   }

   public String getMsg() {
        return this.getVo().asString("MSG");
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
   }

   public BigDecimal getNuDoc() {
        return this.getVo().asBigDecimal("NUDOC");
   }

   public void setNuDoc(BigDecimal nuDoc) {
        markAsChanged("NUDOC", nuDoc);
   }

   public BigDecimal getSolicitacaoManual() {
        return this.getVo().asBigDecimal("SOLICITACAO_MANUAL");
   }

   public void setSolicitacaoManual(BigDecimal solicitacaoManual) {
        markAsChanged("SOLICITACAO_MANUAL", solicitacaoManual);
   }

   public String getStatusAssinatura() {
        return this.getVo().asString("STATUS_ASSINATURA");
   }

   public void setStatusAssinatura(String statusAssinatura) {
        markAsChanged("STATUS_ASSINATURA", statusAssinatura);
   }

   public String getTipoDoc() {
        return this.getVo().asString("TIPODOC");
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   public String getTransactionId() {
        return this.getVo().asString("TRANSACTIONID");
   }

   public void setTransactionId(String transactionId) {
        markAsChanged("TRANSACTIONID", transactionId);
   }

   @Override
   public String getTableName() {
        return "TSIDAS_HIS";
   }

   @Override
   public String getEntityName() {
        return "HistoricoAssinaturaDigital";
   }

   @Override
   public HistoricoAssinaturaDigital fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
