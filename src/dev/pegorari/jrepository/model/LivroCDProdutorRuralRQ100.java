package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LivroCDProdutorRuralRQ100 extends AbstractSankhyaEntity<LivroCDProdutorRuralRQ100> {
   public String getCodConta() {
        return this.getVo().asString("CODCONTA");
   }

   public void setCodConta(String codConta) {
        markAsChanged("CODCONTA", codConta);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodImovel() {
        return this.getVo().asString("CODIMOVEL");
   }

   public void setCodImovel(String codImovel) {
        markAsChanged("CODIMOVEL", codImovel);
   }

   public Timestamp getData() {
        return this.getVo().asTimestamp("DATA");
   }

   public void setData(Timestamp data) {
        markAsChanged("DATA", data);
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

   public String getHist() {
        return this.getVo().asString("HIST");
   }

   public void setHist(String hist) {
        markAsChanged("HIST", hist);
   }

   public String getIdPartic() {
        return this.getVo().asString("IDPARTIC");
   }

   public void setIdPartic(String idPartic) {
        markAsChanged("IDPARTIC", idPartic);
   }

   public String getNatSldFin() {
        return this.getVo().asString("NATSLDFIN");
   }

   public void setNatSldFin(String natSldFin) {
        markAsChanged("NATSLDFIN", natSldFin);
   }

   public String getNumDoc() {
        return this.getVo().asString("NUMDOC");
   }

   public void setNumDoc(String numDoc) {
        markAsChanged("NUMDOC", numDoc);
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

   public String getTipoDoc() {
        return this.getVo().asString("TIPODOC");
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   public String getTipoLanc() {
        return this.getVo().asString("TIPOLANC");
   }

   public void setTipoLanc(String tipoLanc) {
        markAsChanged("TIPOLANC", tipoLanc);
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

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getConciliado() {
        return this.getVo().asString("CONCILIADO");
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
   }

   public String getMes() {
        return this.getVo().asString("MES");
   }

   public void setMes(String mes) {
        markAsChanged("MES", mes);
   }

   public BigDecimal getVlBaixaNat() {
        return this.getVo().asBigDecimal("VLBAIXANAT");
   }

   public void setVlBaixaNat(BigDecimal vlBaixaNat) {
        markAsChanged("VLBAIXANAT", vlBaixaNat);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getVlTotalDoc() {
        return this.getVo().asBigDecimal("VLTOTALDOC");
   }

   public void setVlTotalDoc(BigDecimal vlTotalDoc) {
        markAsChanged("VLTOTALDOC", vlTotalDoc);
   }

   public BigDecimal getCodCtabCoint() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   @Override
   public String getTableName() {
        return "TGFLCDPRRQ100";
   }

   @Override
   public String getEntityName() {
        return "LivroCDProdutorRuralRQ100";
   }

   @Override
   public LivroCDProdutorRuralRQ100 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
