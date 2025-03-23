package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ReaberturaEventoPeriodico extends AbstractSankhyaEntity<ReaberturaEventoPeriodico> {
   private BigDecimal codEmp;
   private Timestamp dtRef;
   private String idEvento;
   private String nrInsc;
   private String nrRecibo;
   private String nrReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tpAmb;
   private BigDecimal tpInsc;
   private char[] msg;
   private char[] xmlEvento;
   private char[] xmlRetorno;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
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

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
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
        return "TRIREP";
   }

   @Override
   public String getEntityName() {
        return "ReaberturaEventoPeriodico";
   }

   @Override
   public ReaberturaEventoPeriodico fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.nrInsc = vo.asString("NRINSC");
        this.nrRecibo = vo.asString("NRORECIBO");
        this.nrReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.msg = vo.asClob("MSG");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
