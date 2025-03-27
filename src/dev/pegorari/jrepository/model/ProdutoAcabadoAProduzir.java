package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoAcabadoAProduzir extends AbstractSankhyaEntity<ProdutoAcabadoAProduzir> {
   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public Timestamp getDtFab() {
        return this.getVo().asTimestamp("DTFAB");
   }

   public void setDtFab(Timestamp dtFab) {
        markAsChanged("DTFAB", dtFab);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getConcluido() {
        return this.getVo().asString("CONCLUIDO");
   }

   public void setConcluido(String concluido) {
        markAsChanged("CONCLUIDO", concluido);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public String getNroLote() {
        return this.getVo().asString("NROLOTE");
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
   }

   public BigDecimal getQtdProduzir() {
        return this.getVo().asBigDecimal("QTDPRODUZIR");
   }

   public void setQtdProduzir(BigDecimal qtdProduzir) {
        markAsChanged("QTDPRODUZIR", qtdProduzir);
   }

   public BigDecimal getSaldoOp() {
        return this.getVo().asBigDecimal("SALDOOP");
   }

   public void setSaldoOp(BigDecimal saldoOp) {
        markAsChanged("SALDOOP", saldoOp);
   }

   public BigDecimal getQtdProduzirOriginal() {
        return this.getVo().asBigDecimal("QTDPRODUZIR_ORIGINAL");
   }

   public void setQtdProduzirOriginal(BigDecimal qtdProduzirOriginal) {
        markAsChanged("QTDPRODUZIR_ORIGINAL", qtdProduzirOriginal);
   }

   @Override
   public String getTableName() {
        return "TPRIPA";
   }

   @Override
   public String getEntityName() {
        return "ProdutoAcabadoAProduzir";
   }

   @Override
   public ProdutoAcabadoAProduzir fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
