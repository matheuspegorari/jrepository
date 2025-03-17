package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostosImportacao implements SankhyaEntity<ImpostosImportacao> {

   private BigDecimal baseImposto;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private BigDecimal vlrDespAdua;
   private BigDecimal vlrImposto;
   private BigDecimal vlrIof;
   private String impTagExCNotNac;

   public BigDecimal getBaseImposto() {
        return baseImposto;
   }

   public void setBaseImposto(BigDecimal baseImposto) {
        this.baseImposto = baseImposto;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
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

   public BigDecimal getVlrDespAdua() {
        return vlrDespAdua;
   }

   public void setVlrDespAdua(BigDecimal vlrDespAdua) {
        this.vlrDespAdua = vlrDespAdua;
   }

   public BigDecimal getVlrImposto() {
        return vlrImposto;
   }

   public void setVlrImposto(BigDecimal vlrImposto) {
        this.vlrImposto = vlrImposto;
   }

   public BigDecimal getVlrIof() {
        return vlrIof;
   }

   public void setVlrIof(BigDecimal vlrIof) {
        this.vlrIof = vlrIof;
   }

   public String getImpTagExCNotNac() {
        return impTagExCNotNac;
   }

   public void setImpTagExCNotNac(String impTagExCNotNac) {
        this.impTagExCNotNac = impTagExCNotNac;
   }

   @Override
   public String getEntityName() {
        return "ImpostosImportacao";
   }

   @Override
   public ImpostosImportacao fromVO(DynamicVO vo) {
        this.baseImposto = vo.asBigDecimal("BASEIMPOSTO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrDespAdua = vo.asBigDecimal("VLRDESPADUA");
        this.vlrImposto = vo.asBigDecimal("VLRIMPOSTO");
        this.vlrIof = vo.asBigDecimal("VLRIOF");
        this.impTagExCNotNac = vo.asString("IMPTAGEXCNOTNAC");
        return this;
   }
}
