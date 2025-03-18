package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SeguroMDFE extends AbstractSankhyaEntity<SeguroMDFE> {
   private String nuMapolice;
   private BigDecimal codParcSeg;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private BigDecimal codParcRespSeg;

   public String getNuMapolice() {
        return nuMapolice;
   }

   public void setNuMapolice(String nuMapolice) {
        markAsChanged("NUMAPOLICE", nuMapolice);
        this.nuMapolice = nuMapolice;
   }

   public BigDecimal getCodParcSeg() {
        return codParcSeg;
   }

   public void setCodParcSeg(BigDecimal codParcSeg) {
        markAsChanged("CODPARCSEG", codParcSeg);
        this.codParcSeg = codParcSeg;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getCodParcRespSeg() {
        return codParcRespSeg;
   }

   public void setCodParcRespSeg(BigDecimal codParcRespSeg) {
        markAsChanged("CODPARCRESPSEG", codParcRespSeg);
        this.codParcRespSeg = codParcRespSeg;
   }

   @Override
   public String getTableName() {
        return "TGFMDFESEG";
   }

   @Override
   public String getEntityName() {
        return "SeguroMDFE";
   }

   @Override
   public SeguroMDFE fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.nuMapolice = vo.asString("NUMAPOLICE");
        this.codParcSeg = vo.asBigDecimal("CODPARCSEG");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.codParcRespSeg = vo.asBigDecimal("CODPARCRESPSEG");
        return this;
   }
}
