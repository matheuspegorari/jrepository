package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AverbacaoSeguroMDFE extends AbstractSankhyaEntity<AverbacaoSeguroMDFE> {
   public String getNuAverb() {
        return this.getVo().asString("NUMAVERB");
   }

   public void setNuAverb(String nuAverb) {
        markAsChanged("NUMAVERB", nuAverb);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public String getNumApOlice() {
        return this.getVo().asString("NUMAPOLICE");
   }

   public void setNumApOlice(String numApOlice) {
        markAsChanged("NUMAPOLICE", numApOlice);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   @Override
   public String getTableName() {
        return "TGFAVE";
   }

   @Override
   public String getEntityName() {
        return "AverbacaoSeguroMDFE";
   }

   @Override
   public AverbacaoSeguroMDFE fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
