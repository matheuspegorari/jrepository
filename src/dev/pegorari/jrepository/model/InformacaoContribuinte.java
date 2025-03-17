package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoContribuinte implements SankhyaEntity<InformacaoContribuinte> {

   private String cnpjEfr;
   private BigDecimal codEmp;
   private String controle;
   private String cpfCtt;
   private Timestamp dtRef;
   private String emailCtt;
   private Timestamp fimValid;
   private String foneCel;
   private String foneFixoCtt;
   private String ideEfr;
   private String idEvento;
   private BigDecimal indAcordoIsenMulta;
   private BigDecimal indDesoneracao;
   private BigDecimal indEscrituracao;
   private BigDecimal indSitPj;
   private Timestamp iniValid;
   private String nmCtt;
   private String nrInsc;
   private String nrRecibo;
   private String nrReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tipo;
   private String tpAmb;
   private BigDecimal tpInsc;
   private String chave;
   private BigDecimal classTrib;
   private char[] dataChange;
   private Timestamp fimValidNovo;
   private Timestamp iniValidNovo;
   private char[] msg;
   private char[] xmlEvento;
   private char[] xmlRetorno;
   private Timestamp dtObito;
   private Timestamp dtTransfFinsLucr;
   private BigDecimal indUniao;

   public String getCnpjEfr() {
        return cnpjEfr;
   }

   public void setCnpjEfr(String cnpjEfr) {
        this.cnpjEfr = cnpjEfr;
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

   public String getCpfCtt() {
        return cpfCtt;
   }

   public void setCpfCtt(String cpfCtt) {
        this.cpfCtt = cpfCtt;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public String getEmailCtt() {
        return emailCtt;
   }

   public void setEmailCtt(String emailCtt) {
        this.emailCtt = emailCtt;
   }

   public Timestamp getFimValid() {
        return fimValid;
   }

   public void setFimValid(Timestamp fimValid) {
        this.fimValid = fimValid;
   }

   public String getFoneCel() {
        return foneCel;
   }

   public void setFoneCel(String foneCel) {
        this.foneCel = foneCel;
   }

   public String getFoneFixoCtt() {
        return foneFixoCtt;
   }

   public void setFoneFixoCtt(String foneFixoCtt) {
        this.foneFixoCtt = foneFixoCtt;
   }

   public String getIdeEfr() {
        return ideEfr;
   }

   public void setIdeEfr(String ideEfr) {
        this.ideEfr = ideEfr;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
   }

   public BigDecimal getIndAcordoIsenMulta() {
        return indAcordoIsenMulta;
   }

   public void setIndAcordoIsenMulta(BigDecimal indAcordoIsenMulta) {
        this.indAcordoIsenMulta = indAcordoIsenMulta;
   }

   public BigDecimal getIndDesoneracao() {
        return indDesoneracao;
   }

   public void setIndDesoneracao(BigDecimal indDesoneracao) {
        this.indDesoneracao = indDesoneracao;
   }

   public BigDecimal getIndEscrituracao() {
        return indEscrituracao;
   }

   public void setIndEscrituracao(BigDecimal indEscrituracao) {
        this.indEscrituracao = indEscrituracao;
   }

   public BigDecimal getIndSitPj() {
        return indSitPj;
   }

   public void setIndSitPj(BigDecimal indSitPj) {
        this.indSitPj = indSitPj;
   }

   public Timestamp getIniValid() {
        return iniValid;
   }

   public void setIniValid(Timestamp iniValid) {
        this.iniValid = iniValid;
   }

   public String getNmCtt() {
        return nmCtt;
   }

   public void setNmCtt(String nmCtt) {
        this.nmCtt = nmCtt;
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

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
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

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public BigDecimal getClassTrib() {
        return classTrib;
   }

   public void setClassTrib(BigDecimal classTrib) {
        this.classTrib = classTrib;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        this.dataChange = dataChange;
   }

   public Timestamp getFimValidNovo() {
        return fimValidNovo;
   }

   public void setFimValidNovo(Timestamp fimValidNovo) {
        this.fimValidNovo = fimValidNovo;
   }

   public Timestamp getIniValidNovo() {
        return iniValidNovo;
   }

   public void setIniValidNovo(Timestamp iniValidNovo) {
        this.iniValidNovo = iniValidNovo;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
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

   public Timestamp getDtObito() {
        return dtObito;
   }

   public void setDtObito(Timestamp dtObito) {
        this.dtObito = dtObito;
   }

   public Timestamp getDtTransfFinsLucr() {
        return dtTransfFinsLucr;
   }

   public void setDtTransfFinsLucr(Timestamp dtTransfFinsLucr) {
        this.dtTransfFinsLucr = dtTransfFinsLucr;
   }

   public BigDecimal getIndUniao() {
        return indUniao;
   }

   public void setIndUniao(BigDecimal indUniao) {
        this.indUniao = indUniao;
   }

   @Override
   public String getEntityName() {
        return "InformacaoContribuinte";
   }

   @Override
   public InformacaoContribuinte fromVO(DynamicVO vo) {
        this.cnpjEfr = vo.asString("CNPJEFR");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.cpfCtt = vo.asString("CPFCTT");
        this.dtRef = vo.asTimestamp("DTREF");
        this.emailCtt = vo.asString("EMAILCTT");
        this.fimValid = vo.asTimestamp("FIMVALID");
        this.foneCel = vo.asString("FONECEL");
        this.foneFixoCtt = vo.asString("FONEFIXOCTT");
        this.ideEfr = vo.asString("IDEEFR");
        this.idEvento = vo.asString("IDEVENTO");
        this.indAcordoIsenMulta = vo.asBigDecimal("INDACORDOISENMULTA");
        this.indDesoneracao = vo.asBigDecimal("INDDESONERACAO");
        this.indEscrituracao = vo.asBigDecimal("INDESCRITURACAO");
        this.indSitPj = vo.asBigDecimal("INDSITPJ");
        this.iniValid = vo.asTimestamp("INIVALID");
        this.nmCtt = vo.asString("NMCTT");
        this.nrInsc = vo.asString("NRINSC");
        this.nrRecibo = vo.asString("NRRECIBO");
        this.nrReciboAnt = vo.asString("NRRECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tipo = vo.asString("TIPO");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.chave = vo.asString("CHAVE");
        this.classTrib = vo.asBigDecimal("CLASSTRIB");
        this.dataChange = vo.asClob("DATACHANGE");
        this.fimValidNovo = vo.asTimestamp("FIMVALIDNOVO");
        this.iniValidNovo = vo.asTimestamp("INIVALIDNOVO");
        this.msg = vo.asClob("MSG");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        this.dtObito = vo.asTimestamp("DTOBITO");
        this.dtTransfFinsLucr = vo.asTimestamp("DTTRANSFFINSLUCR");
        this.indUniao = vo.asBigDecimal("INDUNIAO");
        return this;
   }
}
