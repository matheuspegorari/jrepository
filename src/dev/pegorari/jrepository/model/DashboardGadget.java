package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DashboardGadget extends AbstractSankhyaEntity<DashboardGadget> {
   public BigDecimal getNuDsb() {
        return this.getVo().asBigDecimal("NUDSB");
   }

   public void setNuDsb(BigDecimal nuDsb) {
        markAsChanged("NUDSB", nuDsb);
   }

   public BigDecimal getNuGdg() {
        return this.getVo().asBigDecimal("NUGDG");
   }

   public void setNuGdg(BigDecimal nuGdg) {
        markAsChanged("NUGDG", nuGdg);
   }

   @Override
   public String getTableName() {
        return "TSIDSG";
   }

   @Override
   public String getEntityName() {
        return "DashboardGadget";
   }

   @Override
   public DashboardGadget fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
