package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ModuloAdicional implements SankhyaEntity<ModuloAdicional> {

   private BigDecimal codModulo;
   private String descrModulo;
   private String resourceId;

   public BigDecimal getCodModulo() {
        return codModulo;
   }

   public void setCodModulo(BigDecimal codModulo) {
        this.codModulo = codModulo;
   }

   public String getDescrModulo() {
        return descrModulo;
   }

   public void setDescrModulo(String descrModulo) {
        this.descrModulo = descrModulo;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
   }

   @Override
   public String getEntityName() {
        return "ModuloAdicional";
   }

   @Override
   public ModuloAdicional fromVO(DynamicVO vo) {
        this.codModulo = vo.asBigDecimal("CODMODULO");
        this.descrModulo = vo.asString("DESCRMODULO");
        this.resourceId = vo.asString("RESOURCEID");
        return this;
   }
}
