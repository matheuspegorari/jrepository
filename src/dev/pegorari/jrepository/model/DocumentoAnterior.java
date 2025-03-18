package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAnterior extends AbstractSankhyaEntity<DocumentoAnterior> {
   private String chaveDant;
   private BigDecimal codParc;
   private BigDecimal nuNota;
   private BigDecimal seqDant;
   private String cteRef;
   private Timestamp demi;
   private String nDoc;
   private String serie;
   private String subSer;
   private String tpDocta;

   public String getChaveDant() {
        return chaveDant;
   }

   public void setChaveDant(String chaveDant) {
        markAsChanged("CHAVEDANT", chaveDant);
        this.chaveDant = chaveDant;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqDant() {
        return seqDant;
   }

   public void setSeqDant(BigDecimal seqDant) {
        markAsChanged("SEQDANT", seqDant);
        this.seqDant = seqDant;
   }

   public String getCteRef() {
        return cteRef;
   }

   public void setCteRef(String cteRef) {
        markAsChanged("CTEREF", cteRef);
        this.cteRef = cteRef;
   }

   public Timestamp getDemi() {
        return demi;
   }

   public void setDemi(Timestamp demi) {
        markAsChanged("DEMI", demi);
        this.demi = demi;
   }

   public String getNDoc() {
        return nDoc;
   }

   public void setNDoc(String nDoc) {
        markAsChanged("NDOC", nDoc);
        this.nDoc = nDoc;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   public String getSubSer() {
        return subSer;
   }

   public void setSubSer(String subSer) {
        markAsChanged("SUBSER", subSer);
        this.subSer = subSer;
   }

   public String getTpDocta() {
        return tpDocta;
   }

   public void setTpDocta(String tpDocta) {
        markAsChanged("TPDOCTA", tpDocta);
        this.tpDocta = tpDocta;
   }

   @Override
   public String getTableName() {
        return "TGFDANT";
   }

   @Override
   public String getEntityName() {
        return "DocumentoAnterior";
   }

   @Override
   public DocumentoAnterior fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.chaveDant = vo.asString("CHAVEDANT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqDant = vo.asBigDecimal("SEQDANT");
        this.cteRef = vo.asString("CTEREF");
        this.demi = vo.asTimestamp("DEMI");
        this.nDoc = vo.asString("NDOC");
        this.serie = vo.asString("SERIE");
        this.subSer = vo.asString("SUBSER");
        this.tpDocta = vo.asString("TPDOCTA");
        return this;
   }
}
