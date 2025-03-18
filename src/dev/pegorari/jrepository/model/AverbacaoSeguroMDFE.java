package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AverbacaoSeguroMDFE extends AbstractSankhyaEntity<AverbacaoSeguroMDFE> {
   private String nuAverb;
   private BigDecimal seqMdfe;
   private String numApOlice;
   private BigDecimal nuViag;

   public String getNuAverb() {
        return nuAverb;
   }

   public void setNuAverb(String nuAverb) {
        markAsChanged("NUMAVERB", nuAverb);
        this.nuAverb = nuAverb;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public String getNumApOlice() {
        return numApOlice;
   }

   public void setNumApOlice(String numApOlice) {
        markAsChanged("NUMAPOLICE", numApOlice);
        this.numApOlice = numApOlice;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
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
        this.setOriginalVO(vo);
        this.nuAverb = vo.asString("NUMAVERB");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.numApOlice = vo.asString("NUMAPOLICE");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        return this;
   }
}
