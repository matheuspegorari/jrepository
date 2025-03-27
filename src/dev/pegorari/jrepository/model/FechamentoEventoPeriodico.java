package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FechamentoEventoPeriodico extends AbstractSankhyaEntity<FechamentoEventoPeriodico> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getCompSemMovto() {
        return this.getVo().asTimestamp("COMPSEMMOVTO");
   }

   public void setCompSemMovto(Timestamp compSemMovto) {
        markAsChanged("COMPSEMMOVTO", compSemMovto);
   }

   public String getCpfResp() {
        return this.getVo().asString("CPFRESP");
   }

   public void setCpfResp(String cpfResp) {
        markAsChanged("CPFRESP", cpfResp);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getEvtAssDesprec() {
        return this.getVo().asString("EVTASSDESPREC");
   }

   public void setEvtAssDesprec(String evtAssDesprec) {
        markAsChanged("EVTASSDESPREC", evtAssDesprec);
   }

   public String getEvtAssDesprep() {
        return this.getVo().asString("EVTASSDESPREP");
   }

   public void setEvtAssDesprep(String evtAssDesprep) {
        markAsChanged("EVTASSDESPREP", evtAssDesprep);
   }

   public String getEvtComProd() {
        return this.getVo().asString("EVTCOMPROD");
   }

   public void setEvtComProd(String evtComProd) {
        markAsChanged("EVTCOMPROD", evtComProd);
   }

   public String getEvtCprb() {
        return this.getVo().asString("EVTCPRB");
   }

   public void setEvtCprb(String evtCprb) {
        markAsChanged("EVTCPRB", evtCprb);
   }

   public String getEvtPgtos() {
        return this.getVo().asString("EVTPGTOS");
   }

   public void setEvtPgtos(String evtPgtos) {
        markAsChanged("EVTPGTOS", evtPgtos);
   }

   public String getEvtServPr() {
        return this.getVo().asString("EVTSERVPR");
   }

   public void setEvtServPr(String evtServPr) {
        markAsChanged("EVTSERVPR", evtServPr);
   }

   public String getEvtServTm() {
        return this.getVo().asString("EVTSERVTM");
   }

   public void setEvtServTm(String evtServTm) {
        markAsChanged("EVTSERVTM", evtServTm);
   }

   public String getIdEvento() {
        return this.getVo().asString("IDEVENTO");
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
   }

   public String getNmResp() {
        return this.getVo().asString("NMRESP");
   }

   public void setNmResp(String nmResp) {
        markAsChanged("NMRESP", nmResp);
   }

   public String getNrInsc() {
        return this.getVo().asString("NRINSC");
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
   }

   public String getNrRecibo() {
        return this.getVo().asString("NRORECIBO");
   }

   public void setNrRecibo(String nrRecibo) {
        markAsChanged("NRORECIBO", nrRecibo);
   }

   public String getNrReciboAnt() {
        return this.getVo().asString("NRORECIBOANT");
   }

   public void setNrReciboAnt(String nrReciboAnt) {
        markAsChanged("NRORECIBOANT", nrReciboAnt);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getStatusReg() {
        return this.getVo().asString("STATUSREG");
   }

   public void setStatusReg(String statusReg) {
        markAsChanged("STATUSREG", statusReg);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTpAmb() {
        return this.getVo().asString("TPAMB");
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   public BigDecimal getTpInsc() {
        return this.getVo().asBigDecimal("TPINSC");
   }

   public void setTpInsc(BigDecimal tpInsc) {
        markAsChanged("TPINSC", tpInsc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public char[] getXmlConsulta() {
        return this.getVo().asClob("XMLCONSULTA");
   }

   public void setXmlConsulta(char[] xmlConsulta) {
        markAsChanged("XMLCONSULTA", xmlConsulta);
   }

   public char[] getXmlEvento() {
        return this.getVo().asClob("XMLEVENTO");
   }

   public void setXmlEvento(char[] xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
   }

   public char[] getXmlRetorno() {
        return this.getVo().asClob("XMLRETORNO");
   }

   public void setXmlRetorno(char[] xmlRetorno) {
        markAsChanged("XMLRETORNO", xmlRetorno);
   }

   public char[] getXmlRetornoConsulta() {
        return this.getVo().asClob("XMLRETORNOCONSULTA");
   }

   public void setXmlRetornoConsulta(char[] xmlRetornoConsulta) {
        markAsChanged("XMLRETORNOCONSULTA", xmlRetornoConsulta);
   }

   public String getEvtAquis() {
        return this.getVo().asString("EVTAQUIS");
   }

   public void setEvtAquis(String evtAquis) {
        markAsChanged("EVTAQUIS", evtAquis);
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
        return this;
   }
}
