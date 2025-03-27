package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecRepassadosAssoDesp extends AbstractSankhyaEntity<RecRepassadosAssoDesp> {
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

   public BigDecimal getCodEmpEstab() {
        return this.getVo().asBigDecimal("CODEMPESTAB");
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public char[] getDataChange() {
        return this.getVo().asClob("DATACHANGE");
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getIdEvento() {
        return this.getVo().asString("IDEVENTO");
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
   }

   public String getMsg() {
        return this.getVo().asString("MSG");
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
   }

   public String getNrInsc() {
        return this.getVo().asString("NRINSC");
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
   }

   public String getNrInscEstab() {
        return this.getVo().asString("NRINSCESTAB");
   }

   public void setNrInscEstab(String nrInscEstab) {
        markAsChanged("NRINSCESTAB", nrInscEstab);
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

   public BigDecimal getTpInscEstab() {
        return this.getVo().asBigDecimal("TPINSCESTAB");
   }

   public void setTpInscEstab(BigDecimal tpInscEstab) {
        markAsChanged("TPINSCESTAB", tpInscEstab);
   }

   public BigDecimal getVlrTotalBaseRet() {
        return this.getVo().asBigDecimal("VLRTOTALBASERET");
   }

   public void setVlrTotalBaseRet(BigDecimal vlrTotalBaseRet) {
        markAsChanged("VLRTOTALBASERET", vlrTotalBaseRet);
   }

   public BigDecimal getVlrTotalNRet() {
        return this.getVo().asBigDecimal("VLRTOTALNRET");
   }

   public void setVlrTotalNRet(BigDecimal vlrTotalNRet) {
        markAsChanged("VLRTOTALNRET", vlrTotalNRet);
   }

   public BigDecimal getVlrTotalNRetRet() {
        return this.getVo().asBigDecimal("VLRTOTALNRETRET");
   }

   public void setVlrTotalNRetRet(BigDecimal vlrTotalNRetRet) {
        markAsChanged("VLRTOTALNRETRET", vlrTotalNRetRet);
   }

   public BigDecimal getVlrTotalRep() {
        return this.getVo().asBigDecimal("VLRTOTALREP");
   }

   public void setVlrTotalRep(BigDecimal vlrTotalRep) {
        markAsChanged("VLRTOTALREP", vlrTotalRep);
   }

   public BigDecimal getVlrTotalRepRet() {
        return this.getVo().asBigDecimal("VLRTOTALREPRET");
   }

   public void setVlrTotalRepRet(BigDecimal vlrTotalRepRet) {
        markAsChanged("VLRTOTALREPRET", vlrTotalRepRet);
   }

   public BigDecimal getVlrTotalRet() {
        return this.getVo().asBigDecimal("VLRTOTALRET");
   }

   public void setVlrTotalRet(BigDecimal vlrTotalRet) {
        markAsChanged("VLRTOTALRET", vlrTotalRet);
   }

   public BigDecimal getVlrTotalRetRet() {
        return this.getVo().asBigDecimal("VLRTOTALRETRET");
   }

   public void setVlrTotalRetRet(BigDecimal vlrTotalRetRet) {
        markAsChanged("VLRTOTALRETRET", vlrTotalRetRet);
   }

   public String getXmlEvento() {
        return this.getVo().asString("XMLEVENTO");
   }

   public void setXmlEvento(String xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
   }

   public String getXmlRetorno() {
        return this.getVo().asString("XMLRETORNO");
   }

   public void setXmlRetorno(String xmlRetorno) {
        markAsChanged("XMLRETORNO", xmlRetorno);
   }

   @Override
   public String getTableName() {
        return "TRIRRAD";
   }

   @Override
   public String getEntityName() {
        return "RecRepassadosAssoDesp";
   }

   @Override
   public RecRepassadosAssoDesp fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
