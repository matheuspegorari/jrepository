package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostosImportacao extends AbstractSankhyaEntity<ImpostosImportacao> {
   private BigDecimal baseImposto;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private BigDecimal vlrDespadua;
   private BigDecimal vlrImposto;
   private BigDecimal vlrIof;
   private String impTagExcnNotNac;

   public BigDecimal getBaseImposto() {
        return baseImposto;
   }

   public void setBaseImposto(BigDecimal baseImposto) {
        markAsChanged("BASEIMPOSTO", baseImposto);
        this.baseImposto = baseImposto;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getVlrDespadua() {
        return vlrDespadua;
   }

   public void setVlrDespadua(BigDecimal vlrDespadua) {
        markAsChanged("VLRDESPADUA", vlrDespadua);
        this.vlrDespadua = vlrDespadua;
   }

   public BigDecimal getVlrImposto() {
        return vlrImposto;
   }

   public void setVlrImposto(BigDecimal vlrImposto) {
        markAsChanged("VLRIMPOSTO", vlrImposto);
        this.vlrImposto = vlrImposto;
   }

   public BigDecimal getVlrIof() {
        return vlrIof;
   }

   public void setVlrIof(BigDecimal vlrIof) {
        markAsChanged("VLRIOF", vlrIof);
        this.vlrIof = vlrIof;
   }

   public String getImpTagExcnNotNac() {
        return impTagExcnNotNac;
   }

   public void setImpTagExcnNotNac(String impTagExcnNotNac) {
        markAsChanged("IMPTAGEXCNOTNAC", impTagExcnNotNac);
        this.impTagExcnNotNac = impTagExcnNotNac;
   }

   @Override
   public String getTableName() {
        return "TGFIII";
   }

   @Override
   public String getEntityName() {
        return "ImpostosImportacao";
   }

   @Override
   public ImpostosImportacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.baseImposto = vo.asBigDecimal("BASEIMPOSTO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrDespadua = vo.asBigDecimal("VLRDESPADUA");
        this.vlrImposto = vo.asBigDecimal("VLRIMPOSTO");
        this.vlrIof = vo.asBigDecimal("VLRIOF");
        this.impTagExcnNotNac = vo.asString("IMPTAGEXCNOTNAC");
        return this;
   }
}
