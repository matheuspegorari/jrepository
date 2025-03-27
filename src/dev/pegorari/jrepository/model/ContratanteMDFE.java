package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContratanteMDFE extends AbstractSankhyaEntity<ContratanteMDFE> {
   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getCodParcContr() {
        return this.getVo().asBigDecimal("CODPARCCONTR");
   }

   public void setCodParcContr(BigDecimal codParcContr) {
        markAsChanged("CODPARCCONTR", codParcContr);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
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
        return this;
   }
}
