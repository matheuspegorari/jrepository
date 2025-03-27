package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioProcesso extends AbstractSankhyaEntity<FormularioProcesso> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getEscopo() {
        return this.getVo().asString("ESCOPO");
   }

   public void setEscopo(String escopo) {
        markAsChanged("ESCOPO", escopo);
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

   public String getNomeInstanciaRef() {
        return this.getVo().asString("NOMEINSTANCIAREF");
   }

   public void setNomeInstanciaRef(String nomeInstanciaRef) {
        markAsChanged("NOMEINSTANCIAREF", nomeInstanciaRef);
   }

   public String getObrigatorioInicia() {
        return this.getVo().asString("OBRIGATORIOINICIA");
   }

   public void setObrigatorioInicia(String obrigatorioInicia) {
        markAsChanged("OBRIGATORIOINICIA", obrigatorioInicia);
   }

   public BigDecimal getOrdemInicia() {
        return this.getVo().asBigDecimal("ORDEMINICIA");
   }

   public void setOrdemInicia(BigDecimal ordemInicia) {
        markAsChanged("ORDEMINICIA", ordemInicia);
   }

   public String getTipoForm() {
        return this.getVo().asString("TIPOFORM");
   }

   public void setTipoForm(String tipoForm) {
        markAsChanged("TIPOFORM", tipoForm);
   }

   public String getCardinalidade() {
        return this.getVo().asString("CARDINALIDADE");
   }

   public void setCardinalidade(String cardinalidade) {
        markAsChanged("CARDINALIDADE", cardinalidade);
   }

   @Override
   public String getTableName() {
        return "TPRFORM";
   }

   @Override
   public String getEntityName() {
        return "FormularioProcesso";
   }

   @Override
   public FormularioProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
