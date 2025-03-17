package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoAdmJudicialReinf implements SankhyaEntity<ProcessoAdmJudicialReinf> {

   private String chave;
   private BigDecimal codEmp;
   private BigDecimal codMunic;
   private String controle;
   private Timestamp dtRef;
   private Timestamp fimValid;
   private String idEvento;
   private String idVara;
   private BigDecimal indAutoria;
   private Timestamp iniValid;
   private String nrInsc;
   private String nrRecibo;
   private String nrReciboAnt;
   private String nrProc;
   private BigDecimal nuProcesso;
   private BigDecimal sequencia;
   private String statusReg;
   private String tipo;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal tpProc;
   private String ufVara;
   private char[] dataChange;
   private Timestamp fimValidNovo;
   private Timestamp iniValidNovo;
   private char[] msg;
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

   public BigDecimal getCodMunic() {
        return codMunic;
   }

   public void setCodMunic(BigDecimal codMunic) {
        this.codMunic = codMunic;
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

   public Timestamp getFimValid() {
        return fimValid;
   }

   public void setFimValid(Timestamp fimValid) {
        this.fimValid = fimValid;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
   }

   public String getIdVara() {
        return idVara;
   }

   public void setIdVara(String idVara) {
        this.idVara = idVara;
   }

   public BigDecimal getIndAutoria() {
        return indAutoria;
   }

   public void setIndAutoria(BigDecimal indAutoria) {
        this.indAutoria = indAutoria;
   }

   public Timestamp getIniValid() {
        return iniValid;
   }

   public void setIniValid(Timestamp iniValid) {
        this.iniValid = iniValid;
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

   public String getNrProc() {
        return nrProc;
   }

   public void setNrProc(String nrProc) {
        this.nrProc = nrProc;
   }

   public BigDecimal getNuProcesso() {
        return nuProcesso;
   }

   public void setNuProcesso(BigDecimal nuProcesso) {
        this.nuProcesso = nuProcesso;
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

   public BigDecimal getTpProc() {
        return tpProc;
   }

   public void setTpProc(BigDecimal tpProc) {
        this.tpProc = tpProc;
   }

   public String getUfVara() {
        return ufVara;
   }

   public void setUfVara(String ufVara) {
        this.ufVara = ufVara;
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

   @Override
   public String getEntityName() {
        return "ProcessoAdmJudicialReinf";
   }

   @Override
   public ProcessoAdmJudicialReinf fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMunic = vo.asBigDecimal("CODMUNIC");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.fimValid = vo.asTimestamp("FIMVALID");
        this.idEvento = vo.asString("IDEVENTO");
        this.idVara = vo.asString("IDVARA");
        this.indAutoria = vo.asBigDecimal("INDAUTORIA");
        this.iniValid = vo.asTimestamp("INIVALID");
        this.nrInsc = vo.asString("NRINSC");
        this.nrRecibo = vo.asString("NRRECIBO");
        this.nrReciboAnt = vo.asString("NRRECIBOANT");
        this.nrProc = vo.asString("NRPROC");
        this.nuProcesso = vo.asBigDecimal("NUPROCESSO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tipo = vo.asString("TIPO");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpProc = vo.asBigDecimal("TPPROC");
        this.ufVara = vo.asString("UFVARA");
        this.dataChange = vo.asClob("DATACHANGE");
        this.fimValidNovo = vo.asTimestamp("FIMVALIDNOVO");
        this.iniValidNovo = vo.asTimestamp("INIVALIDNOVO");
        this.msg = vo.asClob("MSG");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
