package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecRepassadosAssoDesp extends AbstractSankhyaEntity<RecRepassadosAssoDesp> {
   private String chave;
   private BigDecimal codEmp;
   private BigDecimal codEmpEstab;
   private String controle;
   private char[] dataChange;
   private Timestamp dtRef;
   private String idEvento;
   private String msg;
   private String nrInsc;
   private String nrInscEstab;
   private String nrRecibo;
   private String nrReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tipo;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal tpInscEstab;
   private BigDecimal vlrTotalBaseRet;
   private BigDecimal vlrTotalNRet;
   private BigDecimal vlrTotalNRetRet;
   private BigDecimal vlrTotalRep;
   private BigDecimal vlrTotalRepRet;
   private BigDecimal vlrTotalRet;
   private BigDecimal vlrTotalRetRet;
   private String xmlEvento;
   private String xmlRetorno;

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

   public BigDecimal getCodEmpEstab() {
        return codEmpEstab;
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
        this.codEmpEstab = codEmpEstab;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
        this.dataChange = dataChange;
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

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
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

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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

   public BigDecimal getVlrTotalBaseRet() {
        return vlrTotalBaseRet;
   }

   public void setVlrTotalBaseRet(BigDecimal vlrTotalBaseRet) {
        markAsChanged("VLRTOTALBASERET", vlrTotalBaseRet);
        this.vlrTotalBaseRet = vlrTotalBaseRet;
   }

   public BigDecimal getVlrTotalNRet() {
        return vlrTotalNRet;
   }

   public void setVlrTotalNRet(BigDecimal vlrTotalNRet) {
        markAsChanged("VLRTOTALNRET", vlrTotalNRet);
        this.vlrTotalNRet = vlrTotalNRet;
   }

   public BigDecimal getVlrTotalNRetRet() {
        return vlrTotalNRetRet;
   }

   public void setVlrTotalNRetRet(BigDecimal vlrTotalNRetRet) {
        markAsChanged("VLRTOTALNRETRET", vlrTotalNRetRet);
        this.vlrTotalNRetRet = vlrTotalNRetRet;
   }

   public BigDecimal getVlrTotalRep() {
        return vlrTotalRep;
   }

   public void setVlrTotalRep(BigDecimal vlrTotalRep) {
        markAsChanged("VLRTOTALREP", vlrTotalRep);
        this.vlrTotalRep = vlrTotalRep;
   }

   public BigDecimal getVlrTotalRepRet() {
        return vlrTotalRepRet;
   }

   public void setVlrTotalRepRet(BigDecimal vlrTotalRepRet) {
        markAsChanged("VLRTOTALREPRET", vlrTotalRepRet);
        this.vlrTotalRepRet = vlrTotalRepRet;
   }

   public BigDecimal getVlrTotalRet() {
        return vlrTotalRet;
   }

   public void setVlrTotalRet(BigDecimal vlrTotalRet) {
        markAsChanged("VLRTOTALRET", vlrTotalRet);
        this.vlrTotalRet = vlrTotalRet;
   }

   public BigDecimal getVlrTotalRetRet() {
        return vlrTotalRetRet;
   }

   public void setVlrTotalRetRet(BigDecimal vlrTotalRetRet) {
        markAsChanged("VLRTOTALRETRET", vlrTotalRetRet);
        this.vlrTotalRetRet = vlrTotalRetRet;
   }

   public String getXmlEvento() {
        return xmlEvento;
   }

   public void setXmlEvento(String xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
        this.xmlEvento = xmlEvento;
   }

   public String getXmlRetorno() {
        return xmlRetorno;
   }

   public void setXmlRetorno(String xmlRetorno) {
        markAsChanged("XMLRETORNO", xmlRetorno);
        this.xmlRetorno = xmlRetorno;
   }

   @Override
   public String getTableName() {
        return "TRIRRAD";
   }

   @Override
   public String getEntityName() {
        return "RecRepassadosAssoDesp";
   }

   @Override
   public RecRepassadosAssoDesp fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.chave = vo.asString("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpEstab = vo.asBigDecimal("CODEMPESTAB");
        this.controle = vo.asString("CONTROLE");
        this.dataChange = vo.asClob("DATACHANGE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.msg = vo.asString("MSG");
        this.nrInsc = vo.asString("NRINSC");
        this.nrInscEstab = vo.asString("NRINSCESTAB");
        this.nrRecibo = vo.asString("NRORECIBO");
        this.nrReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tipo = vo.asString("TIPO");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstab = vo.asBigDecimal("TPINSCESTAB");
        this.vlrTotalBaseRet = vo.asBigDecimal("VLRTOTALBASERET");
        this.vlrTotalNRet = vo.asBigDecimal("VLRTOTALNRET");
        this.vlrTotalNRetRet = vo.asBigDecimal("VLRTOTALNRETRET");
        this.vlrTotalRep = vo.asBigDecimal("VLRTOTALREP");
        this.vlrTotalRepRet = vo.asBigDecimal("VLRTOTALREPRET");
        this.vlrTotalRet = vo.asBigDecimal("VLRTOTALRET");
        this.vlrTotalRetRet = vo.asBigDecimal("VLRTOTALRETRET");
        this.xmlEvento = vo.asString("XMLEVENTO");
        this.xmlRetorno = vo.asString("XMLRETORNO");
        return this;
   }
}
