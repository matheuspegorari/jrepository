package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoContribuinte extends AbstractSankhyaEntity<InformacaoContribuinte> {
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
        markAsChanged("CNPJEFR", cnpjEfr);
        this.cnpjEfr = cnpjEfr;
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

   public String getCpfCtt() {
        return cpfCtt;
   }

   public void setCpfCtt(String cpfCtt) {
        markAsChanged("CPFCTT", cpfCtt);
        this.cpfCtt = cpfCtt;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public String getEmailCtt() {
        return emailCtt;
   }

   public void setEmailCtt(String emailCtt) {
        markAsChanged("EMAILCTT", emailCtt);
        this.emailCtt = emailCtt;
   }

   public Timestamp getFimValid() {
        return fimValid;
   }

   public void setFimValid(Timestamp fimValid) {
        markAsChanged("FIMVALID", fimValid);
        this.fimValid = fimValid;
   }

   public String getFoneCel() {
        return foneCel;
   }

   public void setFoneCel(String foneCel) {
        markAsChanged("FONECEL", foneCel);
        this.foneCel = foneCel;
   }

   public String getFoneFixoCtt() {
        return foneFixoCtt;
   }

   public void setFoneFixoCtt(String foneFixoCtt) {
        markAsChanged("FONEFIXOCTT", foneFixoCtt);
        this.foneFixoCtt = foneFixoCtt;
   }

   public String getIdeEfr() {
        return ideEfr;
   }

   public void setIdeEfr(String ideEfr) {
        markAsChanged("IDEEFR", ideEfr);
        this.ideEfr = ideEfr;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
        this.idEvento = idEvento;
   }

   public BigDecimal getIndAcordoIsenMulta() {
        return indAcordoIsenMulta;
   }

   public void setIndAcordoIsenMulta(BigDecimal indAcordoIsenMulta) {
        markAsChanged("INDACORDOISENMULTA", indAcordoIsenMulta);
        this.indAcordoIsenMulta = indAcordoIsenMulta;
   }

   public BigDecimal getIndDesoneracao() {
        return indDesoneracao;
   }

   public void setIndDesoneracao(BigDecimal indDesoneracao) {
        markAsChanged("INDDESONERACAO", indDesoneracao);
        this.indDesoneracao = indDesoneracao;
   }

   public BigDecimal getIndEscrituracao() {
        return indEscrituracao;
   }

   public void setIndEscrituracao(BigDecimal indEscrituracao) {
        markAsChanged("INDESCRITURACAO", indEscrituracao);
        this.indEscrituracao = indEscrituracao;
   }

   public BigDecimal getIndSitPj() {
        return indSitPj;
   }

   public void setIndSitPj(BigDecimal indSitPj) {
        markAsChanged("INDSITPJ", indSitPj);
        this.indSitPj = indSitPj;
   }

   public Timestamp getIniValid() {
        return iniValid;
   }

   public void setIniValid(Timestamp iniValid) {
        markAsChanged("INIVALID", iniValid);
        this.iniValid = iniValid;
   }

   public String getNmCtt() {
        return nmCtt;
   }

   public void setNmCtt(String nmCtt) {
        markAsChanged("NMCTT", nmCtt);
        this.nmCtt = nmCtt;
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

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public BigDecimal getClassTrib() {
        return classTrib;
   }

   public void setClassTrib(BigDecimal classTrib) {
        markAsChanged("CLASSTRIB", classTrib);
        this.classTrib = classTrib;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
        this.dataChange = dataChange;
   }

   public Timestamp getFimValidNovo() {
        return fimValidNovo;
   }

   public void setFimValidNovo(Timestamp fimValidNovo) {
        markAsChanged("FIMVALIDNOVO", fimValidNovo);
        this.fimValidNovo = fimValidNovo;
   }

   public Timestamp getIniValidNovo() {
        return iniValidNovo;
   }

   public void setIniValidNovo(Timestamp iniValidNovo) {
        markAsChanged("INIVALIDNOVO", iniValidNovo);
        this.iniValidNovo = iniValidNovo;
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

   public Timestamp getDtObito() {
        return dtObito;
   }

   public void setDtObito(Timestamp dtObito) {
        markAsChanged("DTOBITO", dtObito);
        this.dtObito = dtObito;
   }

   public Timestamp getDtTransfFinsLucr() {
        return dtTransfFinsLucr;
   }

   public void setDtTransfFinsLucr(Timestamp dtTransfFinsLucr) {
        markAsChanged("DTTRANSFFINSLUCR", dtTransfFinsLucr);
        this.dtTransfFinsLucr = dtTransfFinsLucr;
   }

   public BigDecimal getIndUniao() {
        return indUniao;
   }

   public void setIndUniao(BigDecimal indUniao) {
        markAsChanged("INDUNIAO", indUniao);
        this.indUniao = indUniao;
   }

   @Override
   public String getTableName() {
        return "TRIICR";
   }

   @Override
   public String getEntityName() {
        return "InformacaoContribuinte";
   }

   @Override
   public InformacaoContribuinte fromVO(DynamicVO vo) {
        this.setVo(vo);
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
        this.nrRecibo = vo.asString("NRORECIBO");
        this.nrReciboAnt = vo.asString("NRORECIBOANT");
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
