package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R1100 extends AbstractSankhyaEntity<PortariaCat42R1100> {
   private BigDecimal codProd;
   private Timestamp data;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private BigDecimal icmsTot;
   private BigDecimal indOper;
   private BigDecimal nuNota;
   private BigDecimal qtd;
   private String reg;
   private BigDecimal sequencia;
   private String tipMov;
   private BigDecimal vlConfr;
   private BigDecimal vlrParaAtualSaldo;
   private BigDecimal vlrUnit;
   private BigDecimal baseIcmsTot;
   private String chvDoc;
   private BigDecimal codCfo;
   private BigDecimal codEmp;
   private String codItem;
   private BigDecimal codLegal;
   private BigDecimal vlrIcms;
   private BigDecimal tipoDivergencia;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
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

   public BigDecimal getIcmsTot() {
        return icmsTot;
   }

   public void setIcmsTot(BigDecimal icmsTot) {
        markAsChanged("ICMSTOT", icmsTot);
        this.icmsTot = icmsTot;
   }

   public BigDecimal getIndOper() {
        return indOper;
   }

   public void setIndOper(BigDecimal indOper) {
        markAsChanged("INDOPER", indOper);
        this.indOper = indOper;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
        this.qtd = qtd;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
        this.reg = reg;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
        this.tipMov = tipMov;
   }

   public BigDecimal getVlConfr() {
        return vlConfr;
   }

   public void setVlConfr(BigDecimal vlConfr) {
        markAsChanged("VLCONFR", vlConfr);
        this.vlConfr = vlConfr;
   }

   public BigDecimal getVlrParaAtualSaldo() {
        return vlrParaAtualSaldo;
   }

   public void setVlrParaAtualSaldo(BigDecimal vlrParaAtualSaldo) {
        markAsChanged("VLRPARAATUALSALDO", vlrParaAtualSaldo);
        this.vlrParaAtualSaldo = vlrParaAtualSaldo;
   }

   public BigDecimal getVlrUnit() {
        return vlrUnit;
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
        this.vlrUnit = vlrUnit;
   }

   public BigDecimal getBaseIcmsTot() {
        return baseIcmsTot;
   }

   public void setBaseIcmsTot(BigDecimal baseIcmsTot) {
        markAsChanged("BASEICMSTOT", baseIcmsTot);
        this.baseIcmsTot = baseIcmsTot;
   }

   public String getChvDoc() {
        return chvDoc;
   }

   public void setChvDoc(String chvDoc) {
        markAsChanged("CHVDOC", chvDoc);
        this.chvDoc = chvDoc;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
        this.codCfo = codCfo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getCodItem() {
        return codItem;
   }

   public void setCodItem(String codItem) {
        markAsChanged("CODITEM", codItem);
        this.codItem = codItem;
   }

   public BigDecimal getCodLegal() {
        return codLegal;
   }

   public void setCodLegal(BigDecimal codLegal) {
        markAsChanged("CODLEGAL", codLegal);
        this.codLegal = codLegal;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getTipoDivergencia() {
        return tipoDivergencia;
   }

   public void setTipoDivergencia(BigDecimal tipoDivergencia) {
        markAsChanged("TIPODIVERGENCIA", tipoDivergencia);
        this.tipoDivergencia = tipoDivergencia;
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R1100";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R1100";
   }

   @Override
   public PortariaCat42R1100 fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.data = vo.asTimestamp("DATA");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.icmsTot = vo.asBigDecimal("ICMSTOT");
        this.indOper = vo.asBigDecimal("INDOPER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtd = vo.asBigDecimal("QTD");
        this.reg = vo.asString("REG");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipMov = vo.asString("TIPMOV");
        this.vlConfr = vo.asBigDecimal("VLCONFR");
        this.vlrParaAtualSaldo = vo.asBigDecimal("VLRPARAATUALSALDO");
        this.vlrUnit = vo.asBigDecimal("VLRUNIT");
        this.baseIcmsTot = vo.asBigDecimal("BASEICMSTOT");
        this.chvDoc = vo.asString("CHVDOC");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codItem = vo.asString("CODITEM");
        this.codLegal = vo.asBigDecimal("CODLEGAL");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.tipoDivergencia = vo.asBigDecimal("TIPODIVERGENCIA");
        return this;
   }
}
