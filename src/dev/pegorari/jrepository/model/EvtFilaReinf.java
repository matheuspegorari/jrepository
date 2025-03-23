package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EvtFilaReinf extends AbstractSankhyaEntity<EvtFilaReinf> {
   private String acao;
   private String chave;
   private String chaveEvento;
   private BigDecimal codEmp;
   private BigDecimal codRetorno;
   private BigDecimal codUsuInc;
   private String descEvt;
   private Timestamp dhInc;
   private Timestamp dhProc;
   private Timestamp fimValid;
   private BigDecimal indApuracao;
   private BigDecimal indRetif;
   private Timestamp iniValid;
   private char[] msg;
   private String nroProtLote;
   private String nroRecibo;
   private BigDecimal nuLote;
   private String origem;
   private Timestamp referencia;
   private BigDecimal seqEvento;
   private BigDecimal sequencia;
   private String situacao;
   private String tipoEvento;
   private BigDecimal tpAmb;
   private String verProc;
   private char[] xmlEvento;
   private char[] xmlRetorno;
   private BigDecimal versaoLayout;

   public String getAcao() {
        return acao;
   }

   public void setAcao(String acao) {
        markAsChanged("ACAO", acao);
        this.acao = acao;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public String getChaveEvento() {
        return chaveEvento;
   }

   public void setChaveEvento(String chaveEvento) {
        markAsChanged("CHAVEEVENTO", chaveEvento);
        this.chaveEvento = chaveEvento;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodRetorno() {
        return codRetorno;
   }

   public void setCodRetorno(BigDecimal codRetorno) {
        markAsChanged("CODRETORNO", codRetorno);
        this.codRetorno = codRetorno;
   }

   public BigDecimal getCodUsuInc() {
        return codUsuInc;
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
        this.codUsuInc = codUsuInc;
   }

   public String getDescEvt() {
        return descEvt;
   }

   public void setDescEvt(String descEvt) {
        markAsChanged("DESCREVT", descEvt);
        this.descEvt = descEvt;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
        this.dhInc = dhInc;
   }

   public Timestamp getDhProc() {
        return dhProc;
   }

   public void setDhProc(Timestamp dhProc) {
        markAsChanged("DHPROC", dhProc);
        this.dhProc = dhProc;
   }

   public Timestamp getFimValid() {
        return fimValid;
   }

   public void setFimValid(Timestamp fimValid) {
        markAsChanged("FIMVALID", fimValid);
        this.fimValid = fimValid;
   }

   public BigDecimal getIndApuracao() {
        return indApuracao;
   }

   public void setIndApuracao(BigDecimal indApuracao) {
        markAsChanged("INDAPURACAO", indApuracao);
        this.indApuracao = indApuracao;
   }

   public BigDecimal getIndRetif() {
        return indRetif;
   }

   public void setIndRetif(BigDecimal indRetif) {
        markAsChanged("INDRETIF", indRetif);
        this.indRetif = indRetif;
   }

   public Timestamp getIniValid() {
        return iniValid;
   }

   public void setIniValid(Timestamp iniValid) {
        markAsChanged("INIVALID", iniValid);
        this.iniValid = iniValid;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public String getNroProtLote() {
        return nroProtLote;
   }

   public void setNroProtLote(String nroProtLote) {
        markAsChanged("NROPROTLOTE", nroProtLote);
        this.nroProtLote = nroProtLote;
   }

   public String getNroRecibo() {
        return nroRecibo;
   }

   public void setNroRecibo(String nroRecibo) {
        markAsChanged("NRORECIBO", nroRecibo);
        this.nroRecibo = nroRecibo;
   }

   public BigDecimal getNuLote() {
        return nuLote;
   }

   public void setNuLote(BigDecimal nuLote) {
        markAsChanged("NULOTE", nuLote);
        this.nuLote = nuLote;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
        this.origem = origem;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getSeqEvento() {
        return seqEvento;
   }

   public void setSeqEvento(BigDecimal seqEvento) {
        markAsChanged("SEQEVENTO", seqEvento);
        this.seqEvento = seqEvento;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getTipoEvento() {
        return tipoEvento;
   }

   public void setTipoEvento(String tipoEvento) {
        markAsChanged("TIPOEVENTO", tipoEvento);
        this.tipoEvento = tipoEvento;
   }

   public BigDecimal getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(BigDecimal tpAmb) {
        markAsChanged("TPAMB", tpAmb);
        this.tpAmb = tpAmb;
   }

   public String getVerProc() {
        return verProc;
   }

   public void setVerProc(String verProc) {
        markAsChanged("VERPROC", verProc);
        this.verProc = verProc;
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

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
        this.versaoLayout = versaoLayout;
   }

   @Override
   public String getTableName() {
        return "EVTFILAREINF";
   }

   @Override
   public String getEntityName() {
        return "EvtFilaReinf";
   }

   @Override
   public EvtFilaReinf fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.acao = vo.asString("ACAO");
        this.chave = vo.asString("CHAVE");
        this.chaveEvento = vo.asString("CHAVEEVENTO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codRetorno = vo.asBigDecimal("CODRETORNO");
        this.codUsuInc = vo.asBigDecimal("CODUSUINC");
        this.descEvt = vo.asString("DESCREVT");
        this.dhInc = vo.asTimestamp("DHINC");
        this.dhProc = vo.asTimestamp("DHPROC");
        this.fimValid = vo.asTimestamp("FIMVALID");
        this.indApuracao = vo.asBigDecimal("INDAPURACAO");
        this.indRetif = vo.asBigDecimal("INDRETIF");
        this.iniValid = vo.asTimestamp("INIVALID");
        this.msg = vo.asClob("MSG");
        this.nroProtLote = vo.asString("NROPROTLOTE");
        this.nroRecibo = vo.asString("NRORECIBO");
        this.nuLote = vo.asBigDecimal("NULOTE");
        this.origem = vo.asString("ORIGEM");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.seqEvento = vo.asBigDecimal("SEQEVENTO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.situacao = vo.asString("SITUACAO");
        this.tipoEvento = vo.asString("TIPOEVENTO");
        this.tpAmb = vo.asBigDecimal("TPAMB");
        this.verProc = vo.asString("VERPROC");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        return this;
   }
}
