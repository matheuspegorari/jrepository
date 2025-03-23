package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FechamentoEventoPeriodico extends AbstractSankhyaEntity<FechamentoEventoPeriodico> {
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
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getCompSemMovto() {
        return compSemMovto;
   }

   public void setCompSemMovto(Timestamp compSemMovto) {
        markAsChanged("COMPSEMMOVTO", compSemMovto);
        this.compSemMovto = compSemMovto;
   }

   public String getCpfResp() {
        return cpfResp;
   }

   public void setCpfResp(String cpfResp) {
        markAsChanged("CPFRESP", cpfResp);
        this.cpfResp = cpfResp;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getEvtAssDesprec() {
        return evtAssDesprec;
   }

   public void setEvtAssDesprec(String evtAssDesprec) {
        markAsChanged("EVTASSDESPREC", evtAssDesprec);
        this.evtAssDesprec = evtAssDesprec;
   }

   public String getEvtAssDesprep() {
        return evtAssDesprep;
   }

   public void setEvtAssDesprep(String evtAssDesprep) {
        markAsChanged("EVTASSDESPREP", evtAssDesprep);
        this.evtAssDesprep = evtAssDesprep;
   }

   public String getEvtComProd() {
        return evtComProd;
   }

   public void setEvtComProd(String evtComProd) {
        markAsChanged("EVTCOMPROD", evtComProd);
        this.evtComProd = evtComProd;
   }

   public String getEvtCprb() {
        return evtCprb;
   }

   public void setEvtCprb(String evtCprb) {
        markAsChanged("EVTCPRB", evtCprb);
        this.evtCprb = evtCprb;
   }

   public String getEvtPgtos() {
        return evtPgtos;
   }

   public void setEvtPgtos(String evtPgtos) {
        markAsChanged("EVTPGTOS", evtPgtos);
        this.evtPgtos = evtPgtos;
   }

   public String getEvtServPr() {
        return evtServPr;
   }

   public void setEvtServPr(String evtServPr) {
        markAsChanged("EVTSERVPR", evtServPr);
        this.evtServPr = evtServPr;
   }

   public String getEvtServTm() {
        return evtServTm;
   }

   public void setEvtServTm(String evtServTm) {
        markAsChanged("EVTSERVTM", evtServTm);
        this.evtServTm = evtServTm;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
        this.idEvento = idEvento;
   }

   public String getNmResp() {
        return nmResp;
   }

   public void setNmResp(String nmResp) {
        markAsChanged("NMRESP", nmResp);
        this.nmResp = nmResp;
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

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
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

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public char[] getXmlConsulta() {
        return xmlConsulta;
   }

   public void setXmlConsulta(char[] xmlConsulta) {
        markAsChanged("XMLCONSULTA", xmlConsulta);
        this.xmlConsulta = xmlConsulta;
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

   public char[] getXmlRetornoConsulta() {
        return xmlRetornoConsulta;
   }

   public void setXmlRetornoConsulta(char[] xmlRetornoConsulta) {
        markAsChanged("XMLRETORNOCONSULTA", xmlRetornoConsulta);
        this.xmlRetornoConsulta = xmlRetornoConsulta;
   }

   public String getEvtAquis() {
        return evtAquis;
   }

   public void setEvtAquis(String evtAquis) {
        markAsChanged("EVTAQUIS", evtAquis);
        this.evtAquis = evtAquis;
   }

   @Override
   public String getTableName() {
        return "TRIFEP";
   }

   @Override
   public String getEntityName() {
        return "FechamentoEventoPeriodico";
   }

   @Override
   public FechamentoEventoPeriodico fromVO(DynamicVO vo) {
        this.setVo(vo);
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
        this.nrRecibo = vo.asString("NRORECIBO");
        this.nrReciboAnt = vo.asString("NRORECIBOANT");
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
