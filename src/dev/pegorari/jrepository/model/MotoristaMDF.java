package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotoristaMDF extends AbstractSankhyaEntity<MotoristaMDF> {
   private BigDecimal codParc;
   private BigDecimal nuViag;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   @Override
   public String getTableName() {
        return "TGFMME";
   }

   @Override
   public String getEntityName() {
        return "MotoristaMDF";
   }

   @Override
   public MotoristaMDF fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codParc = vo.asBigDecimal("CODPARC");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        return this;
   }
}
