package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SaldoBancario extends AbstractSankhyaEntity<SaldoBancario> {
   public BigDecimal getCodCtabcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        markAsChanged("CODCTABCOINT", codCtabcoInt);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSaldoBco() {
        return this.getVo().asBigDecimal("SALDOBCO");
   }

   public void setSaldoBco(BigDecimal saldoBco) {
        markAsChanged("SALDOBCO", saldoBco);
   }

   public BigDecimal getSaldoReal() {
        return this.getVo().asBigDecimal("SALDOREAL");
   }

   public void setSaldoReal(BigDecimal saldoReal) {
        markAsChanged("SALDOREAL", saldoReal);
   }

   @Override
   public String getTableName() {
        return "TGFSBC";
   }

   @Override
   public String getEntityName() {
        return "SaldoBancario";
   }

   @Override
   public SaldoBancario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
