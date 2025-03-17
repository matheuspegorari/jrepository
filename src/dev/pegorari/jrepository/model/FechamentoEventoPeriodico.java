package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FechamentoEventoPeriodico implements SankhyaEntity<FechamentoEventoPeriodico> {

   private BigDecimal codEmp;
   private Timestamp compSemMovto;
   private String cpfResp;
   private Timestamp dtRef;
   private String email;
   private String evtAssDesprec;
   private String evtAssDesprep;
   private String evtComProd;
   private String evtCprb;
   private String evtPgtos;
   private String evtServPr;
   private String evtServTm;
   private String idEvento;
   private String nmResp;
   private String nrInsc;
   private String nrRecibo;
   private String nrReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String telefone;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal codUsu;
   private char[] msg;
   private char[] xmlConsulta;
   private char[] xmlEvento;
   private char[] xmlRetorno;
   private char[] xmlRetornoConsulta;
   private String evtAquis;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public Timestamp getCompSemMovto() {
        return compSemMovto;
   }

   public void setCompSemMovto(Timestamp compSemMovto) {
        this.compSemMovto = compSemMovto;
   }

   public String getCpfResp() {
        return cpfResp;
   }

   public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getEvtAssDesprec() {
        return evtAssDesprec;
   }

   public void setEvtAssDesprec(String evtAssDesprec) {
        this.evtAssDesprec = evtAssDesprec;
   }

   public String getEvtAssDesprep() {
        return evtAssDesprep;
   }

   public void setEvtAssDesprep(String evtAssDesprep) {
        this.evtAssDesprep = evtAssDesprep;
   }

   public String getEvtComProd() {
        return evtComProd;
   }

   public void setEvtComProd(String evtComProd) {
        this.evtComProd = evtComProd;
   }

   public String getEvtCprb() {
        return evtCprb;
   }

   public void setEvtCprb(String evtCprb) {
        this.evtCprb = evtCprb;
   }

   public String getEvtPgtos() {
        return evtPgtos;
   }

   public void setEvtPgtos(String evtPgtos) {
        this.evtPgtos = evtPgtos;
   }

   public String getEvtServPr() {
        return evtServPr;
   }

   public void setEvtServPr(String evtServPr) {
        this.evtServPr = evtServPr;
   }

   public String getEvtServTm() {
        return evtServTm;
   }

   public void setEvtServTm(String evtServTm) {
        this.evtServTm = evtServTm;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
   }

   public String getNmResp() {
        return nmResp;
   }

   public void setNmResp(String nmResp) {
        this.nmResp = nmResp;
   }

   public String getNrInsc() {
        return nrInsc;
   }

   public void setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
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

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
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

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
   }

   public char[] getXmlConsulta() {
        return xmlConsulta;
   }

   public void setXmlConsulta(char[] xmlConsulta) {
        this.xmlConsulta = xmlConsulta;
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

   public char[] getXmlRetornoConsulta() {
        return xmlRetornoConsulta;
   }

   public void setXmlRetornoConsulta(char[] xmlRetornoConsulta) {
        this.xmlRetornoConsulta = xmlRetornoConsulta;
   }

   public String getEvtAquis() {
        return evtAquis;
   }

   public void setEvtAquis(String evtAquis) {
        this.evtAquis = evtAquis;
   }

   @Override
   public String getEntityName() {
        return "FechamentoEventoPeriodico";
   }

   @Override
   public FechamentoEventoPeriodico fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.compSemMovto = vo.asTimestamp("COMPSEMMOVTO");
        this.cpfResp = vo.asString("CPFRESP");
        this.dtRef = vo.asTimestamp("DTREF");
        this.email = vo.asString("EMAIL");
        this.evtAssDesprec = vo.asString("EVTASSDESPREC");
        this.evtAssDesprep = vo.asString("EVTASSDESPREP");
        this.evtComProd = vo.asString("EVTCOMPROD");
        this.evtCprb = vo.asString("EVTCPRB");
        this.evtPgtos = vo.asString("EVTPGTOS");
        this.evtServPr = vo.asString("EVTSERVPR");
        this.evtServTm = vo.asString("EVTSERVTM");
        this.idEvento = vo.asString("IDEVENTO");
        this.nmResp = vo.asString("NMRESP");
        this.nrInsc = vo.asString("NRINSC");
        this.nrRecibo = vo.asString("NRRECIBO");
        this.nrReciboAnt = vo.asString("NRRECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.telefone = vo.asString("TELEFONE");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.msg = vo.asClob("MSG");
        this.xmlConsulta = vo.asClob("XMLCONSULTA");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        this.xmlRetornoConsulta = vo.asClob("XMLRETORNOCONSULTA");
        this.evtAquis = vo.asString("EVTAQUIS");
        return this;
   }
}
