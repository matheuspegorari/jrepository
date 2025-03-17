package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NaturezaProjetoCtaContabil extends AbstractSankhyaEntity<NaturezaProjetoCtaContabil> {
   private String priorizarRateio;
   private BigDecimal codCtaCtb;
   private BigDecimal codProj;
   private BigDecimal codNat;

   public String getPriorizarRateio() {
        return priorizarRateio;
   }

   public void setPriorizarRateio(String priorizarRateio) {
        this.priorizarRateio = priorizarRateio;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
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
        this.priorizarRateio = vo.asString("PRIORIZARRATEIO");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codNat = vo.asBigDecimal("CODNAT");
        return this;
   }
}
