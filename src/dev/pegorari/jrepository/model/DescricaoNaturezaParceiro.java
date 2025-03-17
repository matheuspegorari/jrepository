package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DescricaoNaturezaParceiro extends AbstractSankhyaEntity<DescricaoNaturezaParceiro> {
   private BigDecimal codNat;
   private BigDecimal codParc;
   private String descrNat;

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public String getDescrNat() {
        return descrNat;
   }

   public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
   }

   @Override
   public String getTableName() {
        return "TGFDNP";
   }

   @Override
   public String getEntityName() {
        return "DescricaoNaturezaParceiro";
   }

   @Override
   public DescricaoNaturezaParceiro fromVO(DynamicVO vo) {
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.descrNat = vo.asString("DESCRNAT");
        return this;
   }
}
