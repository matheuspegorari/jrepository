package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComProducaoProdutorRural extends AbstractSankhyaEntity<ComProducaoProdutorRural> {
   private String chave;
   private BigDecimal codEmp;
   private String controle;
   private Timestamp dtRef;
   private String idEvento;
   private String nrInsc;
   private String nrInscEstab;
   private String nrRecibo;
   private String nrReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal tpInscEstab;
   private BigDecimal vlrCpApur;
   private BigDecimal vlrCpSuspTotal;
   private BigDecimal vlrRatApur;
   private BigDecimal vlrRatSuspTotal;
   private BigDecimal vlrRecBrutaTotal;
   private BigDecimal vlrSenarApur;
   private BigDecimal vlrSenarSuspTotal;
   private BigDecimal codEmpEstab;
   private char[] dataChange;
   private char[] msg;
   private String tipo;
   private BigDecimal vlrBaseCpApur;
   private BigDecimal vlrBaseRatApur;
   private BigDecimal vlrBaseSenarApur;
   private BigDecimal vlrCpApurRet;
   private BigDecimal vlrCpSuspTotalRet;
   private BigDecimal vlrRatApurRet;
   private BigDecimal vlrRatSuspTotalRet;
   private BigDecimal vlrSenarApurRet;
   private BigDecimal vlrSenarSuspTotalRet;
   private char[] xmlEvento;
   private char[] xmlRetorno;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
        this.idEvento = idEvento;
   }

   public String getNrInsc() {
        return nrInsc;
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
        this.nrInsc = nrInsc;
   }

   public String getNrInscEstab() {
        return nrInscEstab;
   }

   public void setNrInscEstab(String nrInscEstab) {
        markAsChanged("NRINSCESTAB", nrInscEstab);
        this.nrInscEstab = nrInscEstab;
   }

   public String getNrRecibo() {
        return nrRecibo;
   }

   public void setNrRecibo(String nrRecibo) {
        markAsChanged("NRORECIBO", nrRecibo);
        this.nrRecibo = nrRecibo;
   }

   public String getNrReciboAnt() {
        return nrReciboAnt;
   }

   public void setNrReciboAnt(String nrReciboAnt) {
        markAsChanged("NRORECIBOANT", nrReciboAnt);
        this.nrReciboAnt = nrReciboAnt;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getStatusReg() {
        return statusReg;
   }

   public void setStatusReg(String statusReg) {
        markAsChanged("STATUSREG", statusReg);
        this.statusReg = statusReg;
   }

   public String getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
        this.tpAmb = tpAmb;
   }

   public BigDecimal getTpInsc() {
        return tpInsc;
   }

   public void setTpInsc(BigDecimal tpInsc) {
        markAsChanged("TPINSC", tpInsc);
        this.tpInsc = tpInsc;
   }

   public BigDecimal getTpInscEstab() {
        return tpInscEstab;
   }

   public void setTpInscEstab(BigDecimal tpInscEstab) {
        markAsChanged("TPINSCESTAB", tpInscEstab);
        this.tpInscEstab = tpInscEstab;
   }

   public BigDecimal getVlrCpApur() {
        return vlrCpApur;
   }

   public void setVlrCpApur(BigDecimal vlrCpApur) {
        markAsChanged("VLRCPAPUR", vlrCpApur);
        this.vlrCpApur = vlrCpApur;
   }

   public BigDecimal getVlrCpSuspTotal() {
        return vlrCpSuspTotal;
   }

   public void setVlrCpSuspTotal(BigDecimal vlrCpSuspTotal) {
        markAsChanged("VLRCPSUSPTOTAL", vlrCpSuspTotal);
        this.vlrCpSuspTotal = vlrCpSuspTotal;
   }

   public BigDecimal getVlrRatApur() {
        return vlrRatApur;
   }

   public void setVlrRatApur(BigDecimal vlrRatApur) {
        markAsChanged("VLRRATAPUR", vlrRatApur);
        this.vlrRatApur = vlrRatApur;
   }

   public BigDecimal getVlrRatSuspTotal() {
        return vlrRatSuspTotal;
   }

   public void setVlrRatSuspTotal(BigDecimal vlrRatSuspTotal) {
        markAsChanged("VLRRATSUSPTOTAL", vlrRatSuspTotal);
        this.vlrRatSuspTotal = vlrRatSuspTotal;
   }

   public BigDecimal getVlrRecBrutaTotal() {
        return vlrRecBrutaTotal;
   }

   public void setVlrRecBrutaTotal(BigDecimal vlrRecBrutaTotal) {
        markAsChanged("VLRRECBRUTATOTAL", vlrRecBrutaTotal);
        this.vlrRecBrutaTotal = vlrRecBrutaTotal;
   }

   public BigDecimal getVlrSenarApur() {
        return vlrSenarApur;
   }

   public void setVlrSenarApur(BigDecimal vlrSenarApur) {
        markAsChanged("VLRSENARAPUR", vlrSenarApur);
        this.vlrSenarApur = vlrSenarApur;
   }

   public BigDecimal getVlrSenarSuspTotal() {
        return vlrSenarSuspTotal;
   }

   public void setVlrSenarSuspTotal(BigDecimal vlrSenarSuspTotal) {
        markAsChanged("VLRSENARSUSPTOTAL", vlrSenarSuspTotal);
        this.vlrSenarSuspTotal = vlrSenarSuspTotal;
   }

   public BigDecimal getCodEmpEstab() {
        return codEmpEstab;
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
        this.codEmpEstab = codEmpEstab;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
        this.dataChange = dataChange;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getVlrBaseCpApur() {
        return vlrBaseCpApur;
   }

   public void setVlrBaseCpApur(BigDecimal vlrBaseCpApur) {
        markAsChanged("VLRBASECPAPUR", vlrBaseCpApur);
        this.vlrBaseCpApur = vlrBaseCpApur;
   }

   public BigDecimal getVlrBaseRatApur() {
        return vlrBaseRatApur;
   }

   public void setVlrBaseRatApur(BigDecimal vlrBaseRatApur) {
        markAsChanged("VLRBASERATAPUR", vlrBaseRatApur);
        this.vlrBaseRatApur = vlrBaseRatApur;
   }

   public BigDecimal getVlrBaseSenarApur() {
        return vlrBaseSenarApur;
   }

   public void setVlrBaseSenarApur(BigDecimal vlrBaseSenarApur) {
        markAsChanged("VLRBASESENARAPUR", vlrBaseSenarApur);
        this.vlrBaseSenarApur = vlrBaseSenarApur;
   }

   public BigDecimal getVlrCpApurRet() {
        return vlrCpApurRet;
   }

   public void setVlrCpApurRet(BigDecimal vlrCpApurRet) {
        markAsChanged("VLRCPAPURRET", vlrCpApurRet);
        this.vlrCpApurRet = vlrCpApurRet;
   }

   public BigDecimal getVlrCpSuspTotalRet() {
        return vlrCpSuspTotalRet;
   }

   public void setVlrCpSuspTotalRet(BigDecimal vlrCpSuspTotalRet) {
        markAsChanged("VLRCPSUSPTOTALRET", vlrCpSuspTotalRet);
        this.vlrCpSuspTotalRet = vlrCpSuspTotalRet;
   }

   public BigDecimal getVlrRatApurRet() {
        return vlrRatApurRet;
   }

   public void setVlrRatApurRet(BigDecimal vlrRatApurRet) {
        markAsChanged("VLRRATAPURRET", vlrRatApurRet);
        this.vlrRatApurRet = vlrRatApurRet;
   }

   public BigDecimal getVlrRatSuspTotalRet() {
        return vlrRatSuspTotalRet;
   }

   public void setVlrRatSuspTotalRet(BigDecimal vlrRatSuspTotalRet) {
        markAsChanged("VLRRATSUSPTOTALRET", vlrRatSuspTotalRet);
        this.vlrRatSuspTotalRet = vlrRatSuspTotalRet;
   }

   public BigDecimal getVlrSenarApurRet() {
        return vlrSenarApurRet;
   }

   public void setVlrSenarApurRet(BigDecimal vlrSenarApurRet) {
        markAsChanged("VLRSENARAPURRET", vlrSenarApurRet);
        this.vlrSenarApurRet = vlrSenarApurRet;
   }

   public BigDecimal getVlrSenarSuspTotalRet() {
        return vlrSenarSuspTotalRet;
   }

   public void setVlrSenarSuspTotalRet(BigDecimal vlrSenarSuspTotalRet) {
        markAsChanged("VLRSENARSUSPTOTALRET", vlrSenarSuspTotalRet);
        this.vlrSenarSuspTotalRet = vlrSenarSuspTotalRet;
   }

   public char[] getXmlEvento() {
        return xmlEvento;
   }

   public void setXmlEvento(char[] xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
        this.xmlEvento = xmlEvento;
   }

   public char[] getXmlRetorno() {
        return xmlRetorno;
   }

   public void setXmlRetorno(char[] xmlRetorno) {
        markAsChanged("XMLRETORNO", xmlRetorno);
        this.xmlRetorno = xmlRetorno;
   }

   @Override
   public String getTableName() {
        return "TRICPPR";
   }

   @Override
   public String getEntityName() {
        return "ComProducaoProdutorRural";
   }

   @Override
   public ComProducaoProdutorRural fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.chave = vo.asString("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.nrInsc = vo.asString("NRINSC");
        this.nrInscEstab = vo.asString("NRINSCESTAB");
        this.nrRecibo = vo.asString("NRORECIBO");
        this.nrReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstab = vo.asBigDecimal("TPINSCESTAB");
        this.vlrCpApur = vo.asBigDecimal("VLRCPAPUR");
        this.vlrCpSuspTotal = vo.asBigDecimal("VLRCPSUSPTOTAL");
        this.vlrRatApur = vo.asBigDecimal("VLRRATAPUR");
        this.vlrRatSuspTotal = vo.asBigDecimal("VLRRATSUSPTOTAL");
        this.vlrRecBrutaTotal = vo.asBigDecimal("VLRRECBRUTATOTAL");
        this.vlrSenarApur = vo.asBigDecimal("VLRSENARAPUR");
        this.vlrSenarSuspTotal = vo.asBigDecimal("VLRSENARSUSPTOTAL");
        this.codEmpEstab = vo.asBigDecimal("CODEMPESTAB");
        this.dataChange = vo.asClob("DATACHANGE");
        this.msg = vo.asClob("MSG");
        this.tipo = vo.asString("TIPO");
        this.vlrBaseCpApur = vo.asBigDecimal("VLRBASECPAPUR");
        this.vlrBaseRatApur = vo.asBigDecimal("VLRBASERATAPUR");
        this.vlrBaseSenarApur = vo.asBigDecimal("VLRBASESENARAPUR");
        this.vlrCpApurRet = vo.asBigDecimal("VLRCPAPURRET");
        this.vlrCpSuspTotalRet = vo.asBigDecimal("VLRCPSUSPTOTALRET");
        this.vlrRatApurRet = vo.asBigDecimal("VLRRATAPURRET");
        this.vlrRatSuspTotalRet = vo.asBigDecimal("VLRRATSUSPTOTALRET");
        this.vlrSenarApurRet = vo.asBigDecimal("VLRSENARAPURRET");
        this.vlrSenarSuspTotalRet = vo.asBigDecimal("VLRSENARSUSPTOTALRET");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
