package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotoristaMDF extends AbstractSankhyaEntity<MotoristaMDF> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
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
        return this;
   }
}
