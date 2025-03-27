package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ProdutoPerigosoNotaMDFE extends AbstractSankhyaEntity<ProdutoPerigosoNotaMDFE> {
   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public String getQtdTotProd() {
        return this.getVo().asString("QTDTOTPROD");
   }

   public void setQtdTotProd(String qtdTotProd) {
        markAsChanged("QTDTOTPROD", qtdTotProd);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getNumOnu() {
        return this.getVo().asString("NUMONU");
   }

   public void setNumOnu(String numOnu) {
        markAsChanged("NUMONU", numOnu);
   }

   @Override
   public String getTableName() {
        return "TGFPERI";
   }

   @Override
   public String getEntityName() {
        return "ProdutoPerigosoNotaMDFE";
   }

   @Override
   public ProdutoPerigosoNotaMDFE fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
