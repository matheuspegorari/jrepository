package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComponenteManufaturaPA extends AbstractSankhyaEntity<ComponenteManufaturaPA> {
   public BigDecimal getCodCpm() {
        return this.getVo().asBigDecimal("CODCPM");
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getQtdComp() {
        return this.getVo().asBigDecimal("QTDCOMP");
   }

   public void setQtdComp(BigDecimal qtdComp) {
        markAsChanged("QTDCOMP", qtdComp);
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
        this.setVo(vo);
        return this;
   }
}
