package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControleTelaI18n implements SankhyaEntity<ControleTelaI18n> {

   private BigDecimal codEmp;
   private BigDecimal codFunc;
   private BigDecimal codHistocor;
   private Timestamp dtMov;
   private BigDecimal entrada;
   private String falta;
   private BigDecimal numItem;
   private BigDecimal numOs;
   private BigDecimal nuOcor;
   private BigDecimal saida;
   private BigDecimal sequencia;
   private BigDecimal turno;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodHistocor() {
        return codHistocor;
   }

   public void setCodHistocor(BigDecimal codHistocor) {
        this.codHistocor = codHistocor;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        this.dtMov = dtMov;
   }

   public BigDecimal getEntrada() {
        return entrada;
   }

   public void setEntrada(BigDecimal entrada) {
        this.entrada = entrada;
   }

   public String getFalta() {
        return falta;
   }

   public void setFalta(String falta) {
        this.falta = falta;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNuOcor() {
        return nuOcor;
   }

   public void setNuOcor(BigDecimal nuOcor) {
        this.nuOcor = nuOcor;
   }

   public BigDecimal getSaida() {
        return saida;
   }

   public void setSaida(BigDecimal saida) {
        this.saida = saida;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getTurno() {
        return turno;
   }

   public void setTurno(BigDecimal turno) {
        this.turno = turno;
   }

   @Override
   public String getEntityName() {
        return "ControleTelaI18n";
   }

   @Override
   public ControleTelaI18n fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codHistocor = vo.asBigDecimal("CODHISTOCOR");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.entrada = vo.asBigDecimal("ENTRADA");
        this.falta = vo.asString("FALTA");
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.nuOcor = vo.asBigDecimal("NUOCOR");
        this.saida = vo.asBigDecimal("SAIDA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.turno = vo.asBigDecimal("TURNO");
        return this;
   }
}
