package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ProdutoPerigosoNotaMDFE implements SankhyaEntity<ProdutoPerigosoNotaMDFE> {

   private BigDecimal nuViag;
   private String qtdTotProd;
   private BigDecimal seqMdfe;
   private BigDecimal nuNota;
   private String numOnu;

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public String getQtdTotProd() {
        return qtdTotProd;
   }

   public void setQtdTotProd(String qtdTotProd) {
        this.qtdTotProd = qtdTotProd;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getNumOnu() {
        return numOnu;
   }

   public void setNumOnu(String numOnu) {
        this.numOnu = numOnu;
   }

   @Override
   public String getEntityName() {
        return "ProdutoPerigosoNotaMDFE";
   }

   @Override
   public ProdutoPerigosoNotaMDFE fromVO(DynamicVO vo) {
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.qtdTotProd = vo.asString("QTDTOTPROD");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.numOnu = vo.asString("NUMONU");
        return this;
   }
}
