package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CustoTarifaCIP implements SankhyaEntity<CustoTarifaCIP> {

   private Timestamp dtAtual;
   private BigDecimal codEmp;
   private BigDecimal cusApurado;
   private BigDecimal codProd;

   public Timestamp getDtAtual() {
        return dtAtual;
   }

   public void setDtAtual(Timestamp dtAtual) {
        this.dtAtual = dtAtual;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCusApurado() {
        return cusApurado;
   }

   public void setCusApurado(BigDecimal cusApurado) {
        this.cusApurado = cusApurado;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   @Override
   public String getEntityName() {
        return "CustoTarifaCIP";
   }

   @Override
   public CustoTarifaCIP fromVO(DynamicVO vo) {
        this.dtAtual = vo.asTimestamp("DTATUAL");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.cusApurado = vo.asBigDecimal("CUSAPURADO");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
