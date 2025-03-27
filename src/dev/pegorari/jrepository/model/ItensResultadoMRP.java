package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItensResultadoMRP extends AbstractSankhyaEntity<ItensResultadoMRP> {
   public BigDecimal getQtdPedCompra() {
        return this.getVo().asBigDecimal("QTDPEDCOMPRA");
   }

   public void setQtdPedCompra(BigDecimal qtdPedCompra) {
        markAsChanged("QTDPEDCOMPRA", qtdPedCompra);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public BigDecimal getQtdMrp() {
        return this.getVo().asBigDecimal("QTDMRP");
   }

   public void setQtdMrp(BigDecimal qtdMrp) {
        markAsChanged("QTDMRP", qtdMrp);
   }

   public BigDecimal getNumPs() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
   }

   public BigDecimal getQtdSaldo() {
        return this.getVo().asBigDecimal("QTDSALDO");
   }

   public void setQtdSaldo(BigDecimal qtdSaldo) {
        markAsChanged("QTDSALDO", qtdSaldo);
   }

   public BigDecimal getQtdEstoque() {
        return this.getVo().asBigDecimal("QTDESTOQUE");
   }

   public void setQtdEstoque(BigDecimal qtdEstoque) {
        markAsChanged("QTDESTOQUE", qtdEstoque);
   }

   public String getProdInterm() {
        return this.getVo().asString("PRODINTERM");
   }

   public void setProdInterm(String prodInterm) {
        markAsChanged("PRODINTERM", prodInterm);
   }

   public String getNecessCompra() {
        return this.getVo().asString("NECESSCOMPRA");
   }

   public void setNecessCompra(String necessCompra) {
        markAsChanged("NECESSCOMPRA", necessCompra);
   }

   public BigDecimal getQtdCot() {
        return this.getVo().asBigDecimal("QTDCOT");
   }

   public void setQtdCot(BigDecimal qtdCot) {
        markAsChanged("QTDCOT", qtdCot);
   }

   public BigDecimal getSeqImrp() {
        return this.getVo().asBigDecimal("SEQIMRP");
   }

   public void setSeqImrp(BigDecimal seqImrp) {
        markAsChanged("SEQIMRP", seqImrp);
   }

   public BigDecimal getQtdSaldoTotal() {
        return this.getVo().asBigDecimal("QTDSALDOTOTAL");
   }

   public void setQtdSaldoTotal(BigDecimal qtdSaldoTotal) {
        markAsChanged("QTDSALDOTOTAL", qtdSaldoTotal);
   }

   public Timestamp getDataPdc() {
        return this.getVo().asTimestamp("DATAPDC");
   }

   public void setDataPdc(Timestamp dataPdc) {
        markAsChanged("DATAPDC", dataPdc);
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
        return this;
   }
}
