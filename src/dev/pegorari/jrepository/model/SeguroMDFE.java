package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SeguroMDFE extends AbstractSankhyaEntity<SeguroMDFE> {
   public String getNuMapolice() {
        return this.getVo().asString("NUMAPOLICE");
   }

   public void setNuMapolice(String nuMapolice) {
        markAsChanged("NUMAPOLICE", nuMapolice);
   }

   public BigDecimal getCodParcSeg() {
        return this.getVo().asBigDecimal("CODPARCSEG");
   }

   public void setCodParcSeg(BigDecimal codParcSeg) {
        markAsChanged("CODPARCSEG", codParcSeg);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getCodParcRespSeg() {
        return this.getVo().asBigDecimal("CODPARCRESPSEG");
   }

   public void setCodParcRespSeg(BigDecimal codParcRespSeg) {
        markAsChanged("CODPARCRESPSEG", codParcRespSeg);
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
        this.setVo(vo);
        return this;
   }
}
