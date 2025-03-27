package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DescricaoNaturezaParceiro extends AbstractSankhyaEntity<DescricaoNaturezaParceiro> {
   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public String getDescrNat() {
        return this.getVo().asString("DESCRNAT");
   }

   public void setDescrNat(String descrNat) {
        markAsChanged("DESCRNAT", descrNat);
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
        this.setVo(vo);
        return this;
   }
}
