package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GadgetBiaVinculo extends AbstractSankhyaEntity<GadgetBiaVinculo> {
   public BigDecimal getCodGbc() {
        return this.getVo().asBigDecimal("CODGBC");
   }

   public void setCodGbc(BigDecimal codGbc) {
        markAsChanged("CODGBC", codGbc);
   }

   public BigDecimal getCodGbi() {
        return this.getVo().asBigDecimal("CODGBI");
   }

   public void setCodGbi(BigDecimal codGbi) {
        markAsChanged("CODGBI", codGbi);
   }

   @Override
   public String getTableName() {
        return "TSIGBV";
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaVinculo";
   }

   @Override
   public GadgetBiaVinculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
