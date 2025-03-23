package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContratanteMDFE extends AbstractSankhyaEntity<ContratanteMDFE> {
   private BigDecimal seqMdfe;
   private BigDecimal codParcContr;
   private BigDecimal nuViag;

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getCodParcContr() {
        return codParcContr;
   }

   public void setCodParcContr(BigDecimal codParcContr) {
        markAsChanged("CODPARCCONTR", codParcContr);
        this.codParcContr = codParcContr;
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
        return "TGFCONTR";
   }

   @Override
   public String getEntityName() {
        return "ContratanteMDFE";
   }

   @Override
   public ContratanteMDFE fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.codParcContr = vo.asBigDecimal("CODPARCCONTR");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        return this;
   }
}
