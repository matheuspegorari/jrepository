package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoAdmJudicialReinf extends AbstractSankhyaEntity<ProcessoAdmJudicialReinf> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMunic() {
        return this.getVo().asBigDecimal("CODMUNIC");
   }

   public void setCodMunic(BigDecimal codMunic) {
        markAsChanged("CODMUNIC", codMunic);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public Timestamp getFimValid() {
        return this.getVo().asTimestamp("FIMVALID");
   }

   public void setFimValid(Timestamp fimValid) {
        markAsChanged("FIMVALID", fimValid);
   }

   public String getIdEvento() {
        return this.getVo().asString("IDEVENTO");
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
   }

   public String getIdVara() {
        return this.getVo().asString("IDVARA");
   }

   public void setIdVara(String idVara) {
        markAsChanged("IDVARA", idVara);
   }

   public BigDecimal getIndAutoria() {
        return this.getVo().asBigDecimal("INDAUTORIA");
   }

   public void setIndAutoria(BigDecimal indAutoria) {
        markAsChanged("INDAUTORIA", indAutoria);
   }

   public Timestamp getIniValid() {
        return this.getVo().asTimestamp("INIVALID");
   }

   public void setIniValid(Timestamp iniValid) {
        markAsChanged("INIVALID", iniValid);
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

   public String getNrProc() {
        return this.getVo().asString("NRPROC");
   }

   public void setNrProc(String nrProc) {
        markAsChanged("NRPROC", nrProc);
   }

   public BigDecimal getNuProcesso() {
        return this.getVo().asBigDecimal("NUPROCESSO");
   }

   public void setNuProcesso(BigDecimal nuProcesso) {
        markAsChanged("NUPROCESSO", nuProcesso);
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

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
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

   public BigDecimal getTpProc() {
        return this.getVo().asBigDecimal("TPPROC");
   }

   public void setTpProc(BigDecimal tpProc) {
        markAsChanged("TPPROC", tpProc);
   }

   public String getUfVara() {
        return this.getVo().asString("UFVARA");
   }

   public void setUfVara(String ufVara) {
        markAsChanged("UFVARA", ufVara);
   }

   public char[] getDataChange() {
        return this.getVo().asClob("DATACHANGE");
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
   }

   public Timestamp getFimValidNovo() {
        return this.getVo().asTimestamp("FIMVALIDNOVO");
   }

   public void setFimValidNovo(Timestamp fimValidNovo) {
        markAsChanged("FIMVALIDNOVO", fimValidNovo);
   }

   public Timestamp getIniValidNovo() {
        return this.getVo().asTimestamp("INIVALIDNOVO");
   }

   public void setIniValidNovo(Timestamp iniValidNovo) {
        markAsChanged("INIVALIDNOVO", iniValidNovo);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
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

   @Override
   public String getTableName() {
        return "TRIPAJR";
   }

   @Override
   public String getEntityName() {
        return "ProcessoAdmJudicialReinf";
   }

   @Override
   public ProcessoAdmJudicialReinf fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
