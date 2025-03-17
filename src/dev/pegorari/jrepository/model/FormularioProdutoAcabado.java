package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioProdutoAcabado extends AbstractSankhyaEntity<FormularioProdutoAcabado> {
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal idForm;
   private BigDecimal idProc;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getIdForm() {
        return idForm;
   }

   public void setIdForm(BigDecimal idForm) {
        this.idForm = idForm;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
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
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.idForm = vo.asBigDecimal("IDFORM");
        this.idProc = vo.asBigDecimal("IDPROC");
        return this;
   }
}
