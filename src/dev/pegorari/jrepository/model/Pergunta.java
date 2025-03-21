package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Pergunta extends AbstractSankhyaEntity<Pergunta> {
   private String aceitaObservacao;
   private BigDecimal codGrupoPerg;
   private BigDecimal codPerg;
   private BigDecimal codPergTab;
   private BigDecimal codUsu;
   private String descrPerg;
   private Timestamp dhAlter;
   private String instrucaoAplicador;
   private BigDecimal nroTentativas;
   private String obrigatoria;
   private BigDecimal ordemTab;
   private String permiteAnexo;
   private BigDecimal qtdMaxEscolhas;
   private BigDecimal qtdMaxLinhas;
   private BigDecimal tempoParaResposta;
   private String tipo;
   private String permiteFiltrar;

   public String getAceitaObservacao() {
        return aceitaObservacao;
   }

   public void setAceitaObservacao(String aceitaObservacao) {
        markAsChanged("ACEITAOBSERVACAO", aceitaObservacao);
        this.aceitaObservacao = aceitaObservacao;
   }

   public BigDecimal getCodGrupoPerg() {
        return codGrupoPerg;
   }

   public void setCodGrupoPerg(BigDecimal codGrupoPerg) {
        markAsChanged("CODGRUPOPERG", codGrupoPerg);
        this.codGrupoPerg = codGrupoPerg;
   }

   public BigDecimal getCodPerg() {
        return codPerg;
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
        this.codPerg = codPerg;
   }

   public BigDecimal getCodPergTab() {
        return codPergTab;
   }

   public void setCodPergTab(BigDecimal codPergTab) {
        markAsChanged("CODPERGTAB", codPergTab);
        this.codPergTab = codPergTab;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescrPerg() {
        return descrPerg;
   }

   public void setDescrPerg(String descrPerg) {
        markAsChanged("DESCRPERG", descrPerg);
        this.descrPerg = descrPerg;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getInstrucaoAplicador() {
        return instrucaoAplicador;
   }

   public void setInstrucaoAplicador(String instrucaoAplicador) {
        markAsChanged("INSTRUCAOAPLICADOR", instrucaoAplicador);
        this.instrucaoAplicador = instrucaoAplicador;
   }

   public BigDecimal getNroTentativas() {
        return nroTentativas;
   }

   public void setNroTentativas(BigDecimal nroTentativas) {
        markAsChanged("NROTENTATIVAS", nroTentativas);
        this.nroTentativas = nroTentativas;
   }

   public String getObrigatoria() {
        return obrigatoria;
   }

   public void setObrigatoria(String obrigatoria) {
        markAsChanged("OBRIGATORIA", obrigatoria);
        this.obrigatoria = obrigatoria;
   }

   public BigDecimal getOrdemTab() {
        return ordemTab;
   }

   public void setOrdemTab(BigDecimal ordemTab) {
        markAsChanged("ORDEMTAB", ordemTab);
        this.ordemTab = ordemTab;
   }

   public String getPermiteAnexo() {
        return permiteAnexo;
   }

   public void setPermiteAnexo(String permiteAnexo) {
        markAsChanged("PERMITEANEXO", permiteAnexo);
        this.permiteAnexo = permiteAnexo;
   }

   public BigDecimal getQtdMaxEscolhas() {
        return qtdMaxEscolhas;
   }

   public void setQtdMaxEscolhas(BigDecimal qtdMaxEscolhas) {
        markAsChanged("QTDMAXESCOLHAS", qtdMaxEscolhas);
        this.qtdMaxEscolhas = qtdMaxEscolhas;
   }

   public BigDecimal getQtdMaxLinhas() {
        return qtdMaxLinhas;
   }

   public void setQtdMaxLinhas(BigDecimal qtdMaxLinhas) {
        markAsChanged("QTDMAXLINHAS", qtdMaxLinhas);
        this.qtdMaxLinhas = qtdMaxLinhas;
   }

   public BigDecimal getTempoParaResposta() {
        return tempoParaResposta;
   }

   public void setTempoParaResposta(BigDecimal tempoParaResposta) {
        markAsChanged("TEMPOPARARESPOSTA", tempoParaResposta);
        this.tempoParaResposta = tempoParaResposta;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getPermiteFiltrar() {
        return permiteFiltrar;
   }

   public void setPermiteFiltrar(String permiteFiltrar) {
        markAsChanged("PERMITEFILTRAR", permiteFiltrar);
        this.permiteFiltrar = permiteFiltrar;
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
        this.setOriginalVO(vo);
        this.aceitaObservacao = vo.asString("ACEITAOBSERVACAO");
        this.codGrupoPerg = vo.asBigDecimal("CODGRUPOPERG");
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.codPergTab = vo.asBigDecimal("CODPERGTAB");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrPerg = vo.asString("DESCRPERG");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.instrucaoAplicador = vo.asString("INSTRUCAOAPLICADOR");
        this.nroTentativas = vo.asBigDecimal("NROTENTATIVAS");
        this.obrigatoria = vo.asString("OBRIGATORIA");
        this.ordemTab = vo.asBigDecimal("ORDEMTAB");
        this.permiteAnexo = vo.asString("PERMITEANEXO");
        this.qtdMaxEscolhas = vo.asBigDecimal("QTDMAXESCOLHAS");
        this.qtdMaxLinhas = vo.asBigDecimal("QTDMAXLINHAS");
        this.tempoParaResposta = vo.asBigDecimal("TEMPOPARARESPOSTA");
        this.tipo = vo.asString("TIPO");
        this.permiteFiltrar = vo.asString("PERMITEFILTRAR");
        return this;
   }
}
