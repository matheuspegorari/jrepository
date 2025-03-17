package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LigacaoPedidoNotaTemp implements SankhyaEntity<LigacaoPedidoNotaTemp> {

   private BigDecimal cusAtend;
   private String nroAtoConcDraw;
   private BigDecimal nroMemorando;
   private String nroRegExport;
   private BigDecimal nuNota;
   private BigDecimal nuNotaOrig;
   private BigDecimal ordemProd;
   private BigDecimal qtdAtendida;
   private BigDecimal sequencia;
   private BigDecimal sequenciaOrig;
   private String statusNota;

   public BigDecimal getCusAtend() {
        return cusAtend;
   }

   public void setCusAtend(BigDecimal cusAtend) {
        this.cusAtend = cusAtend;
   }

   public String getNroAtoConcDraw() {
        return nroAtoConcDraw;
   }

   public void setNroAtoConcDraw(String nroAtoConcDraw) {
        this.nroAtoConcDraw = nroAtoConcDraw;
   }

   public BigDecimal getNroMemorando() {
        return nroMemorando;
   }

   public void setNroMemorando(BigDecimal nroMemorando) {
        this.nroMemorando = nroMemorando;
   }

   public String getNroRegExport() {
        return nroRegExport;
   }

   public void setNroRegExport(String nroRegExport) {
        this.nroRegExport = nroRegExport;
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

   @Override
   public String getEntityName() {
        return "LigacaoPedidoNotaTemp";
   }

   @Override
   public LigacaoPedidoNotaTemp fromVO(DynamicVO vo) {
        this.cusAtend = vo.asBigDecimal("CUSATEND");
        this.nroAtoConcDraw = vo.asString("NROATOCONCDRAW");
        this.nroMemorando = vo.asBigDecimal("NROMEMORANDO");
        this.nroRegExport = vo.asString("NROREGEXPORT");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        this.ordemProd = vo.asBigDecimal("ORDEMPROD");
        this.qtdAtendida = vo.asBigDecimal("QTDATENDIDA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaOrig = vo.asBigDecimal("SEQUENCIAORIG");
        this.statusNota = vo.asString("STATUSNOTA");
        return this;
   }
}
