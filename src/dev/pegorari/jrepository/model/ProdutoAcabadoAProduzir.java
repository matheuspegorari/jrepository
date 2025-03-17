package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoAcabadoAProduzir implements SankhyaEntity<ProdutoAcabadoAProduzir> {

   private Timestamp dtVal;
   private Timestamp dtFab;
   private String referencia;
   private BigDecimal codProdPa;
   private String concluido;
   private String controlePa;
   private BigDecimal idIproc;
   private String nroLote;
   private BigDecimal qtdProduzir;
   private BigDecimal saldoOp;
   private BigDecimal qtdProduzirOriginal;

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   public Timestamp getDtFab() {
        return dtFab;
   }

   public void setDtFab(Timestamp dtFab) {
        this.dtFab = dtFab;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getConcluido() {
        return concluido;
   }

   public void setConcluido(String concluido) {
        this.concluido = concluido;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public String getNroLote() {
        return nroLote;
   }

   public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
   }

   public BigDecimal getQtdProduzir() {
        return qtdProduzir;
   }

   public void setQtdProduzir(BigDecimal qtdProduzir) {
        this.qtdProduzir = qtdProduzir;
   }

   public BigDecimal getSaldoOp() {
        return saldoOp;
   }

   public void setSaldoOp(BigDecimal saldoOp) {
        this.saldoOp = saldoOp;
   }

   public BigDecimal getQtdProduzirOriginal() {
        return qtdProduzirOriginal;
   }

   public void setQtdProduzirOriginal(BigDecimal qtdProduzirOriginal) {
        this.qtdProduzirOriginal = qtdProduzirOriginal;
   }

   @Override
   public String getEntityName() {
        return "ProdutoAcabadoAProduzir";
   }

   @Override
   public ProdutoAcabadoAProduzir fromVO(DynamicVO vo) {
        this.dtVal = vo.asTimestamp("DTVAL");
        this.dtFab = vo.asTimestamp("DTFAB");
        this.referencia = vo.asString("REFERENCIA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.concluido = vo.asString("CONCLUIDO");
        this.controlePa = vo.asString("CONTROLEPA");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.nroLote = vo.asString("NROLOTE");
        this.qtdProduzir = vo.asBigDecimal("QTDPRODUZIR");
        this.saldoOp = vo.asBigDecimal("SALDOOP");
        this.qtdProduzirOriginal = vo.asBigDecimal("QTDPRODUZIRORIGINAL");
        return this;
   }
}
