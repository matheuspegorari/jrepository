package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TrabalhoImpressao extends AbstractSankhyaEntity<TrabalhoImpressao> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCopies() {
        return this.getVo().asBigDecimal("COPIES");
   }

   public void setCopies(BigDecimal copies) {
        markAsChanged("COPIES", copies);
   }

   public String getDescription() {
        return this.getVo().asString("DESCRIPTION");
   }

   public void setDescription(String description) {
        markAsChanged("DESCRIPTION", description);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public Timestamp getDhUltEnv() {
        return this.getVo().asTimestamp("DHULTENV");
   }

   public void setDhUltEnv(Timestamp dhUltEnv) {
        markAsChanged("DHULTENV", dhUltEnv);
   }

   public String getFileName() {
        return this.getVo().asString("FILENAME");
   }

   public void setFileName(String fileName) {
        markAsChanged("FILENAME", fileName);
   }

   public String getIdDoc() {
        return this.getVo().asString("IDDOC");
   }

   public void setIdDoc(String idDoc) {
        markAsChanged("IDDOC", idDoc);
   }

   public String getIdGrupoJob() {
        return this.getVo().asString("IDGRUPOJOB");
   }

   public void setIdGrupoJob(String idGrupoJob) {
        markAsChanged("IDGRUPOJOB", idGrupoJob);
   }

   public String getJobStatus() {
        return this.getVo().asString("JOBSTATUS");
   }

   public void setJobStatus(String jobStatus) {
        markAsChanged("JOBSTATUS", jobStatus);
   }

   public String getMimeType() {
        return this.getVo().asString("MIMETYPE");
   }

   public void setMimeType(String mimeType) {
        markAsChanged("MIMETYPE", mimeType);
   }

   public String getMsgErro() {
        return this.getVo().asString("MSGERRO");
   }

   public void setMsgErro(String msgErro) {
        markAsChanged("MSGERRO", msgErro);
   }

   public BigDecimal getNuJpr() {
        return this.getVo().asBigDecimal("NUJPR");
   }

   public void setNuJpr(BigDecimal nuJpr) {
        markAsChanged("NUJPR", nuJpr);
   }

   public BigDecimal getNumTentativas() {
        return this.getVo().asBigDecimal("NUMTENTATIVAS");
   }

   public void setNumTentativas(BigDecimal numTentativas) {
        markAsChanged("NUMTENTATIVAS", numTentativas);
   }

   public String getOriginalPrinter() {
        return this.getVo().asString("ORIGINALPRINTER");
   }

   public void setOriginalPrinter(String originalPrinter) {
        markAsChanged("ORIGINALPRINTER", originalPrinter);
   }

   public String getPrinterUri() {
        return this.getVo().asString("PRINTERURI");
   }

   public void setPrinterUri(String printerUri) {
        markAsChanged("PRINTERURI", printerUri);
   }

   public String getPrintServerUri() {
        return this.getVo().asString("PRINTSERVERURI");
   }

   public void setPrintServerUri(String printServerUri) {
        markAsChanged("PRINTSERVERURI", printServerUri);
   }

   public String getTipoDoc() {
        return this.getVo().asString("TIPODOC");
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   public String getJobId() {
        return this.getVo().asString("JOBID");
   }

   public void setJobId(String jobId) {
        markAsChanged("JOBID", jobId);
   }

   @Override
   public String getTableName() {
        return "TSIJPR";
   }

   @Override
   public String getEntityName() {
        return "TrabalhoImpressao";
   }

   @Override
   public TrabalhoImpressao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
