package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SaldoECD extends AbstractSankhyaEntity<SaldoECD> {
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
        markAsChanged("SALDOFINMES", saldoFinMes);
        this.saldoFinMes = saldoFinMes;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getIndStIni() {
        return indStIni;
   }

   public void setIndStIni(String indStIni) {
        markAsChanged("INDSTINI", indStIni);
        this.indStIni = indStIni;
   }

   public String getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(String codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public String getIndStFin() {
        return indStFin;
   }

   public void setIndStFin(String indStFin) {
        markAsChanged("INDSTFIN", indStFin);
        this.indStFin = indStFin;
   }

   public BigDecimal getSaldoInicMes() {
        return saldoInicMes;
   }

   public void setSaldoInicMes(BigDecimal saldoInicMes) {
        markAsChanged("SALDOINICMES", saldoInicMes);
        this.saldoInicMes = saldoInicMes;
   }

   public BigDecimal getCredMes() {
        return credMes;
   }

   public void setCredMes(BigDecimal credMes) {
        markAsChanged("CREDMES", credMes);
        this.credMes = credMes;
   }

   public BigDecimal getDebMes() {
        return debMes;
   }

   public void setDebMes(BigDecimal debMes) {
        markAsChanged("DEBMES", debMes);
        this.debMes = debMes;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
        this.ctaCtb = ctaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
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
