package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormulaComposicaoProduto extends AbstractSankhyaEntity<FormulaComposicaoProduto> {
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
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCicloProducao() {
        return cicloProducao;
   }

   public void setCicloProducao(BigDecimal cicloProducao) {
        markAsChanged("CICLOPRODUCAO", cicloProducao);
        this.cicloProducao = cicloProducao;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getDesvio() {
        return desvio;
   }

   public void setDesvio(BigDecimal desvio) {
        markAsChanged("DESVIO", desvio);
        this.desvio = desvio;
   }

   public BigDecimal getDesvioInf() {
        return desvioInf;
   }

   public void setDesvioInf(BigDecimal desvioInf) {
        markAsChanged("DESVIOINF", desvioInf);
        this.desvioInf = desvioInf;
   }

   public String getFormPrincipal() {
        return formPrincipal;
   }

   public void setFormPrincipal(String formPrincipal) {
        markAsChanged("FORMPRINCIPAL", formPrincipal);
        this.formPrincipal = formPrincipal;
   }

   public BigDecimal getMargLucro() {
        return margLucro;
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
        this.margLucro = margLucro;
   }

   public String getMenorDtVal() {
        return menorDtVal;
   }

   public void setMenorDtVal(String menorDtVal) {
        markAsChanged("MENORDTVAL", menorDtVal);
        this.menorDtVal = menorDtVal;
   }

   public BigDecimal getMultiploIdeal() {
        return multiploIdeal;
   }

   public void setMultiploIdeal(BigDecimal multiploIdeal) {
        markAsChanged("MULTIPLOIDEAL", multiploIdeal);
        this.multiploIdeal = multiploIdeal;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getProducaoMin() {
        return producaoMin;
   }

   public void setProducaoMin(BigDecimal producaoMin) {
        markAsChanged("PRODUCAOMIN", producaoMin);
        this.producaoMin = producaoMin;
   }

   public String getRegMapa() {
        return regMapa;
   }

   public void setRegMapa(String regMapa) {
        markAsChanged("REGMAPA", regMapa);
        this.regMapa = regMapa;
   }

   public String getUnidCiclo() {
        return unidCiclo;
   }

   public void setUnidCiclo(String unidCiclo) {
        markAsChanged("UNIDCICLO", unidCiclo);
        this.unidCiclo = unidCiclo;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
        this.variacao = variacao;
   }

   public BigDecimal getVariacaoRel() {
        return variacaoRel;
   }

   public void setVariacaoRel(BigDecimal variacaoRel) {
        markAsChanged("VARIACAOREL", variacaoRel);
        this.variacaoRel = variacaoRel;
   }

   public BigDecimal getCodEst() {
        return codEst;
   }

   public void setCodEst(BigDecimal codEst) {
        markAsChanged("CODEST", codEst);
        this.codEst = codEst;
   }

   public BigDecimal getCodPrc() {
        return codPrc;
   }

   public void setCodPrc(BigDecimal codPrc) {
        markAsChanged("CODPRC", codPrc);
        this.codPrc = codPrc;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   @Override
   public String getTableName() {
        return "TGFFCP";
   }

   @Override
   public String getEntityName() {
        return "FormulaComposicaoProduto";
   }

   @Override
   public FormulaComposicaoProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
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
