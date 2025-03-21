package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Carrinho extends AbstractSankhyaEntity<Carrinho> {
   private BigDecimal codLocal;
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private BigDecimal nuNota;
   private char[] outrasColunas;
   private BigDecimal precoTotal;
   private BigDecimal precoUsado;
   private BigDecimal qtdProduto;
   private BigDecimal seqCac;
   private BigDecimal descTotal;
   private BigDecimal precoBase;
   private BigDecimal precoBaseQtd;
   private BigDecimal vlrAcrescDesc;
   private BigDecimal vlrCus;
   private BigDecimal vlrRetencao;

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

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public char[] getOutrasColunas() {
        return outrasColunas;
   }

   public void setOutrasColunas(char[] outrasColunas) {
        markAsChanged("OUTRASCOLUNAS", outrasColunas);
        this.outrasColunas = outrasColunas;
   }

   public BigDecimal getPrecoTotal() {
        return precoTotal;
   }

   public void setPrecoTotal(BigDecimal precoTotal) {
        markAsChanged("PRECOTOTAL", precoTotal);
        this.precoTotal = precoTotal;
   }

   public BigDecimal getPrecoUsado() {
        return precoUsado;
   }

   public void setPrecoUsado(BigDecimal precoUsado) {
        markAsChanged("PRECOUSADO", precoUsado);
        this.precoUsado = precoUsado;
   }

   public BigDecimal getQtdProduto() {
        return qtdProduto;
   }

   public void setQtdProduto(BigDecimal qtdProduto) {
        markAsChanged("QTDPRODUTO", qtdProduto);
        this.qtdProduto = qtdProduto;
   }

   public BigDecimal getSeqCac() {
        return seqCac;
   }

   public void setSeqCac(BigDecimal seqCac) {
        markAsChanged("SEQCAC", seqCac);
        this.seqCac = seqCac;
   }

   public BigDecimal getDescTotal() {
        return descTotal;
   }

   public void setDescTotal(BigDecimal descTotal) {
        markAsChanged("DESCTOTAL", descTotal);
        this.descTotal = descTotal;
   }

   public BigDecimal getPrecoBase() {
        return precoBase;
   }

   public void setPrecoBase(BigDecimal precoBase) {
        markAsChanged("PRECOBASE", precoBase);
        this.precoBase = precoBase;
   }

   public BigDecimal getPrecoBaseQtd() {
        return precoBaseQtd;
   }

   public void setPrecoBaseQtd(BigDecimal precoBaseQtd) {
        markAsChanged("PRECOBASEQTD", precoBaseQtd);
        this.precoBaseQtd = precoBaseQtd;
   }

   public BigDecimal getVlrAcrescDesc() {
        return vlrAcrescDesc;
   }

   public void setVlrAcrescDesc(BigDecimal vlrAcrescDesc) {
        markAsChanged("VLRACRESCDESC", vlrAcrescDesc);
        this.vlrAcrescDesc = vlrAcrescDesc;
   }

   public BigDecimal getVlrCus() {
        return vlrCus;
   }

   public void setVlrCus(BigDecimal vlrCus) {
        markAsChanged("VLRCUS", vlrCus);
        this.vlrCus = vlrCus;
   }

   public BigDecimal getVlrRetencao() {
        return vlrRetencao;
   }

   public void setVlrRetencao(BigDecimal vlrRetencao) {
        markAsChanged("VLRRETENCAO", vlrRetencao);
        this.vlrRetencao = vlrRetencao;
   }

   @Override
   public String getTableName() {
        return "TGFCAC";
   }

   @Override
   public String getEntityName() {
        return "Carrinho";
   }

   @Override
   public Carrinho fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.outrasColunas = vo.asClob("OUTRASCOLUNAS");
        this.precoTotal = vo.asBigDecimal("PRECOTOTAL");
        this.precoUsado = vo.asBigDecimal("PRECOUSADO");
        this.qtdProduto = vo.asBigDecimal("QTDPRODUTO");
        this.seqCac = vo.asBigDecimal("SEQCAC");
        this.descTotal = vo.asBigDecimal("DESCTOTAL");
        this.precoBase = vo.asBigDecimal("PRECOBASE");
        this.precoBaseQtd = vo.asBigDecimal("PRECOBASEQTD");
        this.vlrAcrescDesc = vo.asBigDecimal("VLRACRESCDESC");
        this.vlrCus = vo.asBigDecimal("VLRCUS");
        this.vlrRetencao = vo.asBigDecimal("VLRRETENCAO");
        return this;
   }
}
