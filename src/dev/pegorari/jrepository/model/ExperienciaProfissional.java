package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExperienciaProfissional extends AbstractSankhyaEntity<ExperienciaProfissional> {
   public String getAtual() {
        return this.getVo().asString("ATUAL");
   }

   public void setAtual(String atual) {
        markAsChanged("ATUAL", atual);
   }

   public String getBairro() {
        return this.getVo().asString("BAIRRO");
   }

   public void setBairro(String bairro) {
        markAsChanged("BAIRRO", bairro);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCidade() {
        return this.getVo().asString("CIDADE");
   }

   public void setCidade(String cidade) {
        markAsChanged("CIDADE", cidade);
   }

   public String getComplEnd() {
        return this.getVo().asString("COMPLEND");
   }

   public void setComplEnd(String complEnd) {
        markAsChanged("COMPLEND", complEnd);
   }

   public Timestamp getDataDm() {
        return this.getVo().asTimestamp("DATADM");
   }

   public void setDataDm(Timestamp dataDm) {
        markAsChanged("DATADM", dataDm);
   }

   public Timestamp getDataDem() {
        return this.getVo().asTimestamp("DATDEM");
   }

   public void setDataDem(Timestamp dataDem) {
        markAsChanged("DATDEM", dataDem);
   }

   public String getDescAtividades() {
        return this.getVo().asString("DESCRATIVIDADES");
   }

   public void setDescAtividades(String descAtividades) {
        markAsChanged("DESCRATIVIDADES", descAtividades);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getFaixaSalarialFinal() {
        return this.getVo().asBigDecimal("FAIXASALARIALFINAL");
   }

   public void setFaixaSalarialFinal(BigDecimal faixaSalarialFinal) {
        markAsChanged("FAIXASALARIALFINAL", faixaSalarialFinal);
   }

   public BigDecimal getFaixaSalarialInicial() {
        return this.getVo().asBigDecimal("FAIXASALARIALINICIAL");
   }

   public void setFaixaSalarialInicial(BigDecimal faixaSalarialInicial) {
        markAsChanged("FAIXASALARIALINICIAL", faixaSalarialInicial);
   }

   public String getNomeEmpresa() {
        return this.getVo().asString("NOMEEMPRESA");
   }

   public void setNomeEmpresa(String nomeEmpresa) {
        markAsChanged("NOMEEMPRESA", nomeEmpresa);
   }

   public String getNomeEnd() {
        return this.getVo().asString("NOMEEND");
   }

   public void setNomeEnd(String nomeEnd) {
        markAsChanged("NOMEEND", nomeEnd);
   }

   public BigDecimal getNuCurriculo() {
        return this.getVo().asBigDecimal("NUCURRICULO");
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTipoEmpresa() {
        return this.getVo().asString("TIPOEMPRESA");
   }

   public void setTipoEmpresa(String tipoEmpresa) {
        markAsChanged("TIPOEMPRESA", tipoEmpresa);
   }

   public String getTipoEnd() {
        return this.getVo().asString("TIPOEND");
   }

   public void setTipoEnd(String tipoEnd) {
        markAsChanged("TIPOEND", tipoEnd);
   }

   public String getUf() {
        return this.getVo().asString("UF");
   }

   public void setUf(String uf) {
        markAsChanged("UF", uf);
   }

   public String getUltCargoOcupado() {
        return this.getVo().asString("ULTCARGOOCUPADO");
   }

   public void setUltCargoOcupado(String ultCargoOcupado) {
        markAsChanged("ULTCARGOOCUPADO", ultCargoOcupado);
   }

   public BigDecimal getUltSalario() {
        return this.getVo().asBigDecimal("ULTSALARIO");
   }

   public void setUltSalario(BigDecimal ultSalario) {
        markAsChanged("ULTSALARIO", ultSalario);
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
        this.setVo(vo);
        return this;
   }
}
