package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Pergunta extends AbstractSankhyaEntity<Pergunta> {
   public String getAceitaObservacao() {
        return this.getVo().asString("ACEITAOBSERVACAO");
   }

   public void setAceitaObservacao(String aceitaObservacao) {
        markAsChanged("ACEITAOBSERVACAO", aceitaObservacao);
   }

   public BigDecimal getCodGrupoPerg() {
        return this.getVo().asBigDecimal("CODGRUPOPERG");
   }

   public void setCodGrupoPerg(BigDecimal codGrupoPerg) {
        markAsChanged("CODGRUPOPERG", codGrupoPerg);
   }

   public BigDecimal getCodPerg() {
        return this.getVo().asBigDecimal("CODPERG");
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
   }

   public BigDecimal getCodPergTab() {
        return this.getVo().asBigDecimal("CODPERGTAB");
   }

   public void setCodPergTab(BigDecimal codPergTab) {
        markAsChanged("CODPERGTAB", codPergTab);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrPerg() {
        return this.getVo().asString("DESCRPERG");
   }

   public void setDescrPerg(String descrPerg) {
        markAsChanged("DESCRPERG", descrPerg);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getInstrucaoAplicador() {
        return this.getVo().asString("INSTRUCAOAPLICADOR");
   }

   public void setInstrucaoAplicador(String instrucaoAplicador) {
        markAsChanged("INSTRUCAOAPLICADOR", instrucaoAplicador);
   }

   public BigDecimal getNroTentativas() {
        return this.getVo().asBigDecimal("NROTENTATIVAS");
   }

   public void setNroTentativas(BigDecimal nroTentativas) {
        markAsChanged("NROTENTATIVAS", nroTentativas);
   }

   public String getObrigatoria() {
        return this.getVo().asString("OBRIGATORIA");
   }

   public void setObrigatoria(String obrigatoria) {
        markAsChanged("OBRIGATORIA", obrigatoria);
   }

   public BigDecimal getOrdemTab() {
        return this.getVo().asBigDecimal("ORDEMTAB");
   }

   public void setOrdemTab(BigDecimal ordemTab) {
        markAsChanged("ORDEMTAB", ordemTab);
   }

   public String getPermiteAnexo() {
        return this.getVo().asString("PERMITEANEXO");
   }

   public void setPermiteAnexo(String permiteAnexo) {
        markAsChanged("PERMITEANEXO", permiteAnexo);
   }

   public BigDecimal getQtdMaxEscolhas() {
        return this.getVo().asBigDecimal("QTDMAXESCOLHAS");
   }

   public void setQtdMaxEscolhas(BigDecimal qtdMaxEscolhas) {
        markAsChanged("QTDMAXESCOLHAS", qtdMaxEscolhas);
   }

   public BigDecimal getQtdMaxLinhas() {
        return this.getVo().asBigDecimal("QTDMAXLINHAS");
   }

   public void setQtdMaxLinhas(BigDecimal qtdMaxLinhas) {
        markAsChanged("QTDMAXLINHAS", qtdMaxLinhas);
   }

   public BigDecimal getTempoParaResposta() {
        return this.getVo().asBigDecimal("TEMPOPARARESPOSTA");
   }

   public void setTempoParaResposta(BigDecimal tempoParaResposta) {
        markAsChanged("TEMPOPARARESPOSTA", tempoParaResposta);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getPermiteFiltrar() {
        return this.getVo().asString("PERMITEFILTRAR");
   }

   public void setPermiteFiltrar(String permiteFiltrar) {
        markAsChanged("PERMITEFILTRAR", permiteFiltrar);
   }

   @Override
   public String getTableName() {
        return "TPQPER";
   }

   @Override
   public String getEntityName() {
        return "Pergunta";
   }

   @Override
   public Pergunta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
