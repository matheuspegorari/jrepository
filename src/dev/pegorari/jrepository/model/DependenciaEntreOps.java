package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DependenciaEntreOps extends AbstractSankhyaEntity<DependenciaEntreOps> {
   public String getReferenciaPi() {
        return this.getVo().asString("REFERENCIAPI");
   }

   public void setReferenciaPi(String referenciaPi) {
        markAsChanged("REFERENCIAPI", referenciaPi);
   }

   public String getReferenciaPa() {
        return this.getVo().asString("REFERENCIAPA");
   }

   public void setReferenciaPa(String referenciaPa) {
        markAsChanged("REFERENCIAPA", referenciaPa);
   }

   public BigDecimal getIdIprocPi() {
        return this.getVo().asBigDecimal("IDIPROCPI");
   }

   public void setIdIprocPi(BigDecimal idIprocPi) {
        markAsChanged("IDIPROCPI", idIprocPi);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public BigDecimal getQtdDep() {
        return this.getVo().asBigDecimal("QTDDEP");
   }

   public void setQtdDep(BigDecimal qtdDep) {
        markAsChanged("QTDDEP", qtdDep);
   }

   public BigDecimal getIdIprocPa() {
        return this.getVo().asBigDecimal("IDIPROCPA");
   }

   public void setIdIprocPa(BigDecimal idIprocPa) {
        markAsChanged("IDIPROCPA", idIprocPa);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePi() {
        return this.getVo().asString("CONTROLEPI");
   }

   public void setControlePi(String controlePi) {
        markAsChanged("CONTROLEPI", controlePi);
   }

   public BigDecimal getCodProdPi() {
        return this.getVo().asBigDecimal("CODPRODPI");
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        markAsChanged("CODPRODPI", codProdPi);
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
        return this;
   }
}
