package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TrabalhoImpressao extends AbstractSankhyaEntity<TrabalhoImpressao> {
   private BigDecimal codUsu;
   private BigDecimal copies;
   private String description;
   private Timestamp dhInc;
   private Timestamp dhUltEnv;
   private String fileName;
   private String idDoc;
   private String idGrupoJob;
   private String jobStatus;
   private String mimeType;
   private String msgErro;
   private BigDecimal nuJpr;
   private BigDecimal numTentativas;
   private String originalPrinter;
   private String printerUri;
   private String printServerUri;
   private String tipoDoc;
   private String jobId;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCopies() {
        return copies;
   }

   public void setCopies(BigDecimal copies) {
        this.copies = copies;
   }

   public String getDescription() {
        return description;
   }

   public void setDescription(String description) {
        this.description = description;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public Timestamp getDhUltEnv() {
        return dhUltEnv;
   }

   public void setDhUltEnv(Timestamp dhUltEnv) {
        this.dhUltEnv = dhUltEnv;
   }

   public String getFileName() {
        return fileName;
   }

   public void setFileName(String fileName) {
        this.fileName = fileName;
   }

   public String getIdDoc() {
        return idDoc;
   }

   public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
   }

   public String getIdGrupoJob() {
        return idGrupoJob;
   }

   public void setIdGrupoJob(String idGrupoJob) {
        this.idGrupoJob = idGrupoJob;
   }

   public String getJobStatus() {
        return jobStatus;
   }

   public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
   }

   public String getMimeType() {
        return mimeType;
   }

   public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
   }

   public String getMsgErro() {
        return msgErro;
   }

   public void setMsgErro(String msgErro) {
        this.msgErro = msgErro;
   }

   public BigDecimal getNuJpr() {
        return nuJpr;
   }

   public void setNuJpr(BigDecimal nuJpr) {
        this.nuJpr = nuJpr;
   }

   public BigDecimal getNumTentativas() {
        return numTentativas;
   }

   public void setNumTentativas(BigDecimal numTentativas) {
        this.numTentativas = numTentativas;
   }

   public String getOriginalPrinter() {
        return originalPrinter;
   }

   public void setOriginalPrinter(String originalPrinter) {
        this.originalPrinter = originalPrinter;
   }

   public String getPrinterUri() {
        return printerUri;
   }

   public void setPrinterUri(String printerUri) {
        this.printerUri = printerUri;
   }

   public String getPrintServerUri() {
        return printServerUri;
   }

   public void setPrintServerUri(String printServerUri) {
        this.printServerUri = printServerUri;
   }

   public String getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
   }

   public String getJobId() {
        return jobId;
   }

   public void setJobId(String jobId) {
        this.jobId = jobId;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.copies = vo.asBigDecimal("COPIES");
        this.description = vo.asString("DESCRIPTION");
        this.dhInc = vo.asTimestamp("DHINC");
        this.dhUltEnv = vo.asTimestamp("DHULTENV");
        this.fileName = vo.asString("FILENAME");
        this.idDoc = vo.asString("IDDOC");
        this.idGrupoJob = vo.asString("IDGRUPOJOB");
        this.jobStatus = vo.asString("JOBSTATUS");
        this.mimeType = vo.asString("MIMETYPE");
        this.msgErro = vo.asString("MSGERRO");
        this.nuJpr = vo.asBigDecimal("NUJPR");
        this.numTentativas = vo.asBigDecimal("NUMTENTATIVAS");
        this.originalPrinter = vo.asString("ORIGINALPRINTER");
        this.printerUri = vo.asString("PRINTERURI");
        this.printServerUri = vo.asString("PRINTSERVERURI");
        this.tipoDoc = vo.asString("TIPODOC");
        this.jobId = vo.asString("JOBID");
        return this;
   }
}
