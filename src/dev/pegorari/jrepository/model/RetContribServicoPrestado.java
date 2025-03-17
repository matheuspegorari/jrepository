package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RetContribServicoPrestado extends AbstractSankhyaEntity<RetContribServicoPrestado> {
   private String chave;
   private BigDecimal codEmp;
   private String controle;
   private Timestamp dtRef;
   private String idEvento;
   private BigDecimal indObra;
   private String nrInsc;
   private String nrInscEstabPrest;
   private String nrInscTomador;
   private String nrORecibo;
   private String nrOReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal tpInscEstabPrest;
   private BigDecimal tpInscTomador;
   private BigDecimal vlrTotalBaseRet;
   private BigDecimal vlrTotalBruto;
   private BigDecimal vlrTotalNRetAdic;
   private BigDecimal vlrTotalNRetPrinc;
   private BigDecimal vlrTotalRetAdic;
   private BigDecimal vlrTotalRetPrinc;
   private BigDecimal codEmpEstabPrest;
   private BigDecimal codParcTomador;
   private char[] dataChange;
   private char[] msg;
   private String nrInscTomadorRet;
   private String tipo;
   private BigDecimal tpInscTomadorRet;
   private BigDecimal vlrTotalBaseRetRet;
   private BigDecimal vlrTotalDifRet;
   private BigDecimal vlrTotalNRetAdicRet;
   private BigDecimal vlrTotalNRetPrincRet;
   private BigDecimal vlrTotalRetAdicCalc;
   private BigDecimal vlrTotalRetAdicDif;
   private BigDecimal vlrTotalRetAdicRet;
   private BigDecimal vlrTotalRetencaoCalc;
   private BigDecimal vlrTotalRetPrincRet;
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

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
   }

   public BigDecimal getIndObra() {
        return indObra;
   }

   public void setIndObra(BigDecimal indObra) {
        this.indObra = indObra;
   }

   public String getNrInsc() {
        return nrInsc;
   }

   public void setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
   }

   public String getNrInscEstabPrest() {
        return nrInscEstabPrest;
   }

   public void setNrInscEstabPrest(String nrInscEstabPrest) {
        this.nrInscEstabPrest = nrInscEstabPrest;
   }

   public String getNrInscTomador() {
        return nrInscTomador;
   }

   public void setNrInscTomador(String nrInscTomador) {
        this.nrInscTomador = nrInscTomador;
   }

   public String getNrORecibo() {
        return nrORecibo;
   }

   public void setNrORecibo(String nrORecibo) {
        this.nrORecibo = nrORecibo;
   }

   public String getNrOReciboAnt() {
        return nrOReciboAnt;
   }

   public void setNrOReciboAnt(String nrOReciboAnt) {
        this.nrOReciboAnt = nrOReciboAnt;
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

   public BigDecimal getTpInscEstabPrest() {
        return tpInscEstabPrest;
   }

   public void setTpInscEstabPrest(BigDecimal tpInscEstabPrest) {
        this.tpInscEstabPrest = tpInscEstabPrest;
   }

   public BigDecimal getTpInscTomador() {
        return tpInscTomador;
   }

   public void setTpInscTomador(BigDecimal tpInscTomador) {
        this.tpInscTomador = tpInscTomador;
   }

   public BigDecimal getVlrTotalBaseRet() {
        return vlrTotalBaseRet;
   }

   public void setVlrTotalBaseRet(BigDecimal vlrTotalBaseRet) {
        this.vlrTotalBaseRet = vlrTotalBaseRet;
   }

   public BigDecimal getVlrTotalBruto() {
        return vlrTotalBruto;
   }

   public void setVlrTotalBruto(BigDecimal vlrTotalBruto) {
        this.vlrTotalBruto = vlrTotalBruto;
   }

   public BigDecimal getVlrTotalNRetAdic() {
        return vlrTotalNRetAdic;
   }

   public void setVlrTotalNRetAdic(BigDecimal vlrTotalNRetAdic) {
        this.vlrTotalNRetAdic = vlrTotalNRetAdic;
   }

   public BigDecimal getVlrTotalNRetPrinc() {
        return vlrTotalNRetPrinc;
   }

   public void setVlrTotalNRetPrinc(BigDecimal vlrTotalNRetPrinc) {
        this.vlrTotalNRetPrinc = vlrTotalNRetPrinc;
   }

   public BigDecimal getVlrTotalRetAdic() {
        return vlrTotalRetAdic;
   }

   public void setVlrTotalRetAdic(BigDecimal vlrTotalRetAdic) {
        this.vlrTotalRetAdic = vlrTotalRetAdic;
   }

   public BigDecimal getVlrTotalRetPrinc() {
        return vlrTotalRetPrinc;
   }

   public void setVlrTotalRetPrinc(BigDecimal vlrTotalRetPrinc) {
        this.vlrTotalRetPrinc = vlrTotalRetPrinc;
   }

   public BigDecimal getCodEmpEstabPrest() {
        return codEmpEstabPrest;
   }

   public void setCodEmpEstabPrest(BigDecimal codEmpEstabPrest) {
        this.codEmpEstabPrest = codEmpEstabPrest;
   }

   public BigDecimal getCodParcTomador() {
        return codParcTomador;
   }

   public void setCodParcTomador(BigDecimal codParcTomador) {
        this.codParcTomador = codParcTomador;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        this.dataChange = dataChange;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
   }

   public String getNrInscTomadorRet() {
        return nrInscTomadorRet;
   }

   public void setNrInscTomadorRet(String nrInscTomadorRet) {
        this.nrInscTomadorRet = nrInscTomadorRet;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getTpInscTomadorRet() {
        return tpInscTomadorRet;
   }

   public void setTpInscTomadorRet(BigDecimal tpInscTomadorRet) {
        this.tpInscTomadorRet = tpInscTomadorRet;
   }

   public BigDecimal getVlrTotalBaseRetRet() {
        return vlrTotalBaseRetRet;
   }

   public void setVlrTotalBaseRetRet(BigDecimal vlrTotalBaseRetRet) {
        this.vlrTotalBaseRetRet = vlrTotalBaseRetRet;
   }

   public BigDecimal getVlrTotalDifRet() {
        return vlrTotalDifRet;
   }

   public void setVlrTotalDifRet(BigDecimal vlrTotalDifRet) {
        this.vlrTotalDifRet = vlrTotalDifRet;
   }

   public BigDecimal getVlrTotalNRetAdicRet() {
        return vlrTotalNRetAdicRet;
   }

   public void setVlrTotalNRetAdicRet(BigDecimal vlrTotalNRetAdicRet) {
        this.vlrTotalNRetAdicRet = vlrTotalNRetAdicRet;
   }

   public BigDecimal getVlrTotalNRetPrincRet() {
        return vlrTotalNRetPrincRet;
   }

   public void setVlrTotalNRetPrincRet(BigDecimal vlrTotalNRetPrincRet) {
        this.vlrTotalNRetPrincRet = vlrTotalNRetPrincRet;
   }

   public BigDecimal getVlrTotalRetAdicCalc() {
        return vlrTotalRetAdicCalc;
   }

   public void setVlrTotalRetAdicCalc(BigDecimal vlrTotalRetAdicCalc) {
        this.vlrTotalRetAdicCalc = vlrTotalRetAdicCalc;
   }

   public BigDecimal getVlrTotalRetAdicDif() {
        return vlrTotalRetAdicDif;
   }

   public void setVlrTotalRetAdicDif(BigDecimal vlrTotalRetAdicDif) {
        this.vlrTotalRetAdicDif = vlrTotalRetAdicDif;
   }

   public BigDecimal getVlrTotalRetAdicRet() {
        return vlrTotalRetAdicRet;
   }

   public void setVlrTotalRetAdicRet(BigDecimal vlrTotalRetAdicRet) {
        this.vlrTotalRetAdicRet = vlrTotalRetAdicRet;
   }

   public BigDecimal getVlrTotalRetencaoCalc() {
        return vlrTotalRetencaoCalc;
   }

   public void setVlrTotalRetencaoCalc(BigDecimal vlrTotalRetencaoCalc) {
        this.vlrTotalRetencaoCalc = vlrTotalRetencaoCalc;
   }

   public BigDecimal getVlrTotalRetPrincRet() {
        return vlrTotalRetPrincRet;
   }

   public void setVlrTotalRetPrincRet(BigDecimal vlrTotalRetPrincRet) {
        this.vlrTotalRetPrincRet = vlrTotalRetPrincRet;
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
   public String getTableName() {
        return "TRIRCSP";
   }

   @Override
   public String getEntityName() {
        return "RetContribServicoPrestado";
   }

   @Override
   public RetContribServicoPrestado fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.indObra = vo.asBigDecimal("INDOBRA");
        this.nrInsc = vo.asString("NRINSC");
        this.nrInscEstabPrest = vo.asString("NRINSCESTABPREST");
        this.nrInscTomador = vo.asString("NRINSCTOMADOR");
        this.nrORecibo = vo.asString("NRORECIBO");
        this.nrOReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstabPrest = vo.asBigDecimal("TPINSCESTABPREST");
        this.tpInscTomador = vo.asBigDecimal("TPINSCTOMADOR");
        this.vlrTotalBaseRet = vo.asBigDecimal("VLRTOTALBASERET");
        this.vlrTotalBruto = vo.asBigDecimal("VLRTOTALBRUTO");
        this.vlrTotalNRetAdic = vo.asBigDecimal("VLRTOTALNRETADIC");
        this.vlrTotalNRetPrinc = vo.asBigDecimal("VLRTOTALNRETPRINC");
        this.vlrTotalRetAdic = vo.asBigDecimal("VLRTOTALRETADIC");
        this.vlrTotalRetPrinc = vo.asBigDecimal("VLRTOTALRETPRINC");
        this.codEmpEstabPrest = vo.asBigDecimal("CODEMPESTABPREST");
        this.codParcTomador = vo.asBigDecimal("CODPARCTOMADOR");
        this.dataChange = vo.asClob("DATACHANGE");
        this.msg = vo.asClob("MSG");
        this.nrInscTomadorRet = vo.asString("NRINSCTOMADORRET");
        this.tipo = vo.asString("TIPO");
        this.tpInscTomadorRet = vo.asBigDecimal("TPINSCTOMADORRET");
        this.vlrTotalBaseRetRet = vo.asBigDecimal("VLRTOTALBASERETRET");
        this.vlrTotalDifRet = vo.asBigDecimal("VLRTOTALDIFRET");
        this.vlrTotalNRetAdicRet = vo.asBigDecimal("VLRTOTALNRETADICRET");
        this.vlrTotalNRetPrincRet = vo.asBigDecimal("VLRTOTALNRETPRINCRET");
        this.vlrTotalRetAdicCalc = vo.asBigDecimal("VLRTOTALRETADICCALC");
        this.vlrTotalRetAdicDif = vo.asBigDecimal("VLRTOTALRETADICDIF");
        this.vlrTotalRetAdicRet = vo.asBigDecimal("VLRTOTALRETADICRET");
        this.vlrTotalRetencaoCalc = vo.asBigDecimal("VLRTOTALRETENCAOCALC");
        this.vlrTotalRetPrincRet = vo.asBigDecimal("VLRTOTALRETPRINCRET");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.xmlRetorno = vo.asClob("XMLRETORNO");
        return this;
   }
}
