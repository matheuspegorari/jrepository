package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class saldoImobilizado implements SankhyaEntity<saldoImobilizado> {

   private String codBem;
   private Timestamp referencia;
   private BigDecimal saldo;
   private BigDecimal totalDep;
   private BigDecimal codProd;

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        this.codBem = codBem;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSaldo() {
        return saldo;
   }

   public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
   }

   public BigDecimal getTotalDep() {
        return totalDep;
   }

   public void setTotalDep(BigDecimal totalDep) {
        this.totalDep = totalDep;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   @Override
   public String getEntityName() {
        return "saldoImobilizado";
   }

   @Override
   public saldoImobilizado fromVO(DynamicVO vo) {
        this.codBem = vo.asString("CODBEM");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.saldo = vo.asBigDecimal("SALDO");
        this.totalDep = vo.asBigDecimal("TOTALDEP");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
