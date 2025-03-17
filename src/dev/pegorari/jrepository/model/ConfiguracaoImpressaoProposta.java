package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoImpressaoProposta extends AbstractSankhyaEntity<ConfiguracaoImpressaoProposta> {
   private String caminhoArqImp;
   private String cargoContato;
   private String cargoVendedor;
   private String celularVendedor;
   private BigDecimal codContato;
   private BigDecimal codParc;
   private BigDecimal codVend;
   private String deptoContato;
   private String emailContato;
   private String emailVendedor;
   private String impresso;
   private String logoParc;
   private String modalidadeReposicao;
   private String modalidadeSuporte;
   private String nomeContato;
   private String nomeParc;
   private String nomeVendedor;
   private BigDecimal nroImpressao;
   private BigDecimal nuProjeto;
   private BigDecimal prazoEntrega;
   private BigDecimal prazoGarantia;
   private BigDecimal prazoInstalacao;
   private BigDecimal prazoPagamento;
   private BigDecimal prazoSuporte;
   private String resumoObjeto;
   private String telefoneContato;
   private String telefoneVendedor;
   private char[] textoObjeto;
   private char[] textoObs;
   private char[] textoTreinamento;
   private String versaoProjeto;

   public String getCaminhoArqImp() {
        return caminhoArqImp;
   }

   public void setCaminhoArqImp(String caminhoArqImp) {
        this.caminhoArqImp = caminhoArqImp;
   }

   public String getCargoContato() {
        return cargoContato;
   }

   public void setCargoContato(String cargoContato) {
        this.cargoContato = cargoContato;
   }

   public String getCargoVendedor() {
        return cargoVendedor;
   }

   public void setCargoVendedor(String cargoVendedor) {
        this.cargoVendedor = cargoVendedor;
   }

   public String getCelularVendedor() {
        return celularVendedor;
   }

   public void setCelularVendedor(String celularVendedor) {
        this.celularVendedor = celularVendedor;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public String getDeptoContato() {
        return deptoContato;
   }

   public void setDeptoContato(String deptoContato) {
        this.deptoContato = deptoContato;
   }

   public String getEmailContato() {
        return emailContato;
   }

   public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
   }

   public String getEmailVendedor() {
        return emailVendedor;
   }

   public void setEmailVendedor(String emailVendedor) {
        this.emailVendedor = emailVendedor;
   }

   public String getImpresso() {
        return impresso;
   }

   public void setImpresso(String impresso) {
        this.impresso = impresso;
   }

   public String getLogoParc() {
        return logoParc;
   }

   public void setLogoParc(String logoParc) {
        this.logoParc = logoParc;
   }

   public String getModalidadeReposicao() {
        return modalidadeReposicao;
   }

   public void setModalidadeReposicao(String modalidadeReposicao) {
        this.modalidadeReposicao = modalidadeReposicao;
   }

   public String getModalidadeSuporte() {
        return modalidadeSuporte;
   }

   public void setModalidadeSuporte(String modalidadeSuporte) {
        this.modalidadeSuporte = modalidadeSuporte;
   }

   public String getNomeContato() {
        return nomeContato;
   }

   public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        this.nomeParc = nomeParc;
   }

   public String getNomeVendedor() {
        return nomeVendedor;
   }

   public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
   }

   public BigDecimal getNroImpressao() {
        return nroImpressao;
   }

   public void setNroImpressao(BigDecimal nroImpressao) {
        this.nroImpressao = nroImpressao;
   }

   public BigDecimal getNuProjeto() {
        return nuProjeto;
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        this.nuProjeto = nuProjeto;
   }

   public BigDecimal getPrazoEntrega() {
        return prazoEntrega;
   }

   public void setPrazoEntrega(BigDecimal prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
   }

   public BigDecimal getPrazoGarantia() {
        return prazoGarantia;
   }

   public void setPrazoGarantia(BigDecimal prazoGarantia) {
        this.prazoGarantia = prazoGarantia;
   }

   public BigDecimal getPrazoInstalacao() {
        return prazoInstalacao;
   }

   public void setPrazoInstalacao(BigDecimal prazoInstalacao) {
        this.prazoInstalacao = prazoInstalacao;
   }

   public BigDecimal getPrazoPagamento() {
        return prazoPagamento;
   }

   public void setPrazoPagamento(BigDecimal prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
   }

   public BigDecimal getPrazoSuporte() {
        return prazoSuporte;
   }

   public void setPrazoSuporte(BigDecimal prazoSuporte) {
        this.prazoSuporte = prazoSuporte;
   }

   public String getResumoObjeto() {
        return resumoObjeto;
   }

   public void setResumoObjeto(String resumoObjeto) {
        this.resumoObjeto = resumoObjeto;
   }

   public String getTelefoneContato() {
        return telefoneContato;
   }

   public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
   }

   public String getTelefoneVendedor() {
        return telefoneVendedor;
   }

   public void setTelefoneVendedor(String telefoneVendedor) {
        this.telefoneVendedor = telefoneVendedor;
   }

   public char[] getTextoObjeto() {
        return textoObjeto;
   }

   public void setTextoObjeto(char[] textoObjeto) {
        this.textoObjeto = textoObjeto;
   }

   public char[] getTextoObs() {
        return textoObs;
   }

   public void setTextoObs(char[] textoObs) {
        this.textoObs = textoObs;
   }

   public char[] getTextoTreinamento() {
        return textoTreinamento;
   }

   public void setTextoTreinamento(char[] textoTreinamento) {
        this.textoTreinamento = textoTreinamento;
   }

   public String getVersaoProjeto() {
        return versaoProjeto;
   }

   public void setVersaoProjeto(String versaoProjeto) {
        this.versaoProjeto = versaoProjeto;
   }

   @Override
   public String getTableName() {
        return "TGICIP";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoImpressaoProposta";
   }

   @Override
   public ConfiguracaoImpressaoProposta fromVO(DynamicVO vo) {
        this.caminhoArqImp = vo.asString("CAMINHOARQIMP");
        this.cargoContato = vo.asString("CARGOCONTATO");
        this.cargoVendedor = vo.asString("CARGOVENDEDOR");
        this.celularVendedor = vo.asString("CELULARVENDEDOR");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.deptoContato = vo.asString("DEPTOCONTATO");
        this.emailContato = vo.asString("EMAILCONTATO");
        this.emailVendedor = vo.asString("EMAILVENDEDOR");
        this.impresso = vo.asString("IMPRESSO");
        this.logoParc = vo.asString("LOGOPARC");
        this.modalidadeReposicao = vo.asString("MODALIDADEREPOSICAO");
        this.modalidadeSuporte = vo.asString("MODALIDADESUPORTE");
        this.nomeContato = vo.asString("NOMECONTATO");
        this.nomeParc = vo.asString("NOMEPARC");
        this.nomeVendedor = vo.asString("NOMEVENDEDOR");
        this.nroImpressao = vo.asBigDecimal("NROIMPRESSAO");
        this.nuProjeto = vo.asBigDecimal("NUPROJETO");
        this.prazoEntrega = vo.asBigDecimal("PRAZOENTREGA");
        this.prazoGarantia = vo.asBigDecimal("PRAZOGARANTIA");
        this.prazoInstalacao = vo.asBigDecimal("PRAZOINSTALACAO");
        this.prazoPagamento = vo.asBigDecimal("PRAZOPAGAMENTO");
        this.prazoSuporte = vo.asBigDecimal("PRAZOSUPORTE");
        this.resumoObjeto = vo.asString("RESUMOOBJETO");
        this.telefoneContato = vo.asString("TELEFONECONTATO");
        this.telefoneVendedor = vo.asString("TELEFONEVENDEDOR");
        this.textoObjeto = vo.asClob("TEXTOOBJETO");
        this.textoObs = vo.asClob("TEXTOOBS");
        this.textoTreinamento = vo.asClob("TEXTOTREINAMENTO");
        this.versaoProjeto = vo.asString("VERSAOPROJETO");
        return this;
   }
}
