package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAnterior implements SankhyaEntity<DocumentoAnterior> {

   private String chaveDant;
   private BigDecimal codParc;
   private BigDecimal nuNota;
   private BigDecimal seqDant;
   private String cteRef;
   private Timestamp dEmi;
   private String nDoc;
   private String serie;
   private String subSer;
   private String tpDocTa;

   public String getChaveDant() {
        return chaveDant;
   }

   public void setChaveDant(String chaveDant) {
        this.chaveDant = chaveDant;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqDant() {
        return seqDant;
   }

   public void setSeqDant(BigDecimal seqDant) {
        this.seqDant = seqDant;
   }

   public String getCteRef() {
        return cteRef;
   }

   public void setCteRef(String cteRef) {
        this.cteRef = cteRef;
   }

   public Timestamp getDEmi() {
        return dEmi;
   }

   public void setDEmi(Timestamp dEmi) {
        this.dEmi = dEmi;
   }

   public String getNDoc() {
        return nDoc;
   }

   public void setNDoc(String nDoc) {
        this.nDoc = nDoc;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public String getSubSer() {
        return subSer;
   }

   public void setSubSer(String subSer) {
        this.subSer = subSer;
   }

   public String getTpDocTa() {
        return tpDocTa;
   }

   public void setTpDocTa(String tpDocTa) {
        this.tpDocTa = tpDocTa;
   }

   @Override
   public String getEntityName() {
        return "DocumentoAnterior";
   }

   @Override
   public DocumentoAnterior fromVO(DynamicVO vo) {
        this.chaveDant = vo.asString("CHAVEDANT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqDant = vo.asBigDecimal("SEQDANT");
        this.cteRef = vo.asString("CTEREF");
        this.dEmi = vo.asTimestamp("DEMI");
        this.nDoc = vo.asString("NDOC");
        this.serie = vo.asString("SERIE");
        this.subSer = vo.asString("SUBSER");
        this.tpDocTa = vo.asString("TPDOCTA");
        return this;
   }
}
