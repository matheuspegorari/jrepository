package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R1050 extends AbstractSankhyaEntity<PortariaCat42R1050> {
   public BigDecimal getQtdFim() {
        return this.getVo().asBigDecimal("QTDFIM");
   }

   public void setQtdFim(BigDecimal qtdFim) {
        markAsChanged("QTDFIM", qtdFim);
   }

   public BigDecimal getQtdIni() {
        return this.getVo().asBigDecimal("QTDINI");
   }

   public void setQtdIni(BigDecimal qtdIni) {
        markAsChanged("QTDINI", qtdIni);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   public BigDecimal getVlrUnitEntrec() {
        return this.getVo().asBigDecimal("VLRUNITENTREC");
   }

   public void setVlrUnitEntrec(BigDecimal vlrUnitEntrec) {
        markAsChanged("VLRUNITENTREC", vlrUnitEntrec);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodItem() {
        return this.getVo().asString("CODITEM");
   }

   public void setCodItem(String codItem) {
        markAsChanged("CODITEM", codItem);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtEntrec() {
        return this.getVo().asTimestamp("DTENTREC");
   }

   public void setDtEntrec(Timestamp dtEntrec) {
        markAsChanged("DTENTREC", dtEntrec);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public BigDecimal getIcmsTotFim() {
        return this.getVo().asBigDecimal("ICMSTOTFIM");
   }

   public void setIcmsTotFim(BigDecimal icmsTotFim) {
        markAsChanged("ICMSTOTFIM", icmsTotFim);
   }

   public BigDecimal getIcmsTotIni() {
        return this.getVo().asBigDecimal("ICMSTOTINI");
   }

   public void setIcmsTotIni(BigDecimal icmsTotIni) {
        markAsChanged("ICMSTOTINI", icmsTotIni);
   }

   public BigDecimal getNuNotaEntrec() {
        return this.getVo().asBigDecimal("NUNOTAENTREC");
   }

   public void setNuNotaEntrec(BigDecimal nuNotaEntrec) {
        markAsChanged("NUNOTAENTREC", nuNotaEntrec);
   }

   public String getTipoDivergencia() {
        return this.getVo().asString("TIPODIVERGENCIA");
   }

   public void setTipoDivergencia(String tipoDivergencia) {
        markAsChanged("TIPODIVERGENCIA", tipoDivergencia);
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
        this.setVo(vo);
        return this;
   }
}
