package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SaldoBancario extends AbstractSankhyaEntity<SaldoBancario> {
   private BigDecimal codCtabcoInt;
   private Timestamp referencia;
   private BigDecimal saldoBco;
   private BigDecimal saldoReal;

   public BigDecimal getCodCtabcoInt() {
        return codCtabcoInt;
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        this.codCtabcoInt = codCtabcoInt;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSaldoBco() {
        return saldoBco;
   }

   public void setSaldoBco(BigDecimal saldoBco) {
        this.saldoBco = saldoBco;
   }

   public BigDecimal getSaldoReal() {
        return saldoReal;
   }

   public void setSaldoReal(BigDecimal saldoReal) {
        this.saldoReal = saldoReal;
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
        this.codCtabcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.saldoBco = vo.asBigDecimal("SALDOBCO");
        this.saldoReal = vo.asBigDecimal("SALDOREAL");
        return this;
   }
}
