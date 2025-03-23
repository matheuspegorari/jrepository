package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LacreMDFE extends AbstractSankhyaEntity<LacreMDFE> {
   private BigDecimal nuViag;
   private String numLacre;
   private BigDecimal seqMdfe;

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public String getNumLacre() {
        return numLacre;
   }

   public void setNumLacre(String numLacre) {
        markAsChanged("NUMLACRE", numLacre);
        this.numLacre = numLacre;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   @Override
   public String getTableName() {
        return "TGFMDFELAC";
   }

   @Override
   public String getEntityName() {
        return "LacreMDFE";
   }

   @Override
   public LacreMDFE fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.numLacre = vo.asString("NUMLACRE");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        return this;
   }
}
