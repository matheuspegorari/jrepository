package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LivroCDProdutorRuralRQ200 extends AbstractSankhyaEntity<LivroCDProdutorRuralRQ200> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
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

   public Timestamp getMes() {
        return this.getVo().asTimestamp("MES");
   }

   public void setMes(Timestamp mes) {
        markAsChanged("MES", mes);
   }

   public String getNatSldFin() {
        return this.getVo().asString("NATSLDFIN");
   }

   public void setNatSldFin(String natSldFin) {
        markAsChanged("NATSLDFIN", natSldFin);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   public BigDecimal getSldFin() {
        return this.getVo().asBigDecimal("SLDFIN");
   }

   public void setSldFin(BigDecimal sldFin) {
        markAsChanged("SLDFIN", sldFin);
   }

   public BigDecimal getVlEntrada() {
        return this.getVo().asBigDecimal("VLENTRADA");
   }

   public void setVlEntrada(BigDecimal vlEntrada) {
        markAsChanged("VLENTRADA", vlEntrada);
   }

   public BigDecimal getVlSaida() {
        return this.getVo().asBigDecimal("VLSAIDA");
   }

   public void setVlSaida(BigDecimal vlSaida) {
        markAsChanged("VLSAIDA", vlSaida);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
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
        this.setVo(vo);
        return this;
   }
}
