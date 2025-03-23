package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItensResultadoMRP extends AbstractSankhyaEntity<ItensResultadoMRP> {
   private BigDecimal qtdPedCompra;
   private String controleMp;
   private BigDecimal codProdMp;
   private BigDecimal qtdMrp;
   private BigDecimal numPs;
   private BigDecimal qtdSaldo;
   private BigDecimal qtdEstoque;
   private String prodInterm;
   private String necessCompra;
   private BigDecimal qtdCot;
   private BigDecimal seqImrp;
   private BigDecimal qtdSaldoTotal;
   private Timestamp dataPdc;

   public BigDecimal getQtdPedCompra() {
        return qtdPedCompra;
   }

   public void setQtdPedCompra(BigDecimal qtdPedCompra) {
        markAsChanged("QTDPEDCOMPRA", qtdPedCompra);
        this.qtdPedCompra = qtdPedCompra;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public BigDecimal getQtdMrp() {
        return qtdMrp;
   }

   public void setQtdMrp(BigDecimal qtdMrp) {
        markAsChanged("QTDMRP", qtdMrp);
        this.qtdMrp = qtdMrp;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
        this.numPs = numPs;
   }

   public BigDecimal getQtdSaldo() {
        return qtdSaldo;
   }

   public void setQtdSaldo(BigDecimal qtdSaldo) {
        markAsChanged("QTDSALDO", qtdSaldo);
        this.qtdSaldo = qtdSaldo;
   }

   public BigDecimal getQtdEstoque() {
        return qtdEstoque;
   }

   public void setQtdEstoque(BigDecimal qtdEstoque) {
        markAsChanged("QTDESTOQUE", qtdEstoque);
        this.qtdEstoque = qtdEstoque;
   }

   public String getProdInterm() {
        return prodInterm;
   }

   public void setProdInterm(String prodInterm) {
        markAsChanged("PRODINTERM", prodInterm);
        this.prodInterm = prodInterm;
   }

   public String getNecessCompra() {
        return necessCompra;
   }

   public void setNecessCompra(String necessCompra) {
        markAsChanged("NECESSCOMPRA", necessCompra);
        this.necessCompra = necessCompra;
   }

   public BigDecimal getQtdCot() {
        return qtdCot;
   }

   public void setQtdCot(BigDecimal qtdCot) {
        markAsChanged("QTDCOT", qtdCot);
        this.qtdCot = qtdCot;
   }

   public BigDecimal getSeqImrp() {
        return seqImrp;
   }

   public void setSeqImrp(BigDecimal seqImrp) {
        markAsChanged("SEQIMRP", seqImrp);
        this.seqImrp = seqImrp;
   }

   public BigDecimal getQtdSaldoTotal() {
        return qtdSaldoTotal;
   }

   public void setQtdSaldoTotal(BigDecimal qtdSaldoTotal) {
        markAsChanged("QTDSALDOTOTAL", qtdSaldoTotal);
        this.qtdSaldoTotal = qtdSaldoTotal;
   }

   public Timestamp getDataPdc() {
        return dataPdc;
   }

   public void setDataPdc(Timestamp dataPdc) {
        markAsChanged("DATAPDC", dataPdc);
        this.dataPdc = dataPdc;
   }

   @Override
   public String getTableName() {
        return "TPRIMRP";
   }

   @Override
   public String getEntityName() {
        return "ItensResultadoMRP";
   }

   @Override
   public ItensResultadoMRP fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.qtdPedCompra = vo.asBigDecimal("QTDPEDCOMPRA");
        this.controleMp = vo.asString("CONTROLEMP");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.qtdMrp = vo.asBigDecimal("QTDMRP");
        this.numPs = vo.asBigDecimal("NUMPS");
        this.qtdSaldo = vo.asBigDecimal("QTDSALDO");
        this.qtdEstoque = vo.asBigDecimal("QTDESTOQUE");
        this.prodInterm = vo.asString("PRODINTERM");
        this.necessCompra = vo.asString("NECESSCOMPRA");
        this.qtdCot = vo.asBigDecimal("QTDCOT");
        this.seqImrp = vo.asBigDecimal("SEQIMRP");
        this.qtdSaldoTotal = vo.asBigDecimal("QTDSALDOTOTAL");
        this.dataPdc = vo.asTimestamp("DATAPDC");
        return this;
   }
}
