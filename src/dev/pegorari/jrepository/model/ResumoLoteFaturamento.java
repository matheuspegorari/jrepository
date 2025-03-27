package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ResumoLoteFaturamento extends AbstractSankhyaEntity<ResumoLoteFaturamento> {
   public Timestamp getDhInclusao() {
        return this.getVo().asTimestamp("DHINCLUSAO");
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
   }

   public Timestamp getDhUltTenta() {
        return this.getVo().asTimestamp("DHULTTENTA");
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        markAsChanged("DHULTTENTA", dhUltTenta);
   }

   public BigDecimal getNumLote() {
        return this.getVo().asBigDecimal("NUMLOTE");
   }

   public void setNumLote(BigDecimal numLote) {
        markAsChanged("NUMLOTE", numLote);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtdTentFat() {
        return this.getVo().asBigDecimal("QTDTENTFAT");
   }

   public void setQtdTentFat(BigDecimal qtdTentFat) {
        markAsChanged("QTDTENTFAT", qtdTentFat);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
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
        this.setVo(vo);
        return this;
   }
}
