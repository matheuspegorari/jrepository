package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioElemento extends AbstractSankhyaEntity<FormularioElemento> {
   private BigDecimal ideFx;
   private BigDecimal idForm;
   private String obrigatorio;
   private BigDecimal ordem;
   private String tipoAcesso;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdForm() {
        return idForm;
   }

   public void setIdForm(BigDecimal idForm) {
        this.idForm = idForm;
   }

   public String getObrigatorio() {
        return obrigatorio;
   }

   public void setObrigatorio(String obrigatorio) {
        this.obrigatorio = obrigatorio;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getTipoAcesso() {
        return tipoAcesso;
   }

   public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
   }

   @Override
   public String getTableName() {
        return "TPRFRME";
   }

   @Override
   public String getEntityName() {
        return "FormularioElemento";
   }

   @Override
   public FormularioElemento fromVO(DynamicVO vo) {
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.idForm = vo.asBigDecimal("IDFORM");
        this.obrigatorio = vo.asString("OBRIGATORIO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.tipoAcesso = vo.asString("TIPOACESSO");
        return this;
   }
}
