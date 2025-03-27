package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Carrinho extends AbstractSankhyaEntity<Carrinho> {
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

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public char[] getOutrasColunas() {
        return this.getVo().asClob("OUTRASCOLUNAS");
   }

   public void setOutrasColunas(char[] outrasColunas) {
        markAsChanged("OUTRASCOLUNAS", outrasColunas);
   }

   public BigDecimal getPrecoTotal() {
        return this.getVo().asBigDecimal("PRECOTOTAL");
   }

   public void setPrecoTotal(BigDecimal precoTotal) {
        markAsChanged("PRECOTOTAL", precoTotal);
   }

   public BigDecimal getPrecoUsado() {
        return this.getVo().asBigDecimal("PRECOUSADO");
   }

   public void setPrecoUsado(BigDecimal precoUsado) {
        markAsChanged("PRECOUSADO", precoUsado);
   }

   public BigDecimal getQtdProduto() {
        return this.getVo().asBigDecimal("QTDPRODUTO");
   }

   public void setQtdProduto(BigDecimal qtdProduto) {
        markAsChanged("QTDPRODUTO", qtdProduto);
   }

   public BigDecimal getSeqCac() {
        return this.getVo().asBigDecimal("SEQCAC");
   }

   public void setSeqCac(BigDecimal seqCac) {
        markAsChanged("SEQCAC", seqCac);
   }

   public BigDecimal getDescTotal() {
        return this.getVo().asBigDecimal("DESCTOTAL");
   }

   public void setDescTotal(BigDecimal descTotal) {
        markAsChanged("DESCTOTAL", descTotal);
   }

   public BigDecimal getPrecoBase() {
        return this.getVo().asBigDecimal("PRECOBASE");
   }

   public void setPrecoBase(BigDecimal precoBase) {
        markAsChanged("PRECOBASE", precoBase);
   }

   public BigDecimal getPrecoBaseQtd() {
        return this.getVo().asBigDecimal("PRECOBASEQTD");
   }

   public void setPrecoBaseQtd(BigDecimal precoBaseQtd) {
        markAsChanged("PRECOBASEQTD", precoBaseQtd);
   }

   public BigDecimal getVlrAcrescDesc() {
        return this.getVo().asBigDecimal("VLRACRESCDESC");
   }

   public void setVlrAcrescDesc(BigDecimal vlrAcrescDesc) {
        markAsChanged("VLRACRESCDESC", vlrAcrescDesc);
   }

   public BigDecimal getVlrCus() {
        return this.getVo().asBigDecimal("VLRCUS");
   }

   public void setVlrCus(BigDecimal vlrCus) {
        markAsChanged("VLRCUS", vlrCus);
   }

   public BigDecimal getVlrRetencao() {
        return this.getVo().asBigDecimal("VLRRETENCAO");
   }

   public void setVlrRetencao(BigDecimal vlrRetencao) {
        markAsChanged("VLRRETENCAO", vlrRetencao);
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
        this.setVo(vo);
        return this;
   }
}
