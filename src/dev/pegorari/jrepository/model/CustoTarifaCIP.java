package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CustoTarifaCIP extends AbstractSankhyaEntity<CustoTarifaCIP> {
   public Timestamp getDtAtual() {
        return this.getVo().asTimestamp("DTATUAL");
   }

   public void setDtAtual(Timestamp dtAtual) {
        markAsChanged("DTATUAL", dtAtual);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCusApurado() {
        return this.getVo().asBigDecimal("CUSAPURADO");
   }

   public void setCusApurado(BigDecimal cusApurado) {
        markAsChanged("CUSAPURADO", cusApurado);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
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
        this.setVo(vo);
        return this;
   }
}
