package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LivroCDProdutorRuralRQ200 extends AbstractSankhyaEntity<LivroCDProdutorRuralRQ200> {
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
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public Timestamp getMes() {
        return mes;
   }

   public void setMes(Timestamp mes) {
        markAsChanged("MES", mes);
        this.mes = mes;
   }

   public String getNatSldFin() {
        return natSldFin;
   }

   public void setNatSldFin(String natSldFin) {
        markAsChanged("NATSLDFIN", natSldFin);
        this.natSldFin = natSldFin;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
        this.reg = reg;
   }

   public BigDecimal getSldFin() {
        return sldFin;
   }

   public void setSldFin(BigDecimal sldFin) {
        markAsChanged("SLDFIN", sldFin);
        this.sldFin = sldFin;
   }

   public BigDecimal getVlEntrada() {
        return vlEntrada;
   }

   public void setVlEntrada(BigDecimal vlEntrada) {
        markAsChanged("VLENTRADA", vlEntrada);
        this.vlEntrada = vlEntrada;
   }

   public BigDecimal getVlSaida() {
        return vlSaida;
   }

   public void setVlSaida(BigDecimal vlSaida) {
        markAsChanged("VLSAIDA", vlSaida);
        this.vlSaida = vlSaida;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   @Override
   public String getTableName() {
        return "TGFLCDPRRQ200";
   }

   @Override
   public String getEntityName() {
        return "LivroCDProdutorRuralRQ200";
   }

   @Override
   public LivroCDProdutorRuralRQ200 fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
