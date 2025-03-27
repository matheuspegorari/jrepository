package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioElemento extends AbstractSankhyaEntity<FormularioElemento> {
   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdForm() {
        return this.getVo().asBigDecimal("IDFORM");
   }

   public void setIdForm(BigDecimal idForm) {
        markAsChanged("IDFORM", idForm);
   }

   public String getObrigatorio() {
        return this.getVo().asString("OBRIGATORIO");
   }

   public void setObrigatorio(String obrigatorio) {
        markAsChanged("OBRIGATORIO", obrigatorio);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getTipoAcesso() {
        return this.getVo().asString("TIPOACESSO");
   }

   public void setTipoAcesso(String tipoAcesso) {
        markAsChanged("TIPOACESSO", tipoAcesso);
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
        this.setVo(vo);
        return this;
   }
}
