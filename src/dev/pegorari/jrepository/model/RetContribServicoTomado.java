package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RetContribServicoTomado extends AbstractSankhyaEntity<RetContribServicoTomado> {
   private String chave;
   private String cnpjPrestador;
   private BigDecimal codEmp;
   private String controle;
   private Timestamp dtRef;
   private String idEvento;
   private BigDecimal indCprb;
   private BigDecimal indObra;
   private String nrInsc;
   private String nrInscEstab;
   private String nrRecibo;
   private String nrReciboAnt;
   private BigDecimal sequencia;
   private String statusReg;
   private String tpAmb;
   private BigDecimal tpInsc;
   private BigDecimal tpInscEstab;
   private BigDecimal vlrTotalBaseRet;
   private BigDecimal vlrTotalBruto;
   private BigDecimal vlrTotalNretAdic;
   private BigDecimal vlrTotalNretPrinc;
   private BigDecimal vlrTotalRetAdic;
   private BigDecimal vlrTotalRetPrinc;
   private String cnpjPrestadorRet;
   private BigDecimal codEmpEstab;
   private BigDecimal codParcPrestador;
   private char[] dataChange;
   private char[] msg;
   private String tipo;
   private BigDecimal vlrCrTom;
   private BigDecimal vlrCrTomRet;
   private BigDecimal vlrCrTomSusp;
   private BigDecimal vlrCrTomSuspRet;
   private BigDecimal vlrTotalBaseRetRet;
   private BigDecimal vlrTotalDifRet;
   private BigDecimal vlrTotalNretAdicRet;
   private BigDecimal vlrTotalNretPrincRet;
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

   public String getCnpjPrestador() {
        return cnpjPrestador;
   }

   public void setCnpjPrestador(String cnpjPrestador) {
        this.cnpjPrestador = cnpjPrestador;
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

   public BigDecimal getIndCprb() {
        return indCprb;
   }

   public void setIndCprb(BigDecimal indCprb) {
        this.indCprb = indCprb;
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

   public String getNrInscEstab() {
        return nrInscEstab;
   }

   public void setNrInscEstab(String nrInscEstab) {
        this.nrInscEstab = nrInscEstab;
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

   public BigDecimal getTpInscEstab() {
        return tpInscEstab;
   }

   public void setTpInscEstab(BigDecimal tpInscEstab) {
        this.tpInscEstab = tpInscEstab;
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

   public BigDecimal getVlrTotalNretAdic() {
        return vlrTotalNretAdic;
   }

   public void setVlrTotalNretAdic(BigDecimal vlrTotalNretAdic) {
        this.vlrTotalNretAdic = vlrTotalNretAdic;
   }

   public BigDecimal getVlrTotalNretPrinc() {
        return vlrTotalNretPrinc;
   }

   public void setVlrTotalNretPrinc(BigDecimal vlrTotalNretPrinc) {
        this.vlrTotalNretPrinc = vlrTotalNretPrinc;
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

   public String getCnpjPrestadorRet() {
        return cnpjPrestadorRet;
   }

   public void setCnpjPrestadorRet(String cnpjPrestadorRet) {
        this.cnpjPrestadorRet = cnpjPrestadorRet;
   }

   public BigDecimal getCodEmpEstab() {
        return codEmpEstab;
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        this.codEmpEstab = codEmpEstab;
   }

   public BigDecimal getCodParcPrestador() {
        return codParcPrestador;
   }

   public void setCodParcPrestador(BigDecimal codParcPrestador) {
        this.codParcPrestador = codParcPrestador;
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

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getVlrCrTom() {
        return vlrCrTom;
   }

   public void setVlrCrTom(BigDecimal vlrCrTom) {
        this.vlrCrTom = vlrCrTom;
   }

   public BigDecimal getVlrCrTomRet() {
        return vlrCrTomRet;
   }

   public void setVlrCrTomRet(BigDecimal vlrCrTomRet) {
        this.vlrCrTomRet = vlrCrTomRet;
   }

   public BigDecimal getVlrCrTomSusp() {
        return vlrCrTomSusp;
   }

   public void setVlrCrTomSusp(BigDecimal vlrCrTomSusp) {
        this.vlrCrTomSusp = vlrCrTomSusp;
   }

   public BigDecimal getVlrCrTomSuspRet() {
        return vlrCrTomSuspRet;
   }

   public void setVlrCrTomSuspRet(BigDecimal vlrCrTomSuspRet) {
        this.vlrCrTomSuspRet = vlrCrTomSuspRet;
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

   public BigDecimal getVlrTotalNretAdicRet() {
        return vlrTotalNretAdicRet;
   }

   public void setVlrTotalNretAdicRet(BigDecimal vlrTotalNretAdicRet) {
        this.vlrTotalNretAdicRet = vlrTotalNretAdicRet;
   }

   public BigDecimal getVlrTotalNretPrincRet() {
        return vlrTotalNretPrincRet;
   }

   public void setVlrTotalNretPrincRet(BigDecimal vlrTotalNretPrincRet) {
        this.vlrTotalNretPrincRet = vlrTotalNretPrincRet;
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
        return "TRIRCST";
   }

   @Override
   public String getEntityName() {
        return "RetContribServicoTomado";
   }

   @Override
   public RetContribServicoTomado fromVO(DynamicVO vo) {
        this.chave = vo.asString("CHAVE");
        this.cnpjPrestador = vo.asString("CNPJPRESTADOR");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.controle = vo.asString("CONTROLE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.idEvento = vo.asString("IDEVENTO");
        this.indCprb = vo.asBigDecimal("INDCPRB");
        this.indObra = vo.asBigDecimal("INDOBRA");
        this.nrInsc = vo.asString("NRINSC");
        this.nrInscEstab = vo.asString("NRINSCESTAB");
        this.nrRecibo = vo.asString("NRORECIBO");
        this.nrReciboAnt = vo.asString("NRORECIBOANT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.statusReg = vo.asString("STATUSREG");
        this.tpAmb = vo.asString("TPAMB");
        this.tpInsc = vo.asBigDecimal("TPINSC");
        this.tpInscEstab = vo.asBigDecimal("TPINSCESTAB");
        this.vlrTotalBaseRet = vo.asBigDecimal("VLRTOTALBASERET");
        this.vlrTotalBruto = vo.asBigDecimal("VLRTOTALBRUTO");
        this.vlrTotalNretAdic = vo.asBigDecimal("VLRTOTALNRETADIC");
        this.vlrTotalNretPrinc = vo.asBigDecimal("VLRTOTALNRETPRINC");
        this.vlrTotalRetAdic = vo.asBigDecimal("VLRTOTALRETADIC");
        this.vlrTotalRetPrinc = vo.asBigDecimal("VLRTOTALRETPRINC");
        this.cnpjPrestadorRet = vo.asString("CNPJPRESTADORRET");
        this.codEmpEstab = vo.asBigDecimal("CODEMPESTAB");
        this.codParcPrestador = vo.asBigDecimal("CODPARCPRESTADOR");
        this.dataChange = vo.asClob("DATACHANGE");
        this.msg = vo.asClob("MSG");
        this.tipo = vo.asString("TIPO");
        this.vlrCrTom = vo.asBigDecimal("VLRCRTOM");
        this.vlrCrTomRet = vo.asBigDecimal("VLRCRTOMRET");
        this.vlrCrTomSusp = vo.asBigDecimal("VLRCRTOMSUSP");
        this.vlrCrTomSuspRet = vo.asBigDecimal("VLRCRTOMSUSPRET");
        this.vlrTotalBaseRetRet = vo.asBigDecimal("VLRTOTALBASERETRET");
        this.vlrTotalDifRet = vo.asBigDecimal("VLRTOTALDIFRET");
        this.vlrTotalNretAdicRet = vo.asBigDecimal("VLRTOTALNRETADICRET");
        this.vlrTotalNretPrincRet = vo.asBigDecimal("VLRTOTALNRETPRINCRET");
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
