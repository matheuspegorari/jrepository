package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ResumoLoteFaturamento extends AbstractSankhyaEntity<ResumoLoteFaturamento> {
   private Timestamp dhInclusao;
   private Timestamp dhUltTenta;
   private BigDecimal numLote;
   private BigDecimal nuNota;
   private BigDecimal qtdTentFat;
   private String status;

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        this.dhInclusao = dhInclusao;
   }

   public Timestamp getDhUltTenta() {
        return dhUltTenta;
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        this.dhUltTenta = dhUltTenta;
   }

   public BigDecimal getNumLote() {
        return numLote;
   }

   public void setNumLote(BigDecimal numLote) {
        this.numLote = numLote;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getQtdTentFat() {
        return qtdTentFat;
   }

   public void setQtdTentFat(BigDecimal qtdTentFat) {
        this.qtdTentFat = qtdTentFat;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   @Override
   public String getTableName() {
        return "TGFRFT";
   }

   @Override
   public String getEntityName() {
        return "ResumoLoteFaturamento";
   }

   @Override
   public ResumoLoteFaturamento fromVO(DynamicVO vo) {
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.dhUltTenta = vo.asTimestamp("DHULTTENTA");
        this.numLote = vo.asBigDecimal("NUMLOTE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtdTentFat = vo.asBigDecimal("QTDTENTFAT");
        this.status = vo.asString("STATUS");
        return this;
   }
}
