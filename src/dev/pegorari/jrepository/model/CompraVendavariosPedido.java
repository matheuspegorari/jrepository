package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CompraVendavariosPedido implements SankhyaEntity<CompraVendavariosPedido> {

   private BigDecimal cusAtend;
   private BigDecimal nuNota;
   private BigDecimal nuNotaOrig;
   private BigDecimal ordemProd;
   private BigDecimal qtdAtendida;
   private BigDecimal sequencia;
   private BigDecimal sequenciaOrig;
   private String statusNota;
   private String nroRegExport;
   private String nroAtoConcdraw;
   private BigDecimal nroMemorando;
   private String fixacao;

   public BigDecimal getCusAtend() {
        return cusAtend;
   }

   public void setCusAtend(BigDecimal cusAtend) {
        this.cusAtend = cusAtend;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaOrig() {
        return nuNotaOrig;
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        this.nuNotaOrig = nuNotaOrig;
   }

   public BigDecimal getOrdemProd() {
        return ordemProd;
   }

   public void setOrdemProd(BigDecimal ordemProd) {
        this.ordemProd = ordemProd;
   }

   public BigDecimal getQtdAtendida() {
        return qtdAtendida;
   }

   public void setQtdAtendida(BigDecimal qtdAtendida) {
        this.qtdAtendida = qtdAtendida;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaOrig() {
        return sequenciaOrig;
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        this.sequenciaOrig = sequenciaOrig;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        this.statusNota = statusNota;
   }

   public String getNroRegExport() {
        return nroRegExport;
   }

   public void setNroRegExport(String nroRegExport) {
        this.nroRegExport = nroRegExport;
   }

   public String getNroAtoConcdraw() {
        return nroAtoConcdraw;
   }

   public void setNroAtoConcdraw(String nroAtoConcdraw) {
        this.nroAtoConcdraw = nroAtoConcdraw;
   }

   public BigDecimal getNroMemorando() {
        return nroMemorando;
   }

   public void setNroMemorando(BigDecimal nroMemorando) {
        this.nroMemorando = nroMemorando;
   }

   public String getFixacao() {
        return fixacao;
   }

   public void setFixacao(String fixacao) {
        this.fixacao = fixacao;
   }

   @Override
   public String getEntityName() {
        return "CompraVendavariosPedido";
   }

   @Override
   public CompraVendavariosPedido fromVO(DynamicVO vo) {
        this.cusAtend = vo.asBigDecimal("CUSATEND");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        this.ordemProd = vo.asBigDecimal("ORDEMPROD");
        this.qtdAtendida = vo.asBigDecimal("QTDATENDIDA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaOrig = vo.asBigDecimal("SEQUENCIAORIG");
        this.statusNota = vo.asString("STATUSNOTA");
        this.nroRegExport = vo.asString("NROREGEXPORT");
        this.nroAtoConcdraw = vo.asString("NROATOCONCDRAW");
        this.nroMemorando = vo.asBigDecimal("NROMEMORANDO");
        this.fixacao = vo.asString("FIXACAO");
        return this;
   }
}
