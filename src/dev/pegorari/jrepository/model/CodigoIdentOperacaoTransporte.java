package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CodigoIdentOperacaoTransporte extends AbstractSankhyaEntity<CodigoIdentOperacaoTransporte> {
   private BigDecimal seqMdfe;
   private String ciot;
   private BigDecimal nuViag;
   private BigDecimal codParCciot;

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public String getCiot() {
        return ciot;
   }

   public void setCiot(String ciot) {
        markAsChanged("CIOT", ciot);
        this.ciot = ciot;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getCodParCciot() {
        return codParCciot;
   }

   public void setCodParCciot(BigDecimal codParCciot) {
        markAsChanged("CODPARCCIOT", codParCciot);
        this.codParCciot = codParCciot;
   }

   @Override
   public String getTableName() {
        return "TGFCIOT";
   }

   @Override
   public String getEntityName() {
        return "CodigoIdentOperacaoTransporte";
   }

   @Override
   public CodigoIdentOperacaoTransporte fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.ciot = vo.asString("CIOT");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.codParCciot = vo.asBigDecimal("CODPARCCIOT");
        return this;
   }
}
