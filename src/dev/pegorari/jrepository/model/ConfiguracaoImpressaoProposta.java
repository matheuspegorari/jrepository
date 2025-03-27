package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoImpressaoProposta extends AbstractSankhyaEntity<ConfiguracaoImpressaoProposta> {
   public String getCaminhoArqImp() {
        return this.getVo().asString("CAMINHOARQIMP");
   }

   public void setCaminhoArqImp(String caminhoArqImp) {
        markAsChanged("CAMINHOARQIMP", caminhoArqImp);
   }

   public String getCargoContato() {
        return this.getVo().asString("CARGOCONTATO");
   }

   public void setCargoContato(String cargoContato) {
        markAsChanged("CARGOCONTATO", cargoContato);
   }

   public String getCargoVendedor() {
        return this.getVo().asString("CARGOVENDEDOR");
   }

   public void setCargoVendedor(String cargoVendedor) {
        markAsChanged("CARGOVENDEDOR", cargoVendedor);
   }

   public String getCelularVendedor() {
        return this.getVo().asString("CELULARVENDEDOR");
   }

   public void setCelularVendedor(String celularVendedor) {
        markAsChanged("CELULARVENDEDOR", celularVendedor);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getDeptoContato() {
        return this.getVo().asString("DEPTOCONTATO");
   }

   public void setDeptoContato(String deptoContato) {
        markAsChanged("DEPTOCONTATO", deptoContato);
   }

   public String getEmailContato() {
        return this.getVo().asString("EMAILCONTATO");
   }

   public void setEmailContato(String emailContato) {
        markAsChanged("EMAILCONTATO", emailContato);
   }

   public String getEmailVendedor() {
        return this.getVo().asString("EMAILVENDEDOR");
   }

   public void setEmailVendedor(String emailVendedor) {
        markAsChanged("EMAILVENDEDOR", emailVendedor);
   }

   public String getImpresso() {
        return this.getVo().asString("IMPRESSO");
   }

   public void setImpresso(String impresso) {
        markAsChanged("IMPRESSO", impresso);
   }

   public String getLogoParc() {
        return this.getVo().asString("LOGOPARC");
   }

   public void setLogoParc(String logoParc) {
        markAsChanged("LOGOPARC", logoParc);
   }

   public String getModalidadeReposicao() {
        return this.getVo().asString("MODALIDADEREPOSICAO");
   }

   public void setModalidadeReposicao(String modalidadeReposicao) {
        markAsChanged("MODALIDADEREPOSICAO", modalidadeReposicao);
   }

   public String getModalidadeSuporte() {
        return this.getVo().asString("MODALIDADESUPORTE");
   }

   public void setModalidadeSuporte(String modalidadeSuporte) {
        markAsChanged("MODALIDADESUPORTE", modalidadeSuporte);
   }

   public String getNomeContato() {
        return this.getVo().asString("NOMECONTATO");
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
   }

   public String getNomeParc() {
        return this.getVo().asString("NOMEPARC");
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
   }

   public String getNomeVendedor() {
        return this.getVo().asString("NOMEVENDEDOR");
   }

   public void setNomeVendedor(String nomeVendedor) {
        markAsChanged("NOMEVENDEDOR", nomeVendedor);
   }

   public BigDecimal getNroImpressao() {
        return this.getVo().asBigDecimal("NROIMPRESSAO");
   }

   public void setNroImpressao(BigDecimal nroImpressao) {
        markAsChanged("NROIMPRESSAO", nroImpressao);
   }

   public BigDecimal getNuProjeto() {
        return this.getVo().asBigDecimal("NUPROJETO");
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
   }

   public BigDecimal getPrazoEntrega() {
        return this.getVo().asBigDecimal("PRAZOENTREGA");
   }

   public void setPrazoEntrega(BigDecimal prazoEntrega) {
        markAsChanged("PRAZOENTREGA", prazoEntrega);
   }

   public BigDecimal getPrazoGarantia() {
        return this.getVo().asBigDecimal("PRAZOGARANTIA");
   }

   public void setPrazoGarantia(BigDecimal prazoGarantia) {
        markAsChanged("PRAZOGARANTIA", prazoGarantia);
   }

   public BigDecimal getPrazoInstalacao() {
        return this.getVo().asBigDecimal("PRAZOINSTALACAO");
   }

   public void setPrazoInstalacao(BigDecimal prazoInstalacao) {
        markAsChanged("PRAZOINSTALACAO", prazoInstalacao);
   }

   public BigDecimal getPrazoPagamento() {
        return this.getVo().asBigDecimal("PRAZOPAGAMENTO");
   }

   public void setPrazoPagamento(BigDecimal prazoPagamento) {
        markAsChanged("PRAZOPAGAMENTO", prazoPagamento);
   }

   public BigDecimal getPrazoSuporte() {
        return this.getVo().asBigDecimal("PRAZOSUPORTE");
   }

   public void setPrazoSuporte(BigDecimal prazoSuporte) {
        markAsChanged("PRAZOSUPORTE", prazoSuporte);
   }

   public String getResumoObjeto() {
        return this.getVo().asString("RESUMOOBJETO");
   }

   public void setResumoObjeto(String resumoObjeto) {
        markAsChanged("RESUMOOBJETO", resumoObjeto);
   }

   public String getTelefoneContato() {
        return this.getVo().asString("TELEFONECONTATO");
   }

   public void setTelefoneContato(String telefoneContato) {
        markAsChanged("TELEFONECONTATO", telefoneContato);
   }

   public String getTelefoneVendedor() {
        return this.getVo().asString("TELEFONEVENDEDOR");
   }

   public void setTelefoneVendedor(String telefoneVendedor) {
        markAsChanged("TELEFONEVENDEDOR", telefoneVendedor);
   }

   public char[] getTextoObjeto() {
        return this.getVo().asClob("TEXTOOBJETO");
   }

   public void setTextoObjeto(char[] textoObjeto) {
        markAsChanged("TEXTOOBJETO", textoObjeto);
   }

   public char[] getTextoObs() {
        return this.getVo().asClob("TEXTOOBS");
   }

   public void setTextoObs(char[] textoObs) {
        markAsChanged("TEXTOOBS", textoObs);
   }

   public char[] getTextoTreinamento() {
        return this.getVo().asClob("TEXTOTREINAMENTO");
   }

   public void setTextoTreinamento(char[] textoTreinamento) {
        markAsChanged("TEXTOTREINAMENTO", textoTreinamento);
   }

   public String getVersaoProjeto() {
        return this.getVo().asString("VERSAOPROJETO");
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
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
        this.setVo(vo);
        return this;
   }
}
