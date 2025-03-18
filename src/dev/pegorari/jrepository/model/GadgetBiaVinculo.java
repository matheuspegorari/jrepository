package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GadgetBiaVinculo extends AbstractSankhyaEntity<GadgetBiaVinculo> {
   private BigDecimal codGbc;
   private BigDecimal codGbi;

   public BigDecimal getCodGbc() {
        return codGbc;
   }

   public void setCodGbc(BigDecimal codGbc) {
        markAsChanged("CODGBC", codGbc);
        this.codGbc = codGbc;
   }

   public BigDecimal getCodGbi() {
        return codGbi;
   }

   public void setCodGbi(BigDecimal codGbi) {
        markAsChanged("CODGBI", codGbi);
        this.codGbi = codGbi;
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
        this.setOriginalVO(vo);
        this.codGbc = vo.asBigDecimal("CODGBC");
        this.codGbi = vo.asBigDecimal("CODGBI");
        return this;
   }
}
