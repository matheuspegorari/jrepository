package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAnterior extends AbstractSankhyaEntity<DocumentoAnterior> {
   public String getChaveDant() {
        return this.getVo().asString("CHAVEDANT");
   }

   public void setChaveDant(String chaveDant) {
        markAsChanged("CHAVEDANT", chaveDant);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqDant() {
        return this.getVo().asBigDecimal("SEQDANT");
   }

   public void setSeqDant(BigDecimal seqDant) {
        markAsChanged("SEQDANT", seqDant);
   }

   public String getCteRef() {
        return this.getVo().asString("CTEREF");
   }

   public void setCteRef(String cteRef) {
        markAsChanged("CTEREF", cteRef);
   }

   public Timestamp getDemi() {
        return this.getVo().asTimestamp("DEMI");
   }

   public void setDemi(Timestamp demi) {
        markAsChanged("DEMI", demi);
   }

   public String getNDoc() {
        return this.getVo().asString("NDOC");
   }

   public void setNDoc(String nDoc) {
        markAsChanged("NDOC", nDoc);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getSubSer() {
        return this.getVo().asString("SUBSER");
   }

   public void setSubSer(String subSer) {
        markAsChanged("SUBSER", subSer);
   }

   public String getTpDocta() {
        return this.getVo().asString("TPDOCTA");
   }

   public void setTpDocta(String tpDocta) {
        markAsChanged("TPDOCTA", tpDocta);
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
        this.setVo(vo);
        return this;
   }
}
