package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DependenciaEntreOps extends AbstractSankhyaEntity<DependenciaEntreOps> {
   private String referenciaPi;
   private String referenciaPa;
   private BigDecimal idIprocPi;
   private String controlePa;
   private Timestamp dhInc;
   private BigDecimal qtdDep;
   private BigDecimal idIprocPa;
   private BigDecimal codProdPa;
   private String controlePi;
   private BigDecimal codProdPi;

   public String getReferenciaPi() {
        return referenciaPi;
   }

   public void setReferenciaPi(String referenciaPi) {
        this.referenciaPi = referenciaPi;
   }

   public String getReferenciaPa() {
        return referenciaPa;
   }

   public void setReferenciaPa(String referenciaPa) {
        this.referenciaPa = referenciaPa;
   }

   public BigDecimal getIdIprocPi() {
        return idIprocPi;
   }

   public void setIdIprocPi(BigDecimal idIprocPi) {
        this.idIprocPi = idIprocPi;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public BigDecimal getQtdDep() {
        return qtdDep;
   }

   public void setQtdDep(BigDecimal qtdDep) {
        this.qtdDep = qtdDep;
   }

   public BigDecimal getIdIprocPa() {
        return idIprocPa;
   }

   public void setIdIprocPa(BigDecimal idIprocPa) {
        this.idIprocPa = idIprocPa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePi() {
        return controlePi;
   }

   public void setControlePi(String controlePi) {
        this.controlePi = controlePi;
   }

   public BigDecimal getCodProdPi() {
        return codProdPi;
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        this.codProdPi = codProdPi;
   }

   @Override
   public String getTableName() {
        return "TPRIDEP";
   }

   @Override
   public String getEntityName() {
        return "DependenciaEntreOps";
   }

   @Override
   public DependenciaEntreOps fromVO(DynamicVO vo) {
        this.referenciaPi = vo.asString("REFERENCIAPI");
        this.referenciaPa = vo.asString("REFERENCIAPA");
        this.idIprocPi = vo.asBigDecimal("IDIPROCPI");
        this.controlePa = vo.asString("CONTROLEPA");
        this.dhInc = vo.asTimestamp("DHINC");
        this.qtdDep = vo.asBigDecimal("QTDDEP");
        this.idIprocPa = vo.asBigDecimal("IDIPROCPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePi = vo.asString("CONTROLEPI");
        this.codProdPi = vo.asBigDecimal("CODPRODPI");
        return this;
   }
}
