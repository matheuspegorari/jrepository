package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CustoTarifaCIP extends AbstractSankhyaEntity<CustoTarifaCIP> {
   private Timestamp dtAtual;
   private BigDecimal codEmp;
   private BigDecimal cusApurado;
   private BigDecimal codProd;

   public Timestamp getDtAtual() {
        return dtAtual;
   }

   public void setDtAtual(Timestamp dtAtual) {
        markAsChanged("DTATUAL", dtAtual);
        this.dtAtual = dtAtual;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCusApurado() {
        return cusApurado;
   }

   public void setCusApurado(BigDecimal cusApurado) {
        markAsChanged("CUSAPURADO", cusApurado);
        this.cusApurado = cusApurado;
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
        return "TGFCUSTAR";
   }

   @Override
   public String getEntityName() {
        return "CustoTarifaCIP";
   }

   @Override
   public CustoTarifaCIP fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.dtAtual = vo.asTimestamp("DTATUAL");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.cusApurado = vo.asBigDecimal("CUSAPURADO");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
