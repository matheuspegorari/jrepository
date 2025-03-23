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
        markAsChanged("CHAVE", chave);
        this.chave = chave;
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

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public String getIdEvento() {
        return idEvento;
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
        this.idEvento = idEvento;
   }

   public BigDecimal getIndObra() {
        return indObra;
   }

   public void setIndObra(BigDecimal indObra) {
        markAsChanged("INDOBRA", indObra);
        this.indObra = indObra;
   }

   public String getNrInsc() {
        return nrInsc;
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
        this.nrInsc = nrInsc;
   }

   public String getNrInscEstabPrest() {
        return nrInscEstabPrest;
   }

   public void setNrInscEstabPrest(String nrInscEstabPrest) {
        markAsChanged("NRINSCESTABPREST", nrInscEstabPrest);
        this.nrInscEstabPrest = nrInscEstabPrest;
   }

   public String getNrInscTomador() {
        return nrInscTomador;
   }

   public void setNrInscTomador(String nrInscTomador) {
        markAsChanged("NRINSCTOMADOR", nrInscTomador);
        this.nrInscTomador = nrInscTomador;
   }

   public String getNrORecibo() {
        return nrORecibo;
   }

   public void setNrORecibo(String nrORecibo) {
        markAsChanged("NRORECIBO", nrORecibo);
        this.nrORecibo = nrORecibo;
   }

   public String getNrOReciboAnt() {
        return nrOReciboAnt;
   }

   public void setNrOReciboAnt(String nrOReciboAnt) {
        markAsChanged("NRORECIBOANT", nrOReciboAnt);
        this.nrOReciboAnt = nrOReciboAnt;
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

   public BigDecimal getTpInscEstabPrest() {
        return tpInscEstabPrest;
   }

   public void setTpInscEstabPrest(BigDecimal tpInscEstabPrest) {
        markAsChanged("TPINSCESTABPREST", tpInscEstabPrest);
        this.tpInscEstabPrest = tpInscEstabPrest;
   }

   public BigDecimal getTpInscTomador() {
        return tpInscTomador;
   }

   public void setTpInscTomador(BigDecimal tpInscTomador) {
        markAsChanged("TPINSCTOMADOR", tpInscTomador);
        this.tpInscTomador = tpInscTomador;
   }

   public BigDecimal getVlrTotalBaseRet() {
        return vlrTotalBaseRet;
   }

   public void setVlrTotalBaseRet(BigDecimal vlrTotalBaseRet) {
        markAsChanged("VLRTOTALBASERET", vlrTotalBaseRet);
        this.vlrTotalBaseRet = vlrTotalBaseRet;
   }

   public BigDecimal getVlrTotalBruto() {
        return vlrTotalBruto;
   }

   public void setVlrTotalBruto(BigDecimal vlrTotalBruto) {
        markAsChanged("VLRTOTALBRUTO", vlrTotalBruto);
        this.vlrTotalBruto = vlrTotalBruto;
   }

   public BigDecimal getVlrTotalNRetAdic() {
        return vlrTotalNRetAdic;
   }

   public void setVlrTotalNRetAdic(BigDecimal vlrTotalNRetAdic) {
        markAsChanged("VLRTOTALNRETADIC", vlrTotalNRetAdic);
        this.vlrTotalNRetAdic = vlrTotalNRetAdic;
   }

   public BigDecimal getVlrTotalNRetPrinc() {
        return vlrTotalNRetPrinc;
   }

   public void setVlrTotalNRetPrinc(BigDecimal vlrTotalNRetPrinc) {
        markAsChanged("VLRTOTALNRETPRINC", vlrTotalNRetPrinc);
        this.vlrTotalNRetPrinc = vlrTotalNRetPrinc;
   }

   public BigDecimal getVlrTotalRetAdic() {
        return vlrTotalRetAdic;
   }

   public void setVlrTotalRetAdic(BigDecimal vlrTotalRetAdic) {
        markAsChanged("VLRTOTALRETADIC", vlrTotalRetAdic);
        this.vlrTotalRetAdic = vlrTotalRetAdic;
   }

   public BigDecimal getVlrTotalRetPrinc() {
        return vlrTotalRetPrinc;
   }

   public void setVlrTotalRetPrinc(BigDecimal vlrTotalRetPrinc) {
        markAsChanged("VLRTOTALRETPRINC", vlrTotalRetPrinc);
        this.vlrTotalRetPrinc = vlrTotalRetPrinc;
   }

   public BigDecimal getCodEmpEstabPrest() {
        return codEmpEstabPrest;
   }

   public void setCodEmpEstabPrest(BigDecimal codEmpEstabPrest) {
        markAsChanged("CODEMPESTABPREST", codEmpEstabPrest);
        this.codEmpEstabPrest = codEmpEstabPrest;
   }

   public BigDecimal getCodParcTomador() {
        return codParcTomador;
   }

   public void setCodParcTomador(BigDecimal codParcTomador) {
        markAsChanged("CODPARCTOMADOR", codParcTomador);
        this.codParcTomador = codParcTomador;
   }

   public char[] getDataChange() {
        return dataChange;
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
        this.dataChange = dataChange;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public String getNrInscTomadorRet() {
        return nrInscTomadorRet;
   }

   public void setNrInscTomadorRet(String nrInscTomadorRet) {
        markAsChanged("NRINSCTOMADORRET", nrInscTomadorRet);
        this.nrInscTomadorRet = nrInscTomadorRet;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getTpInscTomadorRet() {
        return tpInscTomadorRet;
   }

   public void setTpInscTomadorRet(BigDecimal tpInscTomadorRet) {
        markAsChanged("TPINSCTOMADORRET", tpInscTomadorRet);
        this.tpInscTomadorRet = tpInscTomadorRet;
   }

   public BigDecimal getVlrTotalBaseRetRet() {
        return vlrTotalBaseRetRet;
   }

   public void setVlrTotalBaseRetRet(BigDecimal vlrTotalBaseRetRet) {
        markAsChanged("VLRTOTALBASERETRET", vlrTotalBaseRetRet);
        this.vlrTotalBaseRetRet = vlrTotalBaseRetRet;
   }

   public BigDecimal getVlrTotalDifRet() {
        return vlrTotalDifRet;
   }

   public void setVlrTotalDifRet(BigDecimal vlrTotalDifRet) {
        markAsChanged("VLRTOTALDIFRET", vlrTotalDifRet);
        this.vlrTotalDifRet = vlrTotalDifRet;
   }

   public BigDecimal getVlrTotalNRetAdicRet() {
        return vlrTotalNRetAdicRet;
   }

   public void setVlrTotalNRetAdicRet(BigDecimal vlrTotalNRetAdicRet) {
        markAsChanged("VLRTOTALNRETADICRET", vlrTotalNRetAdicRet);
        this.vlrTotalNRetAdicRet = vlrTotalNRetAdicRet;
   }

   public BigDecimal getVlrTotalNRetPrincRet() {
        return vlrTotalNRetPrincRet;
   }

   public void setVlrTotalNRetPrincRet(BigDecimal vlrTotalNRetPrincRet) {
        markAsChanged("VLRTOTALNRETPRINCRET", vlrTotalNRetPrincRet);
        this.vlrTotalNRetPrincRet = vlrTotalNRetPrincRet;
   }

   public BigDecimal getVlrTotalRetAdicCalc() {
        return vlrTotalRetAdicCalc;
   }

   public void setVlrTotalRetAdicCalc(BigDecimal vlrTotalRetAdicCalc) {
        markAsChanged("VLRTOTALRETADICCALC", vlrTotalRetAdicCalc);
        this.vlrTotalRetAdicCalc = vlrTotalRetAdicCalc;
   }

   public BigDecimal getVlrTotalRetAdicDif() {
        return vlrTotalRetAdicDif;
   }

   public void setVlrTotalRetAdicDif(BigDecimal vlrTotalRetAdicDif) {
        markAsChanged("VLRTOTALRETADICDIF", vlrTotalRetAdicDif);
        this.vlrTotalRetAdicDif = vlrTotalRetAdicDif;
   }

   public BigDecimal getVlrTotalRetAdicRet() {
        return vlrTotalRetAdicRet;
   }

   public void setVlrTotalRetAdicRet(BigDecimal vlrTotalRetAdicRet) {
        markAsChanged("VLRTOTALRETADICRET", vlrTotalRetAdicRet);
        this.vlrTotalRetAdicRet = vlrTotalRetAdicRet;
   }

   public BigDecimal getVlrTotalRetencaoCalc() {
        return vlrTotalRetencaoCalc;
   }

   public void setVlrTotalRetencaoCalc(BigDecimal vlrTotalRetencaoCalc) {
        markAsChanged("VLRTOTALRETENCAOCALC", vlrTotalRetencaoCalc);
        this.vlrTotalRetencaoCalc = vlrTotalRetencaoCalc;
   }

   public BigDecimal getVlrTotalRetPrincRet() {
        return vlrTotalRetPrincRet;
   }

   public void setVlrTotalRetPrincRet(BigDecimal vlrTotalRetPrincRet) {
        markAsChanged("VLRTOTALRETPRINCRET", vlrTotalRetPrincRet);
        this.vlrTotalRetPrincRet = vlrTotalRetPrincRet;
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
