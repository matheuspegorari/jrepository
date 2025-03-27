package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormulaComposicaoProduto extends AbstractSankhyaEntity<FormulaComposicaoProduto> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCicloProducao() {
        return this.getVo().asBigDecimal("CICLOPRODUCAO");
   }

   public void setCicloProducao(BigDecimal cicloProducao) {
        markAsChanged("CICLOPRODUCAO", cicloProducao);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getDesvio() {
        return this.getVo().asBigDecimal("DESVIO");
   }

   public void setDesvio(BigDecimal desvio) {
        markAsChanged("DESVIO", desvio);
   }

   public BigDecimal getDesvioInf() {
        return this.getVo().asBigDecimal("DESVIOINF");
   }

   public void setDesvioInf(BigDecimal desvioInf) {
        markAsChanged("DESVIOINF", desvioInf);
   }

   public String getFormPrincipal() {
        return this.getVo().asString("FORMPRINCIPAL");
   }

   public void setFormPrincipal(String formPrincipal) {
        markAsChanged("FORMPRINCIPAL", formPrincipal);
   }

   public BigDecimal getMargLucro() {
        return this.getVo().asBigDecimal("MARGLUCRO");
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
   }

   public String getMenorDtVal() {
        return this.getVo().asString("MENORDTVAL");
   }

   public void setMenorDtVal(String menorDtVal) {
        markAsChanged("MENORDTVAL", menorDtVal);
   }

   public BigDecimal getMultiploIdeal() {
        return this.getVo().asBigDecimal("MULTIPLOIDEAL");
   }

   public void setMultiploIdeal(BigDecimal multiploIdeal) {
        markAsChanged("MULTIPLOIDEAL", multiploIdeal);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getProducaoMin() {
        return this.getVo().asBigDecimal("PRODUCAOMIN");
   }

   public void setProducaoMin(BigDecimal producaoMin) {
        markAsChanged("PRODUCAOMIN", producaoMin);
   }

   public String getRegMapa() {
        return this.getVo().asString("REGMAPA");
   }

   public void setRegMapa(String regMapa) {
        markAsChanged("REGMAPA", regMapa);
   }

   public String getUnidCiclo() {
        return this.getVo().asString("UNIDCICLO");
   }

   public void setUnidCiclo(String unidCiclo) {
        markAsChanged("UNIDCICLO", unidCiclo);
   }

   public BigDecimal getVariacao() {
        return this.getVo().asBigDecimal("VARIACAO");
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
   }

   public BigDecimal getVariacaoRel() {
        return this.getVo().asBigDecimal("VARIACAOREL");
   }

   public void setVariacaoRel(BigDecimal variacaoRel) {
        markAsChanged("VARIACAOREL", variacaoRel);
   }

   public BigDecimal getCodEst() {
        return this.getVo().asBigDecimal("CODEST");
   }

   public void setCodEst(BigDecimal codEst) {
        markAsChanged("CODEST", codEst);
   }

   public BigDecimal getCodPrc() {
        return this.getVo().asBigDecimal("CODPRC");
   }

   public void setCodPrc(BigDecimal codPrc) {
        markAsChanged("CODPRC", codPrc);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
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
        return this;
   }
}
