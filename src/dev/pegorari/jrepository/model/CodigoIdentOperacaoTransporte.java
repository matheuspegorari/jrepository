package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CodigoIdentOperacaoTransporte implements SankhyaEntity<CodigoIdentOperacaoTransporte> {

   private BigDecimal seqMdfe;
   private String ciot;
   private BigDecimal nuViag;
   private BigDecimal codParcciot;

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public String getCiot() {
        return ciot;
   }

   public void setCiot(String ciot) {
        this.ciot = ciot;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getCodParcciot() {
        return codParcciot;
   }

   public void setCodParcciot(BigDecimal codParcciot) {
        this.codParcciot = codParcciot;
   }

   @Override
   public String getEntityName() {
        return "CodigoIdentOperacaoTransporte";
   }

   @Override
   public CodigoIdentOperacaoTransporte fromVO(DynamicVO vo) {
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.ciot = vo.asString("CIOT");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.codParcciot = vo.asBigDecimal("CODPARCCIOT");
        return this;
   }
}
