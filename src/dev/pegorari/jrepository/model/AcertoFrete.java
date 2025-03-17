package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AcertoFrete extends AbstractSankhyaEntity<AcertoFrete> {
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuAcerto;
   private BigDecimal nuFin;
   private BigDecimal nuFinOrig;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private String tipAcerto;

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

   public BigDecimal getNuAcerto() {
        return nuAcerto;
   }

   public void setNuAcerto(BigDecimal nuAcerto) {
        this.nuAcerto = nuAcerto;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getNuFinOrig() {
        return nuFinOrig;
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        this.nuFinOrig = nuFinOrig;
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

   public String getTipAcerto() {
        return tipAcerto;
   }

   public void setTipAcerto(String tipAcerto) {
        this.tipAcerto = tipAcerto;
   }

   @Override
   public String getTableName() {
        return "TGFFRE";
   }

   @Override
   public String getEntityName() {
        return "AcertoFrete";
   }

   @Override
   public AcertoFrete fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuAcerto = vo.asBigDecimal("NUACERTO");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuFinOrig = vo.asBigDecimal("NUFINORIG");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipAcerto = vo.asString("TIPACERTO");
        return this;
   }
}
