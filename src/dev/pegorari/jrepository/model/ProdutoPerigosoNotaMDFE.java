package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ProdutoPerigosoNotaMDFE extends AbstractSankhyaEntity<ProdutoPerigosoNotaMDFE> {
   private BigDecimal nuViag;
   private String qtdTotProd;
   private BigDecimal seqMdfe;
   private BigDecimal nuNota;
   private String numOnu;

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public String getQtdTotProd() {
        return qtdTotProd;
   }

   public void setQtdTotProd(String qtdTotProd) {
        markAsChanged("QTDTOTPROD", qtdTotProd);
        this.qtdTotProd = qtdTotProd;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getNumOnu() {
        return numOnu;
   }

   public void setNumOnu(String numOnu) {
        markAsChanged("NUMONU", numOnu);
        this.numOnu = numOnu;
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
        this.setOriginalVO(vo);
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.qtdTotProd = vo.asString("QTDTOTPROD");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.numOnu = vo.asString("NUMONU");
        return this;
   }
}
