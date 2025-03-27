package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RetContribServicoPrestado extends AbstractSankhyaEntity<RetContribServicoPrestado> {
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

   public BigDecimal getIndObra() {
        return this.getVo().asBigDecimal("INDOBRA");
   }

   public void setIndObra(BigDecimal indObra) {
        markAsChanged("INDOBRA", indObra);
   }

   public String getNrInsc() {
        return this.getVo().asString("NRINSC");
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
   }

   public String getNrInscEstabPrest() {
        return this.getVo().asString("NRINSCESTABPREST");
   }

   public void setNrInscEstabPrest(String nrInscEstabPrest) {
        markAsChanged("NRINSCESTABPREST", nrInscEstabPrest);
   }

   public String getNrInscTomador() {
        return this.getVo().asString("NRINSCTOMADOR");
   }

   public void setNrInscTomador(String nrInscTomador) {
        markAsChanged("NRINSCTOMADOR", nrInscTomador);
   }

   public String getNrORecibo() {
        return this.getVo().asString("NRORECIBO");
   }

   public void setNrORecibo(String nrORecibo) {
        markAsChanged("NRORECIBO", nrORecibo);
   }

   public String getNrOReciboAnt() {
        return this.getVo().asString("NRORECIBOANT");
   }

   public void setNrOReciboAnt(String nrOReciboAnt) {
        markAsChanged("NRORECIBOANT", nrOReciboAnt);
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

   public BigDecimal getTpInscEstabPrest() {
        return this.getVo().asBigDecimal("TPINSCESTABPREST");
   }

   public void setTpInscEstabPrest(BigDecimal tpInscEstabPrest) {
        markAsChanged("TPINSCESTABPREST", tpInscEstabPrest);
   }

   public BigDecimal getTpInscTomador() {
        return this.getVo().asBigDecimal("TPINSCTOMADOR");
   }

   public void setTpInscTomador(BigDecimal tpInscTomador) {
        markAsChanged("TPINSCTOMADOR", tpInscTomador);
   }

   public BigDecimal getVlrTotalBaseRet() {
        return this.getVo().asBigDecimal("VLRTOTALBASERET");
   }

   public void setVlrTotalBaseRet(BigDecimal vlrTotalBaseRet) {
        markAsChanged("VLRTOTALBASERET", vlrTotalBaseRet);
   }

   public BigDecimal getVlrTotalBruto() {
        return this.getVo().asBigDecimal("VLRTOTALBRUTO");
   }

   public void setVlrTotalBruto(BigDecimal vlrTotalBruto) {
        markAsChanged("VLRTOTALBRUTO", vlrTotalBruto);
   }

   public BigDecimal getVlrTotalNRetAdic() {
        return this.getVo().asBigDecimal("VLRTOTALNRETADIC");
   }

   public void setVlrTotalNRetAdic(BigDecimal vlrTotalNRetAdic) {
        markAsChanged("VLRTOTALNRETADIC", vlrTotalNRetAdic);
   }

   public BigDecimal getVlrTotalNRetPrinc() {
        return this.getVo().asBigDecimal("VLRTOTALNRETPRINC");
   }

   public void setVlrTotalNRetPrinc(BigDecimal vlrTotalNRetPrinc) {
        markAsChanged("VLRTOTALNRETPRINC", vlrTotalNRetPrinc);
   }

   public BigDecimal getVlrTotalRetAdic() {
        return this.getVo().asBigDecimal("VLRTOTALRETADIC");
   }

   public void setVlrTotalRetAdic(BigDecimal vlrTotalRetAdic) {
        markAsChanged("VLRTOTALRETADIC", vlrTotalRetAdic);
   }

   public BigDecimal getVlrTotalRetPrinc() {
        return this.getVo().asBigDecimal("VLRTOTALRETPRINC");
   }

   public void setVlrTotalRetPrinc(BigDecimal vlrTotalRetPrinc) {
        markAsChanged("VLRTOTALRETPRINC", vlrTotalRetPrinc);
   }

   public BigDecimal getCodEmpEstabPrest() {
        return this.getVo().asBigDecimal("CODEMPESTABPREST");
   }

   public void setCodEmpEstabPrest(BigDecimal codEmpEstabPrest) {
        markAsChanged("CODEMPESTABPREST", codEmpEstabPrest);
   }

   public BigDecimal getCodParcTomador() {
        return this.getVo().asBigDecimal("CODPARCTOMADOR");
   }

   public void setCodParcTomador(BigDecimal codParcTomador) {
        markAsChanged("CODPARCTOMADOR", codParcTomador);
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

   public String getNrInscTomadorRet() {
        return this.getVo().asString("NRINSCTOMADORRET");
   }

   public void setNrInscTomadorRet(String nrInscTomadorRet) {
        markAsChanged("NRINSCTOMADORRET", nrInscTomadorRet);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getTpInscTomadorRet() {
        return this.getVo().asBigDecimal("TPINSCTOMADORRET");
   }

   public void setTpInscTomadorRet(BigDecimal tpInscTomadorRet) {
        markAsChanged("TPINSCTOMADORRET", tpInscTomadorRet);
   }

   public BigDecimal getVlrTotalBaseRetRet() {
        return this.getVo().asBigDecimal("VLRTOTALBASERETRET");
   }

   public void setVlrTotalBaseRetRet(BigDecimal vlrTotalBaseRetRet) {
        markAsChanged("VLRTOTALBASERETRET", vlrTotalBaseRetRet);
   }

   public BigDecimal getVlrTotalDifRet() {
        return this.getVo().asBigDecimal("VLRTOTALDIFRET");
   }

   public void setVlrTotalDifRet(BigDecimal vlrTotalDifRet) {
        markAsChanged("VLRTOTALDIFRET", vlrTotalDifRet);
   }

   public BigDecimal getVlrTotalNRetAdicRet() {
        return this.getVo().asBigDecimal("VLRTOTALNRETADICRET");
   }

   public void setVlrTotalNRetAdicRet(BigDecimal vlrTotalNRetAdicRet) {
        markAsChanged("VLRTOTALNRETADICRET", vlrTotalNRetAdicRet);
   }

   public BigDecimal getVlrTotalNRetPrincRet() {
        return this.getVo().asBigDecimal("VLRTOTALNRETPRINCRET");
   }

   public void setVlrTotalNRetPrincRet(BigDecimal vlrTotalNRetPrincRet) {
        markAsChanged("VLRTOTALNRETPRINCRET", vlrTotalNRetPrincRet);
   }

   public BigDecimal getVlrTotalRetAdicCalc() {
        return this.getVo().asBigDecimal("VLRTOTALRETADICCALC");
   }

   public void setVlrTotalRetAdicCalc(BigDecimal vlrTotalRetAdicCalc) {
        markAsChanged("VLRTOTALRETADICCALC", vlrTotalRetAdicCalc);
   }

   public BigDecimal getVlrTotalRetAdicDif() {
        return this.getVo().asBigDecimal("VLRTOTALRETADICDIF");
   }

   public void setVlrTotalRetAdicDif(BigDecimal vlrTotalRetAdicDif) {
        markAsChanged("VLRTOTALRETADICDIF", vlrTotalRetAdicDif);
   }

   public BigDecimal getVlrTotalRetAdicRet() {
        return this.getVo().asBigDecimal("VLRTOTALRETADICRET");
   }

   public void setVlrTotalRetAdicRet(BigDecimal vlrTotalRetAdicRet) {
        markAsChanged("VLRTOTALRETADICRET", vlrTotalRetAdicRet);
   }

   public BigDecimal getVlrTotalRetencaoCalc() {
        return this.getVo().asBigDecimal("VLRTOTALRETENCAOCALC");
   }

   public void setVlrTotalRetencaoCalc(BigDecimal vlrTotalRetencaoCalc) {
        markAsChanged("VLRTOTALRETENCAOCALC", vlrTotalRetencaoCalc);
   }

   public BigDecimal getVlrTotalRetPrincRet() {
        return this.getVo().asBigDecimal("VLRTOTALRETPRINCRET");
   }

   public void setVlrTotalRetPrincRet(BigDecimal vlrTotalRetPrincRet) {
        markAsChanged("VLRTOTALRETPRINCRET", vlrTotalRetPrincRet);
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
        return "TRIRCSP";
   }

   @Override
   public String getEntityName() {
        return "RetContribServicoPrestado";
   }

   @Override
   public RetContribServicoPrestado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
