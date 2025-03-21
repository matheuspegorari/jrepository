package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ResumoPorReferencia extends AbstractSankhyaEntity<ResumoPorReferencia> {
   private BigDecimal codEmp;
   private Timestamp dhProcess;
   private Timestamp dtRef;
   private String idEv;
   private BigDecimal indexistInfo;
   private String nrInsc;
   private String nrRecArqBase;
   private BigDecimal sequencia;
   private String tpAmb;
   private BigDecimal tpInsc;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDhProcess() {
        return dhProcess;
   }

   public void setDhProcess(Timestamp dhProcess) {
        markAsChanged("DHPROCESS", dhProcess);
        this.dhProcess = dhProcess;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public String getIdEv() {
        return idEv;
   }

   public void setIdEv(String idEv) {
        markAsChanged("IDEV", idEv);
        this.idEv = idEv;
   }

   public BigDecimal getIndexistInfo() {
        return indexistInfo;
   }

   public void setIndexistInfo(BigDecimal indexistInfo) {
        markAsChanged("INDEXISTINFO", indexistInfo);
        this.indexistInfo = indexistInfo;
   }

   public String getNrInsc() {
        return nrInsc;
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
        this.nrInsc = nrInsc;
   }

   public String getNrRecArqBase() {
        return nrRecArqBase;
   }

   public void setNrRecArqBase(String nrRecArqBase) {
        markAsChanged("NRRECARQBASE", nrRecArqBase);
        this.nrRecArqBase = nrRecArqBase;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
        this.tpAmb = tpAmb;
   }

   public BigDecimal getTpInsc() {
        return tpInsc;
   }

   public void setTpInsc(BigDecimal tpInsc) {
        markAsChanged("TPINSC", tpInsc);
        this.tpInsc = tpInsc;
   }

   @Override
   public String getTableName() {
        return "TRIRES";
   }

   @Override
   public String getEntityName() {
        return "ResumoPorReferencia";
   }

   @Override
   public ResumoPorReferencia fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dhProcess = vo.asTimestamp("DHPROCESS");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEv = vo.asString("IDEV");
        this.indexistInfo = vo.asBigDecimal("INDEXISTINFO");
        this.nrInsc = vo.asString("NRINSC");
        this.nrRecArqBase = vo.asString("NRRECARQBASE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        return this;
   }
}
