package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PadraoClassificacao implements SankhyaEntity<PadraoClassificacao> {

   private String ativo;
   private BigDecimal classificacao;
   private BigDecimal codClt;
   private BigDecimal codGrupoProd;
   private BigDecimal codProd;
   private String confNegado;
   private String descrClt;
   private String exigeLib;
   private String formula;
   private String observacao;
   private BigDecimal prazoVal;
   private String sigla;
   private String tipoLaudo;
   private String tipoRefPrzVal;
   private BigDecimal codGpc;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getClassificacao() {
        return classificacao;
   }

   public void setClassificacao(BigDecimal classificacao) {
        this.classificacao = classificacao;
   }

   public BigDecimal getCodClt() {
        return codClt;
   }

   public void setCodClt(BigDecimal codClt) {
        this.codClt = codClt;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getConfNegado() {
        return confNegado;
   }

   public void setConfNegado(String confNegado) {
        this.confNegado = confNegado;
   }

   public String getDescrClt() {
        return descrClt;
   }

   public void setDescrClt(String descrClt) {
        this.descrClt = descrClt;
   }

   public String getExigeLib() {
        return exigeLib;
   }

   public void setExigeLib(String exigeLib) {
        this.exigeLib = exigeLib;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        this.formula = formula;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getPrazoVal() {
        return prazoVal;
   }

   public void setPrazoVal(BigDecimal prazoVal) {
        this.prazoVal = prazoVal;
   }

   public String getSigla() {
        return sigla;
   }

   public void setSigla(String sigla) {
        this.sigla = sigla;
   }

   public String getTipoLaudo() {
        return tipoLaudo;
   }

   public void setTipoLaudo(String tipoLaudo) {
        this.tipoLaudo = tipoLaudo;
   }

   public String getTipoRefPrzVal() {
        return tipoRefPrzVal;
   }

   public void setTipoRefPrzVal(String tipoRefPrzVal) {
        this.tipoRefPrzVal = tipoRefPrzVal;
   }

   public BigDecimal getCodGpc() {
        return codGpc;
   }

   public void setCodGpc(BigDecimal codGpc) {
        this.codGpc = codGpc;
   }

   @Override
   public String getEntityName() {
        return "PadraoClassificacao";
   }

   @Override
   public PadraoClassificacao fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.classificacao = vo.asBigDecimal("CLASSIFICACAO");
        this.codClt = vo.asBigDecimal("CODCLT");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.confNegado = vo.asString("CONFNEGADO");
        this.descrClt = vo.asString("DESCRCLT");
        this.exigeLib = vo.asString("EXIGELIB");
        this.formula = vo.asString("FORMULA");
        this.observacao = vo.asString("OBSERVACAO");
        this.prazoVal = vo.asBigDecimal("PRAZOVAL");
        this.sigla = vo.asString("SIGLA");
        this.tipoLaudo = vo.asString("TIPOLAUDO");
        this.tipoRefPrzVal = vo.asString("TIPOREFPRZVAL");
        this.codGpc = vo.asBigDecimal("CODGPC");
        return this;
   }
}
