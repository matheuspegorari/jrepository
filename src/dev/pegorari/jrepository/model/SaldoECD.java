package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SaldoECD implements SankhyaEntity<SaldoECD> {

   private BigDecimal saldoFinMes;
   private Timestamp referencia;
   private String indStIni;
   private String codCencus;
   private String indStFin;
   private BigDecimal saldoInicMes;
   private BigDecimal credMes;
   private BigDecimal debMes;
   private String ctaCtb;
   private BigDecimal codEmp;

   public BigDecimal getSaldoFinMes() {
        return saldoFinMes;
   }

   public void setSaldoFinMes(BigDecimal saldoFinMes) {
        this.saldoFinMes = saldoFinMes;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public String getIndStIni() {
        return indStIni;
   }

   public void setIndStIni(String indStIni) {
        this.indStIni = indStIni;
   }

   public String getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(String codCencus) {
        this.codCencus = codCencus;
   }

   public String getIndStFin() {
        return indStFin;
   }

   public void setIndStFin(String indStFin) {
        this.indStFin = indStFin;
   }

   public BigDecimal getSaldoInicMes() {
        return saldoInicMes;
   }

   public void setSaldoInicMes(BigDecimal saldoInicMes) {
        this.saldoInicMes = saldoInicMes;
   }

   public BigDecimal getCredMes() {
        return credMes;
   }

   public void setCredMes(BigDecimal credMes) {
        this.credMes = credMes;
   }

   public BigDecimal getDebMes() {
        return debMes;
   }

   public void setDebMes(BigDecimal debMes) {
        this.debMes = debMes;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        this.ctaCtb = ctaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   @Override
   public String getEntityName() {
        return "SaldoECD";
   }

   @Override
   public SaldoECD fromVO(DynamicVO vo) {
        this.saldoFinMes = vo.asBigDecimal("SALDOFINMES");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.indStIni = vo.asString("INDSTINI");
        this.codCencus = vo.asString("CODCENCUS");
        this.indStFin = vo.asString("INDSTFIN");
        this.saldoInicMes = vo.asBigDecimal("SALDOINICMES");
        this.credMes = vo.asBigDecimal("CREDMES");
        this.debMes = vo.asBigDecimal("DEBMES");
        this.ctaCtb = vo.asString("CTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        return this;
   }
}
