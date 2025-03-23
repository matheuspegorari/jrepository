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
        markAsChanged("REFERENCIAPI", referenciaPi);
        this.referenciaPi = referenciaPi;
   }

   public String getReferenciaPa() {
        return referenciaPa;
   }

   public void setReferenciaPa(String referenciaPa) {
        markAsChanged("REFERENCIAPA", referenciaPa);
        this.referenciaPa = referenciaPa;
   }

   public BigDecimal getIdIprocPi() {
        return idIprocPi;
   }

   public void setIdIprocPi(BigDecimal idIprocPi) {
        markAsChanged("IDIPROCPI", idIprocPi);
        this.idIprocPi = idIprocPi;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
        this.dhInc = dhInc;
   }

   public BigDecimal getQtdDep() {
        return qtdDep;
   }

   public void setQtdDep(BigDecimal qtdDep) {
        markAsChanged("QTDDEP", qtdDep);
        this.qtdDep = qtdDep;
   }

   public BigDecimal getIdIprocPa() {
        return idIprocPa;
   }

   public void setIdIprocPa(BigDecimal idIprocPa) {
        markAsChanged("IDIPROCPA", idIprocPa);
        this.idIprocPa = idIprocPa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getControlePi() {
        return controlePi;
   }

   public void setControlePi(String controlePi) {
        markAsChanged("CONTROLEPI", controlePi);
        this.controlePi = controlePi;
   }

   public BigDecimal getCodProdPi() {
        return codProdPi;
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        markAsChanged("CODPRODPI", codProdPi);
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
        this.setVo(vo);
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
