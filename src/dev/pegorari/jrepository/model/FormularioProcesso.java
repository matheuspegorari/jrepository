package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioProcesso extends AbstractSankhyaEntity<FormularioProcesso> {
   private String descricao;
   private String escopo;
   private BigDecimal idForm;
   private BigDecimal idProc;
   private String nomeInstanciaRef;
   private String obrigatorioInicia;
   private BigDecimal ordemInicia;
   private String tipoForm;
   private String cardinalidade;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getEscopo() {
        return escopo;
   }

   public void setEscopo(String escopo) {
        markAsChanged("ESCOPO", escopo);
        this.escopo = escopo;
   }

   public BigDecimal getIdForm() {
        return idForm;
   }

   public void setIdForm(BigDecimal idForm) {
        markAsChanged("IDFORM", idForm);
        this.idForm = idForm;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public String getNomeInstanciaRef() {
        return nomeInstanciaRef;
   }

   public void setNomeInstanciaRef(String nomeInstanciaRef) {
        markAsChanged("NOMEINSTANCIAREF", nomeInstanciaRef);
        this.nomeInstanciaRef = nomeInstanciaRef;
   }

   public String getObrigatorioInicia() {
        return obrigatorioInicia;
   }

   public void setObrigatorioInicia(String obrigatorioInicia) {
        markAsChanged("OBRIGATORIOINICIA", obrigatorioInicia);
        this.obrigatorioInicia = obrigatorioInicia;
   }

   public BigDecimal getOrdemInicia() {
        return ordemInicia;
   }

   public void setOrdemInicia(BigDecimal ordemInicia) {
        markAsChanged("ORDEMINICIA", ordemInicia);
        this.ordemInicia = ordemInicia;
   }

   public String getTipoForm() {
        return tipoForm;
   }

   public void setTipoForm(String tipoForm) {
        markAsChanged("TIPOFORM", tipoForm);
        this.tipoForm = tipoForm;
   }

   public String getCardinalidade() {
        return cardinalidade;
   }

   public void setCardinalidade(String cardinalidade) {
        markAsChanged("CARDINALIDADE", cardinalidade);
        this.cardinalidade = cardinalidade;
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
        this.descricao = vo.asString("DESCRICAO");
        this.escopo = vo.asString("ESCOPO");
        this.idForm = vo.asBigDecimal("IDFORM");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.nomeInstanciaRef = vo.asString("NOMEINSTANCIAREF");
        this.obrigatorioInicia = vo.asString("OBRIGATORIOINICIA");
        this.ordemInicia = vo.asBigDecimal("ORDEMINICIA");
        this.tipoForm = vo.asString("TIPOFORM");
        this.cardinalidade = vo.asString("CARDINALIDADE");
        return this;
   }
}
