package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioProdutoAcabado extends AbstractSankhyaEntity<FormularioProdutoAcabado> {
   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdForm() {
        return this.getVo().asBigDecimal("IDFORM");
   }

   public void setIdForm(BigDecimal idForm) {
        markAsChanged("IDFORM", idForm);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   @Override
   public String getTableName() {
        return "TPRFPA";
   }

   @Override
   public String getEntityName() {
        return "FormularioProdutoAcabado";
   }

   @Override
   public FormularioProdutoAcabado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
