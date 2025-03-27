package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContribPrevReceitaBruta extends AbstractSankhyaEntity<ContribPrevReceitaBruta> {
   public String getNroRecibo() {
        return this.getVo().asString("NRORECIBO");
   }

   public void setNroRecibo(String nroRecibo) {
        markAsChanged("NRORECIBO", nroRecibo);
   }

   public String getNroReciboAnt() {
        return this.getVo().asString("NRORECIBOANT");
   }

   public void setNroReciboAnt(String nroReciboAnt) {
        markAsChanged("NRORECIBOANT", nroReciboAnt);
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

   public BigDecimal getVlrCpApuTotal() {
        return this.getVo().asBigDecimal("VLRCPAPURTOTAL");
   }

   public void setVlrCpApuTotal(BigDecimal vlrCpApuTotal) {
        markAsChanged("VLRCPAPURTOTAL", vlrCpApuTotal);
   }

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

   public String getIdEvento() {
        return this.getVo().asString("IDEVENTO");
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
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

   public BigDecimal getVlrCpRbSuspTotal() {
        return this.getVo().asBigDecimal("VLRCPRBSUSPTOTAL");
   }

   public void setVlrCpRbSuspTotal(BigDecimal vlrCpRbSuspTotal) {
        markAsChanged("VLRCPRBSUSPTOTAL", vlrCpRbSuspTotal);
   }

   public BigDecimal getVlrRecBrutaTotal() {
        return this.getVo().asBigDecimal("VLRRECBRUTATOTAL");
   }

   public void setVlrRecBrutaTotal(BigDecimal vlrRecBrutaTotal) {
        markAsChanged("VLRRECBRUTATOTAL", vlrRecBrutaTotal);
   }

   public BigDecimal getCodEmpEstab() {
        return this.getVo().asBigDecimal("CODEMPESTAB");
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
   }

   public String getCodReceita() {
        return this.getVo().asString("CODRECEITA");
   }

   public void setCodReceita(String codReceita) {
        markAsChanged("CODRECEITA", codReceita);
   }

   public char[] getDataChange() {
        return this.getVo().asClob("DATACHANGE");
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVlrBcCpRbTotal() {
        return this.getVo().asBigDecimal("VLRBCCPRBTOTAL");
   }

   public void setVlrBcCpRbTotal(BigDecimal vlrBcCpRbTotal) {
        markAsChanged("VLRBCCPRBTOTAL", vlrBcCpRbTotal);
   }

   public BigDecimal getVlrCpApuTotalRet() {
        return this.getVo().asBigDecimal("VLRCPAPURTOTALRET");
   }

   public void setVlrCpApuTotalRet(BigDecimal vlrCpApuTotalRet) {
        markAsChanged("VLRCPAPURTOTALRET", vlrCpApuTotalRet);
   }

   public BigDecimal getVlrCpRbSuspTotalRet() {
        return this.getVo().asBigDecimal("VLRCPRBSUSPTOTALRET");
   }

   public void setVlrCpRbSuspTotalRet(BigDecimal vlrCpRbSuspTotalRet) {
        markAsChanged("VLRCPRBSUSPTOTALRET", vlrCpRbSuspTotalRet);
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
        return "TRICPRB";
   }

   @Override
   public String getEntityName() {
        return "ContribPrevReceitaBruta";
   }

   @Override
   public ContribPrevReceitaBruta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
