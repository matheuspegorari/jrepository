package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class saldoImobilizado extends AbstractSankhyaEntity<saldoImobilizado> {
   private String codBem;
   private Timestamp referencia;
   private BigDecimal saldo;
   private BigDecimal totalDep;
   private BigDecimal codProd;

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
        this.codBem = codBem;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getSaldo() {
        return saldo;
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
        this.saldo = saldo;
   }

   public BigDecimal getTotalDep() {
        return totalDep;
   }

   public void setTotalDep(BigDecimal totalDep) {
        markAsChanged("TOTALDEP", totalDep);
        this.totalDep = totalDep;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   @Override
   public String getTableName() {
        return "TCISAL";
   }

   @Override
   public String getEntityName() {
        return "saldoImobilizado";
   }

   @Override
   public saldoImobilizado fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codBem = vo.asString("CODBEM");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.saldo = vo.asBigDecimal("SALDO");
        this.totalDep = vo.asBigDecimal("TOTALDEP");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
