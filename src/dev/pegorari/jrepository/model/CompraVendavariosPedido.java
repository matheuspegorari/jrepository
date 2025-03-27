package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CompraVendavariosPedido extends AbstractSankhyaEntity<CompraVendavariosPedido> {
   public BigDecimal getCusAtend() {
        return this.getVo().asBigDecimal("CUSATEND");
   }

   public void setCusAtend(BigDecimal cusAtend) {
        markAsChanged("CUSATEND", cusAtend);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaOrig() {
        return this.getVo().asBigDecimal("NUNOTAORIG");
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
   }

   public BigDecimal getOrdemProd() {
        return this.getVo().asBigDecimal("ORDEMPROD");
   }

   public void setOrdemProd(BigDecimal ordemProd) {
        markAsChanged("ORDEMPROD", ordemProd);
   }

   public BigDecimal getQtdAtendida() {
        return this.getVo().asBigDecimal("QTDATENDIDA");
   }

   public void setQtdAtendida(BigDecimal qtdAtendida) {
        markAsChanged("QTDATENDIDA", qtdAtendida);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSequenciaOrig() {
        return this.getVo().asBigDecimal("SEQUENCIAORIG");
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
   }

   public String getStatusNota() {
        return this.getVo().asString("STATUSNOTA");
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
   }

   public String getNroRegExport() {
        return this.getVo().asString("NROREGEXPORT");
   }

   public void setNroRegExport(String nroRegExport) {
        markAsChanged("NROREGEXPORT", nroRegExport);
   }

   public String getNroAtoConcDraw() {
        return this.getVo().asString("NROATOCONCDRAW");
   }

   public void setNroAtoConcDraw(String nroAtoConcDraw) {
        markAsChanged("NROATOCONCDRAW", nroAtoConcDraw);
   }

   public BigDecimal getNroMemorando() {
        return this.getVo().asBigDecimal("NROMEMORANDO");
   }

   public void setNroMemorando(BigDecimal nroMemorando) {
        markAsChanged("NROMEMORANDO", nroMemorando);
   }

   public String getFixacao() {
        return this.getVo().asString("FIXACAO");
   }

   public void setFixacao(String fixacao) {
        markAsChanged("FIXACAO", fixacao);
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
        this.setVo(vo);
        return this;
   }
}
