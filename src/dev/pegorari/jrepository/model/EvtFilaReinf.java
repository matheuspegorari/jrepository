package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EvtFilaReinf extends AbstractSankhyaEntity<EvtFilaReinf> {
   public String getAcao() {
        return this.getVo().asString("ACAO");
   }

   public void setAcao(String acao) {
        markAsChanged("ACAO", acao);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public String getChaveEvento() {
        return this.getVo().asString("CHAVEEVENTO");
   }

   public void setChaveEvento(String chaveEvento) {
        markAsChanged("CHAVEEVENTO", chaveEvento);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodRetorno() {
        return this.getVo().asBigDecimal("CODRETORNO");
   }

   public void setCodRetorno(BigDecimal codRetorno) {
        markAsChanged("CODRETORNO", codRetorno);
   }

   public BigDecimal getCodUsuInc() {
        return this.getVo().asBigDecimal("CODUSUINC");
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
   }

   public String getDescEvt() {
        return this.getVo().asString("DESCREVT");
   }

   public void setDescEvt(String descEvt) {
        markAsChanged("DESCREVT", descEvt);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public Timestamp getDhProc() {
        return this.getVo().asTimestamp("DHPROC");
   }

   public void setDhProc(Timestamp dhProc) {
        markAsChanged("DHPROC", dhProc);
   }

   public Timestamp getFimValid() {
        return this.getVo().asTimestamp("FIMVALID");
   }

   public void setFimValid(Timestamp fimValid) {
        markAsChanged("FIMVALID", fimValid);
   }

   public BigDecimal getIndApuracao() {
        return this.getVo().asBigDecimal("INDAPURACAO");
   }

   public void setIndApuracao(BigDecimal indApuracao) {
        markAsChanged("INDAPURACAO", indApuracao);
   }

   public BigDecimal getIndRetif() {
        return this.getVo().asBigDecimal("INDRETIF");
   }

   public void setIndRetif(BigDecimal indRetif) {
        markAsChanged("INDRETIF", indRetif);
   }

   public Timestamp getIniValid() {
        return this.getVo().asTimestamp("INIVALID");
   }

   public void setIniValid(Timestamp iniValid) {
        markAsChanged("INIVALID", iniValid);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public String getNroProtLote() {
        return this.getVo().asString("NROPROTLOTE");
   }

   public void setNroProtLote(String nroProtLote) {
        markAsChanged("NROPROTLOTE", nroProtLote);
   }

   public String getNroRecibo() {
        return this.getVo().asString("NRORECIBO");
   }

   public void setNroRecibo(String nroRecibo) {
        markAsChanged("NRORECIBO", nroRecibo);
   }

   public BigDecimal getNuLote() {
        return this.getVo().asBigDecimal("NULOTE");
   }

   public void setNuLote(BigDecimal nuLote) {
        markAsChanged("NULOTE", nuLote);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSeqEvento() {
        return this.getVo().asBigDecimal("SEQEVENTO");
   }

   public void setSeqEvento(BigDecimal seqEvento) {
        markAsChanged("SEQEVENTO", seqEvento);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getTipoEvento() {
        return this.getVo().asString("TIPOEVENTO");
   }

   public void setTipoEvento(String tipoEvento) {
        markAsChanged("TIPOEVENTO", tipoEvento);
   }

   public BigDecimal getTpAmb() {
        return this.getVo().asBigDecimal("TPAMB");
   }

   public void setTpAmb(BigDecimal tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   public String getVerProc() {
        return this.getVo().asString("VERPROC");
   }

   public void setVerProc(String verProc) {
        markAsChanged("VERPROC", verProc);
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

   public BigDecimal getVersaoLayout() {
        return this.getVo().asBigDecimal("VERSAOLAYOUT");
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
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
        return this;
   }
}
