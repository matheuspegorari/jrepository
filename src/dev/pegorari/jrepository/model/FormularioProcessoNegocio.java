package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormularioProcessoNegocio extends AbstractSankhyaEntity<FormularioProcessoNegocio> {
   public String getCardinalidade() {
        return this.getVo().asString("CARDINALIDADE");
   }

   public void setCardinalidade(String cardinalidade) {
        markAsChanged("CARDINALIDADE", cardinalidade);
   }

   public char[] getConfigCampos() {
        return this.getVo().asClob("CONFIGCAMPOS");
   }

   public void setConfigCampos(char[] configCampos) {
        markAsChanged("CONFIGCAMPOS", configCampos);
   }

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

   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public BigDecimal getNuEle() {
        return this.getVo().asBigDecimal("NUELE");
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
   }

   public BigDecimal getNuForm() {
        return this.getVo().asBigDecimal("NUFORM");
   }

   public void setNuForm(BigDecimal nuForm) {
        markAsChanged("NUFORM", nuForm);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getPoliticaReetrancia() {
        return this.getVo().asString("POLITICAREETRANCIA");
   }

   public void setPoliticaReetrancia(String politicaReetrancia) {
        markAsChanged("POLITICAREETRANCIA", politicaReetrancia);
   }

   public BigDecimal getNuFormPai() {
        return this.getVo().asBigDecimal("NUFORMPAI");
   }

   public void setNuFormPai(BigDecimal nuFormPai) {
        markAsChanged("NUFORMPAI", nuFormPai);
   }

   public String getOrdemAbas() {
        return this.getVo().asString("ORDEMABAS");
   }

   public void setOrdemAbas(String ordemAbas) {
        markAsChanged("ORDEMABAS", ordemAbas);
   }

   public String getSalvarDestino() {
        return this.getVo().asString("SALVARDESTINO");
   }

   public void setSalvarDestino(String salvarDestino) {
        markAsChanged("SALVARDESTINO", salvarDestino);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getUtilizaTarefa() {
        return this.getVo().asString("UTILIZATAREFA");
   }

   public void setUtilizaTarefa(String utilizaTarefa) {
        markAsChanged("UTILIZATAREFA", utilizaTarefa);
   }

   public String getSalvarFinalProcesso() {
        return this.getVo().asString("SALVARFINALPROCESSO");
   }

   public void setSalvarFinalProcesso(String salvarFinalProcesso) {
        markAsChanged("SALVARFINALPROCESSO", salvarFinalProcesso);
   }

   @Override
   public String getTableName() {
        return "TWFFORM";
   }

   @Override
   public String getEntityName() {
        return "FormularioProcessoNegocio";
   }

   @Override
   public FormularioProcessoNegocio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
