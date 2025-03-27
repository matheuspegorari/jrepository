package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class saldoImobilizado extends AbstractSankhyaEntity<saldoImobilizado> {
   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSaldo() {
        return this.getVo().asBigDecimal("SALDO");
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
   }

   public BigDecimal getTotalDep() {
        return this.getVo().asBigDecimal("TOTALDEP");
   }

   public void setTotalDep(BigDecimal totalDep) {
        markAsChanged("TOTALDEP", totalDep);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
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
        this.setVo(vo);
        return this;
   }
}
