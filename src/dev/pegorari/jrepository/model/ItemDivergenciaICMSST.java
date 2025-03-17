package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemDivergenciaICMSST extends AbstractSankhyaEntity<ItemDivergenciaICMSST> {
   private BigDecimal baseSubstitCalc;
   private BigDecimal baseSubstitItem;
   private BigDecimal codProd;
   private BigDecimal codTrib;
   private String digitado;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private BigDecimal vlrSubstitCalc;
   private BigDecimal vlrSubstitItem;
   private BigDecimal baseIcmsCalc;
   private BigDecimal baseIcmsIte;
   private BigDecimal vlrIcmsCalc;
   private BigDecimal vlrIcmsIte;
   private BigDecimal difVlrSubstit;
   private BigDecimal idAliqIcms;

   public BigDecimal getBaseSubstitCalc() {
        return baseSubstitCalc;
   }

   public void setBaseSubstitCalc(BigDecimal baseSubstitCalc) {
        this.baseSubstitCalc = baseSubstitCalc;
   }

   public BigDecimal getBaseSubstitItem() {
        return baseSubstitItem;
   }

   public void setBaseSubstitItem(BigDecimal baseSubstitItem) {
        this.baseSubstitItem = baseSubstitItem;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodTrib() {
        return codTrib;
   }

   public void setCodTrib(BigDecimal codTrib) {
        this.codTrib = codTrib;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getVlrSubstitCalc() {
        return vlrSubstitCalc;
   }

   public void setVlrSubstitCalc(BigDecimal vlrSubstitCalc) {
        this.vlrSubstitCalc = vlrSubstitCalc;
   }

   public BigDecimal getVlrSubstitItem() {
        return vlrSubstitItem;
   }

   public void setVlrSubstitItem(BigDecimal vlrSubstitItem) {
        this.vlrSubstitItem = vlrSubstitItem;
   }

   public BigDecimal getBaseIcmsCalc() {
        return baseIcmsCalc;
   }

   public void setBaseIcmsCalc(BigDecimal baseIcmsCalc) {
        this.baseIcmsCalc = baseIcmsCalc;
   }

   public BigDecimal getBaseIcmsIte() {
        return baseIcmsIte;
   }

   public void setBaseIcmsIte(BigDecimal baseIcmsIte) {
        this.baseIcmsIte = baseIcmsIte;
   }

   public BigDecimal getVlrIcmsCalc() {
        return vlrIcmsCalc;
   }

   public void setVlrIcmsCalc(BigDecimal vlrIcmsCalc) {
        this.vlrIcmsCalc = vlrIcmsCalc;
   }

   public BigDecimal getVlrIcmsIte() {
        return vlrIcmsIte;
   }

   public void setVlrIcmsIte(BigDecimal vlrIcmsIte) {
        this.vlrIcmsIte = vlrIcmsIte;
   }

   public BigDecimal getDifVlrSubstit() {
        return difVlrSubstit;
   }

   public void setDifVlrSubstit(BigDecimal difVlrSubstit) {
        this.difVlrSubstit = difVlrSubstit;
   }

   public BigDecimal getIdAliqIcms() {
        return idAliqIcms;
   }

   public void setIdAliqIcms(BigDecimal idAliqIcms) {
        this.idAliqIcms = idAliqIcms;
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
        this.baseSubstitCalc = vo.asBigDecimal("BASESUBSTITCALC");
        this.baseSubstitItem = vo.asBigDecimal("BASESUBSTITITEM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.digitado = vo.asString("DIGITADO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrSubstitCalc = vo.asBigDecimal("VLRSUBSTCALC");
        this.vlrSubstitItem = vo.asBigDecimal("VLRSUBSTITEM");
        this.baseIcmsCalc = vo.asBigDecimal("BASEICMSCALC");
        this.baseIcmsIte = vo.asBigDecimal("BASEICMSITE");
        this.vlrIcmsCalc = vo.asBigDecimal("VLRICMSCALC");
        this.vlrIcmsIte = vo.asBigDecimal("VLRICMSITE");
        this.difVlrSubstit = vo.asBigDecimal("DIFVLRSUBST");
        this.idAliqIcms = vo.asBigDecimal("IDALIQICMS");
        return this;
   }
}
