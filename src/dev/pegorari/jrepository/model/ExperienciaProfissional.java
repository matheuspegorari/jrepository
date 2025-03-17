package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExperienciaProfissional extends AbstractSankhyaEntity<ExperienciaProfissional> {
   private String atual;
   private String bairro;
   private String cep;
   private String cidade;
   private String complEnd;
   private Timestamp dataDm;
   private Timestamp dataDem;
   private String descAtividades;
   private String email;
   private BigDecimal faixaSalarialFinal;
   private BigDecimal faixaSalarialInicial;
   private String nomeEmpresa;
   private String nomeEnd;
   private BigDecimal nuCurriculo;
   private String numEnd;
   private BigDecimal sequencia;
   private String telefone;
   private String tipoEmpresa;
   private String tipoEnd;
   private String uf;
   private String ultCargoOcupado;
   private BigDecimal ultSalario;

   public String getAtual() {
        return atual;
   }

   public void setAtual(String atual) {
        this.atual = atual;
   }

   public String getBairro() {
        return bairro;
   }

   public void setBairro(String bairro) {
        this.bairro = bairro;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public String getCidade() {
        return cidade;
   }

   public void setCidade(String cidade) {
        this.cidade = cidade;
   }

   public String getComplEnd() {
        return complEnd;
   }

   public void setComplEnd(String complEnd) {
        this.complEnd = complEnd;
   }

   public Timestamp getDataDm() {
        return dataDm;
   }

   public void setDataDm(Timestamp dataDm) {
        this.dataDm = dataDm;
   }

   public Timestamp getDataDem() {
        return dataDem;
   }

   public void setDataDem(Timestamp dataDem) {
        this.dataDem = dataDem;
   }

   public String getDescAtividades() {
        return descAtividades;
   }

   public void setDescAtividades(String descAtividades) {
        this.descAtividades = descAtividades;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public BigDecimal getFaixaSalarialFinal() {
        return faixaSalarialFinal;
   }

   public void setFaixaSalarialFinal(BigDecimal faixaSalarialFinal) {
        this.faixaSalarialFinal = faixaSalarialFinal;
   }

   public BigDecimal getFaixaSalarialInicial() {
        return faixaSalarialInicial;
   }

   public void setFaixaSalarialInicial(BigDecimal faixaSalarialInicial) {
        this.faixaSalarialInicial = faixaSalarialInicial;
   }

   public String getNomeEmpresa() {
        return nomeEmpresa;
   }

   public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
   }

   public String getNomeEnd() {
        return nomeEnd;
   }

   public void setNomeEnd(String nomeEnd) {
        this.nomeEnd = nomeEnd;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        this.nuCurriculo = nuCurriculo;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
   }

   public String getTipoEmpresa() {
        return tipoEmpresa;
   }

   public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
   }

   public String getTipoEnd() {
        return tipoEnd;
   }

   public void setTipoEnd(String tipoEnd) {
        this.tipoEnd = tipoEnd;
   }

   public String getUf() {
        return uf;
   }

   public void setUf(String uf) {
        this.uf = uf;
   }

   public String getUltCargoOcupado() {
        return ultCargoOcupado;
   }

   public void setUltCargoOcupado(String ultCargoOcupado) {
        this.ultCargoOcupado = ultCargoOcupado;
   }

   public BigDecimal getUltSalario() {
        return ultSalario;
   }

   public void setUltSalario(BigDecimal ultSalario) {
        this.ultSalario = ultSalario;
   }

   @Override
   public String getTableName() {
        return "TFCEXP";
   }

   @Override
   public String getEntityName() {
        return "ExperienciaProfissional";
   }

   @Override
   public ExperienciaProfissional fromVO(DynamicVO vo) {
        this.atual = vo.asString("ATUAL");
        this.bairro = vo.asString("BAIRRO");
        this.cep = vo.asString("CEP");
        this.cidade = vo.asString("CIDADE");
        this.complEnd = vo.asString("COMPLEND");
        this.dataDm = vo.asTimestamp("DATADM");
        this.dataDem = vo.asTimestamp("DATDEM");
        this.descAtividades = vo.asString("DESCRATIVIDADES");
        this.email = vo.asString("EMAIL");
        this.faixaSalarialFinal = vo.asBigDecimal("FAIXASALARIALFINAL");
        this.faixaSalarialInicial = vo.asBigDecimal("FAIXASALARIALINICIAL");
        this.nomeEmpresa = vo.asString("NOMEEMPRESA");
        this.nomeEnd = vo.asString("NOMEEND");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.numEnd = vo.asString("NUMEND");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.telefone = vo.asString("TELEFONE");
        this.tipoEmpresa = vo.asString("TIPOEMPRESA");
        this.tipoEnd = vo.asString("TIPOEND");
        this.uf = vo.asString("UF");
        this.ultCargoOcupado = vo.asString("ULTCARGOOCUPADO");
        this.ultSalario = vo.asBigDecimal("ULTSALARIO");
        return this;
   }
}
