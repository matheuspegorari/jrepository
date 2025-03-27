package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NaturezaProjetoCtaContabil extends AbstractSankhyaEntity<NaturezaProjetoCtaContabil> {
   public String getPriorizarRateio() {
        return this.getVo().asString("PRIORIZARRATEIO");
   }

   public void setPriorizarRateio(String priorizarRateio) {
        markAsChanged("PRIORIZARRATEIO", priorizarRateio);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   @Override
   public String getTableName() {
        return "TGFNPC";
   }

   @Override
   public String getEntityName() {
        return "NaturezaProjetoCtaContabil";
   }

   @Override
   public NaturezaProjetoCtaContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
