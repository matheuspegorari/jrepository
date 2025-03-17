package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FormularioProcesso implements SankhyaEntity<FormularioProcesso> {

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
        this.descricao = descricao;
   }

   public String getEscopo() {
        return escopo;
   }

   public void setEscopo(String escopo) {
        this.escopo = escopo;
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

   public String getNomeInstanciaRef() {
        return nomeInstanciaRef;
   }

   public void setNomeInstanciaRef(String nomeInstanciaRef) {
        this.nomeInstanciaRef = nomeInstanciaRef;
   }

   public String getObrigatorioInicia() {
        return obrigatorioInicia;
   }

   public void setObrigatorioInicia(String obrigatorioInicia) {
        this.obrigatorioInicia = obrigatorioInicia;
   }

   public BigDecimal getOrdemInicia() {
        return ordemInicia;
   }

   public void setOrdemInicia(BigDecimal ordemInicia) {
        this.ordemInicia = ordemInicia;
   }

   public String getTipoForm() {
        return tipoForm;
   }

   public void setTipoForm(String tipoForm) {
        this.tipoForm = tipoForm;
   }

   public String getCardinalidade() {
        return cardinalidade;
   }

   public void setCardinalidade(String cardinalidade) {
        this.cardinalidade = cardinalidade;
   }

   @Override
   public String getEntityName() {
        return "FormularioProcesso";
   }

   @Override
   public FormularioProcesso fromVO(DynamicVO vo) {
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
