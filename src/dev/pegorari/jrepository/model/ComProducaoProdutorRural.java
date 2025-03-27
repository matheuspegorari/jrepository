package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComProducaoProdutorRural extends AbstractSankhyaEntity<ComProducaoProdutorRural> {
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

   public BigDecimal getVlrCpApur() {
        return this.getVo().asBigDecimal("VLRCPAPUR");
   }

   public void setVlrCpApur(BigDecimal vlrCpApur) {
        markAsChanged("VLRCPAPUR", vlrCpApur);
   }

   public BigDecimal getVlrCpSuspTotal() {
        return this.getVo().asBigDecimal("VLRCPSUSPTOTAL");
   }

   public void setVlrCpSuspTotal(BigDecimal vlrCpSuspTotal) {
        markAsChanged("VLRCPSUSPTOTAL", vlrCpSuspTotal);
   }

   public BigDecimal getVlrRatApur() {
        return this.getVo().asBigDecimal("VLRRATAPUR");
   }

   public void setVlrRatApur(BigDecimal vlrRatApur) {
        markAsChanged("VLRRATAPUR", vlrRatApur);
   }

   public BigDecimal getVlrRatSuspTotal() {
        return this.getVo().asBigDecimal("VLRRATSUSPTOTAL");
   }

   public void setVlrRatSuspTotal(BigDecimal vlrRatSuspTotal) {
        markAsChanged("VLRRATSUSPTOTAL", vlrRatSuspTotal);
   }

   public BigDecimal getVlrRecBrutaTotal() {
        return this.getVo().asBigDecimal("VLRRECBRUTATOTAL");
   }

   public void setVlrRecBrutaTotal(BigDecimal vlrRecBrutaTotal) {
        markAsChanged("VLRRECBRUTATOTAL", vlrRecBrutaTotal);
   }

   public BigDecimal getVlrSenarApur() {
        return this.getVo().asBigDecimal("VLRSENARAPUR");
   }

   public void setVlrSenarApur(BigDecimal vlrSenarApur) {
        markAsChanged("VLRSENARAPUR", vlrSenarApur);
   }

   public BigDecimal getVlrSenarSuspTotal() {
        return this.getVo().asBigDecimal("VLRSENARSUSPTOTAL");
   }

   public void setVlrSenarSuspTotal(BigDecimal vlrSenarSuspTotal) {
        markAsChanged("VLRSENARSUSPTOTAL", vlrSenarSuspTotal);
   }

   public BigDecimal getCodEmpEstab() {
        return this.getVo().asBigDecimal("CODEMPESTAB");
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
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

   public BigDecimal getVlrBaseCpApur() {
        return this.getVo().asBigDecimal("VLRBASECPAPUR");
   }

   public void setVlrBaseCpApur(BigDecimal vlrBaseCpApur) {
        markAsChanged("VLRBASECPAPUR", vlrBaseCpApur);
   }

   public BigDecimal getVlrBaseRatApur() {
        return this.getVo().asBigDecimal("VLRBASERATAPUR");
   }

   public void setVlrBaseRatApur(BigDecimal vlrBaseRatApur) {
        markAsChanged("VLRBASERATAPUR", vlrBaseRatApur);
   }

   public BigDecimal getVlrBaseSenarApur() {
        return this.getVo().asBigDecimal("VLRBASESENARAPUR");
   }

   public void setVlrBaseSenarApur(BigDecimal vlrBaseSenarApur) {
        markAsChanged("VLRBASESENARAPUR", vlrBaseSenarApur);
   }

   public BigDecimal getVlrCpApurRet() {
        return this.getVo().asBigDecimal("VLRCPAPURRET");
   }

   public void setVlrCpApurRet(BigDecimal vlrCpApurRet) {
        markAsChanged("VLRCPAPURRET", vlrCpApurRet);
   }

   public BigDecimal getVlrCpSuspTotalRet() {
        return this.getVo().asBigDecimal("VLRCPSUSPTOTALRET");
   }

   public void setVlrCpSuspTotalRet(BigDecimal vlrCpSuspTotalRet) {
        markAsChanged("VLRCPSUSPTOTALRET", vlrCpSuspTotalRet);
   }

   public BigDecimal getVlrRatApurRet() {
        return this.getVo().asBigDecimal("VLRRATAPURRET");
   }

   public void setVlrRatApurRet(BigDecimal vlrRatApurRet) {
        markAsChanged("VLRRATAPURRET", vlrRatApurRet);
   }

   public BigDecimal getVlrRatSuspTotalRet() {
        return this.getVo().asBigDecimal("VLRRATSUSPTOTALRET");
   }

   public void setVlrRatSuspTotalRet(BigDecimal vlrRatSuspTotalRet) {
        markAsChanged("VLRRATSUSPTOTALRET", vlrRatSuspTotalRet);
   }

   public BigDecimal getVlrSenarApurRet() {
        return this.getVo().asBigDecimal("VLRSENARAPURRET");
   }

   public void setVlrSenarApurRet(BigDecimal vlrSenarApurRet) {
        markAsChanged("VLRSENARAPURRET", vlrSenarApurRet);
   }

   public BigDecimal getVlrSenarSuspTotalRet() {
        return this.getVo().asBigDecimal("VLRSENARSUSPTOTALRET");
   }

   public void setVlrSenarSuspTotalRet(BigDecimal vlrSenarSuspTotalRet) {
        markAsChanged("VLRSENARSUSPTOTALRET", vlrSenarSuspTotalRet);
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
        return "TRICPPR";
   }

   @Override
   public String getEntityName() {
        return "ComProducaoProdutorRural";
   }

   @Override
   public ComProducaoProdutorRural fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
