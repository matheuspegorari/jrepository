package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComProducaoProdutorRural implements SankhyaEntity<ComProducaoProdutorRural> {

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
   private BigDecimal vlrCpApurado;
   private BigDecimal vlrCpSuspTotal;
   private BigDecimal vlrRatApurado;
   private BigDecimal vlrRatSuspTotal;
   private BigDecimal vlrRecBrutaTotal;
   private BigDecimal vlrSenarApurado;
   private BigDecimal vlrSenarSuspTotal;
   private BigDecimal codEmpEstab;
   private char[] dataChange;
   private char[] msg;
   private String tipo;
   private BigDecimal vlrBaseCpApurado;
   private BigDecimal vlrBaseRatApurado;
   private BigDecimal vlrBaseSenarApurado;
   private BigDecimal vlrCpApuradoRet;
   private BigDecimal vlrCpSuspTotalRet;
   private BigDecimal vlrRatApuradoRet;
   private BigDecimal vlrRatSuspTotalRet;
   private BigDecimal vlrSenarApuradoRet;
   private BigDecimal vlrSenarSuspTotalRet;
   private char[] xmlEvento;
   private char[] xmlRetorno;

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
   }

   public String getNrInsc() {
        return nrInsc;
   }

   public void setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
   }

   public String getNrInscEstab() {
        return nrInscEstab;
   }

   public void setNrInscEstab(String nrInscEstab) {
        this.nrInscEstab = nrInscEstab;
   }

   public String getNrRecibo() {
        return nrRecibo;
   }

   public void setNrRecibo(String nrRecibo) {
        this.nrRecibo = nrRecibo;
   }

   public String getNrReciboAnt() {
        return nrReciboAnt;
   }

   public void setNrReciboAnt(String nrReciboAnt) {
        this.nrReciboAnt = nrReciboAnt;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getStatusReg() {
        return statusReg;
   }

   public void setStatusReg(String statusReg) {
        this.statusReg = statusReg;
   }

   public String getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
   }

   public BigDecimal getTpInsc() {
        return tpInsc;
   }

   public void setTpInsc(BigDecimal tpInsc) {
        this.tpInsc = tpInsc;
   }

   public BigDecimal getTpInscEstab() {
        return tpInscEstab;
   }

   public void setTpInscEstab(BigDecimal tpInscEstab) {
        this.tpInscEstab = tpInscEstab;
   }

   public BigDecimal getVlrCpApurado() {
        return vlrCpApurado;
   }

   public void setVlrCpApurado(BigDecimal vlrCpApurado) {
        this.vlrCpApurado = vlrCpApurado;
   }

   public BigDecimal getVlrCpSuspTotal() {
        return vlrCpSuspTotal;
   }

   public void setVlrCpSuspTotal(BigDecimal vlrCpSuspTotal) {
        this.vlrCpSuspTotal = vlrCpSuspTotal;
   }

   public BigDecimal getVlrRatApurado() {
        return vlrRatApurado;
   }

   public void setVlrRatApurado(BigDecimal vlrRatApurado) {
        this.vlrRatApurado = vlrRatApurado;
   }

   public BigDecimal getVlrRatSuspTotal() {
        return vlrRatSuspTotal;
   }

   public void setVlrRatSuspTotal(BigDecimal vlrRatSuspTotal) {
        this.vlrRatSuspTotal = vlrRatSuspTotal;
   }

   public BigDecimal getVlrRecBrutaTotal() {
        return vlrRecBrutaTotal;
   }

   public void setVlrRecBrutaTotal(BigDecimal vlrRecBrutaTotal) {
        this.vlrRecBrutaTotal = vlrRecBrutaTotal;
   }

   public BigDecimal getVlrSenarApurado() {
        return vlrSenarApurado;
   }

   public void setVlrSenarApurado(BigDecimal vlrSenarApurado) {
        this.vlrSenarApurado = vlrSenarApurado;
   }

   public BigDecimal getVlrSenarSuspTotal() {
        return vlrSenarSuspTotal;
   }

   public void setVlrSenarSuspTotal(BigDecimal vlrSenarSuspTotal) {
        this.vlrSenarSuspTotal = vlrSenarSuspTotal;
   }

   public BigDecimal getCodEmpEstab() {
        return codEmpEstab;
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        this.codEmpEstab = codEmpEstab;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        this.dataChange = dataChange;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getVlrBaseCpApurado() {
        return vlrBaseCpApurado;
   }

   public void setVlrBaseCpApurado(BigDecimal vlrBaseCpApurado) {
        this.vlrBaseCpApurado = vlrBaseCpApurado;
   }

   public BigDecimal getVlrBaseRatApurado() {
        return vlrBaseRatApurado;
   }

   public void setVlrBaseRatApurado(BigDecimal vlrBaseRatApurado) {
        this.vlrBaseRatApurado = vlrBaseRatApurado;
   }

   public BigDecimal getVlrBaseSenarApurado() {
        return vlrBaseSenarApurado;
   }

   public void setVlrBaseSenarApurado(BigDecimal vlrBaseSenarApurado) {
        this.vlrBaseSenarApurado = vlrBaseSenarApurado;
   }

   public BigDecimal getVlrCpApuradoRet() {
        return vlrCpApuradoRet;
   }

   public void setVlrCpApuradoRet(BigDecimal vlrCpApuradoRet) {
        this.vlrCpApuradoRet = vlrCpApuradoRet;
   }

   public BigDecimal getVlrCpSuspTotalRet() {
        return vlrCpSuspTotalRet;
   }

   public void setVlrCpSuspTotalRet(BigDecimal vlrCpSuspTotalRet) {
        this.vlrCpSuspTotalRet = vlrCpSuspTotalRet;
   }

   public BigDecimal getVlrRatApuradoRet() {
        return vlrRatApuradoRet;
   }

   public void setVlrRatApuradoRet(BigDecimal vlrRatApuradoRet) {
        this.vlrRatApuradoRet = vlrRatApuradoRet;
   }

   public BigDecimal getVlrRatSuspTotalRet() {
        return vlrRatSuspTotalRet;
   }

   public void setVlrRatSuspTotalRet(BigDecimal vlrRatSuspTotalRet) {
        this.vlrRatSuspTotalRet = vlrRatSuspTotalRet;
   }

   public BigDecimal getVlrSenarApuradoRet() {
        return vlrSenarApuradoRet;
   }

   public void setVlrSenarApuradoRet(BigDecimal vlrSenarApuradoRet) {
        this.vlrSenarApuradoRet = vlrSenarApuradoRet;
   }

   public BigDecimal getVlrSenarSuspTotalRet() {
        return vlrSenarSuspTotalRet;
   }

   public void setVlrSenarSuspTotalRet(BigDecimal vlrSenarSuspTotalRet) {
        this.vlrSenarSuspTotalRet = vlrSenarSuspTotalRet;
   }

   public char[] getXmlEvento() {
        return xmlEvento;
   }

   public void setXmlEvento(char[] xmlEvento) {
        this.xmlEvento = xmlEvento;
   }

   public char[] getXmlRetorno() {
        return xmlRetorno;
   }

   public void setXmlRetorno(char[] xmlRetorno) {
        this.xmlRetorno = xmlRetorno;
   }

   @Override
   public String getEntityName() {
        return "ComProducaoProdutorRural";
   }

   @Override
   public ComProducaoProdutorRural fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.nrInsc = vo.asString("NRINSC");
        this.nrInscEstab = vo.asString("NRINSCESTAB");
        this.nrRecibo = vo.asString("NRRECIBO");
        this.nrReciboAnt = vo.asString("NRRECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstab = vo.asBigDecimal("TPINSCESTAB");
        this.vlrCpApurado = vo.asBigDecimal("VLRCPAPURADO");
        this.vlrCpSuspTotal = vo.asBigDecimal("VLRCPSUSPTOTAL");
        this.vlrRatApurado = vo.asBigDecimal("VLRRATAPURADO");
        this.vlrRatSuspTotal = vo.asBigDecimal("VLRRATSUSPTOTAL");
        this.vlrRecBrutaTotal = vo.asBigDecimal("VLRRECBRUTATOTAL");
        this.vlrSenarApurado = vo.asBigDecimal("VLRSENARAPURADO");
        this.vlrSenarSuspTotal = vo.asBigDecimal("VLRSENARSUSPTOTAL");
        this.codEmpEstab = vo.asBigDecimal("CODEMPESTAB");
        this.dataChange = vo.asClob("DATACHANGE");
        this.msg = vo.asClob("MSG");
        this.tipo = vo.asString("TIPO");
        this.vlrBaseCpApurado = vo.asBigDecimal("VLRBASECPAPURADO");
        this.vlrBaseRatApurado = vo.asBigDecimal("VLRBASERATAPURADO");
        this.vlrBaseSenarApurado = vo.asBigDecimal("VLRBASESENARAPURADO");
        this.vlrCpApuradoRet = vo.asBigDecimal("VLRCPAPURADORET");
        this.vlrCpSuspTotalRet = vo.asBigDecimal("VLRCPSUSPTOTALRET");
        this.vlrRatApuradoRet = vo.asBigDecimal("VLRRATAPURADORET");
        this.vlrRatSuspTotalRet = vo.asBigDecimal("VLRRATSUSPTOTALRET");
        this.vlrSenarApuradoRet = vo.asBigDecimal("VLRSENARAPURADORET");
        this.vlrSenarSuspTotalRet = vo.asBigDecimal("VLRSENARSUSPTOTALRET");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
