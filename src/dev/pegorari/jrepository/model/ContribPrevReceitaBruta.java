package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContribPrevReceitaBruta implements SankhyaEntity<ContribPrevReceitaBruta> {

   private String nroRecibo;
   private String nroReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal tpInscEstab;
   private BigDecimal vlrCpApuTotal;
   private String chave;
   private BigDecimal codEmp;
   private String controle;
   private Timestamp dtRef;
   private String idEvento;
   private String nrInsc;
   private String nrInscEstab;
   private BigDecimal vlrCpRbSuspTotal;
   private BigDecimal vlrRecBrutaTotal;
   private BigDecimal codEmpEstab;
   private String codReceita;
   private char[] dataChange;
   private char[] msg;
   private String tipo;
   private BigDecimal vlrBcCpRbTotal;
   private BigDecimal vlrCpApuTotalRet;
   private BigDecimal vlrCpRbSuspTotalRet;
   private char[] xmlEvento;
   private char[] xmlRetorno;

   public String getNroRecibo() {
        return nroRecibo;
   }

   public void setNroRecibo(String nroRecibo) {
        this.nroRecibo = nroRecibo;
   }

   public String getNroReciboAnt() {
        return nroReciboAnt;
   }

   public void setNroReciboAnt(String nroReciboAnt) {
        this.nroReciboAnt = nroReciboAnt;
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

   public BigDecimal getVlrCpApuTotal() {
        return vlrCpApuTotal;
   }

   public void setVlrCpApuTotal(BigDecimal vlrCpApuTotal) {
        this.vlrCpApuTotal = vlrCpApuTotal;
   }

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

   public BigDecimal getVlrCpRbSuspTotal() {
        return vlrCpRbSuspTotal;
   }

   public void setVlrCpRbSuspTotal(BigDecimal vlrCpRbSuspTotal) {
        this.vlrCpRbSuspTotal = vlrCpRbSuspTotal;
   }

   public BigDecimal getVlrRecBrutaTotal() {
        return vlrRecBrutaTotal;
   }

   public void setVlrRecBrutaTotal(BigDecimal vlrRecBrutaTotal) {
        this.vlrRecBrutaTotal = vlrRecBrutaTotal;
   }

   public BigDecimal getCodEmpEstab() {
        return codEmpEstab;
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        this.codEmpEstab = codEmpEstab;
   }

   public String getCodReceita() {
        return codReceita;
   }

   public void setCodReceita(String codReceita) {
        this.codReceita = codReceita;
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

   public BigDecimal getVlrBcCpRbTotal() {
        return vlrBcCpRbTotal;
   }

   public void setVlrBcCpRbTotal(BigDecimal vlrBcCpRbTotal) {
        this.vlrBcCpRbTotal = vlrBcCpRbTotal;
   }

   public BigDecimal getVlrCpApuTotalRet() {
        return vlrCpApuTotalRet;
   }

   public void setVlrCpApuTotalRet(BigDecimal vlrCpApuTotalRet) {
        this.vlrCpApuTotalRet = vlrCpApuTotalRet;
   }

   public BigDecimal getVlrCpRbSuspTotalRet() {
        return vlrCpRbSuspTotalRet;
   }

   public void setVlrCpRbSuspTotalRet(BigDecimal vlrCpRbSuspTotalRet) {
        this.vlrCpRbSuspTotalRet = vlrCpRbSuspTotalRet;
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
        return "ContribPrevReceitaBruta";
   }

   @Override
   public ContribPrevReceitaBruta fromVO(DynamicVO vo) {
        this.nroRecibo = vo.asString("NRORECIBO");
        this.nroReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstab = vo.asBigDecimal("TPINSCESTAB");
        this.vlrCpApuTotal = vo.asBigDecimal("VLRCPAPUTOTAL");
        this.chave = vo.asString("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.nrInsc = vo.asString("NRINSC");
        this.nrInscEstab = vo.asString("NRINSCESTAB");
        this.vlrCpRbSuspTotal = vo.asBigDecimal("VLRCPRBSUSPTOTAL");
        this.vlrRecBrutaTotal = vo.asBigDecimal("VLRRECBRUTATOTAL");
        this.codEmpEstab = vo.asBigDecimal("CODEMPESTAB");
        this.codReceita = vo.asString("CODRECEITA");
        this.dataChange = vo.asClob("DATACHANGE");
        this.msg = vo.asClob("MSG");
        this.tipo = vo.asString("TIPO");
        this.vlrBcCpRbTotal = vo.asBigDecimal("VLRBCCPRBTOTAL");
        this.vlrCpApuTotalRet = vo.asBigDecimal("VLRCPAPUTOTALRET");
        this.vlrCpRbSuspTotalRet = vo.asBigDecimal("VLRCPRBSUSPTOTALRET");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
