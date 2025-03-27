package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemDivergenciaICMSST extends AbstractSankhyaEntity<ItemDivergenciaICMSST> {
   public BigDecimal getBaseSubstitCalc() {
        return this.getVo().asBigDecimal("BASESUBSTITCALC");
   }

   public void setBaseSubstitCalc(BigDecimal baseSubstitCalc) {
        markAsChanged("BASESUBSTITCALC", baseSubstitCalc);
   }

   public BigDecimal getBaseSubstitItem() {
        return this.getVo().asBigDecimal("BASESUBSTITITEM");
   }

   public void setBaseSubstitItem(BigDecimal baseSubstitItem) {
        markAsChanged("BASESUBSTITITEM", baseSubstitItem);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodTrib() {
        return this.getVo().asBigDecimal("CODTRIB");
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getVlrSubstitCalc() {
        return this.getVo().asBigDecimal("VLRSUBSTCALC");
   }

   public void setVlrSubstitCalc(BigDecimal vlrSubstitCalc) {
        markAsChanged("VLRSUBSTCALC", vlrSubstitCalc);
   }

   public BigDecimal getVlrSubstitItem() {
        return this.getVo().asBigDecimal("VLRSUBSTITEM");
   }

   public void setVlrSubstitItem(BigDecimal vlrSubstitItem) {
        markAsChanged("VLRSUBSTITEM", vlrSubstitItem);
   }

   public BigDecimal getBaseIcmsCalc() {
        return this.getVo().asBigDecimal("BASEICMSCALC");
   }

   public void setBaseIcmsCalc(BigDecimal baseIcmsCalc) {
        markAsChanged("BASEICMSCALC", baseIcmsCalc);
   }

   public BigDecimal getBaseIcmsIte() {
        return this.getVo().asBigDecimal("BASEICMSITE");
   }

   public void setBaseIcmsIte(BigDecimal baseIcmsIte) {
        markAsChanged("BASEICMSITE", baseIcmsIte);
   }

   public BigDecimal getVlrIcmsCalc() {
        return this.getVo().asBigDecimal("VLRICMSCALC");
   }

   public void setVlrIcmsCalc(BigDecimal vlrIcmsCalc) {
        markAsChanged("VLRICMSCALC", vlrIcmsCalc);
   }

   public BigDecimal getVlrIcmsIte() {
        return this.getVo().asBigDecimal("VLRICMSITE");
   }

   public void setVlrIcmsIte(BigDecimal vlrIcmsIte) {
        markAsChanged("VLRICMSITE", vlrIcmsIte);
   }

   public BigDecimal getDifVlrSubstit() {
        return this.getVo().asBigDecimal("DIFVLRSUBST");
   }

   public void setDifVlrSubstit(BigDecimal difVlrSubstit) {
        markAsChanged("DIFVLRSUBST", difVlrSubstit);
   }

   public BigDecimal getIdAliqIcms() {
        return this.getVo().asBigDecimal("IDALIQICMS");
   }

   public void setIdAliqIcms(BigDecimal idAliqIcms) {
        markAsChanged("IDALIQICMS", idAliqIcms);
   }

   @Override
   public String getTableName() {
        return "TGFIDST";
   }

   @Override
   public String getEntityName() {
        return "ItemDivergenciaICMSST";
   }

   @Override
   public ItemDivergenciaICMSST fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
