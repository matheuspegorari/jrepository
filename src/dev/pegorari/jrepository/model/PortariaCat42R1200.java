package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R1200 implements SankhyaEntity<PortariaCat42R1200> {

   private String cgcCpf;
   private BigDecimal baseIcmstot;
   private BigDecimal codCfo;
   private BigDecimal codEmp;
   private String codItem;
   private BigDecimal codLegal;
   private String codMod;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private Timestamp data;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String ecfFab;
   private BigDecimal icmsTot;
   private BigDecimal indOper;
   private BigDecimal numDoc;
   private BigDecimal nuNota;
   private BigDecimal qtd;
   private String reg;
   private BigDecimal sequencia;
   private String ser;
   private String tipMov;
   private BigDecimal vlConfr;
   private BigDecimal vlrParaAtualSaldo;
   private BigDecimal vlrUnit;
   private BigDecimal vlrIcms;
   private BigDecimal tipoDivergencia;

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
   }

   public BigDecimal getBaseIcmstot() {
        return baseIcmstot;
   }

   public void setBaseIcmstot(BigDecimal baseIcmstot) {
        this.baseIcmstot = baseIcmstot;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        this.codCfo = codCfo;
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

   public BigDecimal getCodLegal() {
        return codLegal;
   }

   public void setCodLegal(BigDecimal codLegal) {
        this.codLegal = codLegal;
   }

   public String getCodMod() {
        return codMod;
   }

   public void setCodMod(String codMod) {
        this.codMod = codMod;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public Timestamp getData() {
        return data;
   }

   public void setData(Timestamp data) {
        this.data = data;
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

   public String getEcfFab() {
        return ecfFab;
   }

   public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
   }

   public BigDecimal getIcmsTot() {
        return icmsTot;
   }

   public void setIcmsTot(BigDecimal icmsTot) {
        this.icmsTot = icmsTot;
   }

   public BigDecimal getIndOper() {
        return indOper;
   }

   public void setIndOper(BigDecimal indOper) {
        this.indOper = indOper;
   }

   public BigDecimal getNumDoc() {
        return numDoc;
   }

   public void setNumDoc(BigDecimal numDoc) {
        this.numDoc = numDoc;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSer() {
        return ser;
   }

   public void setSer(String ser) {
        this.ser = ser;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
   }

   public BigDecimal getVlConfr() {
        return vlConfr;
   }

   public void setVlConfr(BigDecimal vlConfr) {
        this.vlConfr = vlConfr;
   }

   public BigDecimal getVlrParaAtualSaldo() {
        return vlrParaAtualSaldo;
   }

   public void setVlrParaAtualSaldo(BigDecimal vlrParaAtualSaldo) {
        this.vlrParaAtualSaldo = vlrParaAtualSaldo;
   }

   public BigDecimal getVlrUnit() {
        return vlrUnit;
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        this.vlrUnit = vlrUnit;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getTipoDivergencia() {
        return tipoDivergencia;
   }

   public void setTipoDivergencia(BigDecimal tipoDivergencia) {
        this.tipoDivergencia = tipoDivergencia;
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R1200";
   }

   @Override
   public PortariaCat42R1200 fromVO(DynamicVO vo) {
        this.cgcCpf = vo.asString("CGCCPF");
        this.baseIcmstot = vo.asBigDecimal("BASEICMSTOT");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codItem = vo.asString("CODITEM");
        this.codLegal = vo.asBigDecimal("CODLEGAL");
        this.codMod = vo.asString("CODMOD");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.data = vo.asTimestamp("DATA");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.ecfFab = vo.asString("ECFFAB");
        this.icmsTot = vo.asBigDecimal("ICMSTOT");
        this.indOper = vo.asBigDecimal("INDOPER");
        this.numDoc = vo.asBigDecimal("NUMDOC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtd = vo.asBigDecimal("QTD");
        this.reg = vo.asString("REG");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.ser = vo.asString("SER");
        this.tipMov = vo.asString("TIPMOV");
        this.vlConfr = vo.asBigDecimal("VLCONFR");
        this.vlrParaAtualSaldo = vo.asBigDecimal("VLRPARAATUALSALDO");
        this.vlrUnit = vo.asBigDecimal("VLRUNIT");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.tipoDivergencia = vo.asBigDecimal("TIPODIVERGENCIA");
        return this;
   }
}
