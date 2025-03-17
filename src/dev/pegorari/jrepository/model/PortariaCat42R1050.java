package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R1050 extends AbstractSankhyaEntity<PortariaCat42R1050> {
   private BigDecimal qtdFim;
   private BigDecimal qtdIni;
   private String reg;
   private BigDecimal vlrUnitEntrec;
   private BigDecimal codEmp;
   private String codItem;
   private BigDecimal codProd;
   private String digitado;
   private Timestamp dtEntrec;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private BigDecimal icmsTotFim;
   private BigDecimal icmsTotIni;
   private BigDecimal nuNotaEntrec;
   private String tipoDivergencia;

   public BigDecimal getQtdFim() {
        return qtdFim;
   }

   public void setQtdFim(BigDecimal qtdFim) {
        this.qtdFim = qtdFim;
   }

   public BigDecimal getQtdIni() {
        return qtdIni;
   }

   public void setQtdIni(BigDecimal qtdIni) {
        this.qtdIni = qtdIni;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   public BigDecimal getVlrUnitEntrec() {
        return vlrUnitEntrec;
   }

   public void setVlrUnitEntrec(BigDecimal vlrUnitEntrec) {
        this.vlrUnitEntrec = vlrUnitEntrec;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCodItem() {
        return codItem;
   }

   public void setCodItem(String codItem) {
        this.codItem = codItem;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtEntrec() {
        return dtEntrec;
   }

   public void setDtEntrec(Timestamp dtEntrec) {
        this.dtEntrec = dtEntrec;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public BigDecimal getIcmsTotFim() {
        return icmsTotFim;
   }

   public void setIcmsTotFim(BigDecimal icmsTotFim) {
        this.icmsTotFim = icmsTotFim;
   }

   public BigDecimal getIcmsTotIni() {
        return icmsTotIni;
   }

   public void setIcmsTotIni(BigDecimal icmsTotIni) {
        this.icmsTotIni = icmsTotIni;
   }

   public BigDecimal getNuNotaEntrec() {
        return nuNotaEntrec;
   }

   public void setNuNotaEntrec(BigDecimal nuNotaEntrec) {
        this.nuNotaEntrec = nuNotaEntrec;
   }

   public String getTipoDivergencia() {
        return tipoDivergencia;
   }

   public void setTipoDivergencia(String tipoDivergencia) {
        this.tipoDivergencia = tipoDivergencia;
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R1050";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R1050";
   }

   @Override
   public PortariaCat42R1050 fromVO(DynamicVO vo) {
        this.qtdFim = vo.asBigDecimal("QTDFIM");
        this.qtdIni = vo.asBigDecimal("QTDINI");
        this.reg = vo.asString("REG");
        this.vlrUnitEntrec = vo.asBigDecimal("VLRUNITENTREC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codItem = vo.asString("CODITEM");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.digitado = vo.asString("DIGITADO");
        this.dtEntrec = vo.asTimestamp("DTENTREC");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.icmsTotFim = vo.asBigDecimal("ICMSTOTFIM");
        this.icmsTotIni = vo.asBigDecimal("ICMSTOTINI");
        this.nuNotaEntrec = vo.asBigDecimal("NUNOTAENTREC");
        this.tipoDivergencia = vo.asString("TIPODIVERGENCIA");
        return this;
   }
}
