package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LivroCDProdutorRuralRQ100 extends AbstractSankhyaEntity<LivroCDProdutorRuralRQ100> {
   private String codConta;
   private BigDecimal codEmp;
   private String codImovel;
   private Timestamp data;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String hist;
   private String idPartic;
   private String natSldFin;
   private String numDoc;
   private String reg;
   private BigDecimal sldFin;
   private String tipoDoc;
   private String tipoLanc;
   private BigDecimal vlEntrada;
   private BigDecimal vlSaida;
   private BigDecimal sequencia;
   private String conciliado;
   private String mes;
   private BigDecimal vlBaixaNat;
   private BigDecimal nuFin;
   private BigDecimal vlTotalDoc;
   private BigDecimal codCtabCoint;
   private BigDecimal codNat;
   private BigDecimal codParc;

   public String getCodConta() {
        return codConta;
   }

   public void setCodConta(String codConta) {
        markAsChanged("CODCONTA", codConta);
        this.codConta = codConta;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getCodImovel() {
        return codImovel;
   }

   public void setCodImovel(String codImovel) {
        markAsChanged("CODIMOVEL", codImovel);
        this.codImovel = codImovel;
   }

   public Timestamp getData() {
        return data;
   }

   public void setData(Timestamp data) {
        markAsChanged("DATA", data);
        this.data = data;
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

   public String getHist() {
        return hist;
   }

   public void setHist(String hist) {
        markAsChanged("HIST", hist);
        this.hist = hist;
   }

   public String getIdPartic() {
        return idPartic;
   }

   public void setIdPartic(String idPartic) {
        markAsChanged("IDPARTIC", idPartic);
        this.idPartic = idPartic;
   }

   public String getNatSldFin() {
        return natSldFin;
   }

   public void setNatSldFin(String natSldFin) {
        markAsChanged("NATSLDFIN", natSldFin);
        this.natSldFin = natSldFin;
   }

   public String getNumDoc() {
        return numDoc;
   }

   public void setNumDoc(String numDoc) {
        markAsChanged("NUMDOC", numDoc);
        this.numDoc = numDoc;
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

   public String getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
        this.tipoDoc = tipoDoc;
   }

   public String getTipoLanc() {
        return tipoLanc;
   }

   public void setTipoLanc(String tipoLanc) {
        markAsChanged("TIPOLANC", tipoLanc);
        this.tipoLanc = tipoLanc;
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

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
        this.conciliado = conciliado;
   }

   public String getMes() {
        return mes;
   }

   public void setMes(String mes) {
        markAsChanged("MES", mes);
        this.mes = mes;
   }

   public BigDecimal getVlBaixaNat() {
        return vlBaixaNat;
   }

   public void setVlBaixaNat(BigDecimal vlBaixaNat) {
        markAsChanged("VLBAIXANAT", vlBaixaNat);
        this.vlBaixaNat = vlBaixaNat;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public BigDecimal getVlTotalDoc() {
        return vlTotalDoc;
   }

   public void setVlTotalDoc(BigDecimal vlTotalDoc) {
        markAsChanged("VLTOTALDOC", vlTotalDoc);
        this.vlTotalDoc = vlTotalDoc;
   }

   public BigDecimal getCodCtabCoint() {
        return codCtabCoint;
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
        this.codCtabCoint = codCtabCoint;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
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
        return "TGFLCDPRRQ100";
   }

   @Override
   public String getEntityName() {
        return "LivroCDProdutorRuralRQ100";
   }

   @Override
   public LivroCDProdutorRuralRQ100 fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codConta = vo.asString("CODCONTA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codImovel = vo.asString("CODIMOVEL");
        this.data = vo.asTimestamp("DATA");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.hist = vo.asString("HIST");
        this.idPartic = vo.asString("IDPARTIC");
        this.natSldFin = vo.asString("NATSLDFIN");
        this.numDoc = vo.asString("NUMDOC");
        this.reg = vo.asString("REG");
        this.sldFin = vo.asBigDecimal("SLDFIN");
        this.tipoDoc = vo.asString("TIPODOC");
        this.tipoLanc = vo.asString("TIPOLANC");
        this.vlEntrada = vo.asBigDecimal("VLENTRADA");
        this.vlSaida = vo.asBigDecimal("VLSAIDA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.conciliado = vo.asString("CONCILIADO");
        this.mes = vo.asString("MES");
        this.vlBaixaNat = vo.asBigDecimal("VLBAIXANAT");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.vlTotalDoc = vo.asBigDecimal("VLTOTALDOC");
        this.codCtabCoint = vo.asBigDecimal("CODCTABCOINT");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        return this;
   }
}
