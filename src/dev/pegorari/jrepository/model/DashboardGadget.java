package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DashboardGadget extends AbstractSankhyaEntity<DashboardGadget> {
   private BigDecimal nuDsb;
   private BigDecimal nuGdg;

   public BigDecimal getNuDsb() {
        return nuDsb;
   }

   public void setNuDsb(BigDecimal nuDsb) {
        markAsChanged("NUDSB", nuDsb);
        this.nuDsb = nuDsb;
   }

   public BigDecimal getNuGdg() {
        return nuGdg;
   }

   public void setNuGdg(BigDecimal nuGdg) {
        markAsChanged("NUGDG", nuGdg);
        this.nuGdg = nuGdg;
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
        this.nuDsb = vo.asBigDecimal("NUDSB");
        this.nuGdg = vo.asBigDecimal("NUGDG");
        return this;
   }
}
