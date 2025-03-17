package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class FormulaComposicaoProduto implements SankhyaEntity<FormulaComposicaoProduto> {

   private String ativo;
   private BigDecimal cicloProducao;
   private BigDecimal codLocal;
   private BigDecimal codProd;
   private String controle;
   private BigDecimal desvio;
   private BigDecimal desvioInf;
   private String formPrincipal;
   private BigDecimal margLucro;
   private String menorDtVal;
   private BigDecimal multiploIdeal;
   private String observacao;
   private BigDecimal producaoMin;
   private String regMapa;
   private String unidCiclo;
   private BigDecimal variacao;
   private BigDecimal variacaoRel;
   private BigDecimal codEst;
   private BigDecimal codPrc;
   private BigDecimal idProc;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCicloProducao() {
        return cicloProducao;
   }

   public void setCicloProducao(BigDecimal cicloProducao) {
        this.cicloProducao = cicloProducao;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getDesvio() {
        return desvio;
   }

   public void setDesvio(BigDecimal desvio) {
        this.desvio = desvio;
   }

   public BigDecimal getDesvioInf() {
        return desvioInf;
   }

   public void setDesvioInf(BigDecimal desvioInf) {
        this.desvioInf = desvioInf;
   }

   public String getFormPrincipal() {
        return formPrincipal;
   }

   public void setFormPrincipal(String formPrincipal) {
        this.formPrincipal = formPrincipal;
   }

   public BigDecimal getMargLucro() {
        return margLucro;
   }

   public void setMargLucro(BigDecimal margLucro) {
        this.margLucro = margLucro;
   }

   public String getMenorDtVal() {
        return menorDtVal;
   }

   public void setMenorDtVal(String menorDtVal) {
        this.menorDtVal = menorDtVal;
   }

   public BigDecimal getMultiploIdeal() {
        return multiploIdeal;
   }

   public void setMultiploIdeal(BigDecimal multiploIdeal) {
        this.multiploIdeal = multiploIdeal;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getProducaoMin() {
        return producaoMin;
   }

   public void setProducaoMin(BigDecimal producaoMin) {
        this.producaoMin = producaoMin;
   }

   public String getRegMapa() {
        return regMapa;
   }

   public void setRegMapa(String regMapa) {
        this.regMapa = regMapa;
   }

   public String getUnidCiclo() {
        return unidCiclo;
   }

   public void setUnidCiclo(String unidCiclo) {
        this.unidCiclo = unidCiclo;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        this.variacao = variacao;
   }

   public BigDecimal getVariacaoRel() {
        return variacaoRel;
   }

   public void setVariacaoRel(BigDecimal variacaoRel) {
        this.variacaoRel = variacaoRel;
   }

   public BigDecimal getCodEst() {
        return codEst;
   }

   public void setCodEst(BigDecimal codEst) {
        this.codEst = codEst;
   }

   public BigDecimal getCodPrc() {
        return codPrc;
   }

   public void setCodPrc(BigDecimal codPrc) {
        this.codPrc = codPrc;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   @Override
   public String getEntityName() {
        return "FormulaComposicaoProduto";
   }

   @Override
   public FormulaComposicaoProduto fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.cicloProducao = vo.asBigDecimal("CICLOPRODUCAO");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.desvio = vo.asBigDecimal("DESVIO");
        this.desvioInf = vo.asBigDecimal("DESVIOINF");
        this.formPrincipal = vo.asString("FORMPRINCIPAL");
        this.margLucro = vo.asBigDecimal("MARGLUCRO");
        this.menorDtVal = vo.asString("MENORDTVAL");
        this.multiploIdeal = vo.asBigDecimal("MULTIPLOIDEAL");
        this.observacao = vo.asString("OBSERVACAO");
        this.producaoMin = vo.asBigDecimal("PRODUCAOMIN");
        this.regMapa = vo.asString("REGMAPA");
        this.unidCiclo = vo.asString("UNIDCICLO");
        this.variacao = vo.asBigDecimal("VARIACAO");
        this.variacaoRel = vo.asBigDecimal("VARIACAOREL");
        this.codEst = vo.asBigDecimal("CODEST");
        this.codPrc = vo.asBigDecimal("CODPRC");
        this.idProc = vo.asBigDecimal("IDPROC");
        return this;
   }
}
