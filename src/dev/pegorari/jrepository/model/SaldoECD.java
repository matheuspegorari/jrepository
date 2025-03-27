package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SaldoECD extends AbstractSankhyaEntity<SaldoECD> {
   public BigDecimal getSaldoFinMes() {
        return this.getVo().asBigDecimal("SALDOFINMES");
   }

   public void setSaldoFinMes(BigDecimal saldoFinMes) {
        markAsChanged("SALDOFINMES", saldoFinMes);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getIndStIni() {
        return this.getVo().asString("INDSTINI");
   }

   public void setIndStIni(String indStIni) {
        markAsChanged("INDSTINI", indStIni);
   }

   public String getCodCencus() {
        return this.getVo().asString("CODCENCUS");
   }

   public void setCodCencus(String codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public String getIndStFin() {
        return this.getVo().asString("INDSTFIN");
   }

   public void setIndStFin(String indStFin) {
        markAsChanged("INDSTFIN", indStFin);
   }

   public BigDecimal getSaldoInicMes() {
        return this.getVo().asBigDecimal("SALDOINICMES");
   }

   public void setSaldoInicMes(BigDecimal saldoInicMes) {
        markAsChanged("SALDOINICMES", saldoInicMes);
   }

   public BigDecimal getCredMes() {
        return this.getVo().asBigDecimal("CREDMES");
   }

   public void setCredMes(BigDecimal credMes) {
        markAsChanged("CREDMES", credMes);
   }

   public BigDecimal getDebMes() {
        return this.getVo().asBigDecimal("DEBMES");
   }

   public void setDebMes(BigDecimal debMes) {
        markAsChanged("DEBMES", debMes);
   }

   public String getCtaCtb() {
        return this.getVo().asString("CTACTB");
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   @Override
   public String getTableName() {
        return "TCBSAL_IMP";
   }

   @Override
   public String getEntityName() {
        return "SaldoECD";
   }

   @Override
   public SaldoECD fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
