package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoRepositorioPA extends AbstractSankhyaEntity<MovimentacaoRepositorioPA> {
   private BigDecimal codCpm;
   private BigDecimal codProdPa;
   private String controlePa;
   private Timestamp dhMov;
   private BigDecimal idIatv;
   private BigDecimal idProc;
   private BigDecimal idMer;
   private BigDecimal idRpa;
   private BigDecimal qtd;
   private BigDecimal seqMer;
   private BigDecimal sinal;
   private String statusExec;
   private BigDecimal qtdPerda;

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        this.codCpm = codCpm;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public Timestamp getDhMov() {
        return dhMov;
   }

   public void setDhMov(Timestamp dhMov) {
        this.dhMov = dhMov;
   }

   public BigDecimal getIdIatv() {
        return idIatv;
   }

   public void setIdIatv(BigDecimal idIatv) {
        this.idIatv = idIatv;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public BigDecimal getIdMer() {
        return idMer;
   }

   public void setIdMer(BigDecimal idMer) {
        this.idMer = idMer;
   }

   public BigDecimal getIdRpa() {
        return idRpa;
   }

   public void setIdRpa(BigDecimal idRpa) {
        this.idRpa = idRpa;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public BigDecimal getSeqMer() {
        return seqMer;
   }

   public void setSeqMer(BigDecimal seqMer) {
        this.seqMer = seqMer;
   }

   public BigDecimal getSinal() {
        return sinal;
   }

   public void setSinal(BigDecimal sinal) {
        this.sinal = sinal;
   }

   public String getStatusExec() {
        return statusExec;
   }

   public void setStatusExec(String statusExec) {
        this.statusExec = statusExec;
   }

   public BigDecimal getQtdPerda() {
        return qtdPerda;
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        this.qtdPerda = qtdPerda;
   }

   @Override
   public String getTableName() {
        return "TPRMER";
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoRepositorioPA";
   }

   @Override
   public MovimentacaoRepositorioPA fromVO(DynamicVO vo) {
        this.codCpm = vo.asBigDecimal("CODCPM");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.idIatv = vo.asBigDecimal("IDIATV");
        this.idProc = vo.asBigDecimal("IDIPROC");
        this.idMer = vo.asBigDecimal("IDMER");
        this.idRpa = vo.asBigDecimal("IDRPA");
        this.qtd = vo.asBigDecimal("QTD");
        this.seqMer = vo.asBigDecimal("SEQMER");
        this.sinal = vo.asBigDecimal("SINAL");
        this.statusExec = vo.asString("STATUSEXEC");
        this.qtdPerda = vo.asBigDecimal("QTDPERDA");
        return this;
   }
}
