package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LivroCDProdutorRuralRQ200 implements SankhyaEntity<LivroCDProdutorRuralRQ200> {

   private BigDecimal codEmp;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private Timestamp mes;
   private String natSldFin;
   private String reg;
   private BigDecimal sldFin;
   private BigDecimal vlEntrada;
   private BigDecimal vlSaida;
   private BigDecimal codParc;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
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

   public Timestamp getMes() {
        return mes;
   }

   public void setMes(Timestamp mes) {
        this.mes = mes;
   }

   public String getNatSldFin() {
        return natSldFin;
   }

   public void setNatSldFin(String natSldFin) {
        this.natSldFin = natSldFin;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   public BigDecimal getSldFin() {
        return sldFin;
   }

   public void setSldFin(BigDecimal sldFin) {
        this.sldFin = sldFin;
   }

   public BigDecimal getVlEntrada() {
        return vlEntrada;
   }

   public void setVlEntrada(BigDecimal vlEntrada) {
        this.vlEntrada = vlEntrada;
   }

   public BigDecimal getVlSaida() {
        return vlSaida;
   }

   public void setVlSaida(BigDecimal vlSaida) {
        this.vlSaida = vlSaida;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   @Override
   public String getEntityName() {
        return "LivroCDProdutorRuralRQ200";
   }

   @Override
   public LivroCDProdutorRuralRQ200 fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.mes = vo.asTimestamp("MES");
        this.natSldFin = vo.asString("NATSLDFIN");
        this.reg = vo.asString("REG");
        this.sldFin = vo.asBigDecimal("SLDFIN");
        this.vlEntrada = vo.asBigDecimal("VLENTRADA");
        this.vlSaida = vo.asBigDecimal("VLSAIDA");
        this.codParc = vo.asBigDecimal("CODPARC");
        return this;
   }
}
