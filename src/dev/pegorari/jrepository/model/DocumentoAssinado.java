package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAssinado extends AbstractSankhyaEntity<DocumentoAssinado> {
   private Timestamp dhSolic;
   private String nomeArquivo;
   private BigDecimal nuDoc;
   private String descricao;
   private String hashArquivo;
   private BigDecimal codUsu;
   private String transactionId;
   private String status;
   private String chaveArquivo;
   private Timestamp dhResp;
   private String idDestinatario;
   private String idSolicitante;
   private String tipoNotific;
   private String nomeSolicitante;
   private String nomeDestinatario;
   private String detalhesStatus;

   public Timestamp getDhSolic() {
        return dhSolic;
   }

   public void setDhSolic(Timestamp dhSolic) {
        markAsChanged("DHSOLIC", dhSolic);
        this.dhSolic = dhSolic;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public BigDecimal getNuDoc() {
        return nuDoc;
   }

   public void setNuDoc(BigDecimal nuDoc) {
        markAsChanged("NUDOC", nuDoc);
        this.nuDoc = nuDoc;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getHashArquivo() {
        return hashArquivo;
   }

   public void setHashArquivo(String hashArquivo) {
        markAsChanged("HASHARQUIVO", hashArquivo);
        this.hashArquivo = hashArquivo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getTransactionId() {
        return transactionId;
   }

   public void setTransactionId(String transactionId) {
        markAsChanged("TRANSACTIONID", transactionId);
        this.transactionId = transactionId;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getChaveArquivo() {
        return chaveArquivo;
   }

   public void setChaveArquivo(String chaveArquivo) {
        markAsChanged("CHAVEARQUIVO", chaveArquivo);
        this.chaveArquivo = chaveArquivo;
   }

   public Timestamp getDhResp() {
        return dhResp;
   }

   public void setDhResp(Timestamp dhResp) {
        markAsChanged("DHRESP", dhResp);
        this.dhResp = dhResp;
   }

   public String getIdDestinatario() {
        return idDestinatario;
   }

   public void setIdDestinatario(String idDestinatario) {
        markAsChanged("IDDESTINATARIO", idDestinatario);
        this.idDestinatario = idDestinatario;
   }

   public String getIdSolicitante() {
        return idSolicitante;
   }

   public void setIdSolicitante(String idSolicitante) {
        markAsChanged("IDSOLICITANTE", idSolicitante);
        this.idSolicitante = idSolicitante;
   }

   public String getTipoNotific() {
        return tipoNotific;
   }

   public void setTipoNotific(String tipoNotific) {
        markAsChanged("TIPONOTIFIC", tipoNotific);
        this.tipoNotific = tipoNotific;
   }

   public String getNomeSolicitante() {
        return nomeSolicitante;
   }

   public void setNomeSolicitante(String nomeSolicitante) {
        markAsChanged("NOMESOLICITANTE", nomeSolicitante);
        this.nomeSolicitante = nomeSolicitante;
   }

   public String getNomeDestinatario() {
        return nomeDestinatario;
   }

   public void setNomeDestinatario(String nomeDestinatario) {
        markAsChanged("NOMEDESTINATARIO", nomeDestinatario);
        this.nomeDestinatario = nomeDestinatario;
   }

   public String getDetalhesStatus() {
        return detalhesStatus;
   }

   public void setDetalhesStatus(String detalhesStatus) {
        markAsChanged("DETALHESTATUS", detalhesStatus);
        this.detalhesStatus = detalhesStatus;
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
        this.dhSolic = vo.asTimestamp("DHSOLIC");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.nuDoc = vo.asBigDecimal("NUDOC");
        this.descricao = vo.asString("DESCRICAO");
        this.hashArquivo = vo.asString("HASHARQUIVO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.transactionId = vo.asString("TRANSACTIONID");
        this.status = vo.asString("STATUS");
        this.chaveArquivo = vo.asString("CHAVEARQUIVO");
        this.dhResp = vo.asTimestamp("DHRESP");
        this.idDestinatario = vo.asString("IDDESTINATARIO");
        this.idSolicitante = vo.asString("IDSOLICITANTE");
        this.tipoNotific = vo.asString("TIPONOTIFIC");
        this.nomeSolicitante = vo.asString("NOMESOLICITANTE");
        this.nomeDestinatario = vo.asString("NOMEDESTINATARIO");
        this.detalhesStatus = vo.asString("DETALHESTATUS");
        return this;
   }
}
