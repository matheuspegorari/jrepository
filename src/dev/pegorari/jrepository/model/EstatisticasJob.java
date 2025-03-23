package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EstatisticasJob extends AbstractSankhyaEntity<EstatisticasJob> {
   private String ativo;
   private String descricao;
   private Timestamp dhexec;
   private Timestamp dhproxexec;
   private String errotrace;
   private String id;
   private BigDecimal mediaexec;
   private String msgerro;
   private BigDecimal qtdexecs;
   private BigDecimal qtdfalhas;
   private String statusexec;
   private BigDecimal tempoexec;
   private BigDecimal tempomaxexec;
   private BigDecimal tempominexec;
   private BigDecimal tempoulimaexec;
   private String tipjob;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhexec() {
        return dhexec;
   }

   public void setDhexec(Timestamp dhexec) {
        markAsChanged("DHEXEC", dhexec);
        this.dhexec = dhexec;
   }

   public Timestamp getDhproxexec() {
        return dhproxexec;
   }

   public void setDhproxexec(Timestamp dhproxexec) {
        markAsChanged("DHPROXEXEC", dhproxexec);
        this.dhproxexec = dhproxexec;
   }

   public String getErrotrace() {
        return errotrace;
   }

   public void setErrotrace(String errotrace) {
        markAsChanged("ERROTRACE", errotrace);
        this.errotrace = errotrace;
   }

   public String getId() {
        return id;
   }

   public void setId(String id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public BigDecimal getMediaexec() {
        return mediaexec;
   }

   public void setMediaexec(BigDecimal mediaexec) {
        markAsChanged("MEDIAEXEC", mediaexec);
        this.mediaexec = mediaexec;
   }

   public String getMsgerro() {
        return msgerro;
   }

   public void setMsgerro(String msgerro) {
        markAsChanged("MSGERRO", msgerro);
        this.msgerro = msgerro;
   }

   public BigDecimal getQtdexecs() {
        return qtdexecs;
   }

   public void setQtdexecs(BigDecimal qtdexecs) {
        markAsChanged("QTDEXECS", qtdexecs);
        this.qtdexecs = qtdexecs;
   }

   public BigDecimal getQtdfalhas() {
        return qtdfalhas;
   }

   public void setQtdfalhas(BigDecimal qtdfalhas) {
        markAsChanged("QTDFALHAS", qtdfalhas);
        this.qtdfalhas = qtdfalhas;
   }

   public String getStatusexec() {
        return statusexec;
   }

   public void setStatusexec(String statusexec) {
        markAsChanged("STATUSEXEC", statusexec);
        this.statusexec = statusexec;
   }

   public BigDecimal getTempoexec() {
        return tempoexec;
   }

   public void setTempoexec(BigDecimal tempoexec) {
        markAsChanged("TEMPOEXEC", tempoexec);
        this.tempoexec = tempoexec;
   }

   public BigDecimal getTempomaxexec() {
        return tempomaxexec;
   }

   public void setTempomaxexec(BigDecimal tempomaxexec) {
        markAsChanged("TEMPOMAXEXEC", tempomaxexec);
        this.tempomaxexec = tempomaxexec;
   }

   public BigDecimal getTempominexec() {
        return tempominexec;
   }

   public void setTempominexec(BigDecimal tempominexec) {
        markAsChanged("TEMPOMINEXEC", tempominexec);
        this.tempominexec = tempominexec;
   }

   public BigDecimal getTempoulimaexec() {
        return tempoulimaexec;
   }

   public void setTempoulimaexec(BigDecimal tempoulimaexec) {
        markAsChanged("TEMPOULIMAEXEC", tempoulimaexec);
        this.tempoulimaexec = tempoulimaexec;
   }

   public String getTipjob() {
        return tipjob;
   }

   public void setTipjob(String tipjob) {
        markAsChanged("TIPJOB", tipjob);
        this.tipjob = tipjob;
   }

   @Override
   public String getTableName() {
        return "TSIEJO";
   }

   @Override
   public String getEntityName() {
        return "EstatisticasJob";
   }

   @Override
   public EstatisticasJob fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.ativo = vo.asString("ATIVO");
        this.descricao = vo.asString("DESCRICAO");
        this.dhexec = vo.asTimestamp("DHEXEC");
        this.dhproxexec = vo.asTimestamp("DHPROXEXEC");
        this.errotrace = vo.asString("ERROTRACE");
        this.id = vo.asString("ID");
        this.mediaexec = vo.asBigDecimal("MEDIAEXEC");
        this.msgerro = vo.asString("MSGERRO");
        this.qtdexecs = vo.asBigDecimal("QTDEXECS");
        this.qtdfalhas = vo.asBigDecimal("QTDFALHAS");
        this.statusexec = vo.asString("STATUSEXEC");
        this.tempoexec = vo.asBigDecimal("TEMPOEXEC");
        this.tempomaxexec = vo.asBigDecimal("TEMPOMAXEXEC");
        this.tempominexec = vo.asBigDecimal("TEMPOMINEXEC");
        this.tempoulimaexec = vo.asBigDecimal("TEMPOULIMAEXEC");
        this.tipjob = vo.asString("TIPJOB");
        return this;
   }
}
