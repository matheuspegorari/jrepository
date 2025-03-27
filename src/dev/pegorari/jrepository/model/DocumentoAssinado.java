package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAssinado extends AbstractSankhyaEntity<DocumentoAssinado> {
   public Timestamp getDhSolic() {
        return this.getVo().asTimestamp("DHSOLIC");
   }

   public void setDhSolic(Timestamp dhSolic) {
        markAsChanged("DHSOLIC", dhSolic);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public BigDecimal getNuDoc() {
        return this.getVo().asBigDecimal("NUDOC");
   }

   public void setNuDoc(BigDecimal nuDoc) {
        markAsChanged("NUDOC", nuDoc);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getHashArquivo() {
        return this.getVo().asString("HASHARQUIVO");
   }

   public void setHashArquivo(String hashArquivo) {
        markAsChanged("HASHARQUIVO", hashArquivo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getTransactionId() {
        return this.getVo().asString("TRANSACTIONID");
   }

   public void setTransactionId(String transactionId) {
        markAsChanged("TRANSACTIONID", transactionId);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getChaveArquivo() {
        return this.getVo().asString("CHAVEARQUIVO");
   }

   public void setChaveArquivo(String chaveArquivo) {
        markAsChanged("CHAVEARQUIVO", chaveArquivo);
   }

   public Timestamp getDhResp() {
        return this.getVo().asTimestamp("DHRESP");
   }

   public void setDhResp(Timestamp dhResp) {
        markAsChanged("DHRESP", dhResp);
   }

   public String getIdDestinatario() {
        return this.getVo().asString("IDDESTINATARIO");
   }

   public void setIdDestinatario(String idDestinatario) {
        markAsChanged("IDDESTINATARIO", idDestinatario);
   }

   public String getIdSolicitante() {
        return this.getVo().asString("IDSOLICITANTE");
   }

   public void setIdSolicitante(String idSolicitante) {
        markAsChanged("IDSOLICITANTE", idSolicitante);
   }

   public String getTipoNotific() {
        return this.getVo().asString("TIPONOTIFIC");
   }

   public void setTipoNotific(String tipoNotific) {
        markAsChanged("TIPONOTIFIC", tipoNotific);
   }

   public String getNomeSolicitante() {
        return this.getVo().asString("NOMESOLICITANTE");
   }

   public void setNomeSolicitante(String nomeSolicitante) {
        markAsChanged("NOMESOLICITANTE", nomeSolicitante);
   }

   public String getNomeDestinatario() {
        return this.getVo().asString("NOMEDESTINATARIO");
   }

   public void setNomeDestinatario(String nomeDestinatario) {
        markAsChanged("NOMEDESTINATARIO", nomeDestinatario);
   }

   public String getDetalhesStatus() {
        return this.getVo().asString("DETALHESTATUS");
   }

   public void setDetalhesStatus(String detalhesStatus) {
        markAsChanged("DETALHESTATUS", detalhesStatus);
   }

   @Override
   public String getTableName() {
        return "TSIDAS";
   }

   @Override
   public String getEntityName() {
        return "DocumentoAssinado";
   }

   @Override
   public DocumentoAssinado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
