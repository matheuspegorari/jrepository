package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EstatisticasJob extends AbstractSankhyaEntity<EstatisticasJob> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhexec() {
        return this.getVo().asTimestamp("DHEXEC");
   }

   public void setDhexec(Timestamp dhexec) {
        markAsChanged("DHEXEC", dhexec);
   }

   public Timestamp getDhproxexec() {
        return this.getVo().asTimestamp("DHPROXEXEC");
   }

   public void setDhproxexec(Timestamp dhproxexec) {
        markAsChanged("DHPROXEXEC", dhproxexec);
   }

   public String getErrotrace() {
        return this.getVo().asString("ERROTRACE");
   }

   public void setErrotrace(String errotrace) {
        markAsChanged("ERROTRACE", errotrace);
   }

   public String getId() {
        return this.getVo().asString("ID");
   }

   public void setId(String id) {
        markAsChanged("ID", id);
   }

   public BigDecimal getMediaexec() {
        return this.getVo().asBigDecimal("MEDIAEXEC");
   }

   public void setMediaexec(BigDecimal mediaexec) {
        markAsChanged("MEDIAEXEC", mediaexec);
   }

   public String getMsgerro() {
        return this.getVo().asString("MSGERRO");
   }

   public void setMsgerro(String msgerro) {
        markAsChanged("MSGERRO", msgerro);
   }

   public BigDecimal getQtdexecs() {
        return this.getVo().asBigDecimal("QTDEXECS");
   }

   public void setQtdexecs(BigDecimal qtdexecs) {
        markAsChanged("QTDEXECS", qtdexecs);
   }

   public BigDecimal getQtdfalhas() {
        return this.getVo().asBigDecimal("QTDFALHAS");
   }

   public void setQtdfalhas(BigDecimal qtdfalhas) {
        markAsChanged("QTDFALHAS", qtdfalhas);
   }

   public String getStatusexec() {
        return this.getVo().asString("STATUSEXEC");
   }

   public void setStatusexec(String statusexec) {
        markAsChanged("STATUSEXEC", statusexec);
   }

   public BigDecimal getTempoexec() {
        return this.getVo().asBigDecimal("TEMPOEXEC");
   }

   public void setTempoexec(BigDecimal tempoexec) {
        markAsChanged("TEMPOEXEC", tempoexec);
   }

   public BigDecimal getTempomaxexec() {
        return this.getVo().asBigDecimal("TEMPOMAXEXEC");
   }

   public void setTempomaxexec(BigDecimal tempomaxexec) {
        markAsChanged("TEMPOMAXEXEC", tempomaxexec);
   }

   public BigDecimal getTempominexec() {
        return this.getVo().asBigDecimal("TEMPOMINEXEC");
   }

   public void setTempominexec(BigDecimal tempominexec) {
        markAsChanged("TEMPOMINEXEC", tempominexec);
   }

   public BigDecimal getTempoulimaexec() {
        return this.getVo().asBigDecimal("TEMPOULIMAEXEC");
   }

   public void setTempoulimaexec(BigDecimal tempoulimaexec) {
        markAsChanged("TEMPOULIMAEXEC", tempoulimaexec);
   }

   public String getTipjob() {
        return this.getVo().asString("TIPJOB");
   }

   public void setTipjob(String tipjob) {
        markAsChanged("TIPJOB", tipjob);
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
        return this;
   }
}
