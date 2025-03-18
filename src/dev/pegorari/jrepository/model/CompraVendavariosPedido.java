package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CompraVendavariosPedido extends AbstractSankhyaEntity<CompraVendavariosPedido> {
   private BigDecimal cusAtend;
   private BigDecimal nuNota;
   private BigDecimal nuNotaOrig;
   private BigDecimal ordemProd;
   private BigDecimal qtdAtendida;
   private BigDecimal sequencia;
   private BigDecimal sequenciaOrig;
   private String statusNota;
   private String nroRegExport;
   private String nroAtoConcDraw;
   private BigDecimal nroMemorando;
   private String fixacao;

   public BigDecimal getCusAtend() {
        return cusAtend;
   }

   public void setCusAtend(BigDecimal cusAtend) {
        markAsChanged("CUSATEND", cusAtend);
        this.cusAtend = cusAtend;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaOrig() {
        return nuNotaOrig;
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
        this.nuNotaOrig = nuNotaOrig;
   }

   public BigDecimal getOrdemProd() {
        return ordemProd;
   }

   public void setOrdemProd(BigDecimal ordemProd) {
        markAsChanged("ORDEMPROD", ordemProd);
        this.ordemProd = ordemProd;
   }

   public BigDecimal getQtdAtendida() {
        return qtdAtendida;
   }

   public void setQtdAtendida(BigDecimal qtdAtendida) {
        markAsChanged("QTDATENDIDA", qtdAtendida);
        this.qtdAtendida = qtdAtendida;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaOrig() {
        return sequenciaOrig;
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
        this.sequenciaOrig = sequenciaOrig;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
        this.statusNota = statusNota;
   }

   public String getNroRegExport() {
        return nroRegExport;
   }

   public void setNroRegExport(String nroRegExport) {
        markAsChanged("NROREGEXPORT", nroRegExport);
        this.nroRegExport = nroRegExport;
   }

   public String getNroAtoConcDraw() {
        return nroAtoConcDraw;
   }

   public void setNroAtoConcDraw(String nroAtoConcDraw) {
        markAsChanged("NROATOCONCDRAW", nroAtoConcDraw);
        this.nroAtoConcDraw = nroAtoConcDraw;
   }

   public BigDecimal getNroMemorando() {
        return nroMemorando;
   }

   public void setNroMemorando(BigDecimal nroMemorando) {
        markAsChanged("NROMEMORANDO", nroMemorando);
        this.nroMemorando = nroMemorando;
   }

   public String getFixacao() {
        return fixacao;
   }

   public void setFixacao(String fixacao) {
        markAsChanged("FIXACAO", fixacao);
        this.fixacao = fixacao;
   }

   @Override
   public String getTableName() {
        return "TGFVAR";
   }

   @Override
   public String getEntityName() {
        return "CompraVendavariosPedido";
   }

   @Override
   public CompraVendavariosPedido fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.cusAtend = vo.asBigDecimal("CUSATEND");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        this.ordemProd = vo.asBigDecimal("ORDEMPROD");
        this.qtdAtendida = vo.asBigDecimal("QTDATENDIDA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaOrig = vo.asBigDecimal("SEQUENCIAORIG");
        this.statusNota = vo.asString("STATUSNOTA");
        this.nroRegExport = vo.asString("NROREGEXPORT");
        this.nroAtoConcDraw = vo.asString("NROATOCONCDRAW");
        this.nroMemorando = vo.asBigDecimal("NROMEMORANDO");
        this.fixacao = vo.asString("FIXACAO");
        return this;
   }
}
