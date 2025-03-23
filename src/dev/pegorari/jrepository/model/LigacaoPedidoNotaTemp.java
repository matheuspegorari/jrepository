package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoPedidoNotaTemp extends AbstractSankhyaEntity<LigacaoPedidoNotaTemp> {
   private BigDecimal cusAtend;
   private String nroAtoConcdraw;
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
        markAsChanged("CUSATEND", cusAtend);
        this.cusAtend = cusAtend;
   }

   public String getNroAtoConcdraw() {
        return nroAtoConcdraw;
   }

   public void setNroAtoConcdraw(String nroAtoConcdraw) {
        markAsChanged("NROATOCONCDRAW", nroAtoConcdraw);
        this.nroAtoConcdraw = nroAtoConcdraw;
   }

   public BigDecimal getNroMemorando() {
        return nroMemorando;
   }

   public void setNroMemorando(BigDecimal nroMemorando) {
        markAsChanged("NROMEMORANDO", nroMemorando);
        this.nroMemorando = nroMemorando;
   }

   public String getNroRegExport() {
        return nroRegExport;
   }

   public void setNroRegExport(String nroRegExport) {
        markAsChanged("NROREGEXPORT", nroRegExport);
        this.nroRegExport = nroRegExport;
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

   @Override
   public String getTableName() {
        return "TGFLIGT";
   }

   @Override
   public String getEntityName() {
        return "LigacaoPedidoNotaTemp";
   }

   @Override
   public LigacaoPedidoNotaTemp fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.cusAtend = vo.asBigDecimal("CUSATEND");
        this.nroAtoConcdraw = vo.asString("NROATOCONCDRAW");
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
