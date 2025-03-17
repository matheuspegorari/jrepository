package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ContratanteMDFE implements SankhyaEntity<ContratanteMDFE> {

   private BigDecimal seqMdfe;
   private BigDecimal codParcContr;
   private BigDecimal nuViag;

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getCodParcContr() {
        return codParcContr;
   }

   public void setCodParcContr(BigDecimal codParcContr) {
        this.codParcContr = codParcContr;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   @Override
   public String getEntityName() {
        return "ContratanteMDFE";
   }

   @Override
   public ContratanteMDFE fromVO(DynamicVO vo) {
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.codParcContr = vo.asBigDecimal("CODPARCCONTR");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        return this;
   }
}
