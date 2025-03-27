package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CodigoIdentOperacaoTransporte extends AbstractSankhyaEntity<CodigoIdentOperacaoTransporte> {
   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public String getCiot() {
        return this.getVo().asString("CIOT");
   }

   public void setCiot(String ciot) {
        markAsChanged("CIOT", ciot);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getCodParCciot() {
        return this.getVo().asBigDecimal("CODPARCCIOT");
   }

   public void setCodParCciot(BigDecimal codParCciot) {
        markAsChanged("CODPARCCIOT", codParCciot);
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
        this.setVo(vo);
        return this;
   }
}
