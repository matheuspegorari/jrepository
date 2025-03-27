package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ResumoPorReferencia extends AbstractSankhyaEntity<ResumoPorReferencia> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDhProcess() {
        return this.getVo().asTimestamp("DHPROCESS");
   }

   public void setDhProcess(Timestamp dhProcess) {
        markAsChanged("DHPROCESS", dhProcess);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getIdEv() {
        return this.getVo().asString("IDEV");
   }

   public void setIdEv(String idEv) {
        markAsChanged("IDEV", idEv);
   }

   public BigDecimal getIndexistInfo() {
        return this.getVo().asBigDecimal("INDEXISTINFO");
   }

   public void setIndexistInfo(BigDecimal indexistInfo) {
        markAsChanged("INDEXISTINFO", indexistInfo);
   }

   public String getNrInsc() {
        return this.getVo().asString("NRINSC");
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
   }

   public String getNrRecArqBase() {
        return this.getVo().asString("NRRECARQBASE");
   }

   public void setNrRecArqBase(String nrRecArqBase) {
        markAsChanged("NRRECARQBASE", nrRecArqBase);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTpAmb() {
        return this.getVo().asString("TPAMB");
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   public BigDecimal getTpInsc() {
        return this.getVo().asBigDecimal("TPINSC");
   }

   public void setTpInsc(BigDecimal tpInsc) {
        markAsChanged("TPINSC", tpInsc);
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
        this.setVo(vo);
        return this;
   }
}
