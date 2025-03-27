package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DespesaInstalacaoBem extends AbstractSankhyaEntity<DespesaInstalacaoBem> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuNotaDesp() {
        return this.getVo().asBigDecimal("NUNOTADESP");
   }

   public void setNuNotaDesp(BigDecimal nuNotaDesp) {
        markAsChanged("NUNOTADESP", nuNotaDesp);
   }

   public BigDecimal getNuRateio() {
        return this.getVo().asBigDecimal("NURATEIO");
   }

   public void setNuRateio(BigDecimal nuRateio) {
        markAsChanged("NURATEIO", nuRateio);
   }

   public String getStatusRateio() {
        return this.getVo().asString("STATUSRATEIO");
   }

   public void setStatusRateio(String statusRateio) {
        markAsChanged("STATUSRATEIO", statusRateio);
   }

   public BigDecimal getVlrPendNota() {
        return this.getVo().asBigDecimal("VLRPENDNOTA");
   }

   public void setVlrPendNota(BigDecimal vlrPendNota) {
        markAsChanged("VLRPENDNOTA", vlrPendNota);
   }

   public BigDecimal getVlrTotRateio() {
        return this.getVo().asBigDecimal("VLRTOTRATEIO");
   }

   public void setVlrTotRateio(BigDecimal vlrTotRateio) {
        markAsChanged("VLRTOTRATEIO", vlrTotRateio);
   }

   @Override
   public String getTableName() {
        return "TCIDIB";
   }

   @Override
   public String getEntityName() {
        return "DespesaInstalacaoBem";
   }

   @Override
   public DespesaInstalacaoBem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
