package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LacreMDFE extends AbstractSankhyaEntity<LacreMDFE> {
   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public String getNumLacre() {
        return this.getVo().asString("NUMLACRE");
   }

   public void setNumLacre(String numLacre) {
        markAsChanged("NUMLACRE", numLacre);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
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
        return this;
   }
}
