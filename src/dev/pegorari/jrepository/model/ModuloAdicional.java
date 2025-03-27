package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ModuloAdicional extends AbstractSankhyaEntity<ModuloAdicional> {
   public BigDecimal getCodModulo() {
        return this.getVo().asBigDecimal("CODMODULO");
   }

   public void setCodModulo(BigDecimal codModulo) {
        markAsChanged("CODMODULO", codModulo);
   }

   public String getDescrModulo() {
        return this.getVo().asString("DESCRMODULO");
   }

   public void setDescrModulo(String descrModulo) {
        markAsChanged("DESCRMODULO", descrModulo);
   }

   public String getResourceId() {
        return this.getVo().asString("RESOURCEID");
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
   }

   @Override
   public String getTableName() {
        return "TSIMOD";
   }

   @Override
   public String getEntityName() {
        return "ModuloAdicional";
   }

   @Override
   public ModuloAdicional fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
