package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContribPrevReceitaBruta extends AbstractSankhyaEntity<ContribPrevReceitaBruta> {
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
        markAsChanged("NRORECIBO", nroRecibo);
        this.nroRecibo = nroRecibo;
   }

   public String getNroReciboAnt() {
        return nroReciboAnt;
   }

   public void setNroReciboAnt(String nroReciboAnt) {
        markAsChanged("NRORECIBOANT", nroReciboAnt);
        this.nroReciboAnt = nroReciboAnt;
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

   public BigDecimal getVlrCpApuTotal() {
        return vlrCpApuTotal;
   }

   public void setVlrCpApuTotal(BigDecimal vlrCpApuTotal) {
        markAsChanged("VLRCPAPURTOTAL", vlrCpApuTotal);
        this.vlrCpApuTotal = vlrCpApuTotal;
   }

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

   public BigDecimal getVlrCpRbSuspTotal() {
        return vlrCpRbSuspTotal;
   }

   public void setVlrCpRbSuspTotal(BigDecimal vlrCpRbSuspTotal) {
        markAsChanged("VLRCPRBSUSPTOTAL", vlrCpRbSuspTotal);
        this.vlrCpRbSuspTotal = vlrCpRbSuspTotal;
   }

   public BigDecimal getVlrRecBrutaTotal() {
        return vlrRecBrutaTotal;
   }

   public void setVlrRecBrutaTotal(BigDecimal vlrRecBrutaTotal) {
        markAsChanged("VLRRECBRUTATOTAL", vlrRecBrutaTotal);
        this.vlrRecBrutaTotal = vlrRecBrutaTotal;
   }

   public BigDecimal getCodEmpEstab() {
        return codEmpEstab;
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
        this.codEmpEstab = codEmpEstab;
   }

   public String getCodReceita() {
        return codReceita;
   }

   public void setCodReceita(String codReceita) {
        markAsChanged("CODRECEITA", codReceita);
        this.codReceita = codReceita;
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

   public BigDecimal getVlrBcCpRbTotal() {
        return vlrBcCpRbTotal;
   }

   public void setVlrBcCpRbTotal(BigDecimal vlrBcCpRbTotal) {
        markAsChanged("VLRBCCPRBTOTAL", vlrBcCpRbTotal);
        this.vlrBcCpRbTotal = vlrBcCpRbTotal;
   }

   public BigDecimal getVlrCpApuTotalRet() {
        return vlrCpApuTotalRet;
   }

   public void setVlrCpApuTotalRet(BigDecimal vlrCpApuTotalRet) {
        markAsChanged("VLRCPAPURTOTALRET", vlrCpApuTotalRet);
        this.vlrCpApuTotalRet = vlrCpApuTotalRet;
   }

   public BigDecimal getVlrCpRbSuspTotalRet() {
        return vlrCpRbSuspTotalRet;
   }

   public void setVlrCpRbSuspTotalRet(BigDecimal vlrCpRbSuspTotalRet) {
        markAsChanged("VLRCPRBSUSPTOTALRET", vlrCpRbSuspTotalRet);
        this.vlrCpRbSuspTotalRet = vlrCpRbSuspTotalRet;
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
        return "TRICPRB";
   }

   @Override
   public String getEntityName() {
        return "ContribPrevReceitaBruta";
   }

   @Override
   public ContribPrevReceitaBruta fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nroRecibo = vo.asString("NRORECIBO");
        this.nroReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstab = vo.asBigDecimal("TPINSCESTAB");
        this.vlrCpApuTotal = vo.asBigDecimal("VLRCPAPURTOTAL");
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
        this.vlrCpApuTotalRet = vo.asBigDecimal("VLRCPAPURTOTALRET");
        this.vlrCpRbSuspTotalRet = vo.asBigDecimal("VLRCPRBSUSPTOTALRET");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
