package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComponenteManufaturaPA extends AbstractSankhyaEntity<ComponenteManufaturaPA> {
   private BigDecimal codCpm;
   private BigDecimal codProd;
   private BigDecimal qtdComp;

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        this.codCpm = codCpm;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getQtdComp() {
        return qtdComp;
   }

   public void setQtdComp(BigDecimal qtdComp) {
        this.qtdComp = qtdComp;
   }

   @Override
   public String getTableName() {
        return "TPRCPMP";
   }

   @Override
   public String getEntityName() {
        return "ComponenteManufaturaPA";
   }

   @Override
   public ComponenteManufaturaPA fromVO(DynamicVO vo) {
        this.codCpm = vo.asBigDecimal("CODCPM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.qtdComp = vo.asBigDecimal("QTDCOMP");
        return this;
   }
}
